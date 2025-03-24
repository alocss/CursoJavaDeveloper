package estruturas_repetição.construtore;

public class Pessoa {
    private String nome;
    private String cpf;
    private String enderenco;

    //Método construtor, Estou informando que sempre que forem criar um objeto Pessoa, é necessário informar o nome e o cpf
    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf; 
    }

    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    public String getEndereco(){
        return enderenco;
    }
    public void setEdenreco(String endereco){
        this.enderenco = endereco;
    }

    
}
