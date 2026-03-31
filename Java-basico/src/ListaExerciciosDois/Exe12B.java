package ListaExerciciosDois;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Exe12B {
    public static void main(String[] args) {
        // Exe12
        //Segunda forma
        Scanner scan = new Scanner(System.in);
        List<Double> notas = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas.add(scan.nextDouble());
        }

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / notas.size();

        int acimaDaMedia = 0;
        double maiorNota = notas.get(0);
        List<Integer> posicoesMaiorNota = new ArrayList<>();
        for (int i = 0; i < notas.size(); i++) {
            if (notas.get(i) > media) {
                acimaDaMedia++;
            }
            if (notas.get(i) > maiorNota) {
                maiorNota = notas.get(i);
                posicoesMaiorNota.clear();
                posicoesMaiorNota.add(i);
            } else if (notas.get(i) == maiorNota) {
                posicoesMaiorNota.add(i);
            }
        }

        System.out.println("Média da turma: " + media);
        System.out.println("Alunos acima da média: " + acimaDaMedia);
        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Posições da maior nota: " + posicoesMaiorNota);

        scan.close();
    }
}
