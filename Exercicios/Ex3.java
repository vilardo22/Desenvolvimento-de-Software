import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {  
    Scanner scanner = new Scanner(System.in);  
     
    System.out.print("\nInforme a quantidade de Lata (350 ml): "); 
    int lata = scanner.nextInt(); 
     
    System.out.print("\nInforme a quantidade de garrafa 600ml: "); 
    int garrafa = scanner.nextInt(); 
     
    System.out.print("\nInforme a quantidade de garrafa 2l: "); 
    int litrao = scanner.nextInt(); 
     
    // Declare total_litros como double 
    double total_litros = lata * 0.35 + garrafa * 0.60 + litrao * 2.0; 
     
    // Exibe o total de litros com 2 casas decimais 
    System.out.printf("\nA quantidade total em litros é: %.2f litros\n", total_litros); 
     
    scanner.close();  
}  
  

} 

