package org.biblioteca;

import javax.swing.JOptionPane;
public class Biblioteca {
    public static void main(String x[]) {
        Emprestimo emprestimo = new Emprestimo();
        CadastroLivro livro = new CadastroLivro();
        CadastroAluno aluno = new CadastroAluno();

        int op;

        do{
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "\n\nBem vindo a biblioteca! \n Escolha uma das " +
                    "opções abaixo: \n 0 - Sair \n 1 - Cadastro de Livro. \n 2 - Cadastro de Aluno. \n 3 - Retirada de Livros. \n 4 - Devolução de livro"));
            if (op != 0){
                if (op==1){
                    livro.cadastroLivro();
                }
                if (op==2){
                    aluno.cadastroAluno();
                }
                if (op==3){
                    emprestimo.retirada();
                }
                if (op==4){
                    emprestimo.devolucao();
                }
            }
        }while (op != 0);
    }
}