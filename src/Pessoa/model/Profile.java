package Pessoa.model;

import sistema.model.Role;

import java.util.LinkedHashSet;
import java.util.Set;

public class Profile extends Role {

    private Long id;
    private String nome;
    private Set<Role> roles = new LinkedHashSet<>();

    public Profile(Long id, String nome, Set<Role> roles) {
        super();
        this.id = id;
        this.nome = nome;
        this.roles = roles;
    }

    public Profile() {

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

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", roles=" + roles +
                "} " + super.toString();
    }
}
