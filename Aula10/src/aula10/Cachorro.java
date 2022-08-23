package aula10;

public class Cachorro extends Lobo {



    public void reagir(String frase){
        if (frase.equals("toma comida") || frase.equals("ola")){
            System.out.println("Abanar e latir");
        } else {
            System.out.println("Rosnar");
        }
    }
    public void reagir(double hora){
        if (hora < 12){
            System.out.println("Abanar");
        } else if (hora >= 18) {
            System.out.println("Ignorar");
        }
        else {
            System.out.println("Abanar e latir");
        }
    }
    public void reagir(boolean dono){
        if (dono){
            System.out.println("Abanar");
        }
        else {
            System.out.println("Rosnar e Latir");
        }
    }

    public void reagir(int idade, double peso){
        if (idade < 5){
            if (peso < 10){
                System.out.println("Abanar");
            }
            else {
                System.out.println("Latir");
            }
        }  else if (peso < 10){
            System.out.println("Rosnar");
        }
        else {
            System.out.println("Ignorar");
        }


    }



    @Override
    public void emitirSom() {
        System.out.println("Latido de cachorro do dia a dia");
    }
}
