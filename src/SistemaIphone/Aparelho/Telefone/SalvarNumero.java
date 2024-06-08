package SistemaIphone.Aparelho.Telefone;
import java.util.Scanner;

public class SalvarNumero implements Telefone{
    Scanner sc = new Scanner(System.in);

    public void usarTelefone() {
        salvarNumero();
    }
    private void salvarNumero(){
        System.out.print("NUMERO: ");
        String numeroTelefone = sc.nextLine();
        System.out.print("NOME : ");
        String nome = sc.nextLine();

        System.out.println("NUMERO SALVO COM SUCESSO...");
        System.out.println("NUMERO : " + numeroTelefone + " NOME : " + nome.toUpperCase());
    }
}
