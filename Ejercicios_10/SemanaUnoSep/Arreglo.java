package Ejercicios_10.SemanaUnoSep;

public class Arreglo{

    //Atributos
    int tamaño;
    int random;

    //Constructores
    public Arreglo(int tamaño, int random) {
        this.tamaño = tamaño;
        this.random = random;
    }

    //Getters y Setters
    public int getTamaño() {
        return tamaño;
    }
    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    public int getRandom() {
        return random;
    }
    public void setRandom(int random) {
        this.random = random;
    }

    @Override
    public String toString() {
        return "Arreglo \ntamaño=" + tamaño + ",\nrandom=" + random ;
    }
    

    
}
