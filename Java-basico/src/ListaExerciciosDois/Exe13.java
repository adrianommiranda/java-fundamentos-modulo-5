package ListaExerciciosDois;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Exe13 {
    public static void main(String[] args) {
        // Exe13
        Random r = new Random();
        List<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            numeros.add(r.nextInt(100));
        }

        System.out.println("Números gerados:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        Collections.sort(numeros);

        System.out.println("\n\nNúmeros ordenados:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

    }
}
