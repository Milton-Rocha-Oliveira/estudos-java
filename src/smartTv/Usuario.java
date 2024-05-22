package smartTv;

public class Usuario {
    public static void main(String [] args){

        SmartTv smartTv = new SmartTv();



        System.out.println("A tv esta ligada ? " + smartTv.ligada);
        System.out.println("A tv esta no canal : " + smartTv.canal);
        System.out.println("A tv esta no volume : " + smartTv.volume);

        smartTv.ligar();

        smartTv.diminuirVolume();

        smartTv.aumentarVolume();

        smartTv.aumentarUmCanal();

        smartTv.diminuirUmCanal();

        smartTv.mudarCanal(5);

        smartTv.desligar();

    }
}
