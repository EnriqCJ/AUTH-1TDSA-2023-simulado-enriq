package Pessoa.model;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

public class PessoaJuridica extends Pessoa{

    private String cnpj;
    private Set<Pessoa> socios = new LinkedHashSet<>();

    public PessoaJuridica(Long id, String nome, LocalDate nasimento, String cnpj, Set<Pessoa> socios) {
        super(id, nome, nasimento);
        this.cnpj = cnpj;
        this.socios = socios;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Set<Pessoa> getSocios() {
        return socios;
    }

    public void setSocios(Set<Pessoa> socios) {
        this.socios = socios;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "cnpj='" + cnpj + '\'' +
                ", socios=" + socios +
                "} " + super.toString();
    }
}
