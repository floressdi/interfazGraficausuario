import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {

        System.out.println("JFrame,JTextFields, ActionEvent, ActionListener");
        Campotexto campito = new Campotexto();
        campito.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        campito.setSize(350, 300);
        campito.setVisible(true);

        // Factorial de un numero
         //String primerNumero = JOptionPane.showInputDialog("Introduzca el primer entero");
        //int numerofactorial = Integer.parseInt(primerNumero);

        //int resultado = metodo.factCalculator(numerofactorial);
        //JOptionPane.showMessageDialog(null, "El factorial es " + (resultado), "Numero Factorial", JOptionPane.PLAIN_MESSAGE);

        //Constante matematica
        //String secondNumber = JOptionPane.showInputDialog("Introduzca un numero");
        //int seNumber = Integer.parseInt(secondNumber);

        //double resuConstante = metodo.mathematicalconstant(seNumber);
        //JOptionPane.showMessageDialog(null, "El resultado es " + (resuConstante), "Constante Matematica", JOptionPane.PLAIN_MESSAGE);
    }
}