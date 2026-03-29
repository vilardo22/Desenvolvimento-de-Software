package ExercicioFuncao;
import java.util.Scanner;

public class Ex9 {

    // Removido o preco_final dos parâmetros e padronizado para double
    public static void mensagem(String nome_produto, double preco_produto) {
        
        // Correção do cálculo (multiplicação ao invés de divisão)
        double desconto = preco_produto * 0.10; 
        
        // A variável preco_final é declarada e calculada direto aqui dentro
        double preco_final = preco_produto - desconto; 
        
        // Uso de %% para que o Java imprima o símbolo "%" corretamente
        System.out.printf("Você comprou um produto (%s) por R$ %.2f e acaba de ganhar um desconto de 10%%. Assim você vai pagar apenas R$ %.2f pelo seu produto. Volte sempre!\n", nome_produto, preco_produto, preco_final);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Qual produto voce comprou? ");
        String nome_produto = scanner.nextLine(); // nextLine() permite ler frases inteiras com espaços

        System.out.print("Qual o valor do produto? ");
        double preco_produto = scanner.nextDouble();

        // Passando apenas as informações que o método precisa para fazer a conta
        mensagem(nome_produto, preco_produto);
        
        scanner.close(); // É uma boa prática fechar o scanner no final!
    }
}