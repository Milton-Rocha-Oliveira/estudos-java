package estudo.milton.estudosJava;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Scanner;
import java.util.Locale;

public class ExemploExecao {
    public static void main(String[] args) {
        Number valor;
        try {

            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);

        }catch(ParseException e){
            e.printStackTrace();
        }
    }
}
