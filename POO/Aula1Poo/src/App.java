public class App {
    public static void main(String[] args) throws Exception {
       // Instanciando o primeiro livro (criando o objeto)
       Livro livro1 = new Livro();
       livro1.titulo = "O Hobbit";
       livro1.autor = "J.R.R. Tolkien";
       livro1.ano = 1937;


       Livro livro2 = new Livro();
       livro2.titulo = "Dom Casmurro";
       livro2.autor = "Machado de Assis";
       livro2.ano = 1899;

       System.out.println("--- Informações dos Livros ---");
       livro1.exibirInfo();
       livro2.exibirInfo();
    }
}
