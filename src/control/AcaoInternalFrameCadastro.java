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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author CarlosFernandes
 */
public class AcaoInternalFrameCadastro implements ActionListener {

    private Date data;
    private String Descricao, horario;
    private int codigosolicitacao;
    private PosLogin novo;
    private ModelInternalFrameCadastro intelnalframecadastro;
    private InternalFrameCadastro cadastro;

    public AcaoInternalFrameCadastro(InternalFrameCadastro cadastro) {
        this.cadastro = cadastro;

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

            SimpleDateFormat deteformat = new SimpleDateFormat("dd/MM/yyyy");
            String dataformatada = deteformat.format(data);
            System.out.println("Codigo de Solicitão :" + codigosolicitacao + ""
                    + "\nDescrição :" + Descricao
                    + "\nData :" + dataformatada
                    + "\nHorário :" + horario);

        }
        if ("limpar".equals(e.getActionCommand())) {

            cadastro.limpar();
        }

        if ("novo".equals(e.getActionCommand())) {
            int escolha = JOptionPane.showConfirmDialog(null, "Um novo agendamento será iniciado "
                    + "\nDeseja continuar ?");
            if (escolha == 0) {
                cadastro.limpar();

            }
        }

    }

}
