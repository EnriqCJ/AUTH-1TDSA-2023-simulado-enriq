package sistema.model;

import Pessoa.model.Profile;

import java.util.Set;

public class User extends Profile {
    private Long id;
    private String email;
    private String password;
    private Profile profile;

    public User(Long id, String nome, Set<Role> roles, Long id1, String email, String password, Profile profile) {
        super(id, nome, roles);
        this.id = id1;
        this.email = email;
        this.password = password;
        this.profile = profile;
    }

    public User(Long userId, String userEmail, String userPassword, Profile profile) {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", profile=" + profile +
                "} " + super.toString();
    }
}
