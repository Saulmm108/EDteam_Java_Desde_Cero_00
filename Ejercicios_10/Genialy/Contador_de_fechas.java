package Ejercicios_10.Genialy;

//Escribir un programa que determine cuantos dias hay entre 2 fechas

import javax.swing.JOptionPane;

public class Contador_de_fechas {
    public static void main(String[] args) {
        //Fecha inicial a ingresa
        int diaInicio =Integer.parseInt(JOptionPane.showInputDialog("Recuerda los dias no pueden ser mayores a 31\nIngrese el dia de inicio: "));
        int mesInicio =Integer.parseInt(JOptionPane.showInputDialog("Recuerda los meses no pueden ser mayores a 12\nIngrese el mes de inicio: "));
        int añoInicio =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de inicio: "));

        //Fecha final a ingresar
        int diaFin =Integer.parseInt(JOptionPane.showInputDialog("Recuerda los dias no pueden ser mayores a 31\nIngrese el dia de final: "));
        int mesFin =Integer.parseInt(JOptionPane.showInputDialog("Recuerda los meses no pueden ser mayores a 12\nIngrese el mes de final: "));
        int añoFin =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de final: "));
        
        //Resultados
        int diasCalculado;
        int mesCalculado;
        int añoCalculado;

        if (diaInicio<32 && mesInicio<13) {
            if (diaInicio>diaFin) {
                diasCalculado = diaInicio - 30 + diaFin;
            } else {
                diasCalculado = diaFin - diaInicio;
            }

            if (mesInicio>mesFin) {
                mesCalculado = mesInicio - 12 + mesFin;
            } else {
                mesCalculado = mesFin - mesInicio;
            }
            if (añoInicio<=añoFin) {
                añoCalculado = añoFin - añoInicio;
            } else {
                JOptionPane.showMessageDialog(null, "El año final ingresado no puede ser menor al año de inicio");
            }

            JOptionPane.showMessageDialog(null,"Fecha inicio ingresada = " + diaInicio + "/" + mesInicio + "/" + añoInicio + 
            "\nFecha fin ingresada = " + diaFin + "/" + mesFin + "/" + añoFin +
            "\nEl calculo restante seria = " + diasCalculado + "/" + mesCalculado + "/");
        } else {
            JOptionPane.showMessageDialog(null,"Error a ingresar los datos");
        }

    }
    
}
