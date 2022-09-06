package aulafinal;

public class ProjYoutube {
    public static void main(String[] args) {
        Videos[] v1 = new Videos[3];
        Usuario[] u1 = new Usuario[3];
        v1[0] = new Videos("Teste 01");
        v1[1] = new Videos("Teste 02");


        u1[0] = new Usuario("joao", 22, 'M', "jooj");
        u1[1] = new Usuario("julian", 25, 'M', "jolion");




        VisuVideos you = new VisuVideos(u1[1], v1[1]);
        you.statusG();



    }
}
