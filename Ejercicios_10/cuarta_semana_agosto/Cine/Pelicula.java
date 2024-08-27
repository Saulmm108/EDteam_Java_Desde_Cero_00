package Ejercicios_10.cuarta_semana_agosto.Cine;

public class Pelicula {
    String titulo;
    int duracion;
    String genero;
    
    //Construtores
    public Pelicula(String titulo, int duracion, String genero) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
    }

    //Setters y getters
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
        return "Pelicula [titulo = " + titulo + ", duracion = " + duracion + ", genero = " + genero + "]";
    }

    
    
}
