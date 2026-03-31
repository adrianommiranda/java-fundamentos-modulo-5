package ListaExerciciosDois;

import java.util.ArrayList;
import java.util.List;

public class Exe01B {
    public static void main(String[] args) {
        // Exe1 - Segunda forma
        List<Integer> lista2 = new ArrayList();
        for (int i = 0; i <= 7; i++){
            // Primeiro, adiciona elementos null para criar as posições
            lista2.add(null);
        }

        for (int i = 0; i <= 7; i++){
            // Agora pode usar set() para modificar as posições existentes
            lista2.set(i, 888);
        }
        System.out.println(lista2);
    }
}
