package org.biblioteca;

import javax.swing.*;

public class CadastroLivro extends Cadastro{
    public void cadastroLivro(){
        nomeLivro = JOptionPane.showInputDialog("Digite o nome do Livro");
        idLivro = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do Livro"));
        autor = JOptionPane.showInputDialog("Digite o autor do Livro");
        JOptionPane.showMessageDialog(null, "Livro " + nomeLivro + " com código " + idLivro +" escrito por " + autor + " , cadastrado com sucesso");
    }
}
