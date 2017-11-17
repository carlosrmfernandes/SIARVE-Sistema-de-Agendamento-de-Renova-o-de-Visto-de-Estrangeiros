/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import control.AcaochecarEstrang;
import control.DadosControleDb;
import exception.Excesao;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.ModelCadastroEstrangeiro;
import modelo.ModelChecarEstrang;

/**
 *
 * @author CarlosFernandes
 */
public class ChecarEstrang extends javax.swing.JInternalFrame {

    /**
     * Creates new form ChecarEstrang
     */
    private AcaochecarEstrang l = new AcaochecarEstrang(this);

    public ChecarEstrang() {
        initComponents();
        DadosControleDb k = new DadosControleDb();
        final Vector<ModelCadastroEstrangeiro> vector = k.getAllVector();
        jtbDados.setModel(new DefaultTableModel() {
            @Override
            public Object getValueAt(int row, int column) {
                ModelCadastroEstrangeiro item = vector.get(row);
                if (column == 0) {
                  
                    return item.getNome();
                } else if (column == 1) {
                    
                    return item.getNumPassaporte();
                } else if (column == 2) {
                  
                    return item.getNumCelular();
                } else if (column == 3) {
                    return item.getEndereco();
                }

                return null;
            }

            @Override
            public int getColumnCount() {
                return 4;//TODO: Ajustar de acordo com o número de colunas
            }

            @Override
            public int getRowCount() {
                return vector.size();
            }

            @Override
            public Vector getDataVector() {
                return vector;
            }
        });
        
    }

    public ModelChecarEstrang getModelChecarestrang() throws Excesao {
        if ("".equals(jtfnumpassap.getText())) {
            throw new Excesao("Deve preencher o Numero do Passaporte");

        }

        ModelChecarEstrang modelchecarestrang = new ModelChecarEstrang();
        modelchecarestrang.setNumpassap(jtfnumpassap.getText());
        return modelchecarestrang;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jlbnumpassap = new javax.swing.JLabel();
        jtfnumpassap = new javax.swing.JTextField();
        jbtApagar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbDados = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);

        jlbnumpassap.setText("Num' Passaporte");

        jbtApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/apagar.png"))); // NOI18N
        jbtApagar.setText("Apagar");
        jbtApagar.addActionListener(l);
        jbtApagar.setActionCommand("apagar");
        jbtApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtApagarActionPerformed(evt);
            }
        });

        jtbDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Passaporte", "Celular", "Endereço"
            }
        ));
        jScrollPane2.setViewportView(jtbDados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlbnumpassap)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfnumpassap)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlbnumpassap)
                        .addComponent(jtfnumpassap, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                    .addComponent(jbtApagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtApagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtApagarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtApagar;
    private javax.swing.JLabel jlbnumpassap;
    private javax.swing.JTable jtbDados;
    private javax.swing.JTextField jtfnumpassap;
    // End of variables declaration//GEN-END:variables
}
