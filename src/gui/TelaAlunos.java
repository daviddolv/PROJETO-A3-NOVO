package gui;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import entity.Aluno;
import sistema.Sistema;

/**
 * 🎓 TelaAlunos
 * 
 * Representa a interface gráfica responsável por gerenciar alunos.
 * Permite operações como: cadastrar, listar, excluir e futuramente editar alunos.
 * 
 * Desenvolvida com Java Swing e foco em clareza de código e usabilidade.
 */
public class TelaAlunos extends JFrame {

    /**
     * Construtor principal da tela.
     * Configura layout, botões e eventos associados.
     *
     * @param parent Janela pai (utilizada para centralização na tela)
     */
    public TelaAlunos(JFrame parent) {
        setTitle("Gerenciar Alunos");
        setSize(400, 300);
        setLocationRelativeTo(parent); // Centraliza a janela na tela principal
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Fecha apenas esta janela

        // Painel principal com layout vertical (5 linhas, 1 coluna)
        JPanel painelPrincipal = new JPanel(new GridLayout(5, 1, 10, 10));

        // Botão: Cadastrar aluno
        JButton botaoCadastrar = new JButton("Cadastrar Aluno");
        botaoCadastrar.addActionListener(e -> abrirFormularioCadastro());
        painelPrincipal.add(botaoCadastrar);

        // Botão: Listar alunos
        JButton botaoListar = new JButton("Listar Alunos");
        botaoListar.addActionListener(e -> exibirListaAlunos());
        painelPrincipal.add(botaoListar);

        // Botão: Deletar aluno
        JButton botaoDeletar = new JButton("Deletar Aluno");
        botaoDeletar.addActionListener(e -> deletarAlunoPorId());
        painelPrincipal.add(botaoDeletar);

        // Botão: Alterar aluno (ainda em desenvolvimento)
        JButton botaoAlterar = new JButton("Alterar Aluno");
        botaoAlterar.addActionListener(e -> exibirMensagemEmConstrucao());
        painelPrincipal.add(botaoAlterar);

        // Botão: Voltar
        JButton botaoVoltar = new JButton("Voltar");
        botaoVoltar.addActionListener(e -> dispose());
        painelPrincipal.add(botaoVoltar);

        // Adiciona o painel à janela principal
        add(painelPrincipal);
        setVisible(true);
    }

    /**
     * 📝 Formulário de cadastro de aluno
     * 
     * Solicita os dados via caixas de diálogo e adiciona o aluno ao sistema.
     */
    private void abrirFormularioCadastro() {
        String nome = JOptionPane.showInputDialog(this, "Nome:");
        if (nome == null || nome.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nome não pode ser vazio.");
            return;
        }

        String login = JOptionPane.showInputDialog(this, "Login:");
        String senha = JOptionPane.showInputDialog(this, "Senha:");

        // Verifica se todos os campos obrigatórios foram preenchidos
        if (login == null || senha == null || login.trim().isEmpty() || senha.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos os campos são obrigatórios.");
            return;
        }

        Aluno novoAluno = new Aluno(nome.trim(), login.trim(), senha.trim());
        Sistema.adicionarAluno(novoAluno);

        JOptionPane.showMessageDialog(this, "Aluno cadastrado com sucesso.");
    }

    /**
     * 📋 Lista todos os alunos cadastrados
     * 
     * Mostra ID, nome e login de cada aluno cadastrado no sistema.
     */
    private void exibirListaAlunos() {
        List<Aluno> alunos = Sistema.getAlunos();

        if (alunos.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhum aluno cadastrado.");
            return;
        }

        StringBuilder listaFormatada = new StringBuilder("Lista de Alunos:\n");
        for (Aluno aluno : alunos) {
            listaFormatada.append("ID: ").append(aluno.getId())
                          .append(" | Nome: ").append(aluno.getNome())
                          .append(" | Login: ").append(aluno.getLogin())
                          .append("\n");
        }

        JOptionPane.showMessageDialog(this, listaFormatada.toString());
    }

    /**
     * ❌ Deletar aluno por ID
     * 
     * Solicita ID do aluno e tenta removê-lo do sistema.
     */
    private void deletarAlunoPorId() {
        String idDigitado = JOptionPane.showInputDialog(this, "Informe o ID do aluno:");

        try {
            int id = Integer.parseInt(idDigitado);
            boolean removido = Sistema.deletarAlunoPorId(id);

            if (removido) {
                JOptionPane.showMessageDialog(this, "Aluno removido com sucesso.");
            } else {
                JOptionPane.showMessageDialog(this, "Aluno não encontrado.");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID inválido. Digite um número inteiro.");
        } catch (NullPointerException e) {
            // Usuário clicou em cancelar; nenhuma ação necessária
        }
    }

    /**
     * 🚧 Funcionalidade ainda não implementada
     */
    private void exibirMensagemEmConstrucao() {
        JOptionPane.showMessageDialog(this, "Funcionalidade em desenvolvimento.");
    }
}
