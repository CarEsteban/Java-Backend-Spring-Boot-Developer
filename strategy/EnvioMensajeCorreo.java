public class EnvioMensajeCorreo implements IEnvioMensaje {

    @Override
    public void enviarMensaje(String contenido) {
        System.out.println("Enviando mensaje de correo: " + contenido);
    }
    
}