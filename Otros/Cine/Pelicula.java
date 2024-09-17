package Otros.Cine;

import java.util.ArrayList;

public class Pelicula {
    String titulo;
	int duracion;
	String genero;
	
	public Pelicula(String titulo, int duracion, String genero) {
		this.titulo = titulo;
		this.duracion = duracion;
		this.genero = genero;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return titulo + "\t" + duracion + " min\t" + genero;
	}
	
	
	public static void mostrarPeliculas(ArrayList<Pelicula> peliculas) {
		for (Pelicula p: peliculas) {
			System.out.println(p);
		}
	}
}
