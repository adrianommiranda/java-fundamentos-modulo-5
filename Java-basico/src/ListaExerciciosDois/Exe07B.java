package ListaExerciciosDois;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exe07B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Exe7
        //Segunda forma
        List<String> listaNome2 = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            System.out.print("Digite um nome: ");
            listaNome2.add(scan.nextLine());
        }

        for (int i = listaNome2.size() - 1; i >= 0; i--) {
            System.out.println(listaNome2.get(i));
        }

        scan.close();
    }
}
