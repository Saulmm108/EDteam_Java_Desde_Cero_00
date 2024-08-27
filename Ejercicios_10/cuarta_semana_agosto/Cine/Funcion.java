package Ejercicios_10.cuarta_semana_agosto.Cine;

import java.time.*;

public class Funcion {

    int sala;
    LocalTime hora;
    String formato;
    LocalDate fecha;
    String idioma;
    int capacidad;
    Pelicula pelicula;

    //Constructor

    public Funcion(int sala, int hora, int minutos, String formato, int a ,int m, int d, String idioma, int capacidad,
            Pelicula pelicula) {

        this.sala = sala;
        this.hora = LocalTime.of(hora, minutos);
        this.formato = formato;
        this.fecha = LocalDate.of(a, m, d);
        this.idioma = idioma;
        this.capacidad = capacidad;
        this.pelicula = pelicula;
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

    @Override
    public String toString() {
        return "Funcion [sala = " + sala + ", hora = " + hora + ", formato = " + formato + ", fecha = " + fecha + ", idioma = "
                + idioma + ", capacidad = " + capacidad + ", pelicula = " + pelicula + "]";
    }


    
    


}
