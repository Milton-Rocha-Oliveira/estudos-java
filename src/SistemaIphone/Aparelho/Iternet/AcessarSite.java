package SistemaIphone.Aparelho.Iternet;
import java.util.Scanner;

public class AcessarSite implements NavegadorInternet {
    Scanner sc = new Scanner(System.in);
    public void navegarInternet() {
        acessarSite();
    }
    private void acessarSite(){
        System.out.println("DIGITE SITE...");
        String site = sc.nextLine();
        System.out.println("...ACESSANDO SITE " + site);
        System.out.println("...............................");
    }
}
