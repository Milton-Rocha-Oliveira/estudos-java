package estudo.milton.estudosJava;

public class FormatarCEP {

    public static void main(String[] arg){
        try {
            String cepFormatado = formatarCep("1584190");
            System.out.println(cepFormatado);
        }catch (CepInvalidoException e){
            System.out.println("O CEP não coresponde com as regras de negocio.");
        }

    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8) {
            throw new CepInvalidoException();
        }
        return "15.854-190";
    }
}
