package contaBanco;

public class ContaTerminal {

    int numeroConta = 0;
    String agencia = "";
    String nomeCliente = " ";
    double saldo = 0.0;


    public void conta(int conta) {
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
        saldo = deposito;
        return;
    }
}