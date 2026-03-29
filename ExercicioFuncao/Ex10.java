package ExercicioFuncao;
import java.util.Scanner;

public class Ex10 {

    // A função solicitada pelo exercício: recebe o caractere e as 3 notas
    public static double calcularMedia(String tipo, double n1, double n2, double n3) {
        // Ignora maiúsculas/minúsculas na verificação
        if (tipo.equalsIgnoreCase("A")) { 
            return (n1 + n2 + n3) / 3.0; // Média Aritmética
            
        } else if (tipo.equalsIgnoreCase("P")) {
            // Média Ponderada com pesos 5, 3 e 2
            return ((n1 * 5) + (n2 * 3) + (n3 * 2)) / 10.0; 
            
        } else {
            return 0.0; // Retorno padrão de segurança
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcao;
        double nota1, nota2, nota3;

        while(true) {
            System.out.println("\n ==== Sistema Positivo ====");
            System.out.println("[A] Média Aritmética");
            System.out.println("[P] Média Ponderada");
            System.out.println("[Q] Sair");
            System.out.print("\nEscolha a opção: ");
            opcao = scanner.next();

            // Verifica se o usuário quer sair (usando equalsIgnoreCase para "Q")
            if (opcao.equalsIgnoreCase("Q")) {
                System.out.println("Saindo do sistema...");
                break;
            }

            // Verifica se a opção é A "OU" (||) P usando equalsIgnoreCase
            if (opcao.equalsIgnoreCase("A") || opcao.equalsIgnoreCase("P")) {
                
                System.out.print("Digite a primeira nota: ");
                nota1 = scanner.nextDouble();

                System.out.print("Digite a segunda nota: ");
                nota2 = scanner.nextDouble();

                System.out.print("Digite a terceira nota: ");
                nota3 = scanner.nextDouble();
                
                // Chama a nossa função única passando a letra e as notas
                double resultado = calcularMedia(opcao, nota1, nota2, nota3);
                
                // Exibe o resultado formatado com duas casas decimais
                System.out.printf("O resultado da média calculada é: %.2f\n", resultado);

            } else {
                // Cai aqui se o usuário digitar qualquer coisa diferente de A, P ou Q
                System.out.println("Opção Inválida! Tente novamente.");
            }
        }
        
        scanner.close();
    }
}