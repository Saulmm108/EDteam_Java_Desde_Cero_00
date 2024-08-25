package Java_Desde_Cero_00.Arreglos_03;

import java.util.Scanner;

public class Creacion_De_Arreglos_00 {
  

    public static void main(String[] args) {
        /*ARREGLOS
         * ¿Qué es un arreglo?
         * Un arrglo es una estructura que permite almacaenar una coleccion de datos, todos
         * del mismo tipo
         * 
         * Se le conoce como una estructura de datos que te permite almacenar una lista de valores, pero
         * esos datos deben ser de la misma estructura o tipo de variable
         * 
         * posicion
         * 
         *    0     1     2     3     4  
         * -------------------------------
         * |  8  |  3  |  7  |  0  |  1  |
         * -------------------------------
         * valor entero
         *
         * ¿Cuales son sus caracteristicas?
         * 
         * La caracteristicas que tiene son:
         *      -Tamaño fijo: Un arreglo tiene un tama;o predefinido de su
         *       creación.
         *      -Elemtos del mismo tipo: Todos los elemtos dentro de un arreglo
         *       deben ser del mismo tipo de dato.
         *      -Acceso por indice o posicion: Los elemtos se acceden y modifican
         *       mediante un indice
         * 
         * Ventajas
         * 
         * 1.-Permite almacenar multiples elementos
         * 2.-Facilitan la organizacion y manejo de conjuntos
         * 3.- Mejoran la legibilidad y la estructura del codigo
         */
        Scanner scanner = new Scanner(System.in);

        


         scanner.close();
    }

    //Creamos 2 metodos

    public static int readValue(String message){
        System.out.println(message);
        return new Scanner(System.in).nextInt();
    }

    public static int readValue(int value1, int value2, int value3, int value4){
        System.out.println(readValue(null));
        return new Scanner(System.in).nextInt();
    }

    
}
