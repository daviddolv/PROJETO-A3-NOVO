package gui;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import entity.Aluno;
import sistema.Sistema;

/**
 * 🎓 TelaGerenciarAlunos
 * 
 * Janela gráfica para gerenciamento de alunos usando Swing.
 * Permite cadastrar, listar, excluir e visualizar opção de alterar alunos.
 */
public class TelaGerenciarAlunos extends JFrame {

    /**
     * Construtor da tela.
     * 
     * @param parent Janela pai usada para centralização.
     */
    public TelaGerenciarAlunos(JFrame parent) {
        setTitle("Gerenciar Alunos");
        setSize(300, 300);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Painel principal com layout em grade (5 linhas x 1 coluna)
        JPanel painel = new JPanel(new GridLayout(5, 1, 10, 10));

        // Botão: Cadastrar
        JButton botaoCadastrar = new JButton("Cadastrar Aluno");
        botaoCadastrar.addActionListener(e -> cadastrarAluno());
        painel.add(botaoCadastrar);

        // Botão: Listar
        JButton botaoListar = new JButton("Listar Alunos");
        botaoListar.addActionListener(e -> listarAlunos());
        painel.add(botaoListar);

        // Botão: Deletar
        JButton botaoDeletar = new JButton("Deletar Aluno");
        botaoDeletar.addActionListener(e -> deletarAluno());
        painel.add(botaoDeletar);

        // Botão: Alterar (ainda não implementado)
        JButton botaoAlterar = new JButton("Alterar Aluno");
        botaoAlterar.addActionListener(e -> JOptionPane.showMessageDialog(this, "Funcionalidade a implementar"));
        painel.add(botaoAlterar);

        // Botão: Voltar
        JButton botaoVoltar = new JButton("Voltar");
        botaoVoltar.addActionListener(e -> dispose());
        painel.add(botaoVoltar);

        add(painel);
    }

    /**
     * 📝 Cadastro de novo aluno.
     * Solicita os dados básicos e envia ao sistema.
     */
    private void cadastrarAluno() {
        String nome = JOptionPane.showInputDialog(this, "Nome:");
        if (nome == null || nome.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nome não pode ser vazio.");
            return;
        }

        String login = JOptionPane.showInputDialog(this, "Login:");
        String senha = JOptionPane.showInputDialog(this, "Senha:");

        // Verificação de campos obrigatórios
        if (login == null || senha == null || login.trim().isEmpty() || senha.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos os campos são obrigatórios.");
            return;
        }

        Aluno novoAluno = new Aluno(nome.trim(), login.trim(), senha.trim());
        Sistema.adicionarAluno(novoAluno);
        JOptionPane.showMessageDialog(this, "Aluno cadastrado com sucesso.");
    }

    /**
     * 📋 Exibe lista de alunos cadastrados.
     */
    private void listarAlunos() {
        List<Aluno> alunos = Sistema.getAlunos();

        if (alunos.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhum aluno cadastrado.");
            return;
        }

        StringBuilder lista = new StringBuilder("Lista de Alunos:\n");
        for (Aluno aluno : alunos) {
            lista.append("ID: ").append(aluno.getId())
                 .append(" | Nome: ").append(aluno.getNome())
                 .append(" | Login: ").append(aluno.getLogin())
                 .append("\n");
        }

        JOptionPane.showMessageDialog(this, lista.toString());
    }

    /**
     * ❌ Remove aluno com base no ID informado.
     */
    private void deletarAluno() {
        String entradaId = JOptionPane.showInputDialog(this, "Informe o ID do aluno:");
        
        try {
            int id = Integer.parseInt(entradaId);
            boolean removido = Sistema.deletarAlunoPorId(id);

            if (removido) {
                JOptionPane.showMessageDialog(this, "Aluno removido com sucesso.");
            } else {
                JOptionPane.showMessageDialog(this, "Aluno não encontrado.");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID inválido. Digite um número inteiro.");
        } catch (NullPointerException e) {
            // Entrada cancelada pelo usuário. Nenhuma ação necessária.
        }
    }
}
