package packages;

public class Lutador implements FunLutas {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nom, String nac, int ida ,double alt, double pes, int vit, int der, int emp){
        setNome(nom);
        setNacionalidade(nac);
        setIdade(ida);
        setAltura(alt);
        setPeso(pes);
        setVitorias(vit);
        setDerrotas(der);
        setEmpates(emp);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {

        if (getPeso() <= 52.2){
            this.categoria = "Invalido";
        } else if (getPeso() <= 70.3) {
            this.categoria = "Peso Leve";
        } else if (getPeso() <= 83.9) {
            this.categoria = "Medio";
        } else if (getPeso() <= 120.2) {
            this.categoria = "Pesado";
        }
        else{
            this.categoria = "Invalido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    @Override
    public void apresentar() {
        System.out.println("Nome: " + getNome());
        System.out.println("Pais de origem: " + getNacionalidade());
        System.out.println("Peso: " + getPeso() + "Kg");
        System.out.println("Idade: " + getIdade() + " anos");
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Altura: " + getAltura() + "m");
        System.out.println("Derrotas: " + getDerrotas());
        System.out.println("Vitorias: " + getVitorias());
        System.out.println("Empates: " + getEmpates());
    }

    @Override
    public void status() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade() + "anos");
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Derrotas: " + getDerrotas());
        System.out.println("Vitorias: " + getVitorias());
        System.out.println("Empates: " + getEmpates());
    }

    @Override
    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }

    @Override
    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
    }

    @Override
    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }
}
