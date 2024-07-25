public class Banda {
    private String Nome;
    private EnumEstilo enumEstilo;

    public Banda(String nome, EnumEstilo enumEstilo) {
        Nome = nome;
        this.enumEstilo = enumEstilo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public EnumEstilo getEnumEstilo() {
        return enumEstilo;
    }

    public void setEnumEstilo(EnumEstilo enumEstilo) {
        this.enumEstilo = enumEstilo;
    }

    @Override
    public String toString() {
        return "Banda [Nome=" + Nome + ", enumEstilo=" + enumEstilo + "]";
    }

}