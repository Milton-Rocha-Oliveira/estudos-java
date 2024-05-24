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
        return;
    }
    public void saque(double valor){
        double saque = saldo - valor;
        if(saque < 0.0){
            System.out.println("Saldo insuficiente:");
        }else{
            System.out.println("Seu dinheiro será entregue :");
            saldo = saque;
            System.out.println("Seu saldo após o saque é de " + saldo);
        }
    }
}