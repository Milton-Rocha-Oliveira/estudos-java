package estudo.milton.estudosJava;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CandidatosVaga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] candidatos = {"Milton", "Juliete", "Eduardo", "Otavio", "Aparecida"};
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }
        static void entrandoEmContato(String candidato){
            int  tentativasRealizadas = 1;
            boolean continuarTentando = true;
            boolean atendeu = false;
            do{
                atendeu = atender();
                continuarTentando = !atendeu;
                if(continuarTentando){
                    tentativasRealizadas++;
                }else {
                    System.out.println("CONTATO REALIZADO COM SCESSO");
                }
            }while(continuarTentando && tentativasRealizadas <3);
            if(atendeu){
                System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
            }else{
                System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + " NO NUMERO MAXIMO E TENTATIVAS");
            }
        }
        //metodo auxiliar
        static boolean atender(){
            return new Random().nextInt(3)==1;
        }

    static void imprimirSelecionados(){
        String [] candidatos = {"Milton", "Juliete", "Eduardo","Otavio","Aparecida"};
        System.out.println("Imprimindo lista de candidatos selecionados, informando o indice do elemento.");

        for(int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato selecionado de n " + (indice + 1) + " è o " + candidatos[indice]);
        }
            System.out.println("Forma abreviadade interação for each");
            for(String candidato : candidatos){
                System.out.println("O candidato selecionado foi " + candidato);
            }
    }
    static void selecaoCandidatos(){
        String [] candidatos = {"Milton", "Juliete", "Eduardo","Otavio","Aparecida","Manoel","Maria"};

        int candidatosSelecionados = 0;
        int candiatoAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candiatoAtual < candidatos.length){
            String candidato = candidatos[candiatoAtual];
            double salarioPrtendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salario " + salarioPrtendido);
            if(salarioBase >= salarioPrtendido){
                System.out.println("O candidato "+ candidato + " foi selecionado para vaga.");
                candidatosSelecionados++;
            }
            candiatoAtual++;

            }
        }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }
    static void analizarCandidato(Double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR CANDIDATO");
        }else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA");
        }else{
            System.out.println("AGUARDAR RESULTADO DOS DEMAIS");
        }
    }
}
