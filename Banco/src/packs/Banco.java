package packs;

import packs.registro.BancoStatus;

public class Banco {
    public static void main(String[] args) {
        BancoStatus user1 = new BancoStatus(1111);
        user1.abrirConta("cc", "Carlos");
        user1.depositar(100);

        BancoStatus user2 = new BancoStatus(2222);
        user2.abrirConta("cp", "Joao");
        user2.depositar(500);
        user2.sacar(100);

        user1.statusGeral();
        user2.statusGeral();

    }
}
