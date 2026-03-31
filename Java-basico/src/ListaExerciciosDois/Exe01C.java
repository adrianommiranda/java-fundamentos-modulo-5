package ListaExerciciosDois;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exe01C {
    public static void main(String[] args) {
        // Exe1 - terceira forma
        // Cria uma lista com 8 elementos, todos com valor 777
        List<Integer> lista3 = new ArrayList<>(Collections.nCopies(8, 777));
        System.out.println(lista3);
    }
}
