package estudo.milton.estudosJava.Enums;

public enum EstadoBrasileiro {
    SAO_PAULO ("São paulo" , "SP",11),
    RIO_DE_JANEIRO ("Rio de Janeiro","RJ",21),
    MINAS_GERAIS ("Minas Gerais","MG", 12);

    private String nome;
    private String sigla;
    private int ibge;

    EstadoBrasileiro( String nome,String sigla,int ibge) {
        this.ibge = ibge;
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public int getIbge() {
        return ibge;
    }

    public void setIbge(int ibge) {
        this.ibge = ibge;
    }
    public String nomeMaiusculo(){
       return this.nome.toUpperCase();

    }
}
