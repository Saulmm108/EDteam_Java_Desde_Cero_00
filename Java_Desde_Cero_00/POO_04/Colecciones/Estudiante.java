public class Estudiante {
    //Atributos
    int estudianteId;
    String nombre;

    //Constructores
    public Estudiante(int estudianteId, String nombre) {
        this.estudianteId = estudianteId;
        this.nombre = nombre;
    }

    //Getters & Setters
    public int getEstudianteId() {
        return estudianteId;
    }

    public void setEstudianteId(int estudianteId) {
        this.estudianteId = estudianteId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Estudiante EstudianteId=" + estudianteId + ", nombre=" + nombre;
    }

    
    
}
