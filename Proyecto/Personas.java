package Proyecto;

//Clase abstracta

public abstract class Personas {

    //Atributos
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private int ci;

    //Contructores
    public Personas(String nombre, String apellidoP, String apellidoM, int ci) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.ci = ci;
    }

    //Getters & Setters
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellidoP() {
        return apellidoP;
    }


    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }


    public String getApellidoM() {
        return apellidoM;
    }


    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }


    public int getCi() {
        return ci;
    }


    public void setCi(int ci) {
        this.ci = ci;
    }

    @Override
    public String toString() {
        return "Personas \nnombre : " + nombre + "\napellido Paterno: " + apellidoP + "\napellido Materno:" + apellidoM + "\nCi: " + ci;
    }

}
