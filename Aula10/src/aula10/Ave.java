package aula10;

public class Ave extends Animal{

    public void corPena(){
        System.out.println("Penas brancas");
    }
    public void fazerNinho(){
        System.out.println("Fazendo ninho");
    }

    @Override
    public void locomover() {
        System.out.println("Deve se mover voando");
    }

    @Override
    public void alimentar() {
        System.out.println("come pequenas frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Provavelmente vai emitir alguns piados");
    }
}
