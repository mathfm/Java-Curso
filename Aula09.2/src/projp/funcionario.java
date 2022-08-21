package projp;

public class funcionario extends pessoa {
    private String setor;
    private boolean trabalhando = false;

    public funcionario() {
    }

    public String getSetor() {
        return this.setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return this.trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public void mudartrab() {
        this.setTrabalhando(!this.trabalhando);
    }
}
