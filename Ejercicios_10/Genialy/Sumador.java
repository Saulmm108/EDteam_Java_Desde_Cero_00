package Ejercicios_10.Genialy;

import javax.swing.JOptionPane;

public class Sumador {
    
        public static void main(String[] args) {
            int numero;
            int sumaPrimos = 0;
    
            // Bucle que solicita números hasta que el usuario ingrese un 0
            do {
                numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número entero (0 para terminar):"));
                
                // Verificar si el número es primo y sumarlo si lo es
                if (esPrimo(numero) && numero != 0) {
                    sumaPrimos += numero;
                }
            } while (numero != 0);
    
            // Mostrar el resultado de la suma de los números primos
            JOptionPane.showMessageDialog(null, "La suma de los números primos es: " + sumaPrimos);
        }
    
        // Método que verifica si un número es primo
        public static boolean esPrimo(int numero) {
            if (numero <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
    