package org.example;

import Pessoa.model.Pessoa;
import Pessoa.model.PessoaFisica;
import Pessoa.model.PessoaJuridica;
import Pessoa.model.Profile;
import sistema.model.Role;
import sistema.model.Sexo;
import sistema.model.Sistema;
import sistema.model.User;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias das classes

        // Pessoa
        Long pessoaId = Long.parseLong(JOptionPane.showInputDialog("Digite o ID da Pessoa:"));
        String pessoaNome = JOptionPane.showInputDialog("Digite o nome da Pessoa:");
        LocalDate pessoaNascimento = LocalDate.parse(JOptionPane.showInputDialog("Digite a data de nascimento da Pessoa (AAAA-MM-DD):"));

        Pessoa pessoa = new Pessoa(pessoaId, pessoaNome, pessoaNascimento);

        // Profile
        Set<Role> roles = new HashSet<>();
        Long roleId = Long.parseLong(JOptionPane.showInputDialog("Digite o ID da Role:"));
        String roleNome = JOptionPane.showInputDialog("Digite o nome da Role:");
        String roleDescricao = JOptionPane.showInputDialog("Digite a descrição da Role:");

        roles.add(new Role(roleId, roleNome, roleDescricao));

        Long profileId = Long.parseLong(JOptionPane.showInputDialog("Digite o ID do Profile:"));
        String profileNome = JOptionPane.showInputDialog("Digite o nome do Profile:");

        Profile profile = new Profile(profileId, profileNome, roles);

        // Sistema
        Set<Pessoa> responsaveis = new HashSet<>();
        Long responsavelId = Long.parseLong(JOptionPane.showInputDialog("Digite o ID do Responsável:"));
        String responsavelNome = JOptionPane.showInputDialog("Digite o nome do Responsável:");
        LocalDate responsavelNascimento = LocalDate.parse(JOptionPane.showInputDialog("Digite a data de nascimento do Responsável (AAAA-MM-DD):"));

        responsaveis.add(new Pessoa(responsavelId, responsavelNome, responsavelNascimento));

        Long sistemaId = Long.parseLong(JOptionPane.showInputDialog("Digite o ID do Sistema:"));
        String sistemaNome = JOptionPane.showInputDialog("Digite o nome do Sistema:");
        LocalDate sistemaData = LocalDate.parse(JOptionPane.showInputDialog("Digite a data do Sistema (AAAA-MM-DD):"));
        Long sistemaResponsavelId = Long.parseLong(JOptionPane.showInputDialog("Digite o ID do Responsável do Sistema:"));
        String sistemaResponsavelNome = JOptionPane.showInputDialog("Digite o nome do Responsável do Sistema:");
        String sistemaSigla = JOptionPane.showInputDialog("Digite a sigla do Sistema:");

        responsaveis.add(new Pessoa(sistemaResponsavelId, sistemaResponsavelNome, null));

        Sistema sistema = new Sistema(sistemaId, sistemaNome, sistemaData, sistemaResponsavelId, sistemaResponsavelNome, sistemaSigla, responsaveis);

        // PessoaJuridica
        Set<Pessoa> socios = new HashSet<>();
        Long socioId = Long.parseLong(JOptionPane.showInputDialog("Digite o ID do Sócio:"));
        String socioNome = JOptionPane.showInputDialog("Digite o nome do Sócio:");
        LocalDate socioNascimento = LocalDate.parse(JOptionPane.showInputDialog("Digite a data de nascimento do Sócio (AAAA-MM-DD):"));

        socios.add(new Pessoa(socioId, socioNome, socioNascimento));

        Long pessoaJuridicaId = Long.parseLong(JOptionPane.showInputDialog("Digite o ID da Pessoa Jurídica:"));
        String pessoaJuridicaNome = JOptionPane.showInputDialog("Digite o nome da Pessoa Jurídica:");
        LocalDate pessoaJuridicaData = LocalDate.parse(JOptionPane.showInputDialog("Digite a data da Pessoa Jurídica (AAAA-MM-DD):"));
        String pessoaJuridicaCnpj = JOptionPane.showInputDialog("Digite o CNPJ da Pessoa Jurídica:");

        PessoaJuridica pessoaJuridica = new PessoaJuridica(pessoaJuridicaId, pessoaJuridicaNome, pessoaJuridicaData, pessoaJuridicaCnpj, socios);

        // PessoaFisica
        Long pessoaFisicaId = Long.parseLong(JOptionPane.showInputDialog("Digite o ID da Pessoa Física:"));
        String pessoaFisicaNome = JOptionPane.showInputDialog("Digite o nome da Pessoa Física:");
        LocalDate pessoaFisicaNascimento = LocalDate.parse(JOptionPane.showInputDialog("Digite a data de nascimento da Pessoa Física (AAAA-MM-DD):"));
        String pessoaFisicaCpf = JOptionPane.showInputDialog("Digite o CPF da Pessoa Física:");

        PessoaFisica pessoaFisica = new PessoaFisica(pessoaFisicaId, pessoaFisicaNome, pessoaFisicaNascimento, pessoaFisicaCpf);

        // Role
        Long role2Id = Long.parseLong(JOptionPane.showInputDialog("Digite o ID da Role:"));
        String role2Nome = JOptionPane.showInputDialog("Digite o nome da Role:");
        String role2Descricao = JOptionPane.showInputDialog("Digite a descrição da Role:");

        Role role2 = new Role(role2Id, role2Nome, role2Descricao);

        // Sexo
        int sexoId = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do Sexo:"));
        String sexoNome = JOptionPane.showInputDialog("Digite o nome do Sexo:");
        char sexoSigla = JOptionPane.showInputDialog("Digite a sigla do Sexo:").charAt(0);

        Sexo sexo = new Sexo(sexoId, sexoNome, sexoSigla);

        // User
        Long userId = Long.parseLong(JOptionPane.showInputDialog("Digite o ID do Usuário:"));
        String userEmail = JOptionPane.showInputDialog("Digite o email do Usuário:");
        String userPassword = JOptionPane.showInputDialog("Digite a senha do Usuário:");

        User user = new User(userId, userEmail, userPassword, profile);

        // Exibindo informações
        System.out.println(pessoa);
        System.out.println(profile);
        System.out.println(sistema);
        System.out.println(pessoaJuridica);
        System.out.println(pessoaFisica);
        boolean role = false;
        System.out.println(role);
        System.out.println(sexo);
        System.out.println(user);
    }
}