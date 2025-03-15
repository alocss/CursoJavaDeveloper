// Primeiro desafio 
//Verificar quais palavras tem até 5 letras e deixa como está e a com mais de 5 letras vamo retornar ela invertida respeitando os espaços


//Declarando classe InverterPalavras 
public class InverterPalavras {
    //Declarando metodo inverterPalavras que tem como objetivo inverter as palavras
    public String inverterPalavras(String frase){
        //Aqui ocorre uma operação de separação da frase. O método split(" ") é utilizado para dividir a string frase em várias partes (palavras).
        // O espaço em branco (" ") é o delimitador, ou seja, o método vai separar a string sempre que encontrar um espaço entre as palavras. 
        //O resultado disso é armazenado em um array de strings chamado palavras.
        String[] palavras = frase.split(" ");
        
        // O for está percorrendo a array 
        for(int i = 0; i < palavras.length; i++){
            // O if vai verificar  quais palavras tem 5 ou mais letras 
            if(palavras[i].length()>= 5){
                palavras[i] = new StringBuilder(palavras[i]).reverse().toString(); // O objeto StringBuilder  vai trnaforma a String em objeto para poder inverter 
                                                                                  //  O reverse é oque vai inverter as palavras e o toString vai transformar novamente em String



            }
        }
        return 0;
    }
}