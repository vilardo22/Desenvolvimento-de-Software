import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){ 

        Scanner scanner = new Scanner(System.in); 

         

        System.out.print("\n Qual a capacidade do Tanque? "); 

        float tanque = scanner.nextFloat(); 

         

        System.out.print("\n Quantos Litros foram abastecido para completar? "); 

        float litros = scanner.nextFloat(); 

         

        System.out.print("\n Qual a quilometragem percorrida após o abastecimento ? "); 

        float distancia = scanner.nextFloat(); 

         

        float consumo = distancia / litros; 

        float restante = tanque - litros; 

        float autonomia = restante * consumo; 

         

        System.out.printf("\n O consumo do veiculo eh : %.2f km por litro e a autonomia eh: %.2f ",consumo, autonomia); 

    } 

} 

