package lista;

public class Fibonacci {
    private int total;
    private int sequencia;
    private int limite;



    public Fibonacci(int f1, int f2, int limite){
        this.total = f1;
        this.sequencia = f2;
        this.limite = limite;

        for (int i = 0; i < limite; i++) {
            int fn = f1 + f2;
            System.out.printf("%d ", fn);
            f1 = f2;
            f2 = fn;


        }

    }




}
