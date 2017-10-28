/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import exception.Excesao;
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

        if ("buscar".equals(e.getActionCommand())) {
            try {
                modelchecarEstrang = checarestrang.getModelChecarestrang();
            } catch (Excesao ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
                return;
            }
            modelchecarEstrang.getNumpassap();
            numpassap = modelchecarEstrang.getNumpassap();
            System.out.println("Numero do Passaporte : " + numpassap);

        }
        if ("apagar".equals(e.getActionCommand())) {
            try {
                modelchecarEstrang = checarestrang.getModelChecarestrang();
            } catch (Excesao ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
                return;
            }
            JOptionPane.showMessageDialog(null, " Não foi implementado essa função ");

        }
    }

}
