package entity; 

import org.junit.jupiter.api.*;                
import static org.junit.jupiter.api.Assertions.*;

/**
 * 📘 Classe Aluno
 * 
 * Representa a entidade "Aluno" no sistema acadêmico.
 * Armazena informações básicas: ID, nome, login e senha.
 * 
 * Esta classe foi desenvolvida com foco em clareza, coesão e boas práticas de programação orientada a objetos.
 */
@SuppressWarnings("unused")
public class Aluno {

    // 🔑 Identificador único do aluno (geralmente atribuído automaticamente)
    private int id;

    // 🧑 Nome completo do aluno
    private String nome;

    // 🧾 Nome de usuário (login) para acesso ao sistema
    private String login;

    // 🔒 Senha de acesso (armazenada como texto simples neste exemplo, mas deve ser criptografada em produção)
    private String senha;

    /**
     * 🔧 Construtor
     * 
     * Inicializa um novo aluno com nome, login e senha. O ID é definido separadamente.
     *
     * @param nome  Nome do aluno
     * @param login Nome de login (username)
     * @param senha Senha de acesso
     */
    public Aluno(String nome, String login, String senha) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    // ============================
    // Getters e Setters
    // ============================

    /**
     * Retorna o ID do aluno
     */
    public int getId() {
        return id;
    }

    /**
     * Define o ID do aluno
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Retorna o nome do aluno
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do aluno
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna o login do aluno
     */
    public String getLogin() {
        return login;
    }

    /**
     * Define o login do aluno
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * Retorna a senha do aluno
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Define a senha do aluno
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    // ============================
    // Representação textual
    // ============================

    /**
     * Representa o aluno como uma String.
     * 
     * ⚠️ Por segurança, a senha não é exibida.
     *
     * @return Dados formatados do aluno
     */
    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", login='" + login + '\'' +
                '}';
    }
}
