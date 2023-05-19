package Pessoa.model;

import java.time.LocalDate;

public class PessoaFisica extends Pessoa{

    private String cpf;

    public PessoaFisica(Long id, String nome, LocalDate nasimento, String CPNJ) {
        super(id, nome, nasimento);
    }

    public String getCNPJ() {
        return cpf;
    }

    public void setCNPJ(String CNPJ) {
        this.cpf = CNPJ;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", nasimento=" + nasimento +
                "} " + super.toString();
    }
}
