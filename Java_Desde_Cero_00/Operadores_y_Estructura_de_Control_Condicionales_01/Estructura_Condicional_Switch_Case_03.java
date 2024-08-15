package Java_Desde_Cero_00.Operadores_y_Estructura_de_Control_Condicionales_01;

import javax.swing.JOptionPane;

public class Estructura_Condicional_Switch_Case_03 {
    public static void main(String[] args) {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "              CACULADORA\n1.-Suma\n2.-Resta\n3.-Multiplicacion\n4.-Dvision\nIngrese un opcion"));

        switch (opcion) {
            case 1:
                    JOptionPane.showMessageDialog(null, "SUMA\nIngrese los valores a sumar");
                    int numeroUno = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer valor"));
                    int numeroDos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo valor"));
                    JOptionPane.showMessageDialog(null, "El resultado es: "+(numeroUno + numeroDos));
                break;
            case 2:
                    JOptionPane.showMessageDialog(null, "RESTA\nIngrese los valores a restar");
                    numeroUno = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer valor"));
                    numeroDos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo valor"));
                    JOptionPane.showMessageDialog(null, "El resultado es: "+(numeroUno - numeroDos));
                break;
            case 3:
                    JOptionPane.showMessageDialog(null, "MULTIPLICACION\nIngrese los valores a multiplicar");
                    numeroUno = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer valor"));
                    numeroDos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo valor"));
                    JOptionPane.showMessageDialog(null, "El resultado es: "+(numeroUno * numeroDos));
                break;
            case 4:
                    JOptionPane.showMessageDialog(null, "DIVISION\nIngrese los valores a division");
                    numeroUno = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer valor"));
                    numeroDos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo valor"));
                    JOptionPane.showMessageDialog(null, "El resultado es: "+(numeroUno / numeroDos));
                break;
        }

    }
}
