package sistema.model;

import Pessoa.model.Pessoa;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

public class Sistema extends Pessoa {

    private Long id;
    private String nome;
    private String sigla;

    private Set<Pessoa> responsaveis = new LinkedHashSet<>();

    public Sistema(Long id, String nome, LocalDate nasimento, Long id1, String nome1, String sigla, Set<Pessoa> responsaveis) {
        super(id, nome, nasimento);
        this.id = id1;
        this.nome = nome1;
        this.sigla = sigla;
        this.responsaveis = responsaveis;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Set<Pessoa> getResponsaveis() {
        return responsaveis;
    }

    public void setResponsaveis(Set<Pessoa> responsaveis) {
        this.responsaveis = responsaveis;
    }

    @Override
    public String toString() {
        return "Sistema{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sigla='" + sigla + '\'' +
                ", responsaveis=" + responsaveis +
                "} " + super.toString();
    }
}
