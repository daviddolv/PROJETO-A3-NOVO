package sistema;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class SistemaTestHelper {
    public static void resetSistema() {
        try {
            Field alunosField = Sistema.class.getDeclaredField("alunos");
            alunosField.setAccessible(true);
            alunosField.set(null, new ArrayList<>());

            Field idField = Sistema.class.getDeclaredField("idAtual");
            idField.setAccessible(true);
            idField.setInt(null, 1);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao resetar o sistema para os testes", e);
        }
    }
}
