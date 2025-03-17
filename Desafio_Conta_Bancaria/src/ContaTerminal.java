//Receber dados via terminal contendo caracteristicas de um conta em banco.
//Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada
//Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:
//Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque


import java.util.Scanner;
import java.util.Locale;


public class ContaTerminal {
    public static void main(String[] args){
        Scanner contaBanco = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome: ");
        String nome = contaBanco.next();

        System.out.println("Digite a sua agência:");
        String agencia = contaBanco.next();

        System.out.println("Digite o número da sua conta: ");
        int conta = contaBanco.nextInt();

        System.out.println("Digite o seu saldo bancario");
        double saldo = contaBanco.nextDouble();



        System.out.println("Óla " + nome + ", " + "obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");
        

        
    }
}
