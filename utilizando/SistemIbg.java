package utilizando;

public class SistemIbg {
    public static void main(String[] args) {
        for (EstadoBrasileiro e: EstadoBrasileiro.values()){
            System.out.println("Nome: " + e.getNome() + " - Sigla: " + e.getSigla());
        }
    }
}
