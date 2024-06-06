public class Contexto {
    IEnvioMensaje estrategia;

    public void setEstrategia(IEnvioMensaje estrategia){
        this.estrategia = estrategia;
    }

    public void enviarMensaje(String contenido){
        if (contenido!=null) {
            estrategia.enviarMensaje(contenido);
        }else{
            System.out.println("Error");
        }
    }

}
