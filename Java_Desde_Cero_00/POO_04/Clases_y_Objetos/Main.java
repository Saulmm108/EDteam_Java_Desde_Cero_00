package Java_Desde_Cero_00.POO_04.Clases_y_Objetos;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Libro libroUno = new Libro("Coraline", "Neil Geitman", 2009);
        Libro libroDos = new Libro("java", "geilt", 2003);
        Libro libroTres = new Libro("Bajo la misma estrella", "Jhon Grenn", 2016);

        JOptionPane.showMessageDialog(null, libroUno);
        JOptionPane.showMessageDialog(null, libroDos);
        JOptionPane.showMessageDialog(null, libroTres);
    }
}
