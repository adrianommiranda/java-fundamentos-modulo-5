package ListaExerciciosDois;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exe12 {
    public static void main(String[] args) {
        // Exe12
        //Primeira forma
        List<Integer> lista12 = new ArrayList<>();
        Random rand = new Random();

        int somaNotas = 0;
        double media;
        for (int i = 0; i <= 9; i++) {
            Integer nota = rand.nextInt(10)+1;
            lista12.add(nota);
            somaNotas = somaNotas + nota;
        }

        media = somaNotas / lista12.size();

        System.out.println(lista12);
        System.out.println("Soma das notas: " + somaNotas);
        System.out.printf("Média da turm: %.2f%n", media);

        int alunoAcimaMedia = 0;
        for (int i = 0; i <lista12.size(); i++){
            if(lista12.get(i) > media){
                alunoAcimaMedia++;
            }
        }

        List<Integer> listaMaiorNota = new ArrayList();
        int maiorNota = 0;
        for (int i = 0; i <lista12.size(); i++){
            if(lista12.get(i) > maiorNota){
                maiorNota = lista12.get(i);
            }
        }

        for (int i = 0; i <lista12.size(); i++){
            if(lista12.get(i) == maiorNota){
                System.out.println("Maior nota : " + maiorNota);
                System.out.println("Maior idade encontada na posição: " + i);
            }
        }

        System.out.println("Aluno Acima media: " + alunoAcimaMedia);


    }
}
