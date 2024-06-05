package estudo.milton.estudosJava.Enums;

public class SistemaIbge {
    public static void main(String[] args) {
        for(EstadoBrasileiro e : EstadoBrasileiro.values()){
            System.out.println(e.nomeMaiusculo());
        }
        EstadoBrasileiro eb = EstadoBrasileiro.SAO_PAULO;
        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());
        System.out.println(eb.getIbge());
        System.out.println(eb.nomeMaiusculo());
    }
}
