package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno(); // Objeto felipe 

        felipe.setNome("Felipe"); // Valores do objeto felipe
        felipe.setIdade(8); // Valores do objeto felipe

    System.out.println("O aluno" + felipe.getNome() + "tem" + felipe.getIdade() + "anos");
    }
    
}
