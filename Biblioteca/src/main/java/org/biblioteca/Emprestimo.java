package org.biblioteca;

import javax.swing.JOptionPane;

public class Emprestimo extends Cadastro {
    public void retirada(){

        nomeAluno = JOptionPane.showInputDialog("Digite o nome do Aluno");
        nomeLivro = JOptionPane.showInputDialog("Digite o nome do Livro");
        idLivro = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do Livro"));
        JOptionPane.showMessageDialog(null, "(" + idLivro + ") " + nomeLivro + " foi retirado por " + nomeAluno);
    }

    public void devolucao(){

        nomeAluno = JOptionPane.showInputDialog("Digite o nome do Aluno");
        nomeLivro = JOptionPane.showInputDialog("Digite o nome do Livro");
        idLivro = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do Livro"));
        JOptionPane.showMessageDialog(null, "(" + idLivro + ") " + nomeLivro + " foi devolvido por " + nomeAluno);
    }
}