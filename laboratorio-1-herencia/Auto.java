
// Implementación en Auto
class Auto extends Vehiculo implements Control {
    public Auto(int velocidadMaxima) {
        super(velocidadMaxima);
    }

    @Override
    public void mostrarTipo() {
        System.out.println("Auto");
    }

    public void mostrarTipo(String mensaje) {
        System.out.println("Auto: " + mensaje);
    }

    @Override
    public void encender() {
        System.out.println("Auto encendido");
    }

    @Override
    public void apagar() {
        System.out.println("Auto apagado");
    }
}