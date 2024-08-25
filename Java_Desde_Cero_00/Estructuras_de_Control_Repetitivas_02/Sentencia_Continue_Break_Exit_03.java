package Java_Desde_Cero_00.Estructuras_de_Control_Repetitivas_02;

public class Sentencia_Continue_Break_Exit_03 {
    public static void main(String[] args) {

        System.out.println("Uso del BREAK");
        for(int i = 0; i <10; i++){
            if (i==5){
                break;// esta funcion hace que el programa rompa cuan i llegue a 5
            }
            System.out.println(i);
        }

        System.out.println("===================================================");
        System.out.println("Uso del CONTINUE");
        for(int i = 0; i <10; i++){
            if (i==5){
                continue;// esta funcion hace que el programa continue y siga
            }
            System.out.println(i);
        }
    }
}
