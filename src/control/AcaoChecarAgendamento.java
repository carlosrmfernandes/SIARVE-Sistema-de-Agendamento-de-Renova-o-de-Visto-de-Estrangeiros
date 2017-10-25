/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.ModelChecarAgendamento;
import visao.ChecarAgendamento;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        modelchecaragendamento = checaragendamento.modelchegaragendamento();

        if ("buscar".equals(e.getActionCommand())) {

            pesquisar = modelchecaragendamento.getCodigosolicitacao();
            System.out.println("Codigo :" + pesquisar);

        }
        if ("apagar".equals(e.getActionCommand())) {
            pesquisar = modelchecaragendamento.getCodigosolicitacao();
            JOptionPane.showMessageDialog(null, "Don't have fuction " + " < " + pesquisar + " > ");

        }
        if ("limpar".equals(e.getActionCommand())) {
            checaragendamento.limpar();
        }
    }

}
