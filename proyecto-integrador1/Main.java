public class Main {
    public static void main(String[] args) {
        // Crear 5 instancias de Producto
        Producto producto1 = new Producto("Leche Entera Alpina", "Bolsa x 1.100 ml", "Lacteo/Huevos y refrigerados", "Leches", 3100, "foto1.png");
        Producto producto2 = new Producto("Leche Alpina Deslactosada", "Bolsa x 1.100 ml", "Lacteo/Huevos y refrigerados", "Leches", 3400, "foto2.png");
        Producto producto3 = new Producto("Leche Alpina Semi-Descremada", "Bolsa x 1.100 ml", "Lacteo/Huevos y refrigerados", "Leches", 3500, "foto3.png");
        Producto producto4 = new Producto("Leche Alpina Deslactosada-Descremada", "Bolsa x 1.100 ml", "Lacteo/Huevos y refrigerados", "Leches", 3500, "foto4.png");
        Producto producto5 = new Producto("Leche Alpina Descremada", "Bolsa x 1.100 ml", "Lacteo/Huevos y refrigerados", "Leches", 3500, "foto5.png");

        // Mostrar detalles de cada producto
        producto1.mostrarDetalles();
        System.out.println();
        producto2.mostrarDetalles();
        System.out.println();
        producto3.mostrarDetalles();
        System.out.println();
        producto4.mostrarDetalles();
        System.out.println();
        producto5.mostrarDetalles();
    }
}
