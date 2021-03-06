/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import exception.Excesao;
import modelo.ModelChecarAgendamento;
import visao.ChecarAgendamento;
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
public class AcaoChecarAgendamento implements ActionListener {

    private int pesquisar;
    private ChecarAgendamento checaragendamento;
    private ModelChecarAgendamento modelchecaragendamento;
    private DadosdoSistemas dados = new DadosdoSistemas();
    private String Dados = null;
    private String nomeArquivo = "Dados_do_Sistema.txt";
    private final String nomeArquivoLogin = "Ultimo_Login.txt";
    DadosControleDbAngendamento db = new DadosControleDbAngendamento();

    public AcaoChecarAgendamento(ChecarAgendamento checaragendamento) {
        this.checaragendamento = checaragendamento;
    }

    private String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public void actionPerformed(ActionEvent e) {

        if ("apagar".equals(e.getActionCommand())) {
            try {
                modelchecaragendamento = checaragendamento.modelchegaragendamento();
            } catch (Excesao ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
                return;
            }
            pesquisar = modelchecaragendamento.getCodigosolicitacao();
            Dados = getDateTime() + " Usuário " + dados.lerArquivo(nomeArquivoLogin) + " Apagpou o Angendamento que Contem o Código de Solicitão :" + pesquisar;
            dados.gravarArquivodadossistema(nomeArquivo, Dados);
            db.delete(pesquisar);
            JOptionPane.showMessageDialog(null, " O agendamento "+pesquisar+" Foi removido");

        }
        if ("limpar".equals(e.getActionCommand())) {

            Dados = getDateTime() + " Usuário " + dados.lerArquivo(nomeArquivoLogin) + " Limpou o Campos da Pesquisa de Agendamento";
            dados.gravarArquivodadossistema(nomeArquivo, Dados);

            checaragendamento.limpar();
        }
    }

}
