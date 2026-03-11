//1. Escreva um programa que leia dois números inteiros e os apresente em ordem crescente.
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe primeiro numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Informe segundo numero: ");
        int num2 = scanner.nextInt();

        if(num1 > num2){
            System.out.print("Numeros em ordem crescente: " + num2 + "," + num1);
        }
        else{
            System.out.print("Numeros em ordem crescente: " + num2 + "," + num1);
        }
        scanner.close();
    }
}
