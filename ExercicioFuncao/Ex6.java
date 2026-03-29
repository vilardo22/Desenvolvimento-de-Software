//6. Crie um método que apresente uma tabuada de acordo com um número informado pelo usuário.
//Por exemplo, para o número 5, deve ser mostrado

package ExercicioFuncao;

import java.util.Scanner;

public class Ex6 {
    
    public static void tabuada(int numero)
    {
        System.out.println("Tabuada do " + numero + ":");

        for (int i = 1; i <= 10; i++){
            int resultado = numero * i;
            System.out.println(numero + "x" + i + "=" + resultado);
        }

        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para ver a tabuada: ");
        int numeroDigitado = scanner.nextInt();

        // Chamando o método diretamente!
        tabuada(numeroDigitado);

        scanner.close();
    }
    

}
