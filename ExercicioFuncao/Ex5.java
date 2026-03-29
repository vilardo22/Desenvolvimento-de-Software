//5. Crie um método que verifique se um número é par.
package ExercicioFuncao;
import java.util.*;

public class Ex5 {
    public static boolean par(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero: ");
        int numero = scanner.nextInt();
        // 1. Chamamos o método e guardamos o verdadeiro ou falso na variável
        boolean resultado = par(numero);

        // 2. Verificamos o resultado para exibir a mensagem correta
        if (resultado) {
            System.out.println("O número " + numero + " é PAR!");
        } else {
            System.out.println("O número " + numero + " é ÍMPAR!");
        }

        // 3. Boa prática: fechar o scanner no final
        scanner.close();
    }

    }

