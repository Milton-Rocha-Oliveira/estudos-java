package contaBanco;

public class ContaTerminal {

    int numeroConta = 0;
    String agencia = "";
    String nomeCliente = " ";
    double saldo = 0.0;


    public void conta(int conta){
        numeroConta = conta;
        return;
    }

    public void agencia(String agencia) {
        agencia = agencia;
        return;
    }

    public void cliente(String cLiente) {
        nomeCliente = cLiente;
        return;
    }
    public void deposito(double deposito){
        saldo = saldo + deposito;
        System.out.println("SEU SALDO É DE R$" + saldo);
        return;
    }
    public void saque(double valor){
        double saque = saldo - valor;
        if(saque < 0.0) {
            System.out.println("SALDO INSUFICIENTE:");
            System.out.println("SEU SALDO É DE R$" + saldo);
        } else {
            System.out.println("SEU DINHEIRO SERÁ ENTREGUE...");
            saldo = saque;
            System.out.println("SEU SALDO APÓS O SAQUE É DE R$" + saldo);
        }
    }
}