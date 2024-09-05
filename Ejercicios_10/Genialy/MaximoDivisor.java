package Ejercicios_10.Genialy;

import javax.swing.JOptionPane;

//Escribir un programa que determine el maximo comun divisior de 2 numeros

public class MaximoDivisor {
    public static void main(String[] args) {
        
        int primerNumero = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el primer valor"));
        int segundoNumero = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el segundo valor"));
       // Calcular el MCD utilizando el algoritmo de Euclides
       int resultado = calcularMCD(primerNumero, segundoNumero);

       // Mostrar el resultado
       JOptionPane.showMessageDialog(null, "El máximo común divisor de " + primerNumero + " y " + segundoNumero + " es: " + resultado);
   }

   // Método para calcular el MCD usando el algoritmo de Euclides
   public static int calcularMCD(int a, int b) {
       while (b != 0) {
           int temp = b;
           b = a % b;
           a = temp;
       }
       return a;
   }
}

