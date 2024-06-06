
// Subclase ProductoAlimenticio
public class ProductoAlimenticio extends Producto {
    private String fechaCaducidad;

    public ProductoAlimenticio(String nombre, String descripcion, String categoria, double precio, String urlFoto, String fechaCaducidad) {
        super(nombre, descripcion, categoria, precio, urlFoto);
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Descripción: " + getDescripcion());
        System.out.println("Categoría: " + getCategoria());
        System.out.println("Precio: " + getPrecio());
        System.out.println("URL Foto: " + getUrlFoto());
        System.out.println("Fecha de Caducidad: " + fechaCaducidad);
    }
}
