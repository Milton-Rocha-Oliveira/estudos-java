package estudo.milton.estudosJava.PooAltomovel;

public class Moto extends Veiculo{
    private String chassi;

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public void ligar(){
        conferirCombustivel();
        System.out.println("MOTO LIGADA");
    }
    private void conferirCombustivel(){
        System.out.println("TANQUE CHEIO");
    }
}
