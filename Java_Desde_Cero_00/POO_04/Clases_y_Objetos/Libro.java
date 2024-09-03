package Java_Desde_Cero_00.POO_04.Clases_y_Objetos;

public class Libro {
    //Informacion de un libro

    //Atributos
    private String titulo;
    private String autor;
    private int año;

    //Constructor
    public Libro(String titulo, String autor, int año) {
        this.titulo = titulo; 
        this.autor = autor;
        this.año = año;
    }

    /*setters y getters
    get es obtener y set es asignar
    */
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    //toString
    @Override
    public String toString() {
        return "\tLibro\ntitulo = " + titulo + "\nautor = " + autor + "\naño = " + año;
    }

}
