package sistema.model;

public class Sexo {

    private int id;
    private String nome;
    private Character sigla;

    public Sexo(int id, String nome, Character sigla) {
        this.id = id;
        this.nome = nome;
        this.sigla = sigla;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Character getSigla() {
        return sigla;
    }

    public void setSigla(Character sigla) {
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        return "Sexo{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sigla=" + sigla +
                '}';
    }
}
