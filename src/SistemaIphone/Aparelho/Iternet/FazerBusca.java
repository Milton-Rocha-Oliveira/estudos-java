package SistemaIphone.Aparelho.Iternet;
import java.util.Scanner;

public class FazerBusca implements NavegadorInternet {
    Scanner sc = new Scanner(System.in);
    public void navegarInternet() {
        fazerBusca();
    }
    private void fazerBusca(){
        System.out.println("DIGITE SUA BUSCA...");
        String busca = sc.nextLine();
        System.out.println("RESULTADO DA BUSCA : " + busca);
        System.out.println("...............................");
    }
}
