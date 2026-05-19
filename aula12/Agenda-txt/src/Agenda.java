/* Biblioteca para leitura de dados do teclado e arquivos */
import java.util.Scanner;
/* Biblioteca para usar listas dinâmicas (ArrayList) */
import java.util.ArrayList;
/* Biblioteca para representar e manipular arquivos */
import java.io.File;
/* Biblioteca para escrever dados em arquivos */
import java.io.FileWriter;
 
class Contato {
 
    String nome;
    String telefone;
 
    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }
}
 
class Agenda {
    public static void main(String[] args) throws Exception {
 
        /* Scanner para ler dados digitados pelo usuário */
        Scanner scanner = new Scanner(System.in);
 
        /* Lista que armazenará os contatos em memória */
        ArrayList<Contato> lista = new ArrayList<>();
 
        /* Representa o arquivo contatos.txt */
        File arquivo = new File("contatos.txt");
 
        /* Verifica se o arquivo existe */
        if (arquivo.exists()) {
 
            /* Scanner usado para ler o arquivo */
            Scanner leitor = new Scanner(arquivo);
 
            /* Enquanto houver linhas no arquivo */
            while (leitor.hasNextLine()) {
 
                /* Lê uma linha completa */
                String linha = leitor.nextLine();
 
                /* Divide a linha usando ";" */
                String[] partes = linha.split(";");
 
                /* Guarda cada parte em variáveis */
                String nome = partes[0];
                String telefone = partes[1];
 
                /* Cria um objeto Contato e adiciona ao ArrayList */
                lista.add(new Contato(nome, telefone));
            }
 
            /* Fecha o leitor do arquivo */
            leitor.close();
        }
 
 
        /* Meunu principal */
        int opcao = 0;
 
        while (opcao != 3) {
 
            System.out.println("\n==== AGENDA ====\n");
            System.out.println("[1] Adicionar");
            System.out.println("[2] Listar");
            System.out.println("[3] Sair");
 
            System.out.print("\nEscolha uma opcao: ");
 
            /* Lê a opção digitada */
            opcao = scanner.nextInt();
 
            /* Limpa o ENTER do teclado */
            scanner.nextLine();
 
            /* Adicionar contato */
            if (opcao == 1) {
 
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
 
                System.out.print("Telefone: ");
                String telefone = scanner.nextLine();
 
                /* Adiciona um novo contato na lista */
                lista.add(new Contato(nome, telefone));
 
                System.out.println("Contato adicionado!");
            }
 
            /* Listar contatos */
            if (opcao == 2) {
 
                /* Percorre toda a lista */
                for (Contato c : lista) {
 
                    /* Mostra os dados do contato */
                    System.out.println(c.nome + " - " + c.telefone);
                }
            }
        }
 
        /* Salvar os dados no arquivo 'contatos.txt' */
 
        /* Cria/escreve no arquivo contatos.txt */
        FileWriter writer = new FileWriter("contatos.txt");
 
        /* Percorre todos os contatos da lista */
        for (Contato c : lista) {
            /* Salva no formato 'nome;telefone'*/
            writer.write(c.nome + ";" + c.telefone + "\n");
        }
 
        /* Fecha o arquivo */
        writer.close();
 
        System.out.println("Dados salvos!");
 
        /* Fecha o scanner do teclado */
        scanner.close();
    }
}