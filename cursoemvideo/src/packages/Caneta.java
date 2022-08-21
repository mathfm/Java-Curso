package packages;

public class Caneta {
    private String modelo;
    String cor;
    private double ponta;
    protected int carga;
    boolean tampa = true;

    Caneta(String modelo, String cor, double ponta){
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;

        carga = 100;
    }



    public void tampdes(){
        tampa = !tampa;
    }
    public void status(){
        System.out.printf("Modelo: %s\nCor: %s\nPonta: %.1f\nCarga: %d\nTampada ? %b\n", modelo, cor, ponta, carga, tampa);
    }

    public String rabiscar(){
        if (!tampa){
            return "Rabiscando";
        }
        return "A caneta esta tampada";
    }



}
