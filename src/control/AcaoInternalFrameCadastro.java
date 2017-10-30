/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import exception.Excesao;
import modelo.ModelInternalFrameCadastro;
import visao.InternalFrameCadastro;
import visao.PosLogin;
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
public class AcaoInternalFrameCadastro implements ActionListener {

    private Date data;
    private String Descricao, horario, tipo, sexo, email, celular;
    private int codigosolicitacao;
    private PosLogin novo;
    private ModelInternalFrameCadastro intelnalframecadastro;
    private InternalFrameCadastro cadastro;
    private DadosdoSistemas dados = new DadosdoSistemas();
    private String Dados = null;
    private String nomeArquivo = "Dados_do_Sistema.txt";

    public AcaoInternalFrameCadastro(InternalFrameCadastro cadastro) {
        this.cadastro = cadastro;

    }

    private String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public void actionPerformed(ActionEvent e) {

        if ("salvar".equals(e.getActionCommand())) {
            try {
                intelnalframecadastro = cadastro.getModelInternalFrameCadastro();
            } catch (Excesao ex) {
                JOptionPane.showMessageDialog(novo, ex.getMessage());
                return;
            }
            codigosolicitacao = intelnalframecadastro.getCodigosolicitacao();
            Descricao = intelnalframecadastro.getDescricao();
            data = intelnalframecadastro.getData();
            horario = intelnalframecadastro.getHorario();
            tipo = intelnalframecadastro.getTipo();
            sexo = intelnalframecadastro.getSexo();
            email = intelnalframecadastro.getEmail();
            celular = intelnalframecadastro.getCelular();

            SimpleDateFormat deteformat = new SimpleDateFormat("dd/MM/yyyy");
            String dataformatada = deteformat.format(data);

            Dados = getDateTime() + " Agendou a Renovação do visto com o Codigo de codigosolicitacao " + codigosolicitacao;
            dados.gravarArquivodadossistema(nomeArquivo, Dados);

            System.out.println("Codigo de Solicitão :" + codigosolicitacao + ""
                    + "\nDescrição :" + Descricao
                    + "\nData :" + dataformatada
                    + "\nHorário :" + horario + ""
                    + "\nTipo :" + tipo + ""
                    + "\nSexo :" + sexo + ""
                    + "\nEmail :" + email + ""
                    + "\nCelualr : " + celular);

        }
        if ("limpar".equals(e.getActionCommand())) {

            Dados = getDateTime() + " Limpou os Campos de Agendamento";
            dados.gravarArquivodadossistema(nomeArquivo, Dados);

            cadastro.limpar();
        }

        if ("novo".equals(e.getActionCommand())) {
            int escolha = JOptionPane.showConfirmDialog(null, "Um novo agendamento será iniciado "
                    + "\nDeseja continuar ?");
            if (escolha == 0) {
                Dados = getDateTime() + " Começou um Novo Agendamento";
                dados.gravarArquivodadossistema(nomeArquivo, Dados);
                cadastro.limpar();

            }
        }

    }

}