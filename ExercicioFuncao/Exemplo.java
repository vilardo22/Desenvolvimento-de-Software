package ExercicioFuncao;

class Exemplo {
    public static float media(float num1, float num2){
        return (num1 + num2) / 2;
    }

    // Versão com 2 parâmetros (Adicionada para corrigir o erro)
    public static int soma(int num1, int num2){
        return num1 + num2;
    }

    // Versão com 3 parâmetros
    public static int soma(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    public static void main(String[] args) {
        // Agora o Java sabe qual "soma" usar em cada linha
        System.out.println(soma(5, 12));       // Chama a de 2 parâmetros
        System.out.println(soma(5, 12, 8));    // Chama a de 3 parâmetros
    }
}