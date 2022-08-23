package aula10;

public abstract class Animal {
    private double peso;

    private String nome;

    private int idade;
    private int membros;

    public double getPeso() {
        return peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

    public void status(){
        System.out.printf("Nome do animal: %s\nPeso: %.2f\nIdade: %d\nMembros: %d\n",
                getNome(), getPeso(), getIdade(), getMembros());
        locomover();
        alimentar();
        emitirSom();
    }

}
