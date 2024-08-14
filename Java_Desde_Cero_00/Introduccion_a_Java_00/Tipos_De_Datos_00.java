package Java_Desde_Cero_00.Introduccion_a_Java_00;

import javax.swing.JOptionPane;

public class Tipos_De_Datos_00 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"TIPOS DE DATOS \n Variables y Constantes");
        JOptionPane.showMessageDialog(null,"¿Que es un tipo de dato? \n Un tipo de dato es una forma de indicarle a la computadora si \n si lo que guardamos es un valor numerico, de texto o verdadero o falso" );
    /*Datos Basicos
    NUMEROS ENTEROS
    short = 5 digitos
    int = 4 10 digitos
    long = 19 digitos

    NUMEROS DECIMALES
    float = 6-7 digitos
    double = 15 digitos
    
    CARACTERES
    char = 1 caracter

    CADENA DE TEXTO
    String = sin limite

    VERDADERO/FALSO
    
    boolean = 1 verdadero o falso
    */
    
    short valCero = (short) Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor short (corto)"));
    int valUno = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor int (entero)"));
    long valDos = (long) Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor long (largo)"));

    float valTres =  (float) Double.parseDouble(JOptionPane.showInputDialog("Ingrese un valor float (flotante)"));
    double valCuatro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un valor double (doble)"));

    char valCindo = JOptionPane.showInputDialog("Ingrese el valor char (caracter)").charAt(0);
    String valSeis = JOptionPane.showInputDialog("Ingrese un valor String (palabra)");

    boolean valSiete = Boolean.parseBoolean(JOptionPane.showInputDialog("Ingrese un valor boolean (boleano)"));
    
    JOptionPane.showMessageDialog(null,"\sLOS VALORES INGRESADOS SON"+"\nshort = "+valCero+"\nint = "+valUno+"\nlong = "+valDos+"\nfloat = "+valTres+"\ndouble = "+valCuatro+"\nchar = "+valCindo+"\nString = "+valSeis+"\nboolean = "+valSiete );

    }
}
