package SistemaIphone.Aparelho.Telefone;
import java.util.Scanner;

public class FazerChamada implements Telefone{
    Scanner sc = new Scanner(System.in);

    public void usarTelefone() {
        fazerChamada();
    }
    private void fazerChamada(){
        System.out.println("FAZENDO CHAMADA");
    }
}
