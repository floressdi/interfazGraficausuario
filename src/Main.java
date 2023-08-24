import javax.swing.JOptionPane;
import java.math.BigInteger;
public class Main {
    public static void main(String[] args) {

        String primerNumero = JOptionPane.showInputDialog("Introduzca el primer entero");

        int numerofactorial = Integer.parseInt(primerNumero);

        int numeronegativo = -1;
        if(numerofactorial <0){
            numerofactorial *= numeronegativo;
        }
        JOptionPane.showMessageDialog(null, "El factorial es " + factCalculator(numerofactorial), "Numero Factorial", JOptionPane.PLAIN_MESSAGE);
    }

    static BigInteger factCalculator(int n){
        BigInteger store_fact = BigInteger.ONE;
        for ( int i1=2;  i1<=n; i1++){
            store_fact = store_fact.multiply(BigInteger.valueOf(i1));
        }
        return store_fact;
    }
}