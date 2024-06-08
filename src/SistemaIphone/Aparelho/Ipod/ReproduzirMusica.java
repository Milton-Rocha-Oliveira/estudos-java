package SistemaIphone.Aparelho.Ipod;

public class ReproduzirMusica implements Ipod {

    @Override
    public void tocarMucica() {
        reproduzirMusica();
    }
    private void reproduzirMusica(){
        System.out.println("...TOCANDO MUSICA VIA IPHOD...");
    }
}
