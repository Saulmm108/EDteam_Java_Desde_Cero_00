package Proyecto;

public class Cliente extends Personas{

    //Atributos
    private int telefono;
    private String correo;

    //Constructores
    public Cliente(String nombre, String apellidoP, String apellidoM, int ci, int telefono, String correo) {
        super(nombre, apellidoP, apellidoM, ci);
        this.telefono = telefono;
        this.correo = correo;
    }

    //Getters & Setters
    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Cliente [telefono=" + telefono + ", correo=" + correo + "]";
    }

    
    
}
