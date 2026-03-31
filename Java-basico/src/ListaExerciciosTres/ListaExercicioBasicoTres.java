package ListaExerciciosTres;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaExercicioBasicoTres {
    public static void main(String[] args) {

        //1 - Crie uma Lista do tipo String com o nome de carro.
        List<String> carro = new ArrayList<>();



        // 2 - Adicionando no array list nome do carro sempre no final da lista
        System.out.println(" -----EXE 02-------- ");
        carro.add("civic");
        carro.add("uno");
        carro.add("corolla");

        for (String c : carro){
            System.out.println(c);
        }



        System.out.println("\n -----EXE 03-------- \n");

        // 3 - Inserindo passando o indice, por posicao
        carro.add(0, "HRV");
        carro.add(2, "Ferrari");

        for (String c : carro){
            System.out.println(c);
        }



        System.out.println("\n -----EXE 04-------- \n");

        /*
          * 4 - Obtendo o elemento de um ArrayList atrav�s do m�todo get
          *     Quero imprimir um elemento espec�fico na posi��o 3
          *     Vai retornar uma string, porque o nosso array � uma string
        */

        System.out.println(carro.get(2));


        System.out.println("\n -----EXE 05-------- \n");

        /*
          * 5 - Imprimindo da maneira tradicional for
		  *     size retorna um inteiro, com a posicao e numero de elementos que eu tenho
		  *     nesse arraylist
        */

        for(int i = 0; i < carro.size(); i++){
            System.out.println(carro.get(i));
        }



        System.out.println("\n -----EXE 06-------- \n");

        /*
          * 6 - limpa o arraylist lista
         */

        /*
          * Documentei para não limpar a lista. continua o exercicio
          * carro.clear(); for (int i = 0; i < carro.size(); i++) {
          * System.out.println(carro.get(i)); }
         */



        System.out.println("\n -----EXE 07-------- \n");

        /*
          * indexOff - informo um objeto, que no caso o tipo de dados do meu arraylist
          * Volta a posicao do elemento que eu informei
         */
        System.out.println(carro.indexOf("Ferrari"));



        System.out.println("\n -----EXE 08-------- \n");

        // Remove, informa o elemento que eu quero remover, a posicao
        carro.remove(3);

        for (String c : carro) {
            System.out.println(c);
        }


        System.out.println("\n -----EXE 09-------- \n");

        // Remove, informa o nome do elemento que eu quero remover
        carro.remove("uno");

        for (String c : carro) {
            System.out.println(c);
        }




        System.out.println("\n -----EXE 10-------- \n");

        /*
         * Ordene a Lista de forma crescente.
         *
         * Collections.sort(lista): Forma tradicional, sempre funciona
         * lista.sort(null): Forma moderna (Java 8+), usa ordem natural
         * lista.sort(String.CASE_INSENSITIVE_ORDER): Ignora maiúsculas/minúsculas
         * Sempre exiba a lista APÓS ordenar, nunca junto com o sort()
         *
         * Então TODAS as maiúsculas vêm ANTES de todas as minúsculas.
         */

        carro.sort(null);
        for (String c : carro) {
            System.out.println(c);
        }


        System.out.println("\n -----EXE 11-------- \n");

        /*
          * trimToSize(), corta, elimina posicoes que n�o est�o sendo utlizados no nosso
		  * arrayList
		  * Para economozar memoria, deixa apenas com o tamanho de elementos alocado
        */

        ArrayList<String> nome = new ArrayList<>(10);
        nome.add("Adriano");
        nome.add("Joyce");

        nome.trimToSize();

        for (String n : nome) {
            System.out.println(n);
        }



        System.out.println("\n -----EXE 12-------- \n");

        /*
         * Verificando se a lista esta vazia - vai dar false
        */
        System.out.println(nome.isEmpty());



        System.out.println("\n -----EXE 13-------- \n");

        /*
          * Verificando se a lista tem elementos - passei "Adriano", retorna true
         */
        System.out.println(nome.contains("Adriano"));



        System.out.println("\n -----EXE 14-------- \n");

        /*
         * Verificando o tanmanho do array list
         */
        System.out.println(nome.size());



        System.out.println("\n -----EXE 15-------- \n");

        /*
         * juntando duas listas em uma
         */

        System.out.println(carro.addAll(nome));

        for (String c : carro) {
            System.out.println(c);
        }


    }
}
