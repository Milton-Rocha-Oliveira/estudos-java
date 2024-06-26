package Contador;
import java.util.Scanner;
import java.util.Locale;

public class Contador {
        public static void main(String[] args) throws ParametrosInvalidosException {
            Scanner sc = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = sc.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = sc.nextInt();

            validar(parametroUm,parametroDois);

        }
        static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException{
            //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
            if(parametroUm < parametroDois){
                for(int i = 1; parametroUm < parametroDois;i++){
                    System.out.println("Imprimindo numero " + i);
                    parametroUm++;
                }
            }
        }
        static void validar(int parametro1,int parametro2) throws ParametrosInvalidosException {
            if(parametro1 < parametro2){
                contar(parametro1,parametro2);
            }else{
                System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            }
        }
}
