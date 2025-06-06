package gui;

import javax.swing.*;
import java.awt.*;

/**
 * 🎓 TelaPrincipal
 * 
 * Interface principal do sistema de gerenciamento.
 * Apresenta três opções: Gerenciar Alunos, Gerenciar Turmas e Sair.
 * Utiliza layout GridBag para posicionamento centralizado e responsivo.
 */
public class TelaPrincipal extends JFrame {

    /**
     * Construtor da tela principal.
     * Define layout e botões funcionais.
     */
    public TelaPrincipal() {
        setTitle("Sistema de Gerenciamento de Alunos");
        setSize(400, 200);
        setLocationRelativeTo(null); // Centraliza a janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Painel principal com layout flexível
        JPanel painel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Espaçamento entre os componentes

        // Botão: Gerenciar Alunos
        JButton botaoAlunos = new JButton("Gerenciar Alunos");
        botaoAlunos.setPreferredSize(new Dimension(200, 40));
        botaoAlunos.addActionListener(e -> new TelaGerenciarAlunos(this).setVisible(true));
        gbc.gridx = 0;
        gbc.gridy = 0;
        painel.add(botaoAlunos, gbc);

        // Botão: Gerenciar Turmas (não implementado ainda)
        JButton botaoTurmas = new JButton("Gerenciar Turmas");
        botaoTurmas.setPreferredSize(new Dimension(200, 40));
        botaoTurmas.addActionListener(e -> JOptionPane.showMessageDialog(this, "Funcionalidade a implementar"));
        gbc.gridy = 1;
        painel.add(botaoTurmas, gbc);

        // Botão: Sair do sistema
        JButton botaoSair = new JButton("Sair");
        botaoSair.setPreferredSize(new Dimension(200, 40));
        botaoSair.addActionListener(e -> System.exit(0));
        gbc.gridy = 2;
        painel.add(botaoSair, gbc);

        add(painel);
        setVisible(true);
    }
}
