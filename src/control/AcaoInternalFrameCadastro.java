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
    private String Descricao, horario, tipo, sexo, email, celular, numpassaporte;
    private int codigosolicitacao;
    private PosLogin novo;
    private ModelInternalFrameCadastro intelnalframecadastro;
    private InternalFrameCadastro cadastro;
    private DadosdoSistemas dados = new DadosdoSistemas();
    private String Dados = null;
    private String nomeArquivo = "Dados_do_Sistema.txt";
    private final String nomeArquivoLogin = "Ultimo_Login.txt";

    private String emailv = "^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$";
    DadosControleDbAngendamento db = new DadosControleDbAngendamento();

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
            numpassaporte = intelnalframecadastro.getNumpassaporte();
            String nomefuncionario = dados.lerArquivo(nomeArquivoLogin);

            SimpleDateFormat deteformat = new SimpleDateFormat("dd/MM/yyyy");
            String dataformatada = deteformat.format(data);

            if (!email.matches(emailv)) {

                JOptionPane.showMessageDialog(null, "Verifica o email esta incorreto");

            } else {
                Dados = getDateTime() + " Usuário " + dados.lerArquivo(nomeArquivoLogin) + " Agendou a Renovação do visto com o Codigo de codigosolicitacao " + codigosolicitacao;
                dados.gravarArquivodadossistema(nomeArquivo, Dados);

                db.cadstroestroAgendamento(intelnalframecadastro, dados.lerArquivo(nomeArquivoLogin));
            }

        }
        if ("limpar".equals(e.getActionCommand())) {

            Dados = getDateTime() + " Usuário " + dados.lerArquivo(nomeArquivoLogin) + " Limpou os Campos de Agendamento";
            dados.gravarArquivodadossistema(nomeArquivo, Dados);

            cadastro.limpar();
        }

        if ("novo".equals(e.getActionCommand())) {
            int escolha = JOptionPane.showConfirmDialog(null, "Um novo agendamento será iniciado "
                    + "\nDeseja continuar ?");
            if (escolha == 0) {
                Dados = getDateTime() + " Usuário " + dados.lerArquivo(nomeArquivoLogin) + " Começou um Novo Agendamento";
                dados.gravarArquivodadossistema(nomeArquivo, Dados);
                cadastro.limpar();

            }
        }

    }

}
