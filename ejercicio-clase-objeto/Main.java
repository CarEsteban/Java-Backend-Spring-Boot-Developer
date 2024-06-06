public class Main {
    public static void main(String[] args) {
        // Crea un objeto 'libro1' utilizando el constructor sin parámetros
        Libro libro1 = new Libro();
        
        // Crea un objeto 'libro2' utilizando el constructor con parámetros
        Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", "978-0307474728", 15.99);

        // Muestra los detalles de 'libro1' y 'libro2'
        System.out.println("Detalles del libro1:");
        libro1.mostrarDetalles();
        
        System.out.println("\nDetalles del libro2:");
        libro2.mostrarDetalles();

        // Actualiza el precio de 'libro2' y muestra los detalles actualizados
        libro2.actualizarPrecio(12.99);
        System.out.println("\nDetalles actualizados del libro2:");
        libro2.mostrarDetalles();
    }
}
