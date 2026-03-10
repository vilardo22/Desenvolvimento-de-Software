//1 - Escreva um programa que dado o saldo inicial e uma série de operações de crédito/débito (identificadas com valores positivos ou negativos e finalizada com zero), informe o total de créditos, o total de débitos, a C.P.M.F. paga (0,40% do total de débitos) e o saldo final da conta, baseado no seguinte exemplo:

import java.util.Scanner;

public class Exextra {
    public static void main(String[] args) {


      Scanner scanner = new Scanner(System.in);

      float saldo_inicial,operacao,creditos = 0,debitos = 0,saldo_final,cpmf;  

      System.out.print("Saldo inicial: ");
      saldo_inicial = scanner.nextFloat();
      
        do { 
            System.out.print("Operacao: ");
            operacao = scanner.nextFloat();

            if(operacao > 0){
                creditos += operacao;

            }
            else{
                debitos += operacao;
            }

        } while (operacao != 0);

        cpmf = (debitos * 0.004f);
        saldo_final = saldo_inicial + creditos + debitos - cpmf;
        System.out.println("-------------------------------");
        System.out.printf("Créditos.....: R$ %.2f\n", creditos);
        System.out.printf("Debitos.....: R$ %.2f\n", debitos *-1);
        System.out.printf("CPMF.....: R$ %.2f\n", cpmf *-1);
        System.out.printf("saldo.....: R$ %.2f\n", saldo_final);
        System.out.println("-------------------------------");
    
      scanner.close();
    }
}
