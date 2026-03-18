//1. Crie uma lista e adicione o nome de 5 pessoas: Carlos, Bruno, Ana, Fernando e Diego. Em seguida:
//Acrescente o nome "Helena" ao final da lista.
//Acrescente o nome "Gustavo" no inicio da lista.
//Verifique se o nome "Fernando" está presente na lista.
//Exclua o nome "Ana" da lista.
//Ordene a lista em ordem crescente.
//Remova todos os nomes da lista.
package ExerciciosArray;
import java.util.*;
public class Ex1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Bruno");
        nomes.add("Ana");
        nomes.add("Fernando");
        nomes.add("Diego");


        nomes.add("Helena"); //Acrescente o nome "Helena" ao final da lista.
        nomes.add(0,"Gustavo"); //Acrescente o nome "Gustavo" no inicio da lista.
        System.out.println(nomes);
        if (nomes.contains("Fernando")) { //Verifique se o nome "Fernando" está presente na lista.
            System.out.println("Está na lista ");
        }
        else{
            System.out.println("Não está na lista ");
        }

        nomes.remove("Ana"); //Exclua o nome "Ana" da lista.
        System.out.println(nomes);
        Collections.sort(nomes); //Ordene a lista em ordem crescente.
        System.out.println(nomes);
        nomes.clear();
        System.out.println(nomes);//Remova todos os nomes da lista.
    }
}
