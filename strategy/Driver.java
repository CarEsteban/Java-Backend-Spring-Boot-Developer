public class Driver {
    public static void main(String[] args) {
        Contexto sistemaEnvio = new Contexto();

        IEnvioMensaje push = new EnvioMensajePush();
        IEnvioMensaje mensaje = new EnvioMensajeTexto();
        IEnvioMensaje correo = new EnvioMensajeCorreo();

        sistemaEnvio.setEstrategia(push);
        sistemaEnvio.enviarMensaje("pago recibido");

        sistemaEnvio.setEstrategia(mensaje);
        sistemaEnvio.enviarMensaje("pago recibido");

        sistemaEnvio.setEstrategia(correo);
        sistemaEnvio.enviarMensaje("pago recibido");

    }     
}
