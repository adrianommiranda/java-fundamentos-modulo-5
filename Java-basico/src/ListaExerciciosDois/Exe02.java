package ListaExerciciosDois;

import java.util.ArrayList;
import java.util.List;

public class Exe02 {
    public static void main(String[] args) {
        // Exe2
        List<Integer> lista4 = new ArrayList<>();
        for (int i = 0; i <= 9; i++){
            lista4.add(5 * (i+1));
        }
        System.out.println(lista4);
    }
}
