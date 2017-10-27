/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.ModelCadastroEstrangeiro;
import visao.CadastroEstrangeiro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author CarlosFernandes
 */
public class AcaoCadastroEstrangeiro implements ActionListener {

    private String NumPassaporte, nome, endereco, email, estadocivil, funcao, localfuncao, estado, sexo;
    private Date data;
    private int numCelular, cpf;

    private CadastroEstrangeiro cadastroestrangeiro;
    private ModelCadastroEstrangeiro modelcadastroEstrangeiro;

    public AcaoCadastroEstrangeiro(CadastroEstrangeiro cadastroestrangeiro) {
        this.cadastroestrangeiro = cadastroestrangeiro;
    }

    public void actionPerformed(ActionEvent e) {

        modelcadastroEstrangeiro = cadastroestrangeiro.modelcdastroestrang();

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

        if ("salvar".equals(e.getActionCommand())) {

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

        if ("limpar".equals(e.getActionCommand())) {
            cadastroestrangeiro.limpar();

        }

    }

}
