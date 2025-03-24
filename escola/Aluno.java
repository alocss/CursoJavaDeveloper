package escola;

public class Aluno {
    private String nome; 
    private int idade;
    
    public String getNome (){ //getter
        return nome;    
    }
    public void setNome(String newNome){  //setter
        nome = newNome;
    }
    public int getIdade(){ //getter
        return idade;
    }
    public void setIdade(int newIdade){ //setter
        this.idade = newIdade;
    }
}
