public class Exemplo2 {
    public static void main(String[] args) throws Exception {
        Caneta c1 = new Caneta();
        c1.cor = "Azuk";
        c1.ponta = 0.5f;
        c1.tampada = true;
        c1.status();
        c1.destampar();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.cor = "Preta";
        c2.ponta = 0.7f;
        c2.tampada = true;
    }
}
