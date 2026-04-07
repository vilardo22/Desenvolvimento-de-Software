public class Pessoa {
    String nome;
    int idade;
    boolean falando = false;
    boolean comendo = false;



    public void status(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Falando: " + (this.falando ? "Sim" : "Não"));
        System.out.println("Comendo: " + (this.comendo ? "Sim" : "Não"));
    }

    public  void falar (){
       if(falando){
        System.out.println(this.nome + " Já está falando. ");
       }
       else if(comendo){
        System.out.println(this.nome + " está comendo. ");
  
       }
       else{
        System.out.println(this.nome + " Começou a falar. ");
        this.falando = true;

       }

    }

    public  void pararfalar (){
        this.falando = false;
    }
    public  void comer(String alimento){
        this.comendo = true;
        System.out.println(this.nome +" esta comendo " + alimento);
    }
    public  void parardeComer(){
        this.comendo = false;
    }
    public  void comendo(){
        if(comendo){
            System.out.println(this.nome + " Já está comendo. ");
           }
           else if(falando){
            System.out.println(this.nome + " está falando. ");
      
           }
           else{
            System.out.println(this.nome + " Começou a comer. ");
            this.comendo = true;
    
           }
    }

}
