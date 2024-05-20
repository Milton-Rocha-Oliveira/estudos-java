package meus.projetos;

import java.util.Scanner;

public class ControleCorte {
    //Registra e retorna o valor do fornecedor
    static void dalton(int corte, int pacotes, int pecas, double preco) {
        int totalPecas = pacotes * pecas;
        double valorTotal = totalPecas * preco;
        System.out.println("O corte de numero " + corte + " do Dalton, tem " + totalPecas + " ,e o valor total do corte é de : R$" + valorTotal%.2f);
    }
    //Registra e retorna o valor do fornecedor
    static void damin(int corte, int pacotes, int pecas, double preco) {
        int totalPecas = pacotes * pecas;
        double valorTotal = totalPecas * preco;
        System.out.println("O corte de numero " + corte + " do Damin, tem " + totalPecas + " ,e o valor total do corte é de : R$" + valorTotal%.2f);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Resgistra nome fornecedor
        System.out.println("Fornecedor (com a primeira letra maiuscula):");
        String fornecedor = sc.nextLine();
        //Se verdadeiro, o resultado dos fornecedores, registrar valores.
        if (fornecedor.equals("Dalton") || fornecedor.equals("Damin")) {
            System.out.println("Numero do corte:");
            int corte = sc.nextInt();
            System.out.println("Pacotes corte:");
            int pacotes = sc.nextInt();
            System.out.println("Peças por pacote:");
            int quantidadePecasPacote = sc.nextInt();
            System.out.println("Valor por peça:");
            double valorPorPeca = sc.nextDouble();
            if (fornecedor.equals("Dalton")) {
                dalton(corte, pacotes, quantidadePecasPacote, valorPorPeca);
            } else{
                damin(corte, pacotes, quantidadePecasPacote, valorPorPeca);
            }
            //Se for fornecedor não registrado, exibir mensagem.
        }else{System.out.println("Desculpe, este fornecedor não esta na nossa base de registros.");
        }
    }
}