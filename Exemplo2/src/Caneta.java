public class Caneta {
String cor;
float ponta;
boolean tampada = true;


    public void status(){
        System.out.println(this.cor);
        System.out.println(this.ponta);
        System.out.println(this.tampada);
        System.out.println("-------------");
    }

    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("Não pode rabiscar");
        }
        else{
            System.out.println("Rabiscando....");
        }
    }
}
