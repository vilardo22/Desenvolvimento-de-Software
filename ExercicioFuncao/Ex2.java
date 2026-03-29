package ExercicioFuncao;

import java.util.Scanner; // Importando a classe Scanner

public class Ex2 {

    public static int calcularQuadrado(int numero) {
        return numero * numero;
    }

    public static void main(String[] args) {
        // Criando o "leitor" para capturar o que for digitado no teclado
        Scanner scanner = new Scanner(System.in);
        
        // Exibindo a mensagem pedindo o número
        System.out.print("Digite um número inteiro: ");
        
        // Lendo o número digitado e guardando na variável
        int numeroDigitado = scanner.nextInt(); 
        
        // Chamando o método com o número que o usuário escolheu
        int resultado = calcularQuadrado(numeroDigitado); 
        
        System.out.println("O quadrado de " + numeroDigitado + " é: " + resultado);
        
        // Fechando o leitor (uma boa prática em Java)
        scanner.close();
    }
}