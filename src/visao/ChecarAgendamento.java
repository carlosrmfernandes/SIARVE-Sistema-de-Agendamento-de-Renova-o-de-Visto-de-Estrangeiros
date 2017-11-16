/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import control.AcaoChecarAgendamento;
import exception.Excesao;
import modelo.ModelChecarAgendamento;

/**
 *
 * @author CarlosFernandes
 */
public class ChecarAgendamento extends javax.swing.JInternalFrame {

    /**
     * Creates new form ChecarAgendamento
     */
    private AcaoChecarAgendamento l = new AcaoChecarAgendamento(this);

    public ModelChecarAgendamento modelchegaragendamento() throws Excesao {

        if ("".equals(tfpesquisa.getText()) || tfpesquisa.getText().length() > 10) {
            throw new Excesao("Verifica se o campo  de codigo de solicitação não esta vazio "
                    + "\nou se codigo de solicitação foi digitado corretamente ");

        }

        ModelChecarAgendamento checaragen = new ModelChecarAgendamento();
        checaragen.setCodigosolicitacao(Integer.parseInt(tfpesquisa.getText()));

        return checaragen;

    }

    public void limpar() {
        tfpesquisa.setText("");
    }

    public ChecarAgendamento() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbcodigosolicitacao = new javax.swing.JLabel();
        tfpesquisa = new javax.swing.JTextField();
        btapagar = new javax.swing.JButton();
        btlimpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTable = new javax.swing.JTable();

        setClosable(true);

        lbcodigosolicitacao.setText("Codigo de Solicitação");

        tfpesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfpesquisaActionPerformed(evt);
            }
        });
        tfpesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfpesquisaKeyTyped(evt);
            }
        });

        btapagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/save.png"))); // NOI18N
        btapagar.setText("Apagar");
        btapagar.addActionListener(l);
        btapagar.setActionCommand("apagar");
        btapagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btapagarActionPerformed(evt);
            }
        });

        btlimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/apagar.png"))); // NOI18N
        btlimpar.setText("Limpar");
        btlimpar.addActionListener(l);
        btlimpar.setActionCommand("limpar");
        btlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlimparActionPerformed(evt);
            }
        });

        tbTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"6381913", "2017-12-06", "16:30", "Renovação de Visto"},
                {"6381913", "2017-12-06", "16:30", "Renovação de Visto"},
                {"6381913", "2017-12-06", "16:30", "Renovação de Visto"},
                {"6381913", "2017-12-06", "16:30", "Renovação de Visto"}
            },
            new String [] {
                "Codigo de Solicitação", "Data", "Horário", "Descrição"
            }
        ));
        jScrollPane1.setViewportView(tbTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lbcodigosolicitacao)
                        .addGap(18, 18, 18)
                        .addComponent(tfpesquisa)
                        .addGap(18, 18, 18)
                        .addComponent(btapagar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btlimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btlimpar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(btapagar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbcodigosolicitacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfpesquisa, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfpesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfpesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfpesquisaActionPerformed

    private void btlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlimparActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btlimparActionPerformed

    private void btapagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btapagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btapagarActionPerformed

    private void tfpesquisaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfpesquisaKeyTyped
        int codigosolicitacao = evt.getKeyChar();
        if (!(codigosolicitacao >= 48 && codigosolicitacao <= 57)) {
            evt.consume();
        }

    }//GEN-LAST:event_tfpesquisaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btapagar;
    private javax.swing.JButton btlimpar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbcodigosolicitacao;
    private javax.swing.JTable tbTable;
    private javax.swing.JTextField tfpesquisa;
    // End of variables declaration//GEN-END:variables
}
