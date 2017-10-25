/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.ModelChecarFunc;
import visao.ChecarFunc;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author CarlosFernandes
 */
public class AcaoChecarFunc implements ActionListener {

    private String email;
    private ChecarFunc checarfunc;
    private ModelChecarFunc modelchecarFunc;

    public AcaoChecarFunc(ChecarFunc checarfunc) {
        this.checarfunc = checarfunc;
    }

    public void actionPerformed(ActionEvent e) {
        modelchecarFunc = checarfunc.getModelChecarFunc();

        if ("apagar".equals(e.getActionCommand())) {
            email = modelchecarFunc.getEmail();
            JOptionPane.showMessageDialog(null, "Don't have fuction " + " < " + email + " > ");
        }
    }

}
