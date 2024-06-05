package estudo.milton.estudosJava.Escola;
import java.util.Scanner;

public class Escola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("NOME : ");
        String nome = sc.nextLine();
        System.out.print("IDADE : ");
        int idade = sc.nextInt();
        Aluno aluno = new Aluno(nome, idade);

        System.out.println("O aluno " + aluno.getNome() + " tem " + aluno.getIdade() + " anos");
    }
}
