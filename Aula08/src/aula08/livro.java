package aula08;

public class livro implements leitura {
    private String autor = "Leon";
    private String titulo;
    private int paginasTot;
    private int pagAtual;
    private boolean aberto;

    public livro() {
        setTitulo("Livro 1");
        setAberto(false);
        setPagAtual(0);
        setPaginasTot(350);
    }

    private String getAutor() {
        return autor;
    }

    private void setAutor(String autor) {
        this.autor = autor;
    }

    private String getTitulo() {
        return titulo;
    }

    private void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    private int getPaginasTot() {
        return paginasTot;
    }

    private void setPaginasTot(int paginasTot) {
        this.paginasTot = paginasTot;
    }

    private int getPagAtual() {
        return pagAtual;
    }

    private void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    private void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public void detalhes(){
        System.out.println("-------------------");
        System.out.printf("\nTitulo: %s\nAutor: %s\nTotal de paginas: %d\nPagina atual: %d\nO livro esta aberto? %b\n",
                getAutor(), getTitulo(), getPaginasTot(), getPagAtual(), isAberto());
        System.out.println("-------------------");
    }

    @Override
    public void abrir() {
        setAberto(true);
    }

    @Override
    public void fechar() {
        setAberto(false);
    }



    @Override
    public void folhear(int folhas) {
        if (isAberto() && folhas >= 0 && folhas <= getPaginasTot()){
            setPagAtual(folhas);
        }

    }

    @Override
    public void avancarPag() {
        if (isAberto() && getPagAtual() >= 0)
            setPagAtual(getPagAtual() + 1);
    }

    @Override
    public void voltarPag() {
        if (isAberto() && getPagAtual() > 0){
            setPagAtual(getPagAtual() - 1);
        }

    }
}
