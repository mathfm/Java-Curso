package usuarios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> nome = new ArrayList<>();
        nome.add("nome 2");
        nome.add("nome 0");
        nome.add("nome 9");
        nome.add("nome 3");
        nome.add("nome 1");
        Collections.sort(nome);

        User id = new User(scanner.nextLine(), scanner.nextLine());

        System.out.println();
        System.out.println(id.nomecomp());



    }

}
