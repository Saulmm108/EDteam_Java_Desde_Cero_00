package Ejercicios_10.Genialy;

import javax.swing.JOptionPane;

public class NumerosPrimos {
    public static void main(String[] args) {
        int numeroPrimo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero"));
        int residuo;

        for (int i = 0 ; i<=numeroPrimo ; i++){ 
            if (numeroPrimo % i == 0){
                JOptionPane.showMessageDialog(null, "Es primo ");
            }
        }
    }
}
