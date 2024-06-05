package estudo.milton.estudosJava.APPMensagemInstantanea.APPs;

public class Telegram extends ServicoDeMensagemInstantanea{
    public void enviarMensagem(){
        validarConectarInternet();
        System.out.println("Enviando mensagem pelo Telegram");
        salvarMensagem();
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo Telegram");
    }
}
