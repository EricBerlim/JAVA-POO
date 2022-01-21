package aula02;
public class Aula02 {
    public static void main(String[] args) {
        
        //Instanciar a 1ª Caneta
        Caneta c1 = new Caneta();
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.tampar();
        
        c1.status();
        c1.rabiscar();
        
        //Instanciar uma 2ª Caneta
        Caneta c2 = new Caneta();
        c2.modelo = "Host";
        c2.cor = "preta";
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }    
}