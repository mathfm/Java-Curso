package aulafinal;

public class VisuVideos {
    Usuario espectador;
    Videos videos;



    public VisuVideos(Usuario espectador, Videos videos) {
        this.espectador = espectador;
        this.videos = videos;
        videos.setViews(videos.getViews() + 1);
        espectador.setTotAssistido(espectador.getTotAssistido() + 1);
    }

    public Usuario getEspectador() {
        return espectador;
    }

    public void setEspectador(Usuario espectador) {
        this.espectador = espectador;
    }

    public Videos getVideos() {
        return videos;
    }

    public void setVideos(Videos videos) {
        this.videos = videos;
    }
    public void statusG(){
        System.out.printf("\nUsuario: %s\nTotal de videos assistidos: %d\n" +
                "o video %s tem um total de %d views no momento, tendo ao todo %d curtidas\n",
                espectador.getLogin(), espectador.getTotAssistido(),
                videos.getTitulo(), videos.getViews(), videos.getCurtidas());
    }
    public void curti(){
        videos.like();
    }
    public void avaliar(double nota){
        if (nota <= 10){
            videos.setAvaliacao(nota);

        }
    }

}
