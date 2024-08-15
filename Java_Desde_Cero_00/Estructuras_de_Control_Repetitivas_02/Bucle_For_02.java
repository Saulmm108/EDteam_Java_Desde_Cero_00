package Java_Desde_Cero_00.Estructuras_de_Control_Repetitivas_02;

public class Bucle_For_02 {
    public static void main(String[] args) {
        
        int  sum = 0;

        for (int i = 0; i <= 10; i++){

            //preguntamos si el valor de i es par:
            if (i % 2 == 0 ){
                System.out.println("Valor de i: "+ i);
                sum = sum + i;

            }
        }

        System.out.println("La suma de los valores pares es:"+ sum);
    }
}
