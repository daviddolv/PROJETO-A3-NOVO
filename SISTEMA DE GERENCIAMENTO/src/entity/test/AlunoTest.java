package entity.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import entity.Aluno;

class AlunoTest {

    @Test
    void testCriacaoAluno() {
        Aluno aluno = new Aluno("David Oliveira", "davidanima@educacao.com.br", "senha90452");
        assertEquals("David Oliveira", aluno.getNome()); // Verifica se o nome foi setado corretamente
        assertEquals("davidanima@educacao.com.br", aluno.getLogin()); // Verifica o login
    }

    @Test
    void testSetId() {
        Aluno aluno = new Aluno("Filipe Matos", "filipeanima@educacao.com.br", "senha47851");
        aluno.setId(1001);
        assertEquals(1001, aluno.getId()); // Verifica se o ID foi atualizado
    }

    @Test
    void testToString() {
        Aluno aluno = new Aluno("Raquel Dias", "raquelanima@educacao.com.br", "senha56978");
        aluno.setId(2002);
        String expected = "Aluno{id=2002, nome='Raquel Dias', login='raquelanima@educacao.com.br'}";
        assertEquals(expected, aluno.toString()); // Verifica a formatação do toString()
    }
}
