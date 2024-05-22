package smartTv;

public class Usuario {
    public static void main(String [] args){

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();

        System.out.println("A tv esta ligada ? " + smartTv.ligada);
        System.out.println("A tv esta no canal : " + smartTv.canal);
        System.out.println("A tv esta no volume : " + smartTv.volume);

        smartTv.aumentarUmCanal();
        System.out.println("Canal recente : " + smartTv.canal);
        smartTv.ligar();
        System.out.println("A tv esta ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("A tv esta ligada ? " + smartTv.ligada);

        smartTv.mudarCanal(5);

        System.out.println("Canal recente : " + smartTv.canal);
    }
}
