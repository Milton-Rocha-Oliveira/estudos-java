package estudo.milton.estudosJava.POO.Lanchonete;

import java.util.Scanner;
import estudo.milton.estudosJava.POO.Lanchonete.Atendimento.Cliente.Atendente;
import estudo.milton.estudosJava.POO.Lanchonete.AreaCliente.Cliente;
import estudo.milton.estudosJava.POO.Lanchonete.Atendimento.Cliente.Cozinha.Almoxarife;
import estudo.milton.estudosJava.POO.Lanchonete.Atendimento.Cliente.Cozinha.Cozinhneiro;


public class Estabelecimento {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Almoxarife almoxarife = new Almoxarife();
        Cozinhneiro cozinheiro = new Cozinhneiro();
        Atendente atendente = new Atendente();
        Cliente cliente = new Cliente();

        System.out.println("PEDIDO CLIENTE:");
        int pedidos = 0;
        do {
            System.out.println("1 - HANBURGER = 20.0");
            System.out.println("2 - X-SALADA = 22.00");
            System.out.println("3 - X - BACON = 25.00");
            System.out.println("4 - X-TUDO = 30.00");
            int pedido = sc.nextInt();
            sc.nextLine();
            cliente.fazerPedido(pedido);
            System.out.println("DESEJA MAIS ALGUM LANCHE ?1 SIM-2 NÃO.");
            pedidos = sc.nextInt();
        }while(pedidos == 1);
        sc.nextLine();
        int pedidosBebida = 0;
        do {
            System.out.println("BEBIDAS:");
            System.out.println("1 - SUCO = 10.00");
            System.out.println("2 - VITAMINA = 12.00");
            System.out.println("3 - REFRIGERANTE = 5.00");
            System.out.println("4 - NENHUMA.");
            int pedidoBebida = sc.nextInt();
            cliente.fazerPedidoBebida(pedidoBebida);
            sc.nextLine();
            System.out.println("DESEJA MAIS ALGUMA BEBIDA ? 1 - SIM. 2 - NÃO");
            pedidosBebida = sc.nextInt();
        }while(pedidosBebida != 2);


        cozinheiro.receberPedido();
        cozinheiro.pedidoNoBalcao();
        atendente.servindoMesa();

        cliente.pagarConta();
        atendente.receberPagamento();

    }
}
