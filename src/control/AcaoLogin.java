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
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author CarlosFernandes
 */
public class AcaoLogin implements ActionListener {

    private String user, password;
    private Login login;
    private ModelLogin modellogin;
    private DadosdoSistemas dados = new DadosdoSistemas();
    private String Dados = null;
    private String nomeArquivodadossistema = "Dados_do_Sistema.txt";

    public AcaoLogin(Login login) {
        this.login = login;
    }

    private void gravarArquivoUltimoLogin(String nomeArquivo, String textoArquivo) {

        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {

            fileWriter = new FileWriter(nomeArquivo, false);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(textoArquivo);
            bufferedWriter.flush();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar o arquivo: " + ex.getMessage());
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao salvar o arquivo: " + ex.getMessage());
                }
            }
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao salvar o arquivo: " + ex.getMessage());
                }

            }
        }
    }

    private String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public void actionPerformed(ActionEvent e) {
        modellogin = login.getLogin();
        user = modellogin.getUser();
        password = modellogin.getPassword();

        if (modellogin.getUser().isEmpty() || modellogin.getPassword().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Deve informar o nome do usuário e senha !...", "", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            login.dispose();
        }
        new PosLogin().setVisible(true);
        String nomeArquivo = "Ultimo_Login.txt";
        gravarArquivoUltimoLogin(nomeArquivo, user);
        Dados = getDateTime() + " Usuário " + user + " Logou No Sistema ";
        dados.gravarArquivodadossistema(nomeArquivodadossistema, Dados);

    }

}
