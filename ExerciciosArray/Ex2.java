//2. Crie uma lista que receba 5 números do usuário. 
// Em seguida apresente:
//A lista com os números informados pelo usuário.
//Uma lista com os números pares.
//Uma lista com os números ímpares.



package ExerciciosArray;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Informe um numero: ");
            int numero = scanner.nextInt();
            numeros.add(numero);
        }
        ArrayList<Integer> pares = new ArrayList<>();

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares.add(numero);
            }
        }

        System.out.println("Numeros pares: " + pares);
        scanner.close();
    }
}



