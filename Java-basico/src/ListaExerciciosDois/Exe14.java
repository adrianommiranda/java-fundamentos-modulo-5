package ListaExerciciosDois;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exe14 {
    public static void main(String[] args) {
        // Exe14
        Scanner scan = new Scanner(System.in);
        //int idade = scan.nextInt();
        //String nome = scan.next();

        List<String> listaNome = new ArrayList();
        List<Integer> listaIdade = new ArrayList();

        for (int i = 0; i < 4; i++){
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            listaNome.add(scan.nextLine());
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            listaIdade.add(scan.nextInt());
            scan.nextLine();
        }

        System.out.println("\nMenores de idade:");
        for (int i = 0; i < listaIdade.size(); i++){
            if(listaIdade.get(i) < 18){
                System.out.println("Nome: " + listaNome.get(i) + " idade: " + listaIdade.get(i));

            }
        }
        scan.close();
    }
}
