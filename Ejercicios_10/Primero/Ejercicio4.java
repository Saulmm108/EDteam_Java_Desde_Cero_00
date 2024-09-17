package Ejercicios_10.Primero;

import javax.swing.JOptionPane;

public class Ejercicio4 {
    public static void main(String[] args) {
        int primerNumero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer valor: "));
        int segundoNumero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo valor: "));
        int contador = 0;

        for (int i = 1; i <= primerNumero; i++){
            if (primerNumero%i==0){
                contador = i;
                System.out.println(contador);
            }
        }

        System.out.println("\n");

        for (int j = 1; j <= segundoNumero; j++){
            if (segundoNumero%j==0){
                contador = j;
                System.out.println(contador);
                }
            }
        
    }
}
