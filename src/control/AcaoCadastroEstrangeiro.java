/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.ModelCadastroEstrangeiro;
import visao.CadastroEstrangeiro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author CarlosFernandes
 */
public class AcaoCadastroEstrangeiro implements ActionListener {

    private String NumPassaporte, nome, numCelular, endereco;
    private CadastroEstrangeiro cadastroestrangeiro;
    private ModelCadastroEstrangeiro modelcadastroEstrangeiro;

    public AcaoCadastroEstrangeiro(CadastroEstrangeiro cadastroestrangeiro) {
        this.cadastroestrangeiro = cadastroestrangeiro;
    }

    public void actionPerformed(ActionEvent e) {

        modelcadastroEstrangeiro = cadastroestrangeiro.modelcdastroestrang();

        NumPassaporte = modelcadastroEstrangeiro.getNumPassaporte();
        nome = modelcadastroEstrangeiro.getNome();
        numCelular = modelcadastroEstrangeiro.getNumCelular();
        endereco = modelcadastroEstrangeiro.getEndereco();

        if ("salvar".equals(e.getActionCommand())) {

            System.out.println("Numero de Passaporte :" + NumPassaporte + ""
                    + "\nNome Completo :" + nome
                    + "\nNumero Celular :" + numCelular
                    + "\nEndereço :" + endereco);

        }

        if ("limpar".equals(e.getActionCommand())) {
            cadastroestrangeiro.limpar();

        }

    }

}
