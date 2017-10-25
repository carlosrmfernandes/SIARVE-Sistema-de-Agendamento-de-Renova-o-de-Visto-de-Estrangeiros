/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import visao.Developer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author CarlosFernandes
 */
public class AcaoDeveloper implements ActionListener {

   private Developer developer;

    public AcaoDeveloper(Developer developer) {
        this.developer = developer;
    }

    public void actionPerformed(ActionEvent e) {
        if ("sair".equals(e.getActionCommand())) {
            developer.dispose();
        }

    }

}
