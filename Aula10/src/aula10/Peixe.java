package aula10;

public class Peixe extends Animal{


    public void corEscamas(){
        System.out.println("Cinza");
    }
    public void soltarBolha(){
        System.out.println("Soltando bolhas");
    }

    @Override
    public void locomover() {
        System.out.println("Nada");
    }

    @Override
    public void alimentar() {
        System.out.println("Algas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixes não emitem sons");
    }
}
