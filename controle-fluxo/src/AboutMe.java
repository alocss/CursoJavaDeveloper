import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;


public class AboutMe {

    public static void main(String[] args) {


        try{
        //Criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite a sua altura: ");
        double altura = scanner.nextDouble();


        //Imprimindo os dados obtidos pelo usuario
        System.out.println("Nome: " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Idade: " + idade+ " anos");
        System.out.println("Altura: " + altura + " cm");  
        }catch(InputMismatchException e){
            System.out.println("Os campos idade e altura precisão ser numéricos");
        }


    }
}