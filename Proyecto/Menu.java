package Proyecto;

import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Mostrar el menú
            System.out.println("\n=== Menú de Opciones ===");
            System.out.println("1. Ver productos");
            System.out.println("2. Realizar una compra");
            System.out.println("3. Consultar saldo");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            // Leer la opción del usuario
            opcion = scanner.nextInt();

            // Evaluar la opción con switch
            switch (opcion) {
                case 1:
                    System.out.println("Mostrando lista de productos...");
                    break;
                case 2:
                    System.out.println("Realizando una compra...");
                    break;
                case 3:
                    System.out.println("Consultando saldo...");
                    break;
                case 0:
                    System.out.println("Saliendo del sistema. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 0); // El bucle se repite mientras la opción no sea 0

        scanner.close();
    }
}