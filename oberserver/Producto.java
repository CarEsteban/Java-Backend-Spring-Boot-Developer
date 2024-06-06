import java.util.ArrayList;

public class Producto {
    
    ArrayList<IObservador> observadores = new ArrayList<>();

    boolean disponibilidad;

    public boolean isDisponible(){
        return disponibilidad;
    }

    public void setDispoible(boolean disponible){
        this.disponibilidad = disponible;
        if (disponible) {
            notificarObservadores();
        }
    }

    public void agregarObservador(IObservador cliente){
        observadores.add(cliente);
    }

    public void eliminarObservador(IObservador cliente){
        observadores.remove(cliente);
    }

    private void notificarObservadores(){
        for (IObservador cliente : observadores) {
            cliente.actualizar();
        }
    }

}
