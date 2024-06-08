package SistemaIphone.Aparelho.Ipod;
import java.util.Scanner;
public class EscolherMusica implements Ipod {
    Scanner sc = new Scanner(System.in);

    public void tocarMucica() {
        ecolherMusica();
    }
    private void ecolherMusica(){
        String musica = " ";
        System.out.println("QUAL MUSICA DESEJA OUVIR ?");
        musica = sc.nextLine();
        System.out.println("TOCANDO A MUSICA " + musica);
    }
}
