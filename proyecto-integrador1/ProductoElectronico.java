
// Subclase ProductoElectronico
public class ProductoElectronico extends Producto {
    private int garantiaMeses;

    public ProductoElectronico(String nombre, String descripcion, String categoria, double precio, String urlFoto, int garantiaMeses) {
        super(nombre, descripcion, categoria, precio, urlFoto);
        this.garantiaMeses = garantiaMeses;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Descripción: " + getDescripcion());
        System.out.println("Categoría: " + getCategoria());
        System.out.println("Precio: " + getPrecio());
        System.out.println("URL Foto: " + getUrlFoto());
        System.out.println("Meses de Garantía: " + garantiaMeses);
    }
}