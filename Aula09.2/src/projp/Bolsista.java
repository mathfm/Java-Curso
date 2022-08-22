package projp;

public class Bolsista extends Aluno {
    private int bolsa;
    public void renovarbol(){
        System.out.println("Renovando bolsa de " + getNome());
    }

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public void pagarMensal(){
        System.out.println(getNome() + " e um bolsista, realizando o pagamento");
    }
}
