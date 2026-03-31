package ListaExerciciosDois;

import java.util.ArrayList;
import java.util.List;

public class Exe05 {
    public static void main(String[] args) {
        // Exe5
        List<Integer> lista7 = new ArrayList<>();
        int a = 0, b = 1;
        for (int i = 0; i <= 14; i++) {
            lista7.add(a);
            int aux = a;
            a = b;
            b = aux + b;
        }

        System.out.println(lista7);
    }
}
