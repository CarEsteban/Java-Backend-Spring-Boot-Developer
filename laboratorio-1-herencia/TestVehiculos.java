public class TestVehiculos {
    public static void main(String[] args) {
        // Crear objetos de Coche y Motocicleta
        Auto auto = new Auto(200);
        Motocicleta motocicleta = new Motocicleta(150);

        // Probar métodos de Coche
        auto.mostrarTipo();
        auto.mostrarTipo("Deportivo");
        auto.encender();
        auto.apagar();

        // Probar métodos de Motocicleta
        motocicleta.mostrarTipo();
        motocicleta.encender();
        motocicleta.apagar();
    }
}
