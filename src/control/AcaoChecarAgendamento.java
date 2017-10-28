/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import exception.Excesao;
import modelo.ModelChecarAgendamento;
import visao.ChecarAgendamento;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author CarlosFernandes
 */
public class AcaoChecarAgendamento implements ActionListener {

    private int pesquisar;
    private ChecarAgendamento checaragendamento;
    private ModelChecarAgendamento modelchecaragendamento;

    public AcaoChecarAgendamento(ChecarAgendamento checaragendamento) {
        this.checaragendamento = checaragendamento;
    }

    public void actionPerformed(ActionEvent e) {

        if ("buscar".equals(e.getActionCommand())) {
            try {
                modelchecaragendamento = checaragendamento.modelchegaragendamento();
            } catch (Excesao ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
                return;
            }

            pesquisar = modelchecaragendamento.getCodigosolicitacao();
            System.out.println("Codigo :" + pesquisar);

        }
        if ("apagar".equals(e.getActionCommand())) {
            try {
                modelchecaragendamento = checaragendamento.modelchegaragendamento();
            } catch (Excesao ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
                return;
            }
            pesquisar = modelchecaragendamento.getCodigosolicitacao();
            JOptionPane.showMessageDialog(null, " Não foi implementado essa função ");

        }
        if ("limpar".equals(e.getActionCommand())) {
            checaragendamento.limpar();
        }
    }

}
