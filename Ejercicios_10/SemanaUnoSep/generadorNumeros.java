package Ejercicios_10.SemanaUnoSep;

import java.util.Random;

public interface generadorNumeros {
    Random random = new Random();
        int min = 10;
        int max = 20;
    int randomNumber = random.nextInt((max - min) + 1) + min;
}
