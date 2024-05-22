package estudo.milton.estudosJava;

public class Metodos {
    public static void main(String [] args){
        System.out.println("Jesus Live");
        String textoBiblia = bible();

        String palavraDoDia = "João 3:16...PORQUE DEUS AMOU AO MUNDO DE TAL MANEIRA, QUE DEU SEU FILHO UNIGENITO, PARA QUE TODO AQUELE QUE NELE CRER NÃO PEREÇA MAIS TENHA VIDA ETERNA";
        System.out.println(palavraDoDia);
        System.out.println(textoBiblia);
        System.out.println("Os dois textos biblicos, são iguais ? " + palavraDoDia.equals(textoBiblia));
    }
    public static String bible(){
        return "João 3:16...PORQUE DEUS AMOU AO MUNDO DE TAL MANEIRA, QUE DEU SEU FILHO UNIGENITO, PARA QUE TODO AQUELE QUE NELE CRER NÃO PEREÇA MAIS TENHA VIDA ETERNA";
    }
}
