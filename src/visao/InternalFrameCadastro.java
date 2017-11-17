/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import control.AcaoInternalFrameCadastro;
import exception.Excesao;
import java.awt.event.KeyEvent;
import modelo.ModelInternalFrameCadastro;

/**
 *
 * @author CarlosFernandes
 */
public class InternalFrameCadastro extends javax.swing.JInternalFrame {

    /**
     * Creates new form InternalFrameCadastro
     */
    private AcaoInternalFrameCadastro l = new AcaoInternalFrameCadastro(this);

    public ModelInternalFrameCadastro getModelInternalFrameCadastro() throws Excesao {

        if ("".equals(jtfcodigosolicitacao.getText()) || jtfcodigosolicitacao.getText().length() > 10) {
            throw new Excesao("Verifica se o campo  de codigo de solicitação não esta vazio "
                    + "\nou se codigo de solicitação foi digitado corretamente ");

        }
        if ("".equals(jTextAreaDescricao.getText())) {
            throw new Excesao("Deve preencher a Descrição");

        }
        if (jDate.getDate() == null) {
            throw new Excesao("Deve preencher a Data de Agendamento");

        }

        if ("".equals(jtfemail.getText())) {
            throw new Excesao("Deve preencher o email");

        }

        if (jtfcelular.getText().equals("(  )         ")) {
            throw new Excesao("Deve preencher a o celular");
        }
         if ("".equals(jtfnumpassaporte.getText())) {
            throw new Excesao("Deve preencher o Numero do Passaporte");
        }


        ModelInternalFrameCadastro modelcadastro = new ModelInternalFrameCadastro();
        modelcadastro.setData(jDate.getDate());
        modelcadastro.setDescricao(jTextAreaDescricao.getText());
        modelcadastro.setCodigosolicitacao(Integer.parseInt(jtfcodigosolicitacao.getText()));

        modelcadastro.setHorario((String) jComboBoxHorario.getSelectedItem());
        modelcadastro.setTipo((String) jcbtipo.getSelectedItem());
        modelcadastro.setSexo((String) jcbsexo.getSelectedItem());
        modelcadastro.setEmail(jtfemail.getText());
        modelcadastro.setCelular(jtfcelular.getText());
        modelcadastro.setNumpassaporte(jtfnumpassaporte.getText());
        return modelcadastro;
    }

    public void limpar() {
        jtfcodigosolicitacao.setText("");
        jTextAreaDescricao.setText("");
        jDate.setDate(null);
        jtfemail.setText("");
        jtfcelular.setText("");
        jtfnumpassaporte.setText("");

    }

    public InternalFrameCadastro() {
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

        jLabel2 = new javax.swing.JLabel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jlbcodigosolicitacao = new javax.swing.JLabel();
        jtfcodigosolicitacao = new javax.swing.JTextField();
        jlbdescricao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescricao = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jDate = new com.toedter.calendar.JDateChooser();
        jlbhorario = new javax.swing.JLabel();
        jComboBoxHorario = new javax.swing.JComboBox<>();
        jbtnovo = new javax.swing.JButton();
        jbtsalvar = new javax.swing.JButton();
        jbtlimpar = new javax.swing.JButton();
        jlbtipo = new javax.swing.JLabel();
        jcbtipo = new javax.swing.JComboBox<>();
        jlbsexo = new javax.swing.JLabel();
        jcbsexo = new javax.swing.JComboBox<>();
        jlbemail = new javax.swing.JLabel();
        jtfemail = new javax.swing.JTextField();
        jlbcelular = new javax.swing.JLabel();
        jtfcelular = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter formataIntervalo = new javax.swing.text.MaskFormatter("(##)#########");
            jtfcelular = new javax.swing.JFormattedTextField(formataIntervalo);
        }catch(Exception e){

        }

        numpassaporte = new javax.swing.JLabel();
        jtfnumpassaporte = new javax.swing.JTextField();

        jLabel2.setText("jLabel2");

        setClosable(true);
        setTitle("SIARVE - Agendamento");

        jlbcodigosolicitacao.setText("Codigo de Solicitação ");

        jtfcodigosolicitacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfcodigosolicitacaoActionPerformed(evt);
            }
        });
        jtfcodigosolicitacao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfcodigosolicitacaoKeyTyped(evt);
            }
        });

        jlbdescricao.setText("Descrição da Solicitação");

        jTextAreaDescricao.setColumns(20);
        jTextAreaDescricao.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescricao);

        jLabel1.setText("Data Agendamento");

        jlbhorario.setText("Horário");

        jComboBoxHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8:00", "8:30", "9:15", "9:45","10:30", "14:00", "14:45", "15:25", "16:00"}));
        jComboBoxHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxHorarioActionPerformed(evt);
            }
        });

        jbtnovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/novo.png"))); // NOI18N
        jbtnovo.setText("Novo");
        jbtnovo.addActionListener(l);
        jbtnovo.setActionCommand("novo");
        jbtnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnovoActionPerformed(evt);
            }
        });

        jbtsalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/save.png"))); // NOI18N
        jbtsalvar.setText("Salvar");
        jbtsalvar.addActionListener(l);
        jbtsalvar.setActionCommand("salvar");
        jbtsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtsalvarActionPerformed(evt);
            }
        });

        jbtlimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/apagar.png"))); // NOI18N
        jbtlimpar.setText("Limpar");
        jbtlimpar.addActionListener(l);
        jbtlimpar.setActionCommand("limpar");
        jbtlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtlimparActionPerformed(evt);
            }
        });

        jlbtipo.setText("Tipo de Fução");

        jcbtipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estudante", "Trabalhador" }));

        jlbsexo.setText("Sexo");

        jcbsexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

        jlbemail.setText("Email");

        jlbcelular.setText("Celular");

        numpassaporte.setText("N'Passaporte");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtlimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbtipo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(235, 235, 235)
                        .addComponent(jlbhorario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxHorario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbsexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbcodigosolicitacao)
                            .addComponent(jlbdescricao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jcbtipo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jtfcodigosolicitacao, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(numpassaporte, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfnumpassaporte, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbemail, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbcelular))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(292, 292, 292)
                                .addComponent(jlbsexo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfcelular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                                    .addComponent(jtfemail, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfcodigosolicitacao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbcodigosolicitacao)
                    .addComponent(numpassaporte)
                    .addComponent(jtfnumpassaporte, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxHorario, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                        .addComponent(jlbhorario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbtipo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbsexo)
                    .addComponent(jcbsexo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbtipo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfemail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbemail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfcelular, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jlbcelular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbtlimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfcodigosolicitacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfcodigosolicitacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfcodigosolicitacaoActionPerformed

    private void jbtlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtlimparActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtlimparActionPerformed

    private void jbtsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtsalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtsalvarActionPerformed

    private void jbtnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnovoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnovoActionPerformed

    private void jComboBoxHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxHorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxHorarioActionPerformed

    private void jtfcodigosolicitacaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfcodigosolicitacaoKeyTyped
        // TODO add your handling code here:
        char codigosolicitacao = evt.getKeyChar();

        if (!(Character.isDigit(codigosolicitacao))
                || (codigosolicitacao == KeyEvent.VK_BACK_SPACE)
                || (codigosolicitacao == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jtfcodigosolicitacaoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JComboBox<String> jComboBoxHorario;
    private com.toedter.calendar.JDateChooser jDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescricao;
    private javax.swing.JButton jbtlimpar;
    private javax.swing.JButton jbtnovo;
    private javax.swing.JButton jbtsalvar;
    private javax.swing.JComboBox<String> jcbsexo;
    private javax.swing.JComboBox<String> jcbtipo;
    private javax.swing.JLabel jlbcelular;
    private javax.swing.JLabel jlbcodigosolicitacao;
    private javax.swing.JLabel jlbdescricao;
    private javax.swing.JLabel jlbemail;
    private javax.swing.JLabel jlbhorario;
    private javax.swing.JLabel jlbsexo;
    private javax.swing.JLabel jlbtipo;
    private javax.swing.JTextField jtfcelular;
    private javax.swing.JTextField jtfcodigosolicitacao;
    private javax.swing.JTextField jtfemail;
    private javax.swing.JTextField jtfnumpassaporte;
    private javax.swing.JLabel numpassaporte;
    // End of variables declaration//GEN-END:variables

}
