import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) { 

  

        Scanner scanner = new Scanner(System.in); 

  

        System.out.print("Informe o numero: "); 

        int numero = scanner.nextInt(); 

  

        // Usando printf para formatar a saída corretamente 

        System.out.printf("O antecessor de %d eh %d e o sucessor eh %d%n", numero, numero - 1, numero + 1); 

  

        scanner.close(); 

    } 

} 

