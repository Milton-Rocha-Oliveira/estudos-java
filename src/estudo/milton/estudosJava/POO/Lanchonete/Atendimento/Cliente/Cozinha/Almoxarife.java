package estudo.milton.estudosJava.POO.Lanchonete.Atendimento.Cliente.Cozinha;

public class Almoxarife {
    private void controlarEntrada(){
        System.out.println("CONTROLANDO ENTRADA");
    }
    private void controlarSaida(){
        System.out.println("CONTROLANDO SAIDA");
    }
     void entregarIngredientes(){
        System.out.println("ENTREGANDO INGREDIENTES");
        controlarSaida();
    }
     void trocarGas(){
        System.out.println("ALMOXARIFE TROCANDO GAS");
    }
}
