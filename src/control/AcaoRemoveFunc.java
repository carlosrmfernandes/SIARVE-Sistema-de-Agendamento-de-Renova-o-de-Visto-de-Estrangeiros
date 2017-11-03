/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import exception.Excesao;
import modelo.ModelChecarFunc;
import visao.ChecarFunc;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author CarlosFernandes
 */
public class AcaoRemoveFunc implements ActionListener {

    private String email;
    private ChecarFunc checarfunc;
    private ModelChecarFunc modelchecarFunc;
    private DadosdoSistemas dados = new DadosdoSistemas();
    private String Dados = null;
    private String nomeArquivo = "Dados_do_Sistema.txt";
    private final String nomeArquivoLogin = "Ultimo_Login.txt";
    private String emailv = "^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$";

    public AcaoRemoveFunc(ChecarFunc checarfunc) {
        this.checarfunc = checarfunc;
    }

    private String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public void actionPerformed(ActionEvent e) {

        if ("apagar".equals(e.getActionCommand())) {
            try {
                modelchecarFunc = checarfunc.getModelChecarFunc();
                email = modelchecarFunc.getEmail();
            } catch (Excesao ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
                return;
            }
            if (!email.matches(emailv)) {

                JOptionPane.showMessageDialog(null, "Verifica o email esta incorreto");

            } else {
                Dados = getDateTime() + " Usuário " + dados.lerArquivo(nomeArquivoLogin) + " Apagou Funcionário com o email " + email;
                dados.gravarArquivodadossistema(nomeArquivo, Dados);
                JOptionPane.showMessageDialog(null, " Não foi implementado essa função ");
            }
        }
    }

}
