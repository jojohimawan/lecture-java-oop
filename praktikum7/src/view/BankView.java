/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import javax.swing.JOptionPane;
import perbankan.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author jordan
 */
public class BankView extends javax.swing.JFrame {
    
    private Bank bank;
    private final DefaultTableModel tableModel;
    private int totalData;

    /**
     * Creates new form NasabahView
     */
    public BankView() {   
        initComponents();
        bank = new Bank();
        tableModel = (DefaultTableModel)tableNasabah.getModel();
        tableModel.setRowCount(0);
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
        jButton1 = new javax.swing.JButton();
        labTitle = new javax.swing.JLabel();
        labNamaAwal = new javax.swing.JLabel();
        labNamaAkhir = new javax.swing.JLabel();
        formNamaAwal = new javax.swing.JTextField();
        formNamaAkhir = new javax.swing.JTextField();
        btnTambahNasabah = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableNasabah = new javax.swing.JTable();
        formSaldo = new javax.swing.JTextField();
        labSaldo = new javax.swing.JLabel();
        btnHapus = new javax.swing.JButton();

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

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        labTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labTitle.setText("Nasabah View");

        labNamaAwal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labNamaAwal.setText("Nama Awal");

        labNamaAkhir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labNamaAkhir.setText("Nama Akhir");

        formNamaAwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formNamaAwalActionPerformed(evt);
            }
        });

        btnTambahNasabah.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTambahNasabah.setText("Tambah Nasabah");
        btnTambahNasabah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahNasabahActionPerformed(evt);
            }
        });

        tableNasabah.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama Awal", "Nama Akhir", "Saldo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableNasabah);

        labSaldo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labSaldo.setText("Saldo");

        btnHapus.setText("Hapus Data");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labTitle)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnTambahNasabah)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labNamaAwal)
                                        .addGap(48, 48, 48))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(labSaldo, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labNamaAkhir, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(formNamaAkhir)
                                    .addComponent(formNamaAwal)
                                    .addComponent(formSaldo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHapus)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labNamaAwal)
                    .addComponent(formNamaAwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formNamaAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labNamaAkhir))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(formSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambahNasabah)
                    .addComponent(btnHapus))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formNamaAwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formNamaAwalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formNamaAwalActionPerformed

    private void btnTambahNasabahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahNasabahActionPerformed
        // TODO : create new object and assign attributes
        if(!formNamaAwal.getText().isBlank() && !formNamaAkhir.getText().isBlank()) {
            bank.tambahNasabah(formNamaAwal.getText(), formNamaAkhir.getText());
            
            if(formSaldo.getText().isBlank()) {
               bank.getNasabah(totalData).setTabungan(new Tabungan(0));
            } else {
                bank.getNasabah(totalData).setTabungan(new Tabungan(Integer.parseInt(formSaldo.getText())));
            }
        } else {
            System.out.println("Masukkan data");
        }
        
        bank.getNasabah(totalData).setTabungan(new Tabungan(Integer.parseInt(formSaldo.getText())));
        formNamaAwal.setText("");
        formNamaAkhir.setText("");
        formSaldo.setText("");
        
        
        // TODO : populate table with object attributes
        tableModel.addRow(new Object[]{bank.getNasabah(totalData).getNamaAwal(), 
            bank.getNasabah(totalData).getNamaAkhir(), 
            bank.getNasabah(totalData).getTabungan().getSaldo()});
        totalData++;
    }//GEN-LAST:event_btnTambahNasabahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        try {
            int rowIndex = tableNasabah.getSelectedRow();
            tableModel.removeRow(rowIndex);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BankView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BankView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BankView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambahNasabah;
    private javax.swing.JTextField formNamaAkhir;
    private javax.swing.JTextField formNamaAwal;
    private javax.swing.JTextField formSaldo;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labNamaAkhir;
    private javax.swing.JLabel labNamaAwal;
    private javax.swing.JLabel labSaldo;
    private javax.swing.JLabel labTitle;
    private javax.swing.JTable tableNasabah;
    // End of variables declaration//GEN-END:variables
}
