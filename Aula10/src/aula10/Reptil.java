package aula10;

public class Reptil extends Animal {


    public void corEscama(){
        System.out.println("Verde");
    }

    @Override
    public void locomover() {
        System.out.println("Rasteja");
    }

    @Override
    public void alimentar() {
        System.out.println("Folhas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Algum som de reptio?");
    }
}
