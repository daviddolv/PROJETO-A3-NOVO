package sistema;

public class SistemaTestHelper {

    public static void resetSistema() {
        try {
            Sistema.limparSistema(); // Limpa a lista usando método público
        } catch (Exception e) {
            throw new RuntimeException("Erro ao resetar o sistema para os testes", e);
        }
    }
}
