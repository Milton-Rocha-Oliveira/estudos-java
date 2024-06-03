package estudo.milton.estudosJava.POO.Lanchonete.Atendimento.Cliente;
import estudo.milton.estudosJava.POO.Lanchonete.Atendimento.Cliente.Cozinha.Cozinhneiro;
import estudo.milton.estudosJava.POO.Lanchonete.Atendimento.Cliente.Atendente;

public class Atendente {
    public void servindoMesa(){
        pegarLancheCozinha();
        System.out.println("SERVINDO MESA");
        System.out.println("BOM APETITE.");
    }
    public void pedidoParaCozinha(){

    }
     void pegarLancheCozinha(){

        System.out.println("PEGANDO LANCHE NA COZINHA");
    }
    public void receberPagamento(){
        System.out.println("RECEBENDO PAGAMENTO");
    }
    public void pegarPedidoBalcao(){

        System.out.println("PEGANDO PEDIDO NO BALCAO");
    }
}
