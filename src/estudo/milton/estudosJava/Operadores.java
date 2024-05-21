package estudo.milton.estudosJava;

public class Operadores {
    public static void main(String[] args) {

        int a ,b;
        a = 5;
        b = 6;

        //modelo simplificado de um IF/ELSE simples
        String resultado = a == b ? "Verdadeiro " : "Falso";

        System.out.println("a é igual a b ? " + resultado);

        //comparação entre variavel e objeto, faz a comparação do conteudo, e retorna true or false
        String nomeUm = "Milton";
        String nomeDois = new String("Milton");

        System.out.println("O nome um é igual ao nome dois ? " + nomeUm.equals(nomeDois));

        //operadores

        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao2 && condicao1)
            System.out.println("Os dois são iguais");
            else System.out.println("Um deles é verdadeiro");


    }
}
