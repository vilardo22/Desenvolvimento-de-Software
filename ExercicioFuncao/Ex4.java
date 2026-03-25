//4. Crie dois métodos chamados multiplicar: um que retorne o resultado da multiplicação de dois
//números e outro que retorne o resultado da multiplicação de três números.
package ExercicioFuncao;
import java.util.*;
public class Ex4 {
    
    public static int multiplicar(int num1, int num2)
    {
        return (num1 * num2);
    }
    public static int multiplicar(int num1, int num2, int num3)
    {
        return (num1 * num2 * num3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero 1: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o numero 2: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o numero 3: ");
        int num3 = scanner.nextInt();

        int resultado = multiplicar(num1, num2);
        int resultado2 = multiplicar(num1, num2, num3);

        System.out.println("O resultado é: " + resultado);
        System.out.println("O resultado é: " + resultado2);
        scanner.close();
    }

}
