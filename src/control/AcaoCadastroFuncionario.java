/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.ModelCadastroFuncionario;
import visao.CadastroFuncionario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author CarlosFernandes
 */
public class AcaoCadastroFuncionario implements ActionListener {

    private CadastroFuncionario cadastroFuncionario;
    private String email, senha, confsenha, endereco, tipopessoa, estado, sexo, nome, estadociveil;
    private Date data;
    private int celular, cpf;
    private ModelCadastroFuncionario modelCadastroFuncionario;

    public AcaoCadastroFuncionario(CadastroFuncionario cadastroFuncionario) {
        this.cadastroFuncionario = cadastroFuncionario;
    }

    public void actionPerformed(ActionEvent e) {
        modelCadastroFuncionario = cadastroFuncionario.modelcadastro();
        if ("salvar".equals(e.getActionCommand())) {

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
                JOptionPane.showMessageDialog(null, "As senhas não conferem");
            }

        }

        if ("limpar".equals(e.getActionCommand())) {
            cadastroFuncionario.limpar();
        }
    }

}
