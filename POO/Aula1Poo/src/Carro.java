public class Carro {
    // Atributos
    String marca;
    String modelo;
    int velocidade = 0;     // O carro sempre começa parado
    boolean ligado = false; // O carro sempre começa desligado

    // Método para ligar o carro
    public void ligar() {
        ligado = true; // Altera o estado para verdadeiro
        System.out.println("Carro ligado!");
    }

    // Método para desligar o carro
    public void desligar() {
        ligado = false; // Altera o estado para falso
        System.out.println("Carro desligado!");
    }

    // Método para acelerar (depende do estado 'ligado')
    public void acelerar() {
        // "if (ligado)" é a mesma coisa que "if (ligado == true)"
        if (ligado) {
            velocidade = velocidade + 10;
            System.out.println("Acelerando... Velocidade atual: " + velocidade + " km/h");
        } else {
            System.out.println("Não é possível acelerar, carro desligado!");
        }
    }

    // Método para frear (impede velocidade negativa)
    public void frear() {
        velocidade = velocidade - 10;
        
        // Regra: A velocidade não pode ser menor que zero
        if (velocidade < 0) {
            velocidade = 0;
        }
        System.out.println("Freando... Velocidade atual: " + velocidade + " km/h");
    }

    // Método para exibir todas as informações
    public void status() {
        System.out.println("--- Status do Carro ---");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidade: " + velocidade + " km/h");
        
        // Usando uma estrutura simples para exibir Sim ou Não em vez de true ou false
        if (ligado) {
            System.out.println("Status: Ligado");
        } else {
            System.out.println("Status: Desligado");
        }
        System.out.println("-----------------------");
    }
}