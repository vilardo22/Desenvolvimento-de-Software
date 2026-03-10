//Escreva um programa que leia horas, minutos e segundos do teclado e apresente o tempo total em Segundos:
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a hora: ");
        int horas = scanner.nextInt();

        System.out.print("Informe os minutos: ");
        int minutos = scanner.nextInt();

        System.out.print("Informe os segundos: ");
        int segundos = scanner.nextInt();

        int totalHoras = horas * 3600;
        int totalMinutos = minutos * 60;
        int totalSegundos = segundos;
        int conversao = totalHoras + totalMinutos + totalSegundos;

        System.out.println("O total de segundos é: " + conversao);
        scanner.close();
    }
}