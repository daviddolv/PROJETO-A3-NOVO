package entity.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import entity.Aluno;

class AlunoTest {

    @Test
    void testCriacaoAluno() {
        Aluno aluno = new Aluno("Maria Silva", "maria.silva", "senha123");
        assertEquals("Maria Silva", aluno.getNome()); // Verifica se o nome foi setado corretamente
        assertEquals("maria.silva", aluno.getLogin()); // Verifica o login
    }

    @Test
    void testSetId() {
        Aluno aluno = new Aluno("João Oliveira", "joao.oliveira", "senha456");
        aluno.setId(1001);
        assertEquals(1001, aluno.getId()); // Verifica se o ID foi atualizado
    }

    @Test
    void testToString() {
        Aluno aluno = new Aluno("Carlos Souza", "carlos.souza", "senha789");
        aluno.setId(2002);
        String expected = "Aluno{id=2002, nome='Carlos Souza', login='carlos.souza'}";
        assertEquals(expected, aluno.toString()); // Verifica a formatação do toString()
    }
}
