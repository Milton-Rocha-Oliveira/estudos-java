package smartTv;

public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada =  true;
        System.out.println("Bem vindo.");
    }
    public void desligar(){
        ligada = false;
        System.out.println("Até mais.");
    }
    public void aumentarVolume(){
        volume++;
        System.out.println("O volume esta sendo aumentado para : " + volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("O volume esta sendo diminuido para : " + volume);
    }
    public void aumentarUmCanal(){
        canal++;
        System.out.println("Canal atual : " + canal);
    }
    public void diminuirUmCanal() {
        canal--;
        System.out.println("Canal atual : " + canal);
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Canal atual : " + canal);
    }
}
