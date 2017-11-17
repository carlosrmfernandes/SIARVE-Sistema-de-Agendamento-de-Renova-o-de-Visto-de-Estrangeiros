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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author CarlosFernandes
 */
public class AcaochecarEstrang implements ActionListener {

    private ChecarEstrang checarestrang;
    private ModelChecarEstrang modelchecarEstrang;
    private String numpassap;
    private DadosdoSistemas dados = new DadosdoSistemas();
    private String Dados = null;
    private String nomeArquivo = "Dados_do_Sistema.txt";
    private final String nomeArquivoLogin = "Ultimo_Login.txt";
    DadosControleDb dbcontrol = new DadosControleDb();

    public AcaochecarEstrang(ChecarEstrang checarestrang) {
        this.checarestrang = checarestrang;
    }

    private String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public void actionPerformed(ActionEvent e) {

        //funca de Busnca 
//        if ("buscar".equals(e.getActionCommand())) {
//            try {
//                modelchecarEstrang = checarestrang.getModelChecarestrang();
//            } catch (Excesao ex) {
//                JOptionPane.showMessageDialog(null, ex.getMessage());
//                return;
//            }
//            modelchecarEstrang.getNumpassap();
//            numpassap = modelchecarEstrang.getNumpassap();
//
//            Dados = getDateTime() + " Usuário " + dados.lerArquivo(nomeArquivoLogin) + " Pesquisou Pelo Estrangeiro que Contem o N' do Passaporte :" + numpassap;
//            dados.gravarArquivodadossistema(nomeArquivo, Dados);
//
//            System.out.println("Numero do Passaporte : " + numpassap);
//
//        }
        if ("apagar".equals(e.getActionCommand())) {
            try {
                modelchecarEstrang = checarestrang.getModelChecarestrang();

            } catch (Excesao ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
                return;
            }
            numpassap = modelchecarEstrang.getNumpassap();
            Dados = getDateTime() + " Usuário " + dados.lerArquivo(nomeArquivoLogin) + " Apagou o Estrangeiro que Contem o N' do Passaporte :" + numpassap;
            dados.gravarArquivodadossistema(nomeArquivo, Dados);

            dbcontrol.delete(numpassap);
        }
    }

}
