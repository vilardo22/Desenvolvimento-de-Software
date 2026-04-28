public class App {
    public static void main(String[] args) {
        
        // 1. Criando e configurando o PRIMEIRO carro
        Carro carro1 = new Carro();
        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        
        System.out.println(">>> AÇÕES DO CARRO 1 (" + carro1.modelo + ") <<<");
        // Sequência pedida: ligar → acelerar → acelerar → status → frear → status → desligar
        carro1.ligar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.status();
        carro1.frear();
        carro1.status();
        carro1.desligar();
        
        System.out.println("\n"); // Apenas pulando uma linha para organizar a tela

        // 2. Criando e configurando o SEGUNDO carro
        Carro carro2 = new Carro();
        carro2.marca = "Honda";
        carro2.modelo = "Civic";
        
        System.out.println(">>> AÇÕES DO CARRO 2 (" + carro2.modelo + ") <<<");
        // Testando a regra de barrar a aceleração com ele desligado
        carro2.acelerar(); 
        
        // Testando a regra de não deixar a velocidade ficar negativa
        carro2.ligar();
        carro2.frear(); 
        carro2.status();
    }
}
//Exercicio2
// ContaBancaria minhaConta = new ContaBancaria();
// minhaConta.titular = "Gabriel Vilar";


// minhaConta.exibirInfo();


// minhaConta.depositar(500.00);
// minhaConta.exibirInfo();


// minhaConta.sacar(600.00);

// minhaConta.sacar(150.00);
// minhaConta.exibirInfo();
//Exercicio1
// Instanciando o primeiro livro (criando o objeto)
//    Livro livro1 = new Livro();
//    livro1.titulo = "O Hobbit";
//    livro1.autor = "J.R.R. Tolkien";
//    livro1.ano = 1937;


//    Livro livro2 = new Livro();
//    livro2.titulo = "Dom Casmurro";
//    livro2.autor = "Machado de Assis";
//    livro2.ano = 1899;

//    System.out.println("--- Informações dos Livros ---");
//    livro1.exibirInfo();
//    livro2.exibirInfo();
// }