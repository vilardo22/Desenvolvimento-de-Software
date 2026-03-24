package ExerciciosArray;
import java.util.*;

    
 
class Ex4 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       ArrayList<String> alunos = new ArrayList<>();
       
       int opcao;
       
       while(true){
           System.out.println("===== MENU =====");
           System.out.println("[1] Adicionar aluno");
           System.out.println("[2] Listar alunos");
           System.out.println("[3] Buscar aluno");
           System.out.println("[4] Remover aluno");
           System.out.println("[5] Sair");
           
           System.out.print("\nEscolha uma opcao: ");
           opcao = scanner.nextInt();
           
           if(opcao == 5){
               break;
           }
           
           switch(opcao){
               case 1:
                    System.out.print("Digite o nome do aluno: ");
                    alunos.add(scanner.next());
                    System.out.println("Aluno adicionado com sucesso!");
                    break;
                
                case 2:
                    if(alunos.isEmpty()){
                        System.out.println("Nenhum aluno cadastrado.");
                        break;
                    }
                    
                    Collections.sort(alunos);
                        
                    System.out.println("Alunos cadastrados: ");
                        
                    for(int i = 0; i < alunos.size(); i++){
                        System.out.printf("%d - %s\n", i + 1, alunos.get(i));
                    }
                    break;
                
                case 3:
                    if(alunos.isEmpty()){
                        System.out.println("Nenhum aluno cadastrado.");
                        break;
                    }
                    
                    System.out.print("Digite o nome do aluno para buscar: ");
                    
                    if(alunos.contains(scanner.next())){
                        System.out.println("Aluno encontrado!");
                    }
                    else{
                        System.out.println("Aluno nao encontrado.");
                    }
                    break;
                    
                case 4:
                    
                    if(alunos.isEmpty()){
                        System.out.println("Nenhum aluno cadastrado.");
                        break;
                    }
                    
                    System.out.print("Digite o nome do aluno para remover: ");
                    String aluno = scanner.next();
                    
                    if(alunos.contains(aluno)){
                        alunos.remove(aluno);
                        System.out.println("Aluno removido com sucesso!");
                    }
                    else{
                        System.out.println("Aluno nao encontrado.");
                    }
                    break;
                
                default: System.out.print("Opcao invalida!");    
           }
           System.out.println();
       }
       
       scanner.close();
    }
}

