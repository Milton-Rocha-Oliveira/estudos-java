package estudo.milton.estudosJava.POO.Lanchonete.Atendimento.Cliente.Cozinha;

import estudo.milton.estudosJava.POO.Lanchonete.Atendimento.Cliente.Atendente;

public class Cozinhneiro {
    public void receberPedido(){

    }
    public void adicionarLancheNoBalcao(){
        System.out.println("ADICIONANDO LANCHE NATURAL HAMBURGER NO BALCAO");
    }
    public void adicionarSucoNoBalcao(){
        System.out.println("ADICIONANDO SUCO NO BALCAO");
    }
    public void adicionarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }
    public void pedidoNoBalcao(){

    }
    private void prepararLanche(){
        System.out.println("PREPARANDO LANCHE TIPO HAMBURGER");
    }
    private void prepararVitamina(){
        System.out.println("PREPARANDO VITAMINA DE FRUTAS");
    }
    private void prepararComboVitamina(){
        prepararLanche();
        prepararVitamina();
    }
    private void selecionarIngredientesLanche(){
        System.out.println("SELECIONAR O PÃO, SALADA, OVO E CARNE");
    }
    private void selecionarIngredientesVitamina(){
        System.out.println("SELECIONAR FRURA, LEITE E SUCO");
    }
    private void lavarIngredientes(){
        System.out.println("LAVANDO INGREDIENTES");
    }
    private void baterVitaminaLiquidificador(){
        System.out.println("BATENDO VITAMINA LIQUIDIFICADOR");
    }
   private void fritarIngredientesLanche(){
       System.out.println("FRITANDO A CARNE E O OVO PARA O HAMBURGER.");
   }
     private void pedirParaTrocarGaz(Almoxarife meusAmigo){
       meusAmigo.trocarGas();
   }
     private void pedirIngredientes(Almoxarife almoxarife){
        almoxarife.entregarIngredientes();
    }
}
