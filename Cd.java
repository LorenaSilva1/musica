public class Cd {
    private String titulo;
    private int ano;
    private boolean ehDuplo;

    public Cd(String titulo, int ano, boolean ehDuplo) {
        this.titulo = titulo;
        this.ano = ano;
        this.ehDuplo = ehDuplo;

    }

    public String getTitulo() {
        return this.titulo;

    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;

    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean getEhDuplo() {
        return this.ehDuplo;
    }

    public void setEhDuplo(boolean ehDuplo) {
        this.ehDuplo = ehDuplo;
    }

    @Override
    public String toString() {
        return "Cd [titulo=" + titulo + ", ano=" + ano + ", ehDuplo=" + ehDuplo + "]";
    }

}
