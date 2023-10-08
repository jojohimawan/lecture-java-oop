/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import entity.Bisnis;
/**
 *
 * @author jordan
 */
public class FrontOffice extends javax.swing.JFrame {
    private Bisnis bisnis;
    private DefaultTableModel model;
    private String[] namaProds = {"Produk 1", "Barang 2", "Barang 3", "Barang 4", "Barang 5", "Barang 6", "Barang 7", "Barang 8", "Barang 9"};
    
    private int itemKeranjangCount;
    private int selectedMember;
    private double subtotal;
    private double ppn;
    private double nominalPpn;
    private double total;
    private boolean isFirstState = true;
    /**
     * Creates new form FrontOffice
     */
    public FrontOffice(Bisnis bisnis) {
        this.bisnis = bisnis; // need to have obj 1st before initialising components (need to set btn text)
        initComponents();
        this.model = (DefaultTableModel) tbKeranjang.getModel();
        
        this.itemKeranjangCount = 0;
        this.selectedMember = -1;
        this.subtotal = 0;
        this.ppn = 0.10;
        this.nominalPpn = 0;
        
        populateComboBox();
    }
    
    private void tambahKeranjang(int index) {
        /* CONCERN: struggle ketika menambah item keranjang yang sama, jadi sementara
                    qty dibikin statis */
        
        // cek apakah stok masih ada
        if(this.bisnis.getProduk(index).getStok() <= 0){
            JOptionPane.showMessageDialog(null, "Stok habis");
        } else {
            // kurangi stok sebanyak 1
            this.bisnis.getProduk(index).setStok(this.bisnis.getProduk(index).getStok() - 1);
            
            this.bisnis.tambahItemKeranjang(this.bisnis.getProduk(index), 1, this.bisnis.getProduk(index).getHarga());
            this.model.addRow(new Object[] {this.bisnis.getKeranjang().getItemKeranjang(this.itemKeranjangCount).getProduk().getNama(),
                this.bisnis.getKeranjang().getItemKeranjang(this.itemKeranjangCount).getQty(),
                this.bisnis.getKeranjang().getItemKeranjang(this.itemKeranjangCount).getSubtotal()
            });
            this.subtotal += this.bisnis.getKeranjang().getItemKeranjang(this.itemKeranjangCount).getSubtotal();
            this.itemKeranjangCount++;
            this.labelSubtotal.setText(Double.toString(this.subtotal));
        }
    }
    
    private void buatStruk() {
        int size = this.bisnis.getKeranjang().getItemKeranjangSize();
        String namaMember = "Tanpa Member\n";
        double potongan = 0;
        if(this.selectedMember >= 0) {
            namaMember = this.bisnis.getMember(this.selectedMember).getNama();
            potongan = this.bisnis.getMember(this.selectedMember).getPotongan();
        }
        
        this.taStruk.setText("\tKoma Point of Sales.\n"
                + "\t93 Zarifa Aliyeva.\n"
                + "\tBaku, Azerbaijan.\n\n"
                + "Member: " + namaMember + "\n"
                + "---------------------------------\n"
                + "Item\t\tQty\tSubtotal\n"
                );
        
        for(int i = 0; i < size; i++) {
            this.taStruk.setText(this.taStruk.getText()
            + this.bisnis.getKeranjang().getItemKeranjang(i).getProduk().getNama()
            + "\t" + this.bisnis.getKeranjang().getItemKeranjang(i).getQty()
            + "\t" + this.bisnis.getKeranjang().getItemKeranjang(i).getSubtotal() + "\n"
            );
        }
        
        this.taStruk.setText(this.taStruk.getText()
                + "---------------------------------\n"
                + "Subtotal:\t" + "Rp. " + this.bisnis.getTransaksi().getSubtotal() + "\n"
                + "PPn(" + this.bisnis.getTransaksi().getPpn() + ")\t" + "Rp. " + this.bisnis.getTransaksi().getNominalPpn() + "\n"
                + "Potongan Member: Rp. " + Double.toString(potongan) + "\n"
                + "Total:\t\t" + "Rp. " + this.bisnis.getTransaksi().getTotal() + "\n"
                + "Cash:\t\t" + "Rp. " + this.bisnis.getTransaksi().getCash() + "\n"
                + "Kembali:\t" + "Rp. " + this.bisnis.getTransaksi().getChange() + "\n"
                + "\n\tTERIMA KASIH >.<");
    }
    
