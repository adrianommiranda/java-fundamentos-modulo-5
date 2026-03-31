package ListaExerciciosDois;

import java.util.ArrayList;
import java.util.List;

public class Exe04 {
    public static void main(String[] args) {
        // Exe4
        List<Integer> lista6 = new ArrayList<>();
        for (int i = 0; i <= 9; i++){
            if(i % 2 == 0){
                lista6.add(5);
            }else{
                lista6.add(3);
            }
        }
        System.out.println(lista6);
    }
}
