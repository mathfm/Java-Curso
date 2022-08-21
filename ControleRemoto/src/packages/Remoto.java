package packages;

public class Remoto implements Controlador {
    private int volume;
    private boolean pausado;
    private boolean mute;
    private boolean ligado;


    public Remoto() {
        volume = 50;
        mute = false;
        ligado = false;
    }

    @Override
    public void play() {
        if (ligado){
            pausado = false;
        }
        else {
            System.out.println("Ligar Tv");
        }

    }

    @Override
    public void pausar() {
        if (ligado){
            pausado = true;
        }
        else {
            System.out.println("Ligar Tv");
        }

    }

    @Override
    public void mute() {
        if (volume > 0 && ligado){
            volume = 0;
            mute = true;
        }
    }

    @Override
    public void maisVolume() {
        if (ligado && !mute){
            volume = volume + 10;
            for (int i = volume; i <= 100; i += 10) {
                System.out.print("| ");
            }
        }
        else {
            System.out.println("Impossivel aumentar o volume");
        }
    }

    @Override
    public void menosVolume() {
        if (ligado && volume > 0){
            volume = volume - 10;
        }
        else {
            System.out.println("Equipamento desligado");
        }
        }

    @Override
    public void menu() {
        if (ligado){
            System.out.println("------------------");
            System.out.printf("Volume: %d\nLigado: %b\nMudo: %b\nPausado: %b\n", volume, ligado, mute, pausado);
            System.out.printf("Volume atual: ");
            if(!mute){
                for (int i = volume; i < 100; i += 10) {
                    System.out.print("| ");
                }
            }
            else {
                System.out.print("Mudo");
            }

            System.out.println(" ");
            System.out.println("------------------");
        }
        else {
            System.out.println("Equipamento desligado");
        }

    }

    @Override
    public void fecharMenu() {
        if (ligado){
            System.out.println("Fechando menu.......");
        }
        else {
            System.out.println("Equipamento desligado");
        }

    }

    @Override
    public void ligar() {
        ligado = true;
    }
    @Override
    public void desligar(){
        ligado = false;
    }
}
