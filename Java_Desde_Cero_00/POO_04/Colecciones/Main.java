import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Crear una Lista(List) de tipo ArrayList
        List<Estudiante> estudiante = new ArrayList<>();
        estudiante.add(new Estudiante(101, "Henry"));
        estudiante.add(new Estudiante(102, "Bob"));
        estudiante.add(new Estudiante(103, "Alice"));

        System.out.println("Listado antes de la eliminacion");
        for(Estudiante estudiantePrueb :estudiante){
            System.out.println(estudiantePrueb);
        }

        //Eliminar un elemnto de la lista
        estudiante.removeIf(estudiantePrueb -> estudiantePrueb.getEstudianteId()==101);

        System.out.println("Listado antes de la eliminacion");
        for(Estudiante estudiantePrueb :estudiante){
            System.out.println(estudiantePrueb);
        }

    }
}
