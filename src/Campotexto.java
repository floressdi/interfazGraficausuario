import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Campotexto extends  JFrame{

    private JLabel etiquetaFactorial;
    private JLabel etiquetaConstante;
    private JLabel etiquetaValuex;
    private JLabel etiquetaNrepeticiones;
    private final JTextField campoFactorial;
    private final JTextField campoConstante;
    private final JTextField campovalueex;
    private final  JTextField campoNrepeticiones;
    private JButton btnMetodos;


  //  private final JButton botonmetodos;

    public  Campotexto(){

        super("Practica 1.11");
        setLayout(new FlowLayout());

        etiquetaFactorial = new JLabel("Numero a sacar factorial");
        campoFactorial = new JTextField(10);
        add(etiquetaFactorial);
        add(campoFactorial);
        // construct  Constante with default text and 21 columns
        etiquetaConstante = new JLabel("Calcular exponencial: ");
        campoConstante = new JTextField(10);
        add(etiquetaConstante);
        add(campoConstante); //add textField to JFrame
        // construct
        etiquetaValuex = new JLabel("Calcular exponencial x, ingrese x");
        campovalueex = new JTextField(5);
        etiquetaNrepeticiones = new JLabel("Ingrese la cantidad de veces que se repetirá");
        campoNrepeticiones = new JTextField(5);
        add(etiquetaValuex);
        add(campovalueex);
        add(etiquetaNrepeticiones);
        add(campoNrepeticiones);

        btnMetodos = new JButton("Calcular");
        add(btnMetodos);
        ManejadorCampotexto manejador = new ManejadorCampotexto();
        btnMetodos.addActionListener(manejador);
    }

    private class  ManejadorCampotexto implements  ActionListener{
        //Processs events
        @Override
        public void actionPerformed(ActionEvent evento){
            MetodoFactoriales metodo = new MetodoFactoriales();//intanciamos

            int numeroFactorial= Integer.parseInt(campoFactorial.getText());
            int resfac = metodo.factCalculator(numeroFactorial);

            double numeroConstante= Double.parseDouble(campoConstante.getText());
            double resCons = metodo.mathematicalconstant(numeroConstante);

            int numeroEx = Integer.parseInt(campovalueex.getText());
            int numeroRep = Integer.parseInt(campoNrepeticiones.getText());
            double resExvalue = metodo.calculate_value_ex(numeroEx, numeroRep);

            JOptionPane.showMessageDialog(
                    null,
                    "El factorial es: "+resfac+
                    "\n  El exponencial es:"+ resCons+
                     "\n El exponencial x es: "+resExvalue,
                     "Resultados", JOptionPane.PLAIN_MESSAGE);
        }
    }
}