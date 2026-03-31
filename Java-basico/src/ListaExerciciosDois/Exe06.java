package ListaExerciciosDois;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exe06 {
    public static void main(String[] args) {
        // Exe6
        List<Integer> lista8 = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i <= 6; i++) {
            lista8.add(random.nextInt(101));
        }

        System.out.println(lista8);
    }
}
