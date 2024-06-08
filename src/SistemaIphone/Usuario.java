package SistemaIphone;
import java.sql.SQLOutput;
import java.util.Scanner;
import SistemaIphone.Aparelho.Iphone;

public class Usuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Iphone iphone = new Iphone();

        System.out.println("...OLÁ...");
        System.out.println("...FUNÇÕES DO SEU IPHONE...");
        System.out.println("1-TELEFONE");
        System.out.println("2-NAVEGADOR");
        System.out.println("3-IPOD");
        int funcao = sc.nextInt();

        int continuar = 1;
        do {
            switch (funcao) {
                case 1:
                    iphone.usarTelefone();
                    break;
                case 2:
                    iphone.navegarInternet();
                    break;
                case 3:
                    iphone.tocarMucica();
                    break;
                default:
                    System.out.println(":(...DESCULPE, MIAS ESTA FUNÇÃO NÃO ESTÁ DISPONIVEL....");
            }
            System.out.println("MAIS ALGUMA OPERAÇÃO ?1-SIM..2-NÃO");
            continuar = sc.nextInt();
        }while(continuar == 1);
        System.out.println("...OBRIGADO POR USAR O NOSSO SISTEMA OPERACIONAL...");
    }
}
