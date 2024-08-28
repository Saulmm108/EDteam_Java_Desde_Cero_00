package Ejercicios_10.cuarta_seana_agosto.Cine;

import java.util.*;
public class Main {

	public static void main(String[] args) {

		ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
		peliculas.add(new Pelicula("Deadpool",150,"Acción"));
		peliculas.add(new Pelicula("Cars",80,"Infantil"));
		peliculas.add(new Pelicula("El Padrino",150,"Drama"));
		peliculas.add(new Pelicula("Rápidos y Furiosos",120,"Acción"));
		peliculas.add(new Pelicula("Gladiador",210,"Drama"));
		peliculas.add(new Pelicula("El vuelo",120,"Drama"));
		
		
		ArrayList<Funcion> funciones =  new ArrayList<Funcion>();
		
		
		try (Scanner lector = new Scanner(System.in)) {
            int opcion = -1;
            while(opcion != 0) {
            	System.out.println("----------- CINE --------------");
            	System.out.println("1. Mostrar Peliculas");
            	System.out.println("2. Registrar Funciones");
            	System.out.println("3. Mostrar Funciones");
            	System.out.println("4. Vender Boleto");
            	System.out.println("5. Mostrar Boletos Vendidos");
            	System.out.println("0. Salir");
            	System.out.println("--------------------------------");
            	System.out.print("Ingrese una opción: ");
            	opcion =  lector.nextInt();
            	switch (opcion){
            	case 1:
            		Pelicula.mostrarPeliculas(peliculas);
            		break;
            	case 2:
            		Funcion.generarFuncion(funciones, peliculas);
            		break;
            	case 3:
            		Funcion.mostrarFunciones(funciones);
            		break;
            	}	
            }
        }
		System.out.println("Adios!");
	}

}
