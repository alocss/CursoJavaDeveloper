package utilizando;

public enum EstadoBrasileiro {
    SAO_PAULO("São Paulo", "SP"),
    RIO_DE_JANEIRO("Rio de Janeiro", "RJ"), 
    PIAUI ("Piauí", "PI"),
    BAHIA("Bahia", "BA");

    private String nome;
    private String sigla;

    EstadoBrasileiro(String nome, String sigla){
        this.nome = nome;
        this.sigla = sigla;
    }
    public String getNome(){
        return nome;
    }
    public String getSigla(){
        return sigla;
    }   
    
    
}
