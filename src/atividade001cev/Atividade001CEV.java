
package atividade001cev;


public class Atividade001CEV {

  
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.carga = 50;
        c1.cor = "vermelha";
        c1.modelo = "bic";
        c1.ponta = 0.5f;
        c1.destampar();
        
        c1.status();
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        c2.modelo = "EAR";
        c2.cor = "azul";
        c2.tampar();
        c2.status();
        c2.rabiscar();
        
        
    }
    
}
