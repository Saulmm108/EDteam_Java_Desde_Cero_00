package ArrayList.EjercicioUno;

import java.util.ArrayList;
/*
 * El Programa debe tener un menú de opciones que se desplegará de forma recurrente, las opciones que ofrecerá seran:

1. Añadir estudiante: Esta opción permitirá al docente agregar los datos de un estudiante: apellidos y nombres, nota primer parcial (sobre 100) 
y nota segundo parcial (sobre 100), a los distintos ArrayList. Estos datos se solicitaran por medio de la consola.

2. Mostrar Lista de Estudiantes: Desplegará los apellidos y nombres de los estudiantes en orden alfabetico.

3. Calcular nota de habilitación.

4. Mostrar lista de notas: Mostrará las notas de los estudiates, 1er parcial, 2do parcial y nota de habilitación junto a sus apellidos y nombres, en el 
orden en el que se introdujeron.

5. Mostrar la lista de los estudiantes habilitados

6. Salir
 */

import javax.swing.JOptionPane;

public class Menu {
    /**
     * @param args
     */
    public static void main(String[] args) {

        int opciones = -1;

        while (opciones != 0) {

            opciones = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una de las siguientes opciones\n1. Añadir estudiante\n2. Mostrar lista de estudiantes\n3. Calcular nota de habilitacion\n4. Mostrar lista de notas\n5. Mostrar lista de estudiantes habilitados\n0. Salir"));

            switch (opciones) {
                case 1:

                int add = Integer.parseInt(JOptionPane.showInputDialog("desea ingresa un nuevo dato de un alumno? "));
                    if (add == 1) {

                        String nombre = JOptionPane.showInputDialog(null, "Ingrese un su nombre");
                        String segundon = JOptionPane.showInputDialog(null, "Ingrese un su  segundo nombre");
                        String apellidoPaterno = JOptionPane.showInputDialog(null, "Ingrese un su apellido paterno");
                        String apellidoMaterno = JOptionPane.showInputDialog(null, "Ingrese un su apellido materno");
                        int primerParcial = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su nota el primer parcial"));
                        int segundoParcial = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su nota del segundo parcial"));

                        Estudiante estudiante = new Estudiante(nombre, segundon, apellidoPaterno, apellidoMaterno, primerParcial, segundoParcial);
                    }
                    break;
                case 2:
                    ArrayList <Estudiante> estudiante = new ArrayList <Estudiante>();
                    
                    JOptionPane.showMessageDialog(null, estudiante);
                    break;
                case 3:
                    
                    break;
            
                case 4:
                    
                    break;
                case 5:
                    
                    break;
            
                case 6:
                    
                    break;

                default:
                    break;
            }
            
        }
        
    }
    
}
