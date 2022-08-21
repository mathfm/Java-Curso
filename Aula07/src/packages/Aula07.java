package packages;

public class Aula07 {
    public static void main(String[] args) {
        Lutador[] l = new Lutador[2];
            l[0] = new Lutador("Cars", "Brasil", 22, 1.78, 60, 13, 0, 2);
            l[1] = new Lutador("Joss", "Espanha", 25, 1.85, 78, 6, 2, 4);
            l[0].apresentar();
        System.out.println("----------------");
            l[1].apresentar();
    }
}
