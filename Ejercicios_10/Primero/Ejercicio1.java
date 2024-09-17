package Ejercicios_10.Primero;

import javax.swing.JOptionPane;

public class Ejercicio1 {
    public static void main(String[] args) {

        //fecha inicio
        int diaInicio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia de inicio"));
        int mesInicio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes de inicio"));
        int añoInicio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de inicio"));

        //fecha fin
        int diaFin = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia de final"));
        int mesFin = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes de final"));
        int añoFin = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de final"));

        int diasTotales;
        int mesesTotales;
        int añosTotales;
        int contador=0;

        if (diaInicio>=diaFin) { 
              diasTotales = 30 - diaInicio + diaFin;
        } else {
            diasTotales = diaFin - diaInicio;
        }

        if (mesInicio>=mesFin) {
            mesesTotales = 12 - mesInicio + mesFin;
        } else {
            mesesTotales = mesFin - mesInicio;
        }

        if (añoInicio<=añoFin) {
            añosTotales = añoFin - añoInicio;
        } else {
            JOptionPane.showMessageDialog(null, "El año final no puede ser menor al año inicial");
            return;
        }

        JOptionPane.showMessageDialog(null, "CALCULADOR DE FECHAS\nFecha Inicial ingresada: " + diaInicio + "/" + mesInicio + "/" + añoInicio
            + "\nFecha Final ingresada: " + diaFin + "/" + mesFin + "/" + añoFin + "\nfecha transcurrida total " + diasTotales + "/" + mesesTotales + "/" + añosTotales
            + "\nDias transcurridos: ");

        while (mesInicio <= mesFin) {
            mesInicio++;
            contador = contador + 1;
        }
    
        contador = contador * 30 + diasTotales -30;
        JOptionPane.showMessageDialog(null, contador);
    }
}
