package SistemaIphone.Aparelho;
import java.util.Scanner;

import SistemaIphone.Aparelho.Ipod.EscolherMusica;
import SistemaIphone.Aparelho.Ipod.Ipod;
import SistemaIphone.Aparelho.Ipod.ReproduzirMusica;
import SistemaIphone.Aparelho.Iternet.AcessarSite;
import SistemaIphone.Aparelho.Iternet.FazerBusca;
import SistemaIphone.Aparelho.Iternet.NavegadorInternet;
import SistemaIphone.Aparelho.Telefone.FazerChamada;
import SistemaIphone.Aparelho.Telefone.ReceberChamada;
import SistemaIphone.Aparelho.Telefone.SalvarNumero;
import SistemaIphone.Aparelho.Telefone.Telefone;

public class Iphone implements Ipod, NavegadorInternet, Telefone {
    Scanner sc = new Scanner(System.in);
    public void tocarMucica() {
        System.out.println("VOCÊ QUER ESCOLHER UMA MUSICA ? 1-SIM..2-NÃO.");
        int escolha = sc.nextInt();

        if(escolha == 1) {
            System.out.println("...ESCOLHENDO MUSICA...");
            EscolherMusica escolherMusica = new EscolherMusica();
            escolherMusica.tocarMucica();
        }else if(escolha == 2){
            System.out.println("...REPRODUZINDO MUSICA DE FORMA ALEATORIA...");
            ReproduzirMusica reproduzirMusica = new ReproduzirMusica();
            reproduzirMusica.tocarMucica();
            new ReproduzirMusica();
        }else{
            System.out.println("...DESCULPE MAIS ESTÁ OPÇÃO NÃO É VALIDA");
        }
    }
    public void navegarInternet() {
        System.out.println("...OQUE VOCÊ QUER FAZER...");
        System.out.println("1-ACESSAR SITE");
        System.out.println("2-FAZER UMA BUSCA");
        int internet = sc.nextInt();

        if(internet == 1){
            AcessarSite acessarSite =  new AcessarSite();
            acessarSite.navegarInternet();
        }else if(internet == 2){
            FazerBusca fazerBusca = new FazerBusca();
            fazerBusca.navegarInternet();
        }else{
            System.out.println("DESCULPE MAIS ESTA OPÇÃO NÃO É VALIDA");
        }
    }
    public void usarTelefone() {
        System.out.println("OPERÇÕES...");
        System.out.println("1-SALVAR NUMERO");
        System.out.println("2-FAZER LIGAÇÃO");
        System.out.println("3-RECEBENDO LIGAÇÃO");
        int operacao = sc.nextInt();

        if(operacao == 1 ){
            System.out.println("...SALVAR NUMERO...");
            SalvarNumero salvarNumero =  new SalvarNumero();
            salvarNumero.usarTelefone();
        }else if(operacao == 2){
            System.out.println("...FAZENDO LIGAÇÃO...");
            new FazerChamada();
        }else if(operacao == 3){
            System.out.println("...RECEBENDO CHAMADA...");
            new ReceberChamada();
        }else{
            System.out.println(":(...DESCULPE. ESTÁ OPERAÇÃO NÃO ESTA DISPONIVEL");
        }
    }
}
