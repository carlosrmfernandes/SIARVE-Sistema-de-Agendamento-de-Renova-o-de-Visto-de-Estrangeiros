/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.ModelLogin;
import visao.Login;
import visao.PosLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author aristoteleslopes
 */
public class AcaoLogin implements ActionListener {

    private String user, password;
    private Login login;
    private ModelLogin modellogin;

    public AcaoLogin(Login login) {
        this.login = login;
    }

    public void actionPerformed(ActionEvent e) {
        modellogin = login.getLogin();
        user = modellogin.getUser();
        password = modellogin.getPassword();

        if (modellogin.getUser().isEmpty() || modellogin.getPassword().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Deve informar o nome do usuário e senha !...", "", JOptionPane.ERROR_MESSAGE);

        } else if (user.equals("admin") && password.equals("123")) {

            if ("login".equals(e.getActionCommand())) {
                login.dispose();
                new PosLogin().setVisible(true);
            }

        } else {

            JOptionPane.showMessageDialog(null, "Nome do usuário ou senha incorreta !...", "", JOptionPane.ERROR_MESSAGE);
        }
    }

}
