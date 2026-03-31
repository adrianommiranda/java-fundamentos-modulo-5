package ListaExerciciosDois;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exe15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> nomes = new ArrayList<>();
        List<String> generos = new ArrayList<>();
        List<Double> salarios = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite o nome do funcionário " + (i + 1) + ": ");
            nomes.add(scan.nextLine());

            while (true) {
                System.out.print("Digite o gênero (masculino ou feminino): ");
                String genero = scan.nextLine();

                if (genero.equalsIgnoreCase("masculino") || genero.equalsIgnoreCase("feminino")) {
                    generos.add(genero);
                    break;
                }

                System.out.println("Gênero inválido. Digite masculino ou feminino.");
            }
            System.out.print("Digite o salário do funcionário " + (i + 1) + ": ");
            salarios.add(scan.nextDouble());
            scan.nextLine();
        }

        System.out.println("\nFuncionárias mulheres com salário acima de R$5 mil:");
        for (int i = 0; i < nomes.size(); i++) {
            if (generos.get(i).equalsIgnoreCase("feminino") && salarios.get(i) > 5000) {
                System.out.println("Nome: " + nomes.get(i));
                System.out.println("Gênero: " + generos.get(i));
                System.out.println("Salário: R$" + salarios.get(i));
                System.out.println();
            }
        }
        scan.close();
    }
}
