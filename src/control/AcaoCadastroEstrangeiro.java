/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import exception.Excesao;
import modelo.ModelCadastroEstrangeiro;
import visao.CadastroEstrangeiro;
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
public class AcaoCadastroEstrangeiro implements ActionListener {

    private String NumPassaporte, nome, endereco, email, estadocivil, funcao, localfuncao, estado, sexo, numCelular, cpf;
    private Date data;
    private CadastroEstrangeiro cadastroestrangeiro;
    private ModelCadastroEstrangeiro modelcadastroEstrangeiro;
    private DadosdoSistemas dados = new DadosdoSistemas();
    private String Dados = null;
    private String nomeArquivo = "Dados_do_Sistema.txt";
    private final String nomeArquivoLogin = "Ultimo_Login.txt";
    private String emailv = "^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$";

    public AcaoCadastroEstrangeiro(CadastroEstrangeiro cadastroestrangeiro) {
        this.cadastroestrangeiro = cadastroestrangeiro;
    }

    private String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public void actionPerformed(ActionEvent e) {

        if ("salvar".equals(e.getActionCommand())) {
            try {
                modelcadastroEstrangeiro = cadastroestrangeiro.modelcdastroestrang();
            } catch (Excesao ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
                return;
            }
            NumPassaporte = modelcadastroEstrangeiro.getNumPassaporte();
            nome = modelcadastroEstrangeiro.getNome();
            numCelular = modelcadastroEstrangeiro.getNumCelular();
            endereco = modelcadastroEstrangeiro.getEndereco();
            cpf = modelcadastroEstrangeiro.getCpf();
            data = modelcadastroEstrangeiro.getData();
            email = modelcadastroEstrangeiro.getEmail();
            estado = modelcadastroEstrangeiro.getEstado();
            estadocivil = modelcadastroEstrangeiro.getEstadocivil();
            funcao = modelcadastroEstrangeiro.getFuncao();
            localfuncao = modelcadastroEstrangeiro.getLocalfuncao();
            sexo = modelcadastroEstrangeiro.getSexo();

            SimpleDateFormat deteformat = new SimpleDateFormat("dd/MM/yyyy");
            String dataformatada = deteformat.format(data);

            if (!email.matches(emailv)) {
                JOptionPane.showMessageDialog(null, "Verifica o email esta incorreto");
            } else {
                Dados = getDateTime() + " Usuário " + dados.lerArquivo(nomeArquivoLogin) + " Cadastrou No Sistema O Estrangeiro " + nome;
                dados.gravarArquivodadossistema(nomeArquivo, Dados);

                System.out.println("Numero de Passaporte :" + NumPassaporte + ""
                        + "\nNome Completo :" + nome
                        + "\nNumero Celular :" + numCelular
                        + "\nEndereço :" + endereco
                        + "\nCPF :" + cpf
                        + "\nData :" + dataformatada
                        + "\nEmail :" + email
                        + "\nEstado :" + estado
                        + "\nEstado Civil :" + estadocivil
                        + "\nFunção :" + funcao
                        + "\nLocal da Função :" + localfuncao
                        + "\nSexo :" + sexo);
            }

        }

        if ("limpar".equals(e.getActionCommand())) {
            Dados = getDateTime() + " Usuário " + dados.lerArquivo(nomeArquivoLogin) + " Lipou os campos do cadastro de Estrangeiro";
            dados.gravarArquivodadossistema(nomeArquivo, Dados);
            cadastroestrangeiro.limpar();

        }

    }

}
