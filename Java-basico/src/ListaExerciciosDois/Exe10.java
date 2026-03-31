package ListaExerciciosDois;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Exe10 {
    public static void main(String[] args) {
        // Exe10
        //Primeira forma
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        List<Integer> lista11 = new ArrayList<>();

        for (int i = 0; i <= 29; i++) {
            Integer num = rand.nextInt(15)+1;
            lista11.add(num);
        }

        System.out.println(lista11);

        System.out.println("Entre com um número a ser pesquisado: ");
        int num = scanner.nextInt();
        int soma = 0;

        for (int i = 0; i < lista11.size(); i++) {
            if (num == lista11.get(i)){
                soma++;
                System.out.println("A chave foi encontrara na posição " + i);
            }
        }

        if (soma !=0){
            System.out.println("Foram sorteafas " + soma + " vezes");
        }
        scanner.close();
    }
}
