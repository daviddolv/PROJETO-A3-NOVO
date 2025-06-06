package sistema;

import entity.Aluno;
import java.util.ArrayList;
import java.util.List;

/**
 * 🎓 Classe Sistema
 * 
 * Responsável pelo gerenciamento central dos alunos do sistema.
 * Implementa operações básicas de adicionar, listar e deletar alunos.
 * Mantém uma lista interna de alunos e controle automático do ID.
 */
public class Sistema {

    // Lista interna que armazena os alunos cadastrados
    private static final List<Aluno> alunos = new ArrayList<>();

    // Controle do ID único para novos alunos, iniciado em 1
    private static int idAtual = 1;

    /**
     * Adiciona um novo aluno à lista, atribuindo um ID automático.
     * 
     * @param aluno Objeto Aluno a ser adicionado.
     */
    public static void adicionarAluno(Aluno aluno) {
        aluno.setId(idAtual++);
        alunos.add(aluno);
    }

    /**
     * Retorna uma cópia da lista de alunos cadastrados.
     * Isso evita exposição direta da lista interna.
     * 
     * @return Lista de alunos cadastrados.
     */
    public static List<Aluno> getAlunos() {
        return new ArrayList<>(alunos);
    }

    /**
     * Remove um aluno pelo seu ID.
     * 
     * @param id Identificador do aluno a ser removido.
     * @return true se o aluno foi removido, false caso contrário.
     */
    public static boolean deletarAlunoPorId(int id) {
        return alunos.removeIf(aluno -> aluno.getId() == id);
    }

    /**
     * Método placeholder para carregar dados do sistema.
     * Implementação futura necessária.
     */
    public void carregarDados() {
        throw new UnsupportedOperationException("Método 'carregarDados' não implementado");
    }

    /**
     * Método placeholder para exibir o menu principal do sistema.
     * Implementação futura necessária.
     */
    public void exibirMenuPrincipal() {
        throw new UnsupportedOperationException("Método 'exibirMenuPrincipal' não implementado");
    }
}
