import java.util.ArrayList;
import java.util.Scanner;

class Agenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Contato> lista = new ArrayList<>();
        int opcao;

        while (true) {
            menuPrincipal();
            opcao = scanner.nextInt();
            scanner.nextLine(); /* Limpar buffer do teclado */
            
            if (opcao == 5) {
                System.out.println("Saindo da agenda...");
                break;
            }

            switch (opcao) {
                case 1:
                    adicionarContato(scanner, lista);
                    break;
                case 2:
                    editarContato(scanner, lista);
                    break;
                case 3:
                    excluirContato(scanner, lista);
                    break;
                case 4:
                    listarContatos(lista);
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
            System.out.println();
        }
        scanner.close();
    }
    
    public static void menuPrincipal() {
        System.out.println("======= AGENDA =======");
        System.out.println("[1] Adicionar contato");
        System.out.println("[2] Editar contato");
        System.out.println("[3] Excluir contato");
        System.out.println("[4] Listar contatos");
        System.out.println("[5] Sair");
        System.out.print("\nEscolha uma opcao: ");
    }

    public static void menuEditar() {
        System.out.println("\n=== EDITAR CONTATO ===");
        System.out.println("[1] Editar telefone");
        System.out.println("[2] Editar email");
        System.out.println("[3] Voltar");
        System.out.print("\nEscolha uma opcao: ");
    }
    
    public static void adicionarContato(Scanner scanner, ArrayList<Contato> lista) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        System.out.print("E-mail: ");
        String email = scanner.nextLine();

        lista.add(new Contato(nome, telefone, email));
        System.out.println("Contato adicionado com sucesso!");
    }
    
    public static void editarContato(Scanner scanner, ArrayList<Contato> lista) {
        if (lista.isEmpty()) {
            System.out.println("Agenda vazia!");
            return;
        }

        System.out.print("Digite o nome do contato que deseja editar: ");
        String nomeBusca = scanner.nextLine();
        Contato contatoEncontrado = null;

        // Busca o contato pelo nome na lista
        for (Contato c : lista) {
            if (c.getNome().equalsIgnoreCase(nomeBusca)) {
                contatoEncontrado = c;
                break;
            }
        }

        if (contatoEncontrado == null) {
            System.out.println("Contato não encontrado!");
            return;
        }

        while (true) {
            menuEditar();
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            if (opcao == 3) break;

            switch (opcao) {
                case 1:
                    System.out.print("Novo telefone: ");
                    contatoEncontrado.setTelefone(scanner.nextLine());
                    System.out.println("Telefone atualizado!");
                    break;
                case 2:
                    System.out.print("Novo e-mail: ");
                    contatoEncontrado.setEmail(scanner.nextLine());
                    System.out.println("E-mail atualizado!");
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        }
    }

    public static void excluirContato(Scanner scanner, ArrayList<Contato> lista) {
        if (lista.isEmpty()) {
            System.out.println("Agenda vazia!");
            return;
        }

        System.out.print("Digite o nome do contato que deseja excluir: ");
        String nomeBusca = scanner.nextLine();

        // Remove o contato se o nome coincidir (ignorando maiúsculas/minúsculas)
        boolean removido = lista.removeIf(c -> c.getNome().equalsIgnoreCase(nomeBusca));

        if (removido) {
            System.out.println("Contato excluido com sucesso!");
        } else {
            System.out.println("Contato não encontrado!");
        }
    }

    public static void listarContatos(ArrayList<Contato> lista) {
        if (lista.isEmpty()) {
            System.out.println("Agenda vazia!");
            return;
        }
        
        // Formata a saída em colunas alinhadas
        System.out.printf("\n%-20s | %-15s | %-25s\n", "Nome", "Telefone", "E-mail");
        System.out.println("------------------------------------------------------------------");
        
        for (Contato c : lista) {
            System.out.printf("%-20s | %-15s | %-25s\n", c.getNome(), c.getTelefone(), c.getEmail());
        }
    }
}

class Contato {
    private String nome;
    private String telefone;
    private String email;

    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() { return nome; }
    public String getTelefone() { return telefone; }
    public String getEmail() { return email; }

    public void setTelefone(String telefone) { this.telefone = telefone; }
    public void setEmail(String email) { this.email = email; }
}