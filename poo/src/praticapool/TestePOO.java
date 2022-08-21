package praticapool;

public class TestePOO {

    public static void main(String[] args) {

        Registro user1 = new Registro();
        user1.nome = "Joao";
        user1.senha = "1234";
        user1.idade = 19;

        System.out.printf("Nome: %s\nSenha: %s\nIdade: %d\n", user1.nome, user1.senha, user1.idade);

        Registro user2 = new Registro();
        user2.nome = "carlos";
        user2.senha = "5678";
        user2.idade = 22;
        System.out.println("---------------------------------");

        System.out.printf("Nome: %s\nSenha: %s\nIdade: %d", user2.nome, user2.senha, user2.idade);

    }
}
