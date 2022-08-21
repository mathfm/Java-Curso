public class primeiro_teste {


    public static void main(String[] args){
        var valor1 = 10;
        var nota = 8.5;
        contagem(5);
    }

    static void soma(int x, double y) {
        var f = x + y;
        System.out.printf("\nSua nota final foi de: %.2f", f);
    }

    static void contagem(int conte){
        for (int i = 1; i <= conte; i++) {
            System.out.printf("%d ", i);
        }

    }




}
