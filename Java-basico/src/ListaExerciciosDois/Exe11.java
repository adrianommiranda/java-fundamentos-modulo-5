package ListaExerciciosDois;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exe11 {
    public static void main(String[] args) {
        // Exe11
        List<Integer> lista11 = new ArrayList<>();
        Random rand = new Random();

        int somaIdade = 0;
        double media;
        for (int i = 0; i <= 7; i++) {
            Integer idade = rand.nextInt(80)+1;
            lista11.add(idade);
            somaIdade = somaIdade + idade;
        }

        media = somaIdade / lista11.size();

        System.out.println(lista11);
        System.out.println("Soma das idades: " + somaIdade);
        System.out.printf("Média de idade: %.2f%n", media);

        for (int i = 0; i <lista11.size(); i++){
            if(lista11.get(i) > 25){
                System.out.println("Posição " + i + " tem a idade : " + lista11.get(i) + " maior que 25 anos");
            }
        }

        int maiorIdade = 0;
        for (int i = 0; i <lista11.size(); i++){
            if(lista11.get(i) > maiorIdade){
                maiorIdade = lista11.get(i);
                System.out.println("Maior idade : " + maiorIdade);
                System.out.println("Maior idade encontada na posição: " + i);
            }
        }
    }
}
