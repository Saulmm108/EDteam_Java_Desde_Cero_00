package Java_Desde_Cero_00.Operadores_y_Estructura_de_Control_Condicionales_01;

import javax.swing.JOptionPane;

public class Operadores_Aritmeticos_00 {
    //OPERADORES ARITMERICOS
    public static void main(String[] args) {
        //Operadores aaritmericos: +, -, /, *, %

        int numeroUno = 10;
        int numeroDos = 5;

        int suma = numeroUno + numeroDos;
        int resta = numeroUno - numeroDos;
        int multipliacaion = numeroUno * numeroDos;
        int division = numeroUno / numeroDos;
        int residuo = numeroUno % numeroDos;


        JOptionPane.showMessageDialog(null, "La suma es: "+suma);
        JOptionPane.showMessageDialog(null, "La resta es: "+resta);
        JOptionPane.showMessageDialog(null, "La multiplicacion es: "+multipliacaion);
        JOptionPane.showMessageDialog(null, "La division es: "+division);
        JOptionPane.showMessageDialog(null, "El residuo es: "+residuo);

        //NIVELES DE PRIORIDAD
        //Esta se establece con el uso de los parentesis

        int a = 1;
        int b = 2;
        int c = 3;

        int result = (a + b) * c;

        JOptionPane.showMessageDialog(null, "El valor del resultado es: "+result);

        //OPERADORES DE INCREMENTO Y DECREMENTO

        int x = 5;
        int y;

        y = ++x; //el ++ significa un valor de incremento y es muy distinto ++x y x++

        JOptionPane.showMessageDialog(null, "el valor de x : "+x);
        JOptionPane.showMessageDialog(null, "el valor de x: "+y);

        int z = 5;

        boolean isTrue = (x==z);
        JOptionPane.showMessageDialog(null, "valor isTrue: "+isTrue);
    }
}
