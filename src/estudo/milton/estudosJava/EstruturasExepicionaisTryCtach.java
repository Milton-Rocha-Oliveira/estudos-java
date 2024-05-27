package estudo.milton.estudosJava;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class EstruturasExepicionaisTryCtach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US) ;

        try {
            System.out.println("Digite seu nome: ");
            String nome = sc.nextLine();

            System.out.println("Digite seu sobrenome: ");
            String sobreNome = sc.nextLine();

            System.out.println("Digite sua idade: ");
            int idade = sc.nextInt();
            sc.nextLine();

            System.out.println("Digite sua altura: ");
            double altura = sc.nextDouble();
            sc.nextLine();

            System.out.println("Olá " + nome + " " + sobreNome + ", você tem " + idade + " anos, e " + altura + " de altura.");
        } catch(InputMismatchException e){
            System.out.println("Os campos idade e altura presisão ser numericos");
        }
    }
}
