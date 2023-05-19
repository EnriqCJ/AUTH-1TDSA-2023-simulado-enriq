package Pessoa.model;

import java.time.LocalDate;

public class Pessoa {
    protected Long id;
    protected String nome;
    protected LocalDate nasimento;

    public Pessoa(Long id, String nome, LocalDate nasimento) {
        this.id = id;
        this.nome = nome;
        this.nasimento = nasimento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNasimento() {
        return nasimento;
    }

    public void setNasimento(LocalDate nasimento) {
        this.nasimento = nasimento;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", nasimento=" + nasimento +
                '}';
    }
}
