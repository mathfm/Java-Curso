package app;

import java.util.Random;
import java.util.Scanner;
import pacotes.packs;

public class gerador {
    public static int valor = 5;

    public static void main(String[] args) {
        int x = 5;
        double y = 2.5;
        int z = x /(int) y;
        System.out.println(z);
        Scanner scanner = new Scanner(System.in);

        String nome = scanner.nextLine();
        System.out.println(nome);
        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            int number = random.nextInt(60);
            System.out.println(number);
        }

        packs.print(valor);
    }



}


