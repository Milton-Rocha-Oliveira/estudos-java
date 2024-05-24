package contaBanco;

import java.util.Scanner;

public class ContaBanco {
     public static void main(String[] args) {

         var novaConta = new ContaTerminal();

          Scanner sc = new Scanner(System.in);

          System.out.print("Numero da conta : ");
          int conta = sc.nextInt();

             sc.nextLine();
             System.out.print("Agencia : ");
             String agencia = sc.nextLine();

             System.out.print("Nome : ");
             String nome = sc.nextLine();;

              novaConta.conta(conta);
              novaConta.agencia(agencia);
              novaConta.cliente(nome);

             System.out.println("Olá " + nome + " , obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo de R$" + novaConta.saldo + " já está disponível para saque");

     }
}

