//3. Crie um método que retorne a média de três notas de um aluno.
package ExercicioFuncao;

import java.util.Scanner;

public class Ex3 {
    
    public static float calcularMedia(float nota1 , float nota2, float nota3)
    {
        return (nota1 + nota2 + nota3) / 3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite sua Nota 1: ");

        float nota1 = scanner.nextFloat();

        System.out.printf("Digite sua Nota 2: ");

        float nota2 = scanner.nextFloat();

        System.out.printf("Digite sua Nota 3: ");

        float nota3 = scanner.nextFloat();

        float media = calcularMedia(nota1, nota2, nota3);

        System.out.println("Sua media é: " + media);

        scanner.close();
    }
}
