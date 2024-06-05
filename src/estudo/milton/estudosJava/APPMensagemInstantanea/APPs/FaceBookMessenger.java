package estudo.milton.estudosJava.APPMensagemInstantanea.APPs;

public class FaceBookMessenger extends ServicoDeMensagemInstantanea{
    public void enviarMensagem(){
        validarConectarInternet();
        System.out.println("Enviando mensagem pelo FacebookMessenger");
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo FacebookMessenger");
        salvarMensagem();
    }
}
