//7. Crie um programa em Java que apresente um menu de opções no console para o usuário escolher
//uma operação matemática. O programa deve permitir realizar operações básicas entre dois números
//utilizando métodos para as operações disponibilizadas

package ExercicioFuncao;
import java.util.*;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        double num1, num2; // Substituímos o ArrayList por duas variáveis de número decimal

        while(true){
            System.out.println("\n===== Calculadora =====");
            System.out.println("[1] Soma");
            System.out.println("[2] Subtração");
            System.out.println("[3] Multiplicação");
            System.out.println("[4] Divisão");
            System.out.println("[5] Sair");

            System.out.print("\nEscolha a operação: ");
            opcao = scanner.nextInt();


            if(opcao == 5){
                break;
            }

           if(opcao >=1 && opcao <=4){
            System.out.print("Digite o primeiro número: ");
            num1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            num2 = scanner.nextDouble();

            switch(opcao){
                case 1:
                    System.out.println("Resultado: " + somar(num1, num2));
                    break;
                case 2:
                    System.out.println("Resultado: " + subtrair(num1, num2));
                    break;
                case 3:
                    System.out.println("Resultado" + multiplicar(num1, num2));
                    break;
                case 4:
                    System.out.println("Resultado" + dividir(num1, num2));
                    break;
               
            }
           } else {
            System.out.println("Opção Invalida! Tente novamente.");
           }
        }
        scanner.close();

    }
    public static double somar(double a, double b){
        return a + b;
    }
    public static double subtrair(double a, double b){
        return a - b;
    }
    public static double multiplicar(double a, double b){
        return a * b;
    }
    public static double dividir(double a, double b){
        return a / b;
    }
}
