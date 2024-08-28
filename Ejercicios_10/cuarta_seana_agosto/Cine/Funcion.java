package Ejercicios_10.cuarta_seana_agosto.Cine;

import java.time.*;
import java.util.*;
public class Funcion {
	int sala;
	LocalTime hora;
	String formato;
	LocalDate fecha;
	String idioma;
	int capacidad;
	Pelicula pelicula;
	public Funcion(int sala, int horas, int minutos, String formato,int d, int m, int a, 
			String idioma, int capacidad,Pelicula pelicula) {
		
		this.sala = sala;
		this.hora = LocalTime.of(horas, minutos);
		this.formato = formato;
		this.fecha = LocalDate.of(a, m, d);
		this.idioma = idioma;
		this.capacidad = capacidad;
		this.pelicula = pelicula;
	}
	@Override
	public String toString() {
		return pelicula.getTitulo() + "\tsala=" + sala + "\t" + hora + "\t" + formato + "\t" + fecha + "\t"
				+ "capacidad=" + capacidad;
	}
	public int getSala() {
		return sala;
	}
	public void setSala(int sala) {
		this.sala = sala;
	}
	public LocalTime getHora() {
		return hora;
	}
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public Pelicula getPelicula() {
		return pelicula;
	}
	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
	
	
	public static void generarFuncion(ArrayList<Funcion> funciones, ArrayList<Pelicula> peliculas) {
		Random rand = new Random();
		int idPeli = rand.nextInt(peliculas.size());
		int sala = rand.nextInt(10)+1;
		int h = rand.nextInt(24);
		int m = rand.nextInt(60);
		funciones.add(new Funcion(sala,h,m,"2D",27,8,2024,"Inglés",20,peliculas.get(idPeli)));
	}
	
	public static void mostrarFunciones(ArrayList<Funcion> funciones) {
		for (Funcion f: funciones) {
			System.out.println(f);
		}
	}
	
	
}