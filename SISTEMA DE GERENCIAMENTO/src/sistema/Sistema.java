package sistema;

import entity.Aluno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sistema {
    // Lista de alunos, marcada como final, mas não será substituída — só esvaziada
    private static final List<Aluno> alunos = new ArrayList<>();

    public static void adicionarAluno(Aluno aluno) {
        aluno.setId(gerarNovoId());
        alunos.add(aluno);
    }

    public static boolean deletarAlunoPorId(int id) {
        return alunos.removeIf(a -> a.getId() == id);
    }

    public static List<Aluno> getAlunos() {
        // Retorna uma lista imutável para evitar alterações externas
        return Collections.unmodifiableList(alunos);
    }

    private static int gerarNovoId() {
        return alunos.size() + 1;
    }

    // ✅ Método usado apenas nos testes para resetar o sistema
    public static void limparSistema() {
        alunos.clear(); // Limpa a lista sem substituir a referência
    }
}