    private void populateComboBox() {
        for (int i = 0; i < this.bisnis.getMemberTotal(); i++) {
            this.cbMember.addItem(this.bisnis.getMember(i).getNama());
        }
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
        tbKeranjang = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        taStruk = new javax.swing.JTextArea();
        btnProduk1 = new javax.swing.JButton();
        btnProduk2 = new javax.swing.JButton();
        btnProduk3 = new javax.swing.JButton();
        btnProduk4 = new javax.swing.JButton();
        btnProduk5 = new javax.swing.JButton();
        btnProduk6 = new javax.swing.JButton();
        btnProduk7 = new javax.swing.JButton();
        btnProduk8 = new javax.swing.JButton();
        btnProduk9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelSubtotal = new javax.swing.JLabel();
        tfCash = new javax.swing.JTextField();
        labelChange = new javax.swing.JLabel();
        btnHitungTotal = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelPpn = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        btnBayar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        cbMember = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbKeranjang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Qty", "Harga"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbKeranjang);

        taStruk.setColumns(20);
        taStruk.setRows(5);
        jScrollPane2.setViewportView(taStruk);

        btnProduk1.setText(this.bisnis.getProduk(0).getNama()
        );
        btnProduk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProduk1ActionPerformed(evt);
            }
        });

        btnProduk2.setText(this.bisnis.getProduk(1).getNama());
        btnProduk2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProduk2ActionPerformed(evt);
            }
        });

        btnProduk3.setText(this.bisnis.getProduk(2).getNama());
        btnProduk3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProduk3ActionPerformed(evt);
            }
        });

        btnProduk4.setText(this.bisnis.getProduk(3).getNama());
        btnProduk4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProduk4ActionPerformed(evt);
            }
        });

        btnProduk5.setText(this.bisnis.getProduk(4).getNama());
        btnProduk5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProduk5ActionPerformed(evt);
            }
        });

        btnProduk6.setText(this.bisnis.getProduk(5).getNama());
        btnProduk6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProduk6ActionPerformed(evt);
            }
        });

        btnProduk7.setText(this.bisnis.getProduk(6).getNama());
        btnProduk7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProduk7ActionPerformed(evt);
            }
        });

        btnProduk8.setText(this.bisnis.getProduk(7).getNama());
        btnProduk8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProduk8ActionPerformed(evt);
            }
        });

        btnProduk9.setText(this.bisnis.getProduk(8).getNama());
        btnProduk9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProduk9ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Plus Jakarta Sans SemiBold", 0, 24)); // NOI18N
        jLabel1.setText("Subtotal:");

        jLabel2.setFont(new java.awt.Font("Plus Jakarta Sans SemiBold", 0, 24)); // NOI18N
        jLabel2.setText("Cash:");

        jLabel3.setFont(new java.awt.Font("Plus Jakarta Sans SemiBold", 0, 24)); // NOI18N
        jLabel3.setText("Change:");

        labelSubtotal.setFont(new java.awt.Font("Plus Jakarta Sans SemiBold", 0, 24)); // NOI18N
        labelSubtotal.setText("0");

        tfCash.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N

        labelChange.setFont(new java.awt.Font("Plus Jakarta Sans SemiBold", 0, 24)); // NOI18N
        labelChange.setText("0");

        btnHitungTotal.setFont(new java.awt.Font("Plus Jakarta Sans SemiBold", 0, 24)); // NOI18N
        btnHitungTotal.setText("Hitung Total");
        btnHitungTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungTotalActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Plus Jakarta Sans SemiBold", 0, 24)); // NOI18N
        jLabel6.setText("KomaPOS Front Office");

        jLabel4.setFont(new java.awt.Font("Plus Jakarta Sans SemiBold", 0, 24)); // NOI18N
        jLabel4.setText("PPN:");

        labelPpn.setFont(new java.awt.Font("Plus Jakarta Sans SemiBold", 0, 24)); // NOI18N
        labelPpn.setText("0");

        jLabel5.setFont(new java.awt.Font("Plus Jakarta Sans SemiBold", 0, 24)); // NOI18N
        jLabel5.setText("Total:");

        labelTotal.setFont(new java.awt.Font("Plus Jakarta Sans SemiBold", 0, 24)); // NOI18N
        labelTotal.setText("0");

        btnBayar.setFont(new java.awt.Font("Plus Jakarta Sans SemiBold", 0, 24)); // NOI18N
        btnBayar.setText("Bayar");
        btnBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBayarActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Plus Jakarta Sans", 0, 14)); // NOI18N
        jButton1.setText("Back Office");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cbMember.setFont(new java.awt.Font("Plus Jakarta Sans", 0, 14)); // NOI18N
        cbMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMemberActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Plus Jakarta Sans SemiBold", 0, 24)); // NOI18N
        jLabel7.setText("Member:");

        jButton2.setFont(new java.awt.Font("Plus Jakarta Sans", 0, 14)); // NOI18N
        jButton2.setText("Transaksi Baru");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnProduk1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnProduk2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnProduk3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnProduk4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnProduk5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnProduk6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnProduk7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnProduk8, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnProduk9, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addComponent(cbMember, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(labelSubtotal)))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnHitungTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelPpn)
                                    .addComponent(labelTotal)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelChange)
                                    .addComponent(tfCash, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 23, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnProduk1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnProduk2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnProduk3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnProduk4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnProduk5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnProduk6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(labelSubtotal))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(labelPpn))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(cbMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(16, 16, 16))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnProduk7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnProduk8, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnProduk9, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnHitungTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTotal)
                    .addComponent(jLabel5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(170, 170, 170)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfCash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(labelChange))
                        .addGap(18, 18, 18)
                        .addComponent(btnBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProduk7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProduk7ActionPerformed
        // TODO add your handling code here:
        tambahKeranjang(6);
    }//GEN-LAST:event_btnProduk7ActionPerformed

    private void btnProduk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProduk1ActionPerformed
        // TODO add your handling code here:
        tambahKeranjang(0);
        
    }//GEN-LAST:event_btnProduk1ActionPerformed

    private void btnProduk2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProduk2ActionPerformed
        // TODO add your handling code here:
        tambahKeranjang(1);
    }//GEN-LAST:event_btnProduk2ActionPerformed

    private void btnProduk3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProduk3ActionPerformed
        // TODO add your handling code here:
        tambahKeranjang(2);
    }//GEN-LAST:event_btnProduk3ActionPerformed

    private void btnProduk4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProduk4ActionPerformed
        // TODO add your handling code here:
        tambahKeranjang(3);
    }//GEN-LAST:event_btnProduk4ActionPerformed

    private void btnProduk5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProduk5ActionPerformed
        // TODO add your handling code here:
        tambahKeranjang(4);
    }//GEN-LAST:event_btnProduk5ActionPerformed

    private void btnProduk6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProduk6ActionPerformed
        // TODO add your handling code here:
        tambahKeranjang(5);
    }//GEN-LAST:event_btnProduk6ActionPerformed

    private void btnProduk8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProduk8ActionPerformed
        // TODO add your handling code here:
        tambahKeranjang(7);
    }//GEN-LAST:event_btnProduk8ActionPerformed

    private void btnProduk9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProduk9ActionPerformed
        // TODO add your handling code here:
        tambahKeranjang(8);
    }//GEN-LAST:event_btnProduk9ActionPerformed

    private void btnHitungTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungTotalActionPerformed
        // TODO add your handling code here:
        this.nominalPpn = (this.ppn * this.subtotal); 
        this.labelPpn.setText(Double.toString(this.nominalPpn));
        
        if(this.selectedMember >= 0) {
            this.total = (this.subtotal + this.nominalPpn) - this.bisnis.getMember(this.selectedMember).getPotongan();
        } else {
            this.total = this.subtotal + this.nominalPpn;
        }
        
        this.labelTotal.setText(Double.toString(this.total));
    }//GEN-LAST:event_btnHitungTotalActionPerformed

    private void btnBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBayarActionPerformed
        // TODO add your handling code here:
        double cash = Double.parseDouble(this.tfCash.getText());
        double change = cash - this.total;
        
        if(cash < total) {
            JOptionPane.showMessageDialog(null, "uang kurang wkwk");
            return;
        }
        
        this.bisnis.buatTransaksi(this.subtotal, this.nominalPpn, this.total, cash, change, this.ppn);
        if(this.selectedMember >= 0) {
            this.bisnis.getTransaksi().setMember(this.bisnis.getMember(this.selectedMember));
        }
        this.labelChange.setText(Double.toString(change));
        
        buatStruk();
    }//GEN-LAST:event_btnBayarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new BackOffice(this.bisnis).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMemberActionPerformed
        // TODO add your handling code here:
        if (isFirstState) {
            isFirstState = false;
            return;
        }
        this.selectedMember = this.cbMember.getSelectedIndex();
    }//GEN-LAST:event_cbMemberActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new FrontOffice(this.bisnis).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrontOffice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrontOffice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrontOffice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrontOffice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BackOffice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBayar;
    private javax.swing.JButton btnHitungTotal;
    private javax.swing.JButton btnProduk1;
    private javax.swing.JButton btnProduk2;
    private javax.swing.JButton btnProduk3;
    private javax.swing.JButton btnProduk4;
    private javax.swing.JButton btnProduk5;
    private javax.swing.JButton btnProduk6;
    private javax.swing.JButton btnProduk7;
    private javax.swing.JButton btnProduk8;
    private javax.swing.JButton btnProduk9;
    private javax.swing.JComboBox<String> cbMember;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelChange;
    private javax.swing.JLabel labelPpn;
    private javax.swing.JLabel labelSubtotal;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JTextArea taStruk;
    private javax.swing.JTable tbKeranjang;
    private javax.swing.JTextField tfCash;
    // End of variables declaration//GEN-END:variables
}
