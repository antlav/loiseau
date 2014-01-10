/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loiseau.ihm;

import classeStockage.ArticleLoiseauCommande;
import java.awt.Component;
import loiseau.stockage.Article_fabrication;

/**
 *
 * @author guillaume
 */
public class JDialogGarage extends javax.swing.JDialog {

    /**
     * Creates new form JDialogGarage
     */
    public JDialogGarage(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    static ArticleLoiseauCommande art;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtHauteur = new javax.swing.JTextField();
        txtLargeur = new javax.swing.JTextField();
        txtQt = new javax.swing.JTextField();
        btnAjout = new javax.swing.JButton();
        cbbNom = new javax.swing.JComboBox();
        ckbMoteur = new javax.swing.JCheckBox();
        ckbBarre = new javax.swing.JCheckBox();
        txtMoteur = new javax.swing.JTextField();
        txtBarre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ckbSystemIO = new javax.swing.JCheckBox();
        ckbJeuDeCellule = new javax.swing.JCheckBox();
        txtxSystemCommandeI0 = new javax.swing.JTextField();
        txtJeuDeCellule = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txtHauteur.setText("1500");

        txtLargeur.setText("1500");

        txtQt.setText("1");

        btnAjout.setText("Ajouter");
        btnAjout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAjoutMouseClicked(evt);
            }
        });

        cbbNom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Volet roulant de garage en renovation coffre a pan coupe", "Porte de garage a enroulement anti tempéte" }));
        cbbNom.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbNomItemStateChanged(evt);
            }
        });

        ckbMoteur.setText("Moteur + commande de secour");
        ckbMoteur.setEnabled(false);

        ckbBarre.setText("Barre palpeuse");
        ckbBarre.setEnabled(false);

        txtMoteur.setBackground(new java.awt.Color(204, 204, 204));
        txtMoteur.setText("779");

        txtBarre.setBackground(new java.awt.Color(204, 204, 204));
        txtBarre.setText("600");

        jLabel1.setText("Largeur en mm");

        jLabel2.setText("Hauteur en mm");

        jLabel3.setText("Quantité");

        ckbSystemIO.setText("moin value systéme de commande IO");

        ckbJeuDeCellule.setText("Moin value jeu de cellule");

        txtxSystemCommandeI0.setBackground(new java.awt.Color(204, 204, 204));
        txtxSystemCommandeI0.setText("165");

        txtJeuDeCellule.setBackground(new java.awt.Color(204, 204, 204));
        txtJeuDeCellule.setText("61");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbbNom, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtQt)
                                    .addComponent(txtLargeur)
                                    .addComponent(txtHauteur, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ckbMoteur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ckbBarre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ckbJeuDeCellule)
                                            .addComponent(ckbSystemIO))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtBarre, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                    .addComponent(txtMoteur))
                                .addComponent(txtxSystemCommandeI0, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtJeuDeCellule, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAjout)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(cbbNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLargeur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(ckbBarre)
                    .addComponent(txtBarre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHauteur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(ckbMoteur)
                    .addComponent(txtMoteur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(ckbSystemIO)
                    .addComponent(txtxSystemCommandeI0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckbJeuDeCellule)
                    .addComponent(txtJeuDeCellule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(btnAjout)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAjoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAjoutMouseClicked
        // TODO add your handling code here:
        art = new ArticleLoiseauCommande();
        String nom;
        if (cbbNom.getSelectedItem().toString().compareTo("Porte de garage a enroulement anti tempéte") == 0) {
            nom = "Porte de garage anti tempéte";
        } else {
            nom = "Volet roulant de garage en renovation";
        }
        double prix = 0;
        if (ckbBarre.isSelected()) {
            prix += Double.parseDouble(txtBarre.getText());
            nom = nom.concat(" + barre palpeuse");
        }
        if (ckbMoteur.isSelected()) {
            prix += Double.parseDouble(txtMoteur.getText());
            nom = nom.concat(" + moteur & cmd de secours");
        }
        if (ckbJeuDeCellule.isSelected()) {
            prix += Double.parseDouble(txtJeuDeCellule.getText());
            nom = nom.concat(" - systéme radio ");
        }
        if (ckbSystemIO.isSelected()) {
            prix += Double.parseDouble(txtxSystemCommandeI0.getText());
            nom = nom.concat(" - jeu de cellule");
        }
        art.setPrix(prix);
        art.setNom(nom);
        art.setHauteur(Double.parseDouble(txtHauteur.getText()));
        art.setLargeur(Double.parseDouble(txtLargeur.getText()));
        art.setQt(Integer.parseInt(txtQt.getText()));
        art.setTablier(0);
        art.setVolet(0);
        art.setAxe(0);
        art.setCouleurCoffre(1);
        art.setCouleurCoulisse(1);
        art.setCoteManoeuvre(1);
        art.setUneCoulisse(1);
        art.setTypeManoeuvre(1);
        art.setCouleurTablier(1);
        art.setUneLame(1);
        art.setTypPose(1);
        dispose();
    }//GEN-LAST:event_btnAjoutMouseClicked

    private void cbbNomItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbNomItemStateChanged
        // TODO add your handling code here:
        if (cbbNom.getSelectedItem().toString().compareTo("Porte de garage a enroulement anti tempéte") == 0) {
            ckbMoteur.setEnabled(true);
            ckbJeuDeCellule.setEnabled(false);
            ckbSystemIO.setEnabled(false);
            ckbSystemIO.setSelected(false);
            ckbJeuDeCellule.setSelected(false);
        } else {
            ckbMoteur.setEnabled(false);
            ckbMoteur.setSelected(false);
            ckbJeuDeCellule.setEnabled(true);
            ckbSystemIO.setEnabled(true);
        }
    }//GEN-LAST:event_cbbNomItemStateChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        ckbBarre.setEnabled(true);
        ckbMoteur.setEnabled(false);
        ckbJeuDeCellule.setEnabled(true);
        ckbSystemIO.setEnabled(true);


    }//GEN-LAST:event_formWindowOpened

    public static Article_fabrication openForm(Component cpt) {
        art = null;
        JDialogGarage porte = new JDialogGarage(null, true);
        porte.setLocationRelativeTo(cpt);
        porte.setVisible(true);
        return art;
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
            java.util.logging.Logger.getLogger(JDialogGarage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogGarage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogGarage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogGarage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogGarage dialog = new JDialogGarage(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjout;
    private javax.swing.JComboBox cbbNom;
    private javax.swing.JCheckBox ckbBarre;
    private javax.swing.JCheckBox ckbJeuDeCellule;
    private javax.swing.JCheckBox ckbMoteur;
    private javax.swing.JCheckBox ckbSystemIO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtBarre;
    private javax.swing.JTextField txtHauteur;
    private javax.swing.JTextField txtJeuDeCellule;
    private javax.swing.JTextField txtLargeur;
    private javax.swing.JTextField txtMoteur;
    private javax.swing.JTextField txtQt;
    private javax.swing.JTextField txtxSystemCommandeI0;
    // End of variables declaration//GEN-END:variables
}
