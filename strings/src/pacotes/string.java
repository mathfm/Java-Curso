package pacotes;


import java.util.Scanner;

public class string {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Usuario login = new Usuario();
        login.name = "Joao";
        login.lastname = "Carlos";

        String senhaSy = "TesteString123";

        String senhaUser = scanner.nextLine();


        if (senhaUser.equals(senhaSy)){
            System.out.println("Seja bem vindo " + login.name);
        }
        else {
            System.out.println("Senha Errada");
        }

    }
}
