package sistema;

import entity.Aluno;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SistemaTest {

    @BeforeEach
    public void preparar() {
        SistemaTestHelper.resetSistema(); // limpa os dados antes de cada teste
    }

    @Test
    public void testAdicionarAluno() {
        Aluno aluno = new Aluno("David Oliveira", "davidanima@educacao.com.br", "senha90452");
        Sistema.adicionarAluno(aluno);

        List<Aluno> alunos = Sistema.getAlunos();
        assertEquals(1, alunos.size());
        assertEquals("David Oliveira", alunos.get(0).getNome());
        assertEquals(1, alunos.get(0).getId());
    }

    @Test
    public void testDeletarAlunoPorId() {
        Aluno aluno = new Aluno("Filipe Matos", "filipeanima@educacao.com.br", "senha47851");
        Sistema.adicionarAluno(aluno);

        boolean resultado = Sistema.deletarAlunoPorId(aluno.getId());
        assertTrue(resultado);
        assertTrue(Sistema.getAlunos().isEmpty());
    }

    @Test
    public void testListaImutavel() {
        Aluno aluno = new Aluno("Raquel Dias", "raquelanima@educacao.com.br", "senha56978");
        Sistema.adicionarAluno(aluno);

        List<Aluno> copia = Sistema.getAlunos();
        copia.clear(); // não deve afetar a lista original

        assertFalse(Sistema.getAlunos().isEmpty());
    }
}
