public class ContaBancaria {
    String titular;
    double saldo = 0.0;


public void depositar(double valor){
    saldo = saldo + valor;//adciona o valor ao saldo
    System.out.println("Deposito de R$ " + valor + "realizado com sucesso.");
}

//Método para sacar dinheiro

public void sacar(double valor){
    if (valor <= saldo){
        saldo = saldo - valor;
        System.out.println("Saque de R$ " + valor + "realizado com sucesso");
    } else {
        System.out.println("Operação negada! Saldo insuficiente para saque");
    }
}

public void exibirInfo(){
    System.out.println("Titular da conta: " + titular);
    System.err.println("Saldo atual: R$ " + saldo);
    System.err.println("-----------------------------------");
}

}
