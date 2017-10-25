/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import visao.CadastroEstrangeiro;
import visao.CadastroFuncionario;
import visao.ChecarAgendamento;
import visao.ChecarEstrang;
import visao.ChecarFunc;
import visao.Developer;
import visao.InternalFrameCadastro;
import visao.PosLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author aristoteleslopes
 */
public class AcaoPosLogin implements ActionListener {

    private PosLogin novo;

    private String pesquisar;
    private InternalFrameCadastro obj;
    private Developer obj1;
    private CadastroFuncionario obj2;
    private CadastroEstrangeiro obj3;
    private ChecarFunc obj4;
    private ChecarEstrang obj5;
    private ChecarAgendamento obj6;

    public AcaoPosLogin(PosLogin novo) {
        this.novo = novo;
    }

    public void actionPerformed(ActionEvent e) {
        if ("novo".equals(e.getActionCommand())) {

            if (obj == null || !obj.isVisible()) {
                obj = new InternalFrameCadastro();
                novo.getjDesktopPane().add(obj);
                obj.setVisible(true);
                try {
                    obj.setSelected(true);
                } catch (PropertyVetoException ex) {
                    Logger.getLogger(AcaoPosLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
        if ("sair".equals(e.getActionCommand())) {
            int escolha = JOptionPane.showConfirmDialog(null, "Att: Certifique que não há agendamento em processamento"
                    + "\nDeseja encerrar o sistema ?");
            if (escolha == 0) {
                System.exit(0);
            }
        }
        if ("sobre".equals(e.getActionCommand())) {
            JOptionPane.showMessageDialog(null, "SIARVE -  É  um   sistema  de  agendamento "
                    + "\nDe ronovacao de visto de  estrangeiro  com o"
                    + "\nObjetivo de facilitar o processo  de marcacao"
                    + "\nDe renovação  do visto, o  sistema permiti a o"
                    + "\nAgentadamento  no maximo de 10 pessoas ao dia, o processo"
                    + "\nO precesso de  renovação  leva em  torno  de 30 à 45 minutos :)");
        }
        if ("ajuda".equals(e.getActionCommand())) {
            JOptionPane.showMessageDialog(null, "Entar em contacto com o suporte "
                    + "\nEmail : carlosr.m.fernandes@hotmail.com");
        }
        if ("developer".equals(e.getActionCommand())) {
            if (obj1 == null || !obj1.isVisible()) {
                obj1 = new Developer();
                novo.getjDesktopPane().add(obj1);
                obj1.setVisible(true);
                try {
                    obj1.setSelected(true);
                } catch (PropertyVetoException ex) {
                    Logger.getLogger(AcaoPosLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

        if ("cadastroFuncionario".equals(e.getActionCommand())) {
            if (obj2 == null || !obj2.isVisible()) {
                obj2 = new CadastroFuncionario();
                novo.getjDesktopPane().add(obj2);
                obj2.setVisible(true);
                try {
                    obj2.setSelected(true);
                } catch (PropertyVetoException ex) {
                    Logger.getLogger(AcaoPosLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        if ("cadastroestrangeiro".equals(e.getActionCommand())) {
            if (obj3 == null || !obj3.isVisible()) {
                obj3 = new CadastroEstrangeiro();
                novo.getjDesktopPane().add(obj3);
                obj3.setVisible(true);
                try {
                    obj3.setSelected(true);
                } catch (PropertyVetoException ex) {
                    Logger.getLogger(AcaoPosLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
        if ("checarfunc".equals(e.getActionCommand())) {

            if (obj4 == null || !obj4.isVisible()) {
                obj4 = new ChecarFunc();
                novo.getjDesktopPane().add(obj4);
                obj4.setVisible(true);
                try {
                    obj4.setSelected(true);
                } catch (PropertyVetoException ex) {
                    Logger.getLogger(AcaoPosLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
        if ("checarestr".equals(e.getActionCommand())) {

            if (obj5 == null || !obj5.isVisible()) {
                obj5 = new ChecarEstrang();
                novo.getjDesktopPane().add(obj5);
                obj5.setVisible(true);
                try {
                    obj5.setSelected(true);
                } catch (PropertyVetoException ex) {
                    Logger.getLogger(AcaoPosLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
        if ("checaragendamento".equals(e.getActionCommand())) {

            if (obj6 == null || !obj6.isVisible()) {
                obj6 = new ChecarAgendamento();
                novo.getjDesktopPane().add(obj6);
                obj6.setVisible(true);
                try {
                    obj6.setSelected(true);
                } catch (PropertyVetoException ex) {
                    Logger.getLogger(AcaoPosLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

    }

}
