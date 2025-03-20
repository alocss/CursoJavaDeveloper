public class FormatorCepExemplo {
    public static void main(String[] args) {  
        try {
            String cepFormatado = formatarCep("23765064");
            System.out.println(cepFormatado);

        } catch (CepInvalidException e) {
            System.out.println("O cep informado é inválido");
        }
    }
    static String formatarCep(String cep) throws CepInvalidException {
        if (cep.length() != 8) {
            throw new CepInvalidException();


            //Simulando um cep formatado
        }
        return "23,765-064";
    }
}
