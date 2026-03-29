//1 - Escreva uma função que solicite ao usuário o nome de um produto, 
//o preço desse produto e o valor em dinheiro entregue ao vendedor. 
//Em seguida, deve ser mostrada uma mensagem baseada no seguinte 
//exemplo: "Você comprou um produto (mouse) por R$ 185,00 e entregou ao vendedor R$ 200,00 em dinheiro. Você vai receber R$ 15,00 de troco. Volte sempre!".


package ExercicioFuncao;
import java.util.Scanner;


public class Ex8 {
    public static void mensagem(String nome_produto, float preco_produto, float valor_entregue){
        float troco = valor_entregue - preco_produto;
        System.out.printf("Voce comprou um produto (%s) por R$ %.2f e entregou ao vendedor R$ %.2f em dinheiro. Voce vai receber R$ %.2f de troco. Volte sempre!", nome_produto, preco_produto, valor_entregue, troco);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual o nome do produto? ");
        String nome_produto = scanner.next();

        System.out.print("Qual o preço do produto?");
        float preco_produto = scanner.nextFloat();

        System.out.print("Quanto o lojista recebeu? ");
        float valor_entregue = scanner.nextFloat();

        mensagem(nome_produto, preco_produto, valor_entregue);

        scanner.close();
    }
}
