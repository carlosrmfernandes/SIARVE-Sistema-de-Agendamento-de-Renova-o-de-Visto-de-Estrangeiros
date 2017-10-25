/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.ModelChecarEstrang;
import visao.ChecarEstrang;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author CarlosFernandes
 */
public class AcaochecarEstrang implements ActionListener {

    private ChecarEstrang checarestrang;
    private ModelChecarEstrang modelchecarEstrang;
    private String numpassap;

    public AcaochecarEstrang(ChecarEstrang checarestrang) {
        this.checarestrang = checarestrang;
    }

    public void actionPerformed(ActionEvent e) {
        modelchecarEstrang = checarestrang.getModelChecarestrang();
        if ("buscar".equals(e.getActionCommand())) {
            modelchecarEstrang.getNumpassap();
            numpassap = modelchecarEstrang.getNumpassap();
            System.out.println("Numero do Passaporte : " + numpassap);

        }
        if ("apagar".equals(e.getActionCommand())) {
            JOptionPane.showMessageDialog(null, "Don't have fuction");

        }
    }

}
