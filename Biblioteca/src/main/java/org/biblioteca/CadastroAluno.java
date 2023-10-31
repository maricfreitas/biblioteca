package org.biblioteca;

import javax.swing.JOptionPane;

public class CadastroAluno extends Cadastro {

    public void cadastroAluno(){
        nomeAluno = JOptionPane.showInputDialog("Digite o nome do aluno");
        idAluno = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do aluno"));
        JOptionPane.showMessageDialog(null, "Aluno " + nomeAluno + " com código " + idAluno +", cadastrado com sucesso");
    }
}
