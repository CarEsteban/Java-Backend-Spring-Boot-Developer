public class EnvioMensajeTexto implements IEnvioMensaje {

    @Override
    public void enviarMensaje(String contenido) {
        System.out.println("Enviando mensaje de texto: " + contenido);
    }
}
