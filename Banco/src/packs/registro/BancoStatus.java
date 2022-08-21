package packs.registro;

public class BancoStatus {

    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public BancoStatus(int numConta) {
        this.numConta = numConta;
        saldo = 0;
        status = false;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo += saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void statusGeral(){
        System.out.println("---------------------------------------");
        System.out.printf("\nNumero da conta: %d\nTipo: %s\nDono: %s\nSaldo: %.2fR$\nStatus: %b\n",
                numConta, tipo, dono, saldo, status);
    }


    public void abrirConta(String tipo, String dono){
        this.tipo = tipo;
        this.dono = dono;
        if(tipo.equals("cc")){
            setSaldo(50);
        } else if (tipo.equals("cp")) {
            setSaldo(150);
        }
        setStatus(true);
    }
    public void fecharConta(){

        if (!status){
            System.out.println("A conta ja esta fechada");
        }   else if (saldo < 0){
            System.out.printf("\nEm debito de %.2fR$ com o banco, favor realize o pagamento", saldo);

        }   else if (saldo > 0) {

            System.out.printf("\n Valor restante de %.2fR$ realize o saque do valor atual", saldo);
        }

        else {
            System.out.println("Conta fechada com sucesso");
            setStatus(false);
        }

    }
    public void depositar(double valorAdc){
        if (status){
            setSaldo(valorAdc);
        }
        else{
            System.out.println("A conta atual esta fechada por favor realize sua abertura");
        }

    }
    public void sacar(double valorSaque){
        if (!status){
            System.out.println("A conta atual esta fechada por favor realize sua abertura");
        }   else if(valorSaque > saldo){
            System.out.printf("\nSeu saldo atual e de %.2fR$ e esta abaixo do valor de saque.", saldo);
        }   else if(valorSaque <= saldo){
            saldo = saldo - valorSaque;
            System.out.printf("\nSaque realizado com sucesso, seu saldo atual e de %.2fR$\n", saldo);
        }


    }
    public void pagarMensal(){
        if (!status){
            System.out.println("A conta atual esta fechada por favor realize sua abertura");
        } else if(tipo.equals("cc")){
            saldo -= 12;
        } else if (tipo.equals("cp")) {
            saldo -= 20;
        }
        else {
            System.out.println("Tipo de conta invalido");
        }
    }



}

