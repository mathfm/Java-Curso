import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String calc = scanner.next();
        var x = scanner.nextInt();
        var y = scanner.nextInt();
        switch (calc) {
            case "some" -> somar(x, y);
            case "multiplicar" -> multi(x, y);
            case "dividir" -> divi(x, y);
            default -> System.out.println("errado");
        }

    }
    static void somar(int x, int y){
        System.out.println(x + y);
    }
    static void multi(int x, int y){
        System.out.println(x * y);
    }
    static void divi(int x, int y){
        System.out.println(x/y);
    }

}
