import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {
        Number valor;
        try {
            valor = NumberFormat.getInstance().parse("a1,5");
        } catch (ParseException e) {
           e.printStackTrace();
        }
    
}
}
