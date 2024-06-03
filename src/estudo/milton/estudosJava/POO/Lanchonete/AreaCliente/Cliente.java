package estudo.milton.estudosJava.POO.Lanchonete.AreaCliente;
import estudo.milton.estudosJava.POO.Lanchonete.Atendimento.Cliente.Atendente;

public class Cliente {
    double saldo = 100.00;
    double valorConta = 0.00;
    String lanche = " ";
    String bebida = " ";

    private void escolherLanche(){
        System.out.println("ESCOLHENDO LANCHE...");
    }
    public void fazerPedido(int pedido){
        escolherLanche();
        double valorLanche = 0.0;
        if(pedido == 1){
            lanche = "HANBURGER";
            valorLanche = 20.00;
            valorConta = valorConta + valorLanche;
            System.out.println("HANBURGER");
            System.out.println("VALOR PARCIAL DO PEDIDO R$: "+ valorConta);
        }else if(pedido == 2){
            lanche = "X-SALADA";
            valorLanche = 22.00;
            valorConta = valorConta + valorLanche;
            System.out.println("X-SALADA");
            System.out.println("VALOR PARCIAL DO PEDIDO R$: "+ valorConta);
        }else if(pedido == 3){
            lanche = "X-BACON";
            valorLanche = 25.00;
            valorConta = valorConta + valorLanche;
            System.out.println("X-BACON");
            System.out.println("VALOR PARCIAL DO PEDIDO R$: "+ valorConta);
        }else if(pedido == 4){
            lanche = "X-TUDO";
            valorLanche = 30.00;
            valorConta = valorConta + valorLanche;
            System.out.println("X-TUDO");
            System.out.println("VALOR PARCIAL DO PEDIDO R$: "+ valorConta);
        }else{
            System.out.println("DESCULPE, ESTE PEDIDO NÃO EXISTE.");
        }
    }
    public void fazerPedidoBebida(int pedido){
        System.out.println("ESCOLHENDO BEBIDA...");
        double valorBebida = 0.0;
        switch (pedido) {
            case 1:
            System.out.println("1 - SUCO.");
            bebida = "SUCO";
            valorBebida = 10.00;
            valorConta = valorConta + valorBebida;
            System.out.println("VALOR PARCIAL DO PEDIDO R$: "+ valorConta);
            break;
            case 2:
            System.out.println("2 - VITAMINA.");
            bebida = "VITAMINA";
            valorBebida = 20.00;
            valorConta = valorConta + valorBebida;
            System.out.println("VALOR PARCIAL DO PEDIDO R$: "+ valorConta);
            break;
            case 3 :
            System.out.println("3 - REFRIGERANTE.");
            valorBebida = 5.00;
            valorConta = valorConta + valorBebida;
            System.out.println("VALOR PARCIAL DO PEDIDO R$: "+ valorConta);
            bebida = "REFRIGERANTE";
            break;
            case 4 :
                System.out.println("NENHUMA BEBIDA.");
                break;
            default:
                System.out.println("ESTE PEDIDO NÃO EXISTE");
        }
    }
    public void pagarConta(){
        consultarSaldoAplicativo();
        System.out.println("VALOR TOTAL CONTA : R$" + valorConta);
        System.out.println("PAGANDO A CONTA....");
        double troco = saldo - valorConta;
        if(valorConta <= saldo) {
            System.out.println("TROCO : R$" + troco);
        }else{
            double saldoDevedor = valorConta - saldo;
            System.out.println("OPERAÇÃO NÃO CONCLUIDA POR FALTA DE SALDO.");
            System.out.println("FALTAM R$" + saldoDevedor + " PARA ACERTAR A CONTA.");
        }
    }
    private void consultarSaldoAplicativo(){
        System.out.println("CONSULTANDO SALDO NO APLICATIVO");
        System.out.println("SALDO APLICATIVO : R$" + saldo);

    }
}
