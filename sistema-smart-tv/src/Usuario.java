public class Usuario {
    public static void main(String[] args) throws Exception {
        //Criando uma instância da classe SmartTV
        SmartTV smartTV = new SmartTV();

        //Status Inical da TV
        System.out.println("TV Ligada ? " + smartTV.ligada);
        System.out.println("Canal Atual: " + smartTV.canal);
        System.out.println("Volume Atual: " + smartTV.volume);

        // Chamando os métodos e imprimindo o status da TV
        smartTV.ligar();
        System.out.println("TV Ligada ? " + smartTV.ligada);
        smartTV.aumentarVolume();
        System.out.println("Volume Atual: " + smartTV.volume);
        smartTV.mudarCanal(12);
        System.out.println("Canal Atual: " + smartTV.canal);

        

    }
}
