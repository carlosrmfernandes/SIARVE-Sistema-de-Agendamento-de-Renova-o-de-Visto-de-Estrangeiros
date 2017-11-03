/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import visao.Developer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author CarlosFernandes
 */
public class AcaoDeveloper implements ActionListener {

    private Developer developer;
    private DadosdoSistemas dados = new DadosdoSistemas();
    private String Dados = null;
    private String nomeArquivo = "Dados_do_Sistema.txt";
    private final String nomeArquivoLogin = "Ultimo_Login.txt";

    public AcaoDeveloper(Developer developer) {
        this.developer = developer;
    }

    private String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public void actionPerformed(ActionEvent e) {
        if ("sair".equals(e.getActionCommand())) {
            Dados = getDateTime() + " Usuário " + dados.lerArquivo(nomeArquivoLogin) + " Visualizou quem foram Os Desenvolvedores do sistema";
            dados.gravarArquivodadossistema(nomeArquivo, Dados);
            developer.dispose();
        }

    }

}
