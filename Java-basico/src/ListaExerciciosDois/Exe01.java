package ListaExerciciosDois;

import java.util.ArrayList;
import java.util.List;

public class Exe01 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList();

        // Exe1 - Primeira forma
        for (int i = 0; i <= 7; i++){
            lista.add(999);
        }

        System.out.println(lista);
    }
}
