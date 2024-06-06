
// Implementación en Motocicleta
class Motocicleta extends Vehiculo implements Control {
    public Motocicleta(int velocidadMaxima) {
        super(velocidadMaxima);
    }

    @Override
    public void mostrarTipo() {
        System.out.println("Motocicleta");
    }

    @Override
    public void encender() {
        System.out.println("Motocicleta encendida");
    }

    @Override
    public void apagar() {
        System.out.println("Motocicleta apagada");
    }
}