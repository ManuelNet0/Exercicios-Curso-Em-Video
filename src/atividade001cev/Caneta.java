package atividade001cev;


public class Caneta {
    
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("A Cor da caneta: "+ this.cor);
        System.out.println("O Modelo da caneta é: "+ this.modelo);
        System.out.println("A ponta dela: "+ this.ponta);
        System.out.println("Qual a carga da caneta: "+this.carga);
        System.out.println("esta tampada ?: "+ this.tampada);
        
    }
    void rabiscar (){
       if (this.tampada == true){
           System.out.println(" ERRO NAO POSSO RABISCAR");
       }else{
           System.out.println("RABISCANDO");
       }   
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
    
}
