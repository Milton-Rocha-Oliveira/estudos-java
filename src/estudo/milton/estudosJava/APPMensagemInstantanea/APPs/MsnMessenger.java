package estudo.milton.estudosJava.APPMensagemInstantanea.APPs;

public class MsnMessenger extends ServicoDeMensagemInstantanea{
    public void enviarMensagem(){
        validarConectarInternet();
        System.out.println("Enviando mensagem via MSN Messenger");
    }
    public void receberMensagem(){
        System.out.println("Recebendo Mensagem pelo MSN Messenger");
        salvarMensagem();
    }
}
