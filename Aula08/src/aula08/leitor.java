package aula08;

public class leitor {
    public static void main(String[] args) {
        pessoa p1 = new pessoa("Carlos", 22, "Masculino");
        livro livro1 = new livro();
        p1.fazerAniversario();
        p1.status();
        livro1.abrir();
        livro1.folhear(250);
        livro1.detalhes();



    }
}
