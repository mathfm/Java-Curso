package projp;

public class Professor extends Pessoa {
    private String especialidade;
    private double salario;

    public Professor() {
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aumento() {
        this.setSalario(this.salario * 0.2 + this.salario);
    }
}
