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
         String nome = sc.nextLine();

         System.out.print("Deposito : ");
         double deposito = sc.nextDouble();

         novaConta.conta(conta);
         novaConta.agencia(agencia);
         novaConta.cliente(nome);
         novaConta.deposito(deposito);

         System.out.println(" ");

         System.out.println("Olá " + nome + " , obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo de R$" + novaConta.saldo + " já está disponível para saque");

         System.out.println(" ");

         int novaOperacao;
         do {
             System.out.println("Deseja fazer alguma outra operação ?");
             System.out.println(" ");
             System.out.print("Se sim digite 1, se não digite 2.");
             novaOperacao = sc.nextInt();
             System.out.println(" ");
             if (novaOperacao == 1) {
                 System.out.println("Ok, qual ?");
                 System.out.println("1 - Desposito:");
                 System.out.println("2 - Saldo:");
                 System.out.println("3 - Saque:");
                 int operacao = sc.nextInt();
                 System.out.println(" ");
                 sc.nextLine();
                 if (operacao == 1) {
                     System.out.print("Digite o valor:");
                     double valor = sc.nextDouble();
                     novaConta.deposito(valor);
                 } else if (operacao == 2) {
                     System.out.println(novaConta.saldo);
                 } else if (operacao == 3) {
                     System.out.print("Valor : ");
                     double valor = sc.nextDouble();
                     novaConta.saque(valor);
                 } else {
                     System.out.println("Desculpe, esta não é uma operação valida");
                 }
             }
         } while(novaOperacao == 1);
         System.out.println(" ");
         System.out.println("Muito obrigado/a, por utilizar nossos serviços, tenha um exlente dia, que Deus te abençoe.");
     }
}

