package estudo.milton.estudosJava.PooAltomovel;

public class Autodromo {
    public static void main(String[] args) {

        Carro logan = new Carro();
        logan.setChassi("dfgh52135");
        logan.getChassi();
        logan.setPlaca("AXO1I69");
        logan.getPlaca();
      //  logan.ligar();

        Moto honda150 = new Moto();
        honda150.setChassi("123548974");
        honda150.setPlaca("asd12365");
        //System.out.println(honda150.getPlaca());
        //honda150.ligar();

         Veiculo coringa = honda150;

         coringa.ligar();

    }
}
