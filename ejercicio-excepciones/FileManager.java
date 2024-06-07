import java.io.*;
import java.util.Scanner;

// Excepción personalizada para manejar archivos no encontrados
class ArchivoNoEncontradoException extends Exception {
    public ArchivoNoEncontradoException(String mensaje) {
        super(mensaje);
    }
}

// Excepción personalizada para manejar la creación de un archivo que ya existe
class ArchivoYaExisteException extends Exception {
    public ArchivoYaExisteException(String mensaje) {
        super(mensaje);
    }
}

public class FileManager {


    // Método para verificar la existencia de un archivo
    public static void verificarArchivo(String nombreArchivo) throws ArchivoNoEncontradoException {
        File archivo = new File(nombreArchivo);
        if (!archivo.exists()) {
            throw new ArchivoNoEncontradoException("El archivo no existe.");
        }
    }

    // Método para crear un archivo
    public static void crearArchivo(String nombreArchivo) throws ArchivoYaExisteException {
        File archivo = new File(nombreArchivo);
        if (archivo.exists()) {
            throw new ArchivoYaExisteException("El archivo ya existe.");
        } else {
            try {
                archivo.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // Método para agregar una nueva línea de texto a un archivo existente
    public static void agregarLinea(String nombreArchivo, String linea) throws ArchivoNoEncontradoException {
        verificarArchivo(nombreArchivo);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo, true))) {
            writer.write(linea);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para leer y mostrar el contenido de un archivo
    public static void mostrarContenido(String nombreArchivo) throws ArchivoNoEncontradoException {
        verificarArchivo(nombreArchivo);
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para leer y mostrar una línea específica de un archivo
    public static void mostrarLineaEspecifica(String nombreArchivo, int numeroLinea) throws ArchivoNoEncontradoException {
        verificarArchivo(nombreArchivo);
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            int contador = 0;
            while ((linea = reader.readLine()) != null) {
                if (contador == numeroLinea) {
                    System.out.println(linea);
                    return;
                }
                contador++;
            }
            System.out.println("El archivo no tiene tantas líneas.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del archivo:");

        String nombreArchivo = scanner.nextLine();

        try {
            verificarArchivo(nombreArchivo);
        } catch (ArchivoNoEncontradoException e) {
            System.out.println(e.getMessage());
            System.out.println("¿Desea crear el archivo? (s/n)");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("s")) {
                try {
                    crearArchivo(nombreArchivo);
                    System.out.println("Archivo creado con éxito.");
                } catch (ArchivoYaExisteException ex) {
                    System.out.println(ex.getMessage());
                }
            } else {
                System.out.println("Terminando el programa.");
                scanner.close();
                return;
            }
        }

        boolean continuar = true;
        while (continuar) {
            System.out.println("Elija una opción:");
            System.out.println("1. Agregar nuevas líneas al archivo.");
            System.out.println("2. Mostrar el contenido del archivo.");
            System.out.println("3. Mostrar una línea específica del archivo.");
            System.out.println("4. Salir.");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consume el salto de línea

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la línea a agregar:");
                    String linea = scanner.nextLine();
                    try {
                        agregarLinea(nombreArchivo, linea);
                        System.out.println("Línea agregada con éxito.");
                    } catch (ArchivoNoEncontradoException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        mostrarContenido(nombreArchivo);
                    } catch (ArchivoNoEncontradoException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el número de la línea a mostrar:");
                    int numeroLinea = scanner.nextInt();
                    scanner.nextLine(); // Consume el salto de línea
                    try {
                        mostrarLineaEspecifica(nombreArchivo, numeroLinea);
                    } catch (ArchivoNoEncontradoException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}
