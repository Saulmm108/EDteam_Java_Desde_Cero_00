package Ejercicios_10.cuarta_semana_agosto.Cine;

public class Main {

    //"\t" sirve para tabulacion al imprimir un mensaje
    
    public static void main(String[] args) {
        Pelicula p1 = new Pelicula("Deadpool", 150, "Accion comedia");
        System.out.println(p1);
        Funcion f1 = new Funcion(10, 14, 0, "3D", 2024, 8, 24, "Ingles", 200, p1);
        System.out.println(f1);
        Boleto b1 = new Boleto(12, 5, 45, "9883243", "Saul Machicado", f1);
        System.out.println(b1);
    }
}
