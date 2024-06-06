public class Driver {
    public static void main(String[] args) {
            
        Producto producto1 = new Producto();

        IObservador cliente1 = new Cliente("Roberto");
        
        IObservador cliente2 = new Cliente("Esteban");

        producto1.agregarObservador(cliente1);
        producto1.agregarObservador(cliente2);

        producto1.setDispoible(true);


    
    }
    
}