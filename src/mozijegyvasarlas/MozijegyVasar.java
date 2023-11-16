/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mozijegyvasarlas;

/**
 *
 * @author PalkovicsAlex(SZOFT_
 */
public class MozijegyVasar extends javax.swing.JFrame {

    /**
     * Creates new form MozijegyVasar
     */
    
    int film, tipus, db, alapOsszeg, vegOsszeg;
    
    public MozijegyVasar() {
        initComponents();
        alapOsszeg = 0;
        film = comFilm.getSelectedIndex();
        
        db = (int) spnDb.getValue();
        
        tipus = 0;
        
        osszegSzamolas();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgTipus = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblMozijegy = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        comFilm = new javax.swing.JComboBox<>();
        btnLefoglal = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        spnSor1 = new javax.swing.JSpinner();
        spnSzek1 = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        spnSor2 = new javax.swing.JSpinner();
        spnSzek2 = new javax.swing.JSpinner();
        spnSor3 = new javax.swing.JSpinner();
        spnSzek3 = new javax.swing.JSpinner();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        spnDb = new javax.swing.JSpinner();
        rbtHaromD = new javax.swing.JRadioButton();
        rbtNegyDx = new javax.swing.JRadioButton();
        rbtKettoD = new javax.swing.JRadioButton();
        chbVip = new javax.swing.JCheckBox();
        chbDiak = new javax.swing.JCheckBox();
        chbAfa = new javax.swing.JCheckBox();
        txtOsszes = new javax.swing.JTextField();
        lblOsszeg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mozijegy Vásárlás");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblMozijegy.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblMozijegy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMozijegy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/popcorn.png"))); // NOI18N
        lblMozijegy.setText("Mozijegy");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMozijegy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMozijegy)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Film:");

        comFilm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Válasszon filmet!", "Az alkotó", "Az apáca II.", "A védelmező 3.", "Cicaverzum", "Feláldozh4tók", "Fűrész X", "Gran Turismo" }));
        comFilm.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comFilmItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comFilm, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comFilm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnLefoglal.setText("Lefoglalás");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Hely"));

        spnSor1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 15, 1));
        spnSor1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        spnSor1.setRequestFocusEnabled(false);

        spnSzek1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        jLabel3.setText("Sor");

        jLabel4.setText("Szék");

        spnSor2.setModel(new javax.swing.SpinnerNumberModel(1, 1, 15, 1));
        spnSor2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        spnSor2.setEnabled(false);
        spnSor2.setRequestFocusEnabled(false);

        spnSzek2.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        spnSzek2.setEnabled(false);

        spnSor3.setModel(new javax.swing.SpinnerNumberModel(1, 1, 15, 1));
        spnSor3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        spnSor3.setEnabled(false);
        spnSor3.setRequestFocusEnabled(false);

        spnSzek3.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        spnSzek3.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(spnSor1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spnSzek1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spnSor2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnSor3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spnSzek2, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(spnSzek3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {spnSor1, spnSzek1});

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {spnSor2, spnSor3, spnSzek2});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnSor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnSzek1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnSor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnSzek2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnSor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnSzek3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Darab:");

        spnDb.setModel(new javax.swing.SpinnerNumberModel(1, 1, 3, 1));
        spnDb.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnDbStateChanged(evt);
            }
        });

        btgTipus.add(rbtHaromD);
        rbtHaromD.setText("3D");
        rbtHaromD.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtHaromDItemStateChanged(evt);
            }
        });

        btgTipus.add(rbtNegyDx);
        rbtNegyDx.setText("4DX");
        rbtNegyDx.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtNegyDxItemStateChanged(evt);
            }
        });

        btgTipus.add(rbtKettoD);
        rbtKettoD.setText("2D");
        rbtKettoD.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtKettoDItemStateChanged(evt);
            }
        });

        chbVip.setText("VIP");
        chbVip.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbVipItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtKettoD, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtHaromD, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtNegyDx, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbVip, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnDb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(spnDb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtHaromD)
                    .addComponent(rbtNegyDx)
                    .addComponent(rbtKettoD)
                    .addComponent(chbVip))
                .addContainerGap())
        );

        chbDiak.setText("A vásárló diák");

        chbAfa.setText("ÁFÁ-s számla");

        txtOsszes.setEditable(false);
        txtOsszes.setToolTipText("");

        lblOsszeg.setText("Összeg: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chbDiak)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chbAfa, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtOsszes)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblOsszeg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLefoglal))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {chbAfa, chbDiak});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbDiak)
                    .addComponent(chbAfa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtOsszes, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLefoglal)
                    .addComponent(lblOsszeg))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void spnDbStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnDbStateChanged
        db = (int) spnDb.getValue();
        osszegSzamolas();
    }//GEN-LAST:event_spnDbStateChanged

    private void rbtKettoDItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtKettoDItemStateChanged
        if(rbtKettoD.isSelected()){
            tipus = 0;
        }
        osszegSzamolas();
    }//GEN-LAST:event_rbtKettoDItemStateChanged

    private void rbtHaromDItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtHaromDItemStateChanged
        if(rbtHaromD.isSelected()) {
            tipus = 500;
        }
        osszegSzamolas();
    }//GEN-LAST:event_rbtHaromDItemStateChanged

    private void rbtNegyDxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtNegyDxItemStateChanged
        if(rbtNegyDx.isSelected()) {
            tipus = 1750;
        }
        osszegSzamolas();
    }//GEN-LAST:event_rbtNegyDxItemStateChanged

    private void chbVipItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbVipItemStateChanged
        if(chbVip.isSelected()) {
            tipus += 5500;
        } else {
             tipus -= 5500;
        }
    }//GEN-LAST:event_chbVipItemStateChanged

    private void comFilmItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comFilmItemStateChanged
        if(film == 0) {
            alapOsszeg = 0;
        } else {
            alapOsszeg = 2500;
        }
        film = comFilm.getSelectedIndex();
        osszegSzamolas();
    }//GEN-LAST:event_comFilmItemStateChanged
    
    private void osszegSzamolas(){
        vegOsszeg = alapOsszeg + tipus;
        vegOsszeg *= db;
        lblOsszeg.setText("Összeg: "+ vegOsszeg + " Ft");
    }
    
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
            java.util.logging.Logger.getLogger(MozijegyVasar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MozijegyVasar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MozijegyVasar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MozijegyVasar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MozijegyVasar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgTipus;
    private javax.swing.JButton btnLefoglal;
    private javax.swing.JCheckBox chbAfa;
    private javax.swing.JCheckBox chbDiak;
    private javax.swing.JCheckBox chbVip;
    private javax.swing.JComboBox<String> comFilm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblMozijegy;
    private javax.swing.JLabel lblOsszeg;
    private javax.swing.JRadioButton rbtHaromD;
    private javax.swing.JRadioButton rbtKettoD;
    private javax.swing.JRadioButton rbtNegyDx;
    private javax.swing.JSpinner spnDb;
    private javax.swing.JSpinner spnSor1;
    private javax.swing.JSpinner spnSor2;
    private javax.swing.JSpinner spnSor3;
    private javax.swing.JSpinner spnSzek1;
    private javax.swing.JSpinner spnSzek2;
    private javax.swing.JSpinner spnSzek3;
    private javax.swing.JTextField txtOsszes;
    // End of variables declaration//GEN-END:variables
}
