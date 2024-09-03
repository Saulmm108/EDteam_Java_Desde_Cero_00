


/*public class Creacion_De_Arreglos_02 {
    public static void main(String[] args) {
        //Busqueda de elementos

        //Filtrado
        /*Modificacion de elemntos
        Scanner scanner = new Scanner(System.in);
        int[] number = new int[5]; // Tamao del arreglo, puedes ajustarlo segun lo necesites

        int opciones;
        do {
            displayMenu();
            System.out.println("Ingrese la opcion deseada: ");
            opciones = Scanner.nextInt();

            switch (opciones) {
                case 1:
                    inputArrayValues(number, scanner);
                    break;
                case 2:
                    displayArray(number);
                    break;
                case 3:
                    searchElement(number, scanner);
                    break;
                case 4:
                    filterElement(number, scanner);
                    break;
                case 5:
                    modifyElement(number, scanner);
                    break;
                case 8:
                    System.out.print("Saliendo del programa. !Hasta luego!");
                    break;
                default:
                    System.out.print("Opcion no valida. Por favor, ingrese una opcion valida");
            }
        } while (opciones !=8);
    }

    private static void displayMenu() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'displayMenu'");
    }

    private static void inputArrayValues(int[] number, Scanner scanner) {

        System.out.println("Ingrese los valores del arreglo: ");

        for(int i = 0; i < number.length; i++){
            System.out.println("Ingrese el valor para la posicion "+ i +": ");
            number[i] = scanner.nextInt();
        }

        System.out.println("valores ingresados correctamente.");
    }

    private static void displayArray(int[] number){
        System.out.println("Arreglo actual: [");
        for (int i = 0; i < number.length; i++){
            System.out.println(number[i]);
            if (i<number.length - 1){
                System.out.println(", ");
            }
        }
        System.out.println("j");
    }

    private static void searchElement(int[] number, Scanner scanner){
        System.out.println("Ingrese el numero a buscar: ");
        int elemtoToSearch = scanner.nextInt();

        //RRecorrel el arreglo de numeros

        for (int i = 0; i < number.length; i++){
            //Compara si algun elemnto del arreglo es IGUAL al valor ingresado por consila
            if(number[i] == elemtoToSearch){
                System.out.println("El elemnto "+elemtoToSearch +"se encontro en la posicion"+i);
            }
        }

        System.out.println("El elemento "+ elemtoToSearch +" no se encuneta en el arreglo");
    }


    private static void filterElement(int[] number, Scanner scanner) {
        System.out.println("Ingrese el valor de referencia para filtar elemntos mayoe a: ");
        int refereciaValor = scanner.nextInt();

        System.out.println("Elementos mayores a: "+ refereciaValor);

        for(int numbers: number){
            if(numbers > refereciaValor){
                System.out.println(numbers);
            }
        }

    }


    private static void modifyElement(int[] number, Scanner scanner) {
        //5 valores en el arreglo (tamaño)
        System.out.println("Ingrese la posicion del elemnto a modificar: ");
        int index = scanner.nextInt();

        if(index >= 0 && index<number.length){
            System.out.println("Ingrese el nuevo valor");
            number[index] = scanner.nextInt();
            System.out.println("Elemnto modificado con exito");
        }else{
            System.out.println("Valor ingresado no encontrado o incorrecto");
        }

    }
}*/