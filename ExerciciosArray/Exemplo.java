package ExerciciosArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Exemplo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        
        nomes.add("Ana");
        nomes.add("Marcelo");
        nomes.add("Pedro");
        nomes.add("Daniel");
    Collections.reverse(nomes);
    System.out.println(nomes);

        System.out.println("Tamanho da lista: " + nomes.size());
        input.close();
    }
}