public class Cliente implements IObservador {
    String nombre;

    public Cliente(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void actualizar() {
        System.out.println("Cliente " + nombre + ": El producto ahora está disponible.");
    }
    
}
