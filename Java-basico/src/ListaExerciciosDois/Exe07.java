package ListaExerciciosDois;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exe07 {
    public static void main(String[] args) {
        // Exe7
        //Primeira forma

       List<String> listaNome = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i <=6; i++){
            listaNome.add(null);
        }

        for (int i = 0; i <= 6; i++){
            System.out.print("Entre com o " + (i+1) + " nome ");
            String nome = scan.nextLine();
            listaNome.set(i, nome);
        }
        Collections.reverse(listaNome);
        System.out.println(listaNome);

        scan.close();
    }
}
