import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        MetodoFactoriales metodo = new MetodoFactoriales();
        // Factorial de un numero
        String primerNumero = JOptionPane.showInputDialog("Introduzca el primer entero");
        int numerofactorial = Integer.parseInt(primerNumero);

        int resultado = metodo.factCalculator(numerofactorial);
        JOptionPane.showMessageDialog(null, "El factorial es " + (resultado), "Numero Factorial", JOptionPane.PLAIN_MESSAGE);

        //Constante matematica
        String secondNumber = JOptionPane.showInputDialog("Introduzca un numero");
        int seNumber = Integer.parseInt(secondNumber);

        double resuConstante = metodo.mathematicalconstant(seNumber);
        JOptionPane.showMessageDialog(null, "El resultado es " + (resuConstante), "Constante Matematica", JOptionPane.PLAIN_MESSAGE);

    }
}