package Java_Desde_Cero_00.Operadores_y_Estructura_de_Control_Condicionales_01;

import javax.swing.JOptionPane;

public class Operadores_Relacionales_y_Logicos_01 {
    /*
    
    OPERADORES RELACIONALES

    == (igual a)
    != (difrenete que)
    > (mayor que)
    < (menor que)
    >= (mayor o igual que)
    <= (menor o igual que)

    OPERADORES LOGICOS

    && (Y)
    || (O)
    ! (NEGACION)

    */

    public static void main(String[] args) {

        //OPERADORES RELACIONALES
        
        int a = 5;
        int b = 10;
        int c = 15;

        boolean esMayorBaC = (b > c);
        boolean esDiferenteBaC = (b != c);
        JOptionPane.showMessageDialog(null, "B es mayor a C?\n"+esMayorBaC);
        JOptionPane.showMessageDialog(null, "B es diferente a C?\n"+esDiferenteBaC);
    

        //OPERADORES LOGICOS

        boolean isAnd = (a<b) && (b<c);
        JOptionPane.showMessageDialog(null, "A es mayor a B y B es mayor a C?\n: "+isAnd);

    }
}
