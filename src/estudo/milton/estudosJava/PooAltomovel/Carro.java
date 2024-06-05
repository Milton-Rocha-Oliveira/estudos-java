package estudo.milton.estudosJava.PooAltomovel;

public class Carro extends Veiculo{

    public void ligar(){
        conferirCanbio();
        conferirCombustivel();
        System.out.println("CARRO LIGADO");
    }
    private void conferirCanbio(){
        System.out.println("CANBIO EM ORDEM NA POSIÇÃO P");
    }

    private void conferirCombustivel(){
        System.out.println("COMBUSTIVEL OK ");
    }
}
