/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.ModelCadastroFuncionario;
import visao.CadastroFuncionario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author CarlosFernandes
 */
public class AcaoCadastroFuncionario implements ActionListener {

    private CadastroFuncionario cadastroFuncionario;
    private String email, senha, confsenha;
    private ModelCadastroFuncionario modelCadastroFuncionario;

    public AcaoCadastroFuncionario(CadastroFuncionario cadastroFuncionario) {
        this.cadastroFuncionario = cadastroFuncionario;
    }

    public void actionPerformed(ActionEvent e) {
        modelCadastroFuncionario = cadastroFuncionario.modelcadastro();
        if ("salvar".equals(e.getActionCommand())) {
          
            email = modelCadastroFuncionario.getEmail();
            senha = modelCadastroFuncionario.getSenha();
            confsenha = modelCadastroFuncionario.getConfsenha();

            if (senha.equals(confsenha)) {
                System.out.println("Email :" + email + ""
                        + "\nSenha :" + senha);
            } else {
                JOptionPane.showMessageDialog(null, "As senhas não conferem");
            }

        }

        if ("limpar".equals(e.getActionCommand())) {
            cadastroFuncionario.limpar();
        }
    }

}
