package contaBanco;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {

        var novaConta = new ContaTerminal();

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        try {
            System.out.print("Numero da conta : ");
            int conta = sc.nextInt();

            sc.nextLine();
            System.out.print("Agencia : ");
            String agencia = sc.nextLine();

            System.out.print("Nome : ");
            String nome = sc.nextLine();

            System.out.print("Deposito : ");
            double deposito = sc.nextDouble();

            novaConta.conta(conta);
            novaConta.agencia(agencia);
            novaConta.cliente(nome);
            novaConta.deposito(deposito);

            System.out.println("");

            System.out.println("OLÁ " + nome + " , OBRIGADO/A POR CRIAR UM CONTA EM NOSSO BANCO, SUA AGENCIA É " + agencia + ", CONTA " + conta + " E SEU SALDO DE R$" + novaConta.saldo + " JÁ ESTÁ DISPONIVEL PARA SAQUE.");
        }catch (InputMismatchException e){
            int i =1;
            System.out.println("!! OS CAMPOS DE CONTA E DEPOSITO, SÓ RECEBEM NUMEROS !!");
            System.exit(i);
        }

        int operacao;
        try {
            do {
                System.out.println("");
                sc.nextLine();
                System.out.print("DESEJA REALIZAR OUTRA OPERAÇÕ ?");
                System.out.print("1 - SIM , 2 - NÃO : ");
                operacao = sc.nextInt();
                System.out.println(" ");
                if (operacao == 1) {
                    System.out.println("OPERAÇÕES...");
                    System.out.println("1 - DEPOSITO.");
                    System.out.println("2 - SALDO.");
                    System.out.println("3 - SAQUE.");
                    int novaOperacao = sc.nextInt();
                    System.out.println(" ");
                    if (novaOperacao == 1) {
                        System.out.println("DEPOSITO...");
                        System.out.print("VALOR :");
                        double valor = sc.nextDouble();
                        novaConta.deposito(valor);
                    } else if (novaOperacao == 2) {
                        System.out.println("SALDO...");
                        System.out.println("SEU SALDO ATUAL É DE R$" + novaConta.saldo);
                    } else if (novaOperacao == 3) {
                        System.out.println("SAQUE...");
                        System.out.print("VALOR :");
                        double valorSaque = sc.nextDouble();
                        novaConta.saque(valorSaque);
                    } else {
                        System.out.println("ERRO!!!");
                        System.out.println("DESCULPE, ESTÁ NÃO É UMA OPERAÇÃO VALIDA.");
                    }
                } else {
                    System.out.println(" ");
                    System.out.println("MUITO OBRIGADO POR SER NOSSO CLIENTE.");
                    System.out.println("TENHA UM OTIMO DIA");
                    System.out.println("QUE DEUS TE ABENÇOE");
                }
            } while (operacao == 1);
        }catch (InputMismatchException e){
            System.out.println("!! NO MENU DE ESCOLHA PARA NOVAS OPERAÇÕES,DEPOSITOS E SAQUES, SÓ É PERMITIDO NUMEROS !!");
        }
    }
}

