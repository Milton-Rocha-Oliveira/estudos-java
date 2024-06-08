package SistemaIphone.Aparelho.Telefone;


public class ReceberChamada implements Telefone{
    public void usarTelefone() {
        receberChamada();
    }
    private void receberChamada(){
        System.out.println("...RECEBENDO CHAMADA...");
    }
}
