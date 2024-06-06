public class Main {
    public static void main(String[] args) {
        // Crear instancias de ProductoAlimenticio y ProductoElectronico
        ProductoAlimenticio leche = new ProductoAlimenticio("Leche Entera Alpina", "Bolsa x 1.100 ml", "Lacteo/Huevos y refrigerados", 3100, "https://www.eurosupermercados.com/eurosupermercado2020/content/images/thumbs/0000785_leche-entera-alpina-bolsa-1100-ml_550.png", "2024-12-31");
        ProductoElectronico laptop = new ProductoElectronico("Laptop XYZ", "Laptop de alto rendimiento", "Electrónica", 1200.00, "urlFoto1.jpg", 24);

        // Mostrar detalles de cada producto
        leche.mostrarDetalles();
        System.out.println();
        laptop.mostrarDetalles();
    }
}
