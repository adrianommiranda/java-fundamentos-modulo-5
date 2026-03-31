package ListaExerciciosDois;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exe09 {
    public static void main(String[] args) {
        // Exe9
        Scanner n = new Scanner(System.in);
        List<Integer> lista10 = new ArrayList<>();

        for (int i = 0; i <= 9; i++){
            System.out.print("Digite um número: " );
            lista10.add(n.nextInt());
        }
        System.out.println(lista10);

        for (int i = 0; i <= 9; i++){
            if (lista10.get(i) % 2 == 0){
                System.out.println("\nNúmero par " + lista10.get(i));
                System.out.println("Posição " + i);
            }
        }
        n.close();
    }
}
