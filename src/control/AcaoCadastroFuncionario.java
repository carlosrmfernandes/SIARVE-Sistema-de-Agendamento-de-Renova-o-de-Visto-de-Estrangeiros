/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import exception.Excesao;
import modelo.ModelCadastroFuncionario;
import visao.CadastroFuncionario;
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
public class AcaoCadastroFuncionario implements ActionListener {

    private CadastroFuncionario cadastroFuncionario;
    private String email, senha, confsenha, endereco, tipopessoa, estado, sexo, nome, estadociveil, celular, cpf;
    private Date data;
    private ModelCadastroFuncionario modelCadastroFuncionario;
    private DadosdoSistemas dados = new DadosdoSistemas();
    private String Dados = null;
    private String nomeArquivo = "Dados_do_Sistema.txt";

    public AcaoCadastroFuncionario(CadastroFuncionario cadastroFuncionario) {
        this.cadastroFuncionario = cadastroFuncionario;
    }

    private String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public void actionPerformed(ActionEvent e) {

        if ("salvar".equals(e.getActionCommand())) {
            try {
                modelCadastroFuncionario = cadastroFuncionario.modelcadastro();
            } catch (Excesao ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
                return;
            }

            email = modelCadastroFuncionario.getEmail();
            senha = modelCadastroFuncionario.getSenha();
            confsenha = modelCadastroFuncionario.getConfsenha();

            endereco = modelCadastroFuncionario.getEndereco();
            tipopessoa = modelCadastroFuncionario.getTipopessoa();
            estado = modelCadastroFuncionario.getEstado();
            sexo = modelCadastroFuncionario.getSexo();
            nome = modelCadastroFuncionario.getNome();
            estadociveil = modelCadastroFuncionario.getEstadociveil();
            data = modelCadastroFuncionario.getData();
            celular = modelCadastroFuncionario.getCelular();
            cpf = modelCadastroFuncionario.getCpf();

            SimpleDateFormat deteformat = new SimpleDateFormat("dd/MM/yyyy");
            String dataformatada = deteformat.format(data);

            if (senha.equals(confsenha)) {

                Dados = getDateTime() + " Foi Cadastrado No Sistema O Funcionário " + nome;
                dados.gravarArquivodadossistema(nomeArquivo, Dados);

                System.out.println("Email :" + email + ""
                        + "\nSenha :" + senha + ""
                        + "\nEdereco : " + endereco + ""
                        + "\nTipo de Pessoa : " + tipopessoa + ""
                        + "\nEstado : " + estado + ""
                        + "\nSexo : " + sexo + ""
                        + "\nNome : " + nome + ""
                        + "\nEstado Civil : " + estadociveil + ""
                        + "\nData de Registro :" + dataformatada + ""
                        + "\nCelular : " + celular + ""
                        + "\nCPF :" + cpf);
            } else {
                Dados = getDateTime() + " Erro No Cadastrado do Funcionário Porque as senhas São Diferentes ";
                dados.gravarArquivodadossistema(nomeArquivo, Dados);
                JOptionPane.showMessageDialog(null, "As senhas não conferem");
            }

        }

        if ("limpar".equals(e.getActionCommand())) {
            Dados = getDateTime() + " Lipou os campos do cadastro de Funcionário";
            dados.gravarArquivodadossistema(nomeArquivo, Dados);
            cadastroFuncionario.limpar();
        }
    }

}