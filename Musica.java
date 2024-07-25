public class Musica {
    private String titulo;
    private int duracao;

    public Musica(String titulo, int duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setduracao(int duracao) {
        this.duracao = duracao;
    }

    public int getDuracao() {
        return this.duracao;
    }

    public String toString() {
        return "Titulo: " + this.titulo + " Duração: " + this.duracao;
    }
}
