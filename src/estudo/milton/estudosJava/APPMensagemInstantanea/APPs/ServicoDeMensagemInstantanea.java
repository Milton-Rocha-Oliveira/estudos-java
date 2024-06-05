package estudo.milton.estudosJava.APPMensagemInstantanea.APPs;

public abstract class ServicoDeMensagemInstantanea {
    public abstract void enviarMensagem();

    public abstract void receberMensagem();

    protected void validarConectarInternet(){
        System.out.println("...CONECTADO A INTERNET...");
    }
    protected void salvarMensagem(){
        System.out.println("...SALVANDO MENSAGEM...");
    }
}
