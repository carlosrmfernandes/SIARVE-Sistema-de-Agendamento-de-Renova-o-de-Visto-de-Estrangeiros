/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import control.AcaoCadastroEstrangeiro;
import exception.Excesao;
import modelo.ModelCadastroEstrangeiro;

/**
 *
 * @author CarlosFernandes
 */
public class CadastroEstrangeiro extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastroEstrangeiro
     */
    private AcaoCadastroEstrangeiro l = new AcaoCadastroEstrangeiro(this);

    public ModelCadastroEstrangeiro modelcdastroestrang() throws Excesao {

        if ("".equals(jtfemail.getText())) {
            throw new Excesao(" Deve preencher o email ");

        }
        if ("".equals(jtfEdereco.getText())) {
            throw new Excesao(" Deve preencher o endereço ");

        }
        if ("".equals(jtfNmcelular.getText())) {
            throw new Excesao(" Deve preencher o Numeru do celular ");

        }
        if ("".equals(jtfcpf.getText())) {
            throw new Excesao(" Deve preencher o CPF ");

        }
        if ("".equals(jtfNumPassaport.getText())) {
            throw new Excesao(" Deve preencher numero do passaporte ");

        }
        if (jdata.getDate() == null) {
            throw new Excesao(" Deve preencher a Data de cadastro ");

        }
        if ("".equals(jtflocalfuncao.getText())) {
            throw new Excesao(" Deve preencher o local da função ");

        }
        if ("".equals(jtfNomeCompleto.getText())) {
            throw new Excesao(" Deve preencher o nome completo ");

        }
        if ("".equals(jtfestado.getText())) {
            throw new Excesao(" Deve preencher o nome completo ");

        }
        ModelCadastroEstrangeiro modelcadastroest = new ModelCadastroEstrangeiro();

        modelcadastroest.setNome(jtfNomeCompleto.getText());
        modelcadastroest.setEndereco(jtfEdereco.getText());
        modelcadastroest.setNumCelular(jtfNmcelular.getText());
        modelcadastroest.setNumPassaporte(jtfNumPassaport.getText());
        modelcadastroest.setCpf(jtfcpf.getText());
        modelcadastroest.setData(jdata.getDate());
        modelcadastroest.setEmail(jtfemail.getText());
        modelcadastroest.setEstado(jtfestado.getText());
        modelcadastroest.setEstadocivil((String) jcbestadocivil.getSelectedItem());
        modelcadastroest.setFuncao((String) jcbfuncao.getSelectedItem());
        modelcadastroest.setLocalfuncao(jtflocalfuncao.getText());
        modelcadastroest.setSexo((String) jcbsexo.getSelectedItem());

        return modelcadastroest;
    }

    public void limpar() {

        jtfNomeCompleto.setText("");
        jtfEdereco.setText("");
        jtfNmcelular.setText("");
        jtfNumPassaport.setText("");
        jtfcpf.setText("");
        jdata.setDate(null);
        jtfemail.setText("");
        jtflocalfuncao.setText("");
        jtfestado.setText("");

    }

    public CadastroEstrangeiro() {
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

        JlbNomecompleto = new javax.swing.JLabel();
        jlbendereco = new javax.swing.JLabel();
        jlbnumeropassaport = new javax.swing.JLabel();
        jlbNumeroCelular = new javax.swing.JLabel();
        jtfNumPassaport = new javax.swing.JTextField();
        jtfNomeCompleto = new javax.swing.JTextField();
        jtfNmcelular = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter formataIntervalo = new javax.swing.text.MaskFormatter("(##)#########");
            jtfNmcelular = new javax.swing.JFormattedTextField(formataIntervalo);
        }catch(Exception e){

        }

        jtfEdereco = new javax.swing.JTextField();
        jbtSalvar = new javax.swing.JButton();
        jbtlimpar = new javax.swing.JButton();
        jlbfuncao = new javax.swing.JLabel();
        jcbfuncao = new javax.swing.JComboBox<>();
        jlbdata = new javax.swing.JLabel();
        jdata = new com.toedter.calendar.JDateChooser();
        jlblocalfuncao = new javax.swing.JLabel();
        jtflocalfuncao = new javax.swing.JTextField();
        jlbemail = new javax.swing.JLabel();
        jtfemail = new javax.swing.JTextField();
        jlbestadocivil = new javax.swing.JLabel();
        jcbestadocivil = new javax.swing.JComboBox<>();
        jlbcpf = new javax.swing.JLabel();
        jtfcpf = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter formataIntervalo = new javax.swing.text.MaskFormatter("###.###.###-##");
            jtfcpf = new javax.swing.JFormattedTextField(formataIntervalo);
        }catch(Exception e){

        }

        jlbestado = new javax.swing.JLabel();
        jtfestado = new javax.swing.JTextField();
        jlbsexo = new javax.swing.JLabel();
        jcbsexo = new javax.swing.JComboBox<>();

        setClosable(true);

        JlbNomecompleto.setText("Nome Completo");

        jlbendereco.setText("Endereço");

        jlbnumeropassaport.setText("Número Passaporte");

        jlbNumeroCelular.setText("N' Celular");

        jbtSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/save.png"))); // NOI18N
        jbtSalvar.addActionListener(l);
        jbtSalvar.setActionCommand("salvar");
        jbtSalvar.setText("Salvar");
        jbtSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSalvarActionPerformed(evt);
            }
        });

        jbtlimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/apagar.png"))); // NOI18N
        jbtlimpar.addActionListener(l);
        jbtlimpar.setActionCommand("limpar");
        jbtlimpar.setText("Limpar");
        jbtlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtlimparActionPerformed(evt);
            }
        });

        jlbfuncao.setText("Fução");

        jcbfuncao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estudante", "Trabalhador"}));

        jlbdata.setText("Data Cadastro");

        jlblocalfuncao.setText("Local da Função");

        jlbemail.setText("Email");

        jlbestadocivil.setText("Estado Civil");

        jcbestadocivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro", "Casada", "Divorcciado", "Viuvo" }));

        jlbcpf.setText("C P F");

        jlbestado.setText("Estado");

        jlbsexo.setText("Sexo");

        jcbsexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino"}));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbnumeropassaport)
                    .addComponent(JlbNomecompleto)
                    .addComponent(jlbemail, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbestadocivil, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbestado, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbsexo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jtfestado)
                    .addComponent(jtfcpf, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbestadocivil, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfemail, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfNomeCompleto, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfNumPassaport, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbsexo, 0, 261, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblocalfuncao)
                            .addComponent(jlbfuncao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcbfuncao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtlimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addGap(6, 6, 6))
                            .addComponent(jtflocalfuncao)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbdata)
                            .addComponent(jlbendereco)
                            .addComponent(jlbNumeroCelular))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfEdereco, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jdata, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfNmcelular))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNumPassaport, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbnumeropassaport)
                    .addComponent(jlbNumeroCelular)
                    .addComponent(jtfNmcelular, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JlbNomecompleto)
                    .addComponent(jlbendereco)
                    .addComponent(jtfEdereco, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlbemail, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfemail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlbdata))
                    .addComponent(jdata, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbestadocivil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jcbfuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlbfuncao)
                        .addComponent(jlbestadocivil)))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtflocalfuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblocalfuncao)
                    .addComponent(jlbcpf)
                    .addComponent(jtfcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfestado, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbestado, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbsexo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbsexo)))
                    .addComponent(jbtlimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtSalvarActionPerformed

    private void jbtlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtlimparActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtlimparActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JlbNomecompleto;
    private javax.swing.JButton jbtSalvar;
    private javax.swing.JButton jbtlimpar;
    private javax.swing.JComboBox<String> jcbestadocivil;
    private javax.swing.JComboBox<String> jcbfuncao;
    private javax.swing.JComboBox<String> jcbsexo;
    private com.toedter.calendar.JDateChooser jdata;
    private javax.swing.JLabel jlbNumeroCelular;
    private javax.swing.JLabel jlbcpf;
    private javax.swing.JLabel jlbdata;
    private javax.swing.JLabel jlbemail;
    private javax.swing.JLabel jlbendereco;
    private javax.swing.JLabel jlbestado;
    private javax.swing.JLabel jlbestadocivil;
    private javax.swing.JLabel jlbfuncao;
    private javax.swing.JLabel jlblocalfuncao;
    private javax.swing.JLabel jlbnumeropassaport;
    private javax.swing.JLabel jlbsexo;
    private javax.swing.JTextField jtfEdereco;
    private javax.swing.JTextField jtfNmcelular;
    private javax.swing.JTextField jtfNomeCompleto;
    private javax.swing.JTextField jtfNumPassaport;
    private javax.swing.JTextField jtfcpf;
    private javax.swing.JTextField jtfemail;
    private javax.swing.JTextField jtfestado;
    private javax.swing.JTextField jtflocalfuncao;
    // End of variables declaration//GEN-END:variables
}