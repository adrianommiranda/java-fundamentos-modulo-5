package ListaExerciciosUm;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ListaExercicioBasico {
    public static void main(String[] args) {
        Random rand = new Random();

        List<Integer> lista = new ArrayList();

        // Crie uma Lista com vinte números aleatórios.
        for (int i=0; i<=19; i++){
            lista.add(rand.nextInt(101)); //serão inseridos 10 valores de 0 a 100
        }

        System.out.println(lista);


        // Adicione o número 11 à Lista criada no exercício anterior. Dessa forma sempre adiciona no final da lista
        lista.add(11);
        System.out.println(lista);


        //Remova o número na 5ª posição da Lista
        lista.remove(4);
        System.out.println(lista);


        //Concatene a Lista atual com uma nova Lista contendo os números de 12 a 15, ou seja, insira os dados da listaNova na lista
        List<Integer> novaLista = new ArrayList();
        novaLista.add(12);
        novaLista.add(13);
        novaLista.add(14);
        novaLista.add(15);

        lista.addAll(novaLista);
        System.out.println(lista);


        // Encontre o comprimento da Lista resultante
        System.out.println(lista.size());


        // Verifique se o número 8 está presente na Lista
        System.out.println("1 forma, contém 8? " + lista.contains(8));

        boolean resultado = lista.contains(8);
        System.out.println("2 forma, contém 8? " + resultado);


        // Inverta a ordem dos elementos na Lista
        List<Integer> listaInvertida = new ArrayList(lista); // Preservo a lista original, cria uma nova lista como cópia da original
        Collections.reverse(listaInvertida);
        System.out.println("Lista nova inverdida = " + listaInvertida);

        Collections.reverse(lista); // Inverto direto a lista original
        System.out.println("Lista original inverdida" + lista);


        // Remova todos os números pares da Lista
        List<Integer> litaImpar = new ArrayList();

        for (int i = 0; i<lista.size(); i++){
            if(lista.get(i) % 2 != 0){
                litaImpar.add(lista.get(i));
            }
        }

        lista.removeAll(lista);
        lista.addAll(litaImpar);
        System.out.println("Lista apenas com números impa: " + lista);


        // Substitua o valor da 3ª posição por 30
        lista.set(2, 30);
        System.out.println(lista);


        // Ordene a Lista de forma crescente
        Collections.sort(lista);
        System.out.println("Lista ordenada " + lista);
    }
}