package ListaExerciciosDois;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exe08 {
    public static void main(String[] args) {
        // Exe8
        Scanner n = new Scanner(System.in);
        List<Integer> lista9 = new ArrayList<>();

        for (int i = 0; i <= 9; i++){
            System.out.print("Digite o número: ");
            lista9.add(n.nextInt());
        }

        System.out.println(lista9);

        for (int i = 0; i < lista9.size(); i++){
            if(lista9.get(i) % 10 == 0){
                System.out.println("Posição: " + i);
            }
        }

        n.close();
    }
}
