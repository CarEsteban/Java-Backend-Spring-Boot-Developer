public class EnvioMensajePush implements IEnvioMensaje {

    @Override
    public void enviarMensaje(String contenido) {
        System.out.println("Enviando mensaje push: " + contenido);
    }
    
}