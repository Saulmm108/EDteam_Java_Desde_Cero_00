package Java_Desde_Cero_00.Arreglos_03;

import java.util.Scanner;

public class Creacion_De_Arreglos_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Declarar un arreglo de numero que soporte 4 valores

        int [] values = new int[4];

        //Lectura de datos

        for (int i = 0; i < values.length ; i++){
            values[i] = readValue("Ingrese el valor "+ (i+1)+": ");
        }

        int max = getMaxValue(values);
        System.out.println("El valor maximo es: "+ max);

        scanner.close();

    }


    @SuppressWarnings("resource")
    public static int readValue(String message){
        System.out.println(message);
        return new Scanner(System.in).nextInt();
    }

    public static int getMaxValue(int[] values){
        int max = values[0];//Asignar el valor que se ubica en la posicion 0

        for (int i = 0; i < values.length; i++)
            if(values[i]>max){
                max = values[i];
        }
        return max;
        
    }
}
