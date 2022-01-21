package aula05;
public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipoConta;
    private String titular;
    private float saldo;
    private boolean status;
    
    //Métodos Personalizados
    public void estadoAtual() {
        System.out.println("-------------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipoConta());
        System.out.println("Titular: " + this.getTitular());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
    public void abrirConta(String t){ //Requisitos para Abrir conta no banco.
        this.setTipoConta(t);
        this.setStatus(true);
        
        if(t == "CC") {
            this.setSaldo(50);
        }
        else if (t == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    public void fecharConta(){ //Requisitos para Fechar conta no banco.
        if (this.getSaldo() > 0) {
            System.out.println("A conta não pode ser fechada contendo dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("A conta não pode ser fechada com débito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    public void depositar(float v){
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de " + this.getTitular());
        } else {
            System.out.println("Impossível depositar em uma conta fechada!");
        }
    }
    public void sacar(float v){
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getTitular());
            } else {
                System.out.println("Saldo insuficiente para saque!");
            }
        } else {
            System.out.println("Impossível sacar de uma conta fechada!");
        }
    }
    public void mensalidade(){
        int v = 0;
        
        if (this.getTipoConta() == "CC") {
            v = 12;
        } else if (this.getTipoConta() == "CP") {
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga por " + this.getTitular());
        } else {
            System.out.println("Impossível pagar mensalidade da conta fechada!");
        }
    }
    //Métodos Especiais
    public void ContaBanco(){
        this.saldo = 0;
        this.status = false;
    }
    //Criar GETTERS e SETTERS = BOTÃO DIREITO + INSERT CODE
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }
    
    public void setStatus(boolean status) {
        this.status = status;
    }       
}