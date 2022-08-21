package aula08;

public class pessoa {
    private String nome;
    private int idade;
    private String genero;

    public pessoa(String nome, int idade, String genero) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }
    public void fazerAniversario(){
        idade ++;
    }
    public void status(){
        System.out.printf("Nome: %s\nIdade: %d anos\nSexo: %s\n",
                nome, idade, genero);
    }
}
