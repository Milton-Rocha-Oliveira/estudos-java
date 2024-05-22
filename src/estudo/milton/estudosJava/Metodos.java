package estudo.milton.estudosJava;

public class Metodos {
    public static void main(String [] args){
        System.out.println("Jesus Live");
        String biblicalText = bible();

        String wordOfTheDay = "John 3:16...FOR GOD SO LOVED THE WORLD, THAT HE GAVE HIS ONLY BEGOTTEN SON, THAT WHOEVER BELIEVES IN HIM SHALL NOT PERISH BUT HAVE ETERNAL LIFE";
        System.out.println(wordOfTheDay);
        System.out.println(biblicalText);
        System.out.println("The two biblical texts are the same ? " + wordOfTheDay.equals(biblicalText));
    }
    public static String bible(){
        return "John 3:16...FOR GOD SO LOVED THE WORLD, THAT HE GAVE HIS ONLY BEGOTTEN SON, THAT WHOEVER BELIEVES IN HIM SHALL NOT PERISH BUT HAVE ETERNAL LIFE";
    }
}

