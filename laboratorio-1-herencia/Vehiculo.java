// Clase abstracta Vehiculo
abstract class Vehiculo {
    protected int velocidadMaxima;

    public Vehiculo(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public abstract void mostrarTipo();
}
