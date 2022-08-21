package lista;

public class ListaUser {

    private String nome;
    private int valor;

    public ListaUser(String nome, int valor){
        this.nome = nome;
        this.valor = valor;

    }

    public int getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }
}
