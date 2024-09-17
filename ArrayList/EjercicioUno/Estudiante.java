package ArrayList.EjercicioUno;

public class Estudiante {

    //Atributos
    String nombre;
    String segundoNombre;
    String apellidoPaterno;
    String apellidoMaterno;
    int primerParcial;
    int segundoPrcial;

    //Constructores
    public Estudiante(String nombre, String segundoNombre, String apellidoPaterno, String apellidoMaterno,
            int primerParcial, int segundoPrcial) {
        this.nombre = nombre;
        this.segundoNombre = segundoNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.primerParcial = primerParcial;
        this.segundoPrcial = segundoPrcial;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public int getPrimerParcial() {
        return primerParcial;
    }

    public void setPrimerParcial(int primerParcial) {
        this.primerParcial = primerParcial;
    }

    public int getSegundoPrcial() {
        return segundoPrcial;
    }

    public void setSegundoPrcial(int segundoPrcial) {
        this.segundoPrcial = segundoPrcial;
    }

    
    //Override
    @Override
    public String toString() {
        return "Estudiante\nnombre = " + nombre + "\nsegundoNombre = " + segundoNombre + "\napellidoPaterno = "
                + apellidoPaterno + "\napellidoMaterno = " + apellidoMaterno + "\nprimerParcial = " + primerParcial
                + "\nsegundoPrcial=" + segundoPrcial;
    }

}
