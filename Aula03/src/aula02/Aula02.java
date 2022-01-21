package aula02;
public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC";
        c1.cor = "azul";
        //c1.ponto = "0.5f"; não pode alterar private
        c1.carga = 80;
        //c1.tampada = false; não pode alterar private
        c1.destampar();
        c1.status();
        c1.rabiscar();
    }
    
}