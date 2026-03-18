import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor do saque: ");
        int valor_saque = scanner.nextInt();

        System.out.printf("%d cedulas de 100\n", valor_saque / 100);
        valor_saque = valor_saque % 100;

        System.out.printf("%d cedulas de 50\n", valor_saque / 50);
        valor_saque = valor_saque % 50;

        System.out.printf("%d cedulas de 20\n", valor_saque / 20);
        valor_saque = valor_saque % 20;

        System.out.printf("%d cedulas de 10\n", valor_saque / 10);
        valor_saque = valor_saque % 10;

        System.out.printf("%d cedulas de 5\n", valor_saque / 5);
        valor_saque = valor_saque % 5;

        scanner.close();
    }
}