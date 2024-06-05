package estudo.milton.estudosJava.APPMensagemInstantanea;
import estudo.milton.estudosJava.APPMensagemInstantanea.APPs.FaceBookMessenger;
import estudo.milton.estudosJava.APPMensagemInstantanea.APPs.MsnMessenger;
import estudo.milton.estudosJava.APPMensagemInstantanea.APPs.ServicoDeMensagemInstantanea;
import estudo.milton.estudosJava.APPMensagemInstantanea.APPs.Telegram;

import java.util.Scanner;
public class ComputadorMilton {
    public static void main(String[] args) {
        ServicoDeMensagemInstantanea Smi =null;
        Scanner sc = new Scanner(System.in);
//o sistema pede para que o usuario escolha um app para enviar mensagem
        System.out.println("QUAL APP DESEJA USAR PARA MANDAR MENSAGEM?");
        System.out.println("MSN..escreva...msn");
        System.out.println("FacebookMessenger...escreva...fbm");
        System.out.println("Telegram..escreva...tlg");
        String smi =sc.nextLine();
//após receber uma entrada o sistema faz uma interação para poder retornar a resposta de acordo com a escolha do usuario
       if(smi.equals("msn")){
           Smi = new MsnMessenger();
       }else if(smi.equals("fbm")){
           Smi = new FaceBookMessenger();
       }else if(smi.equals("tlg")){
           Smi = new Telegram();
       }else{
           //trata uma entrada não esperada, mais de uma forma simploria,o mais indicado seria um tratamento de exeção
           System.out.println("Este aplicativo não foi encontrado");
       }
       //após passar pela sistema de interação, retorna as funções com o app escolhido
       Smi.enviarMensagem();
       Smi.receberMensagem();
    }
}
