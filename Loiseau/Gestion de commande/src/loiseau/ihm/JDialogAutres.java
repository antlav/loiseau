/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loiseau.ihm;

import java.awt.Component;
import loiseau.stockage.Article_fabrication;

/**
 *
 * @author guillaume
 */
public class JDialogAutres extends javax.swing.JDialog {

    /**
     * Creates new form JDialogAutres
     */
    public JDialogAutres(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    static Article_fabrication unAutre;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtRef = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPrix = new javax.swing.JTextField();
        btnAjout = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtQuantite = new javax.swing.JTextField();
        txtLargeur = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtHauteur = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nom / Description");

        jLabel2.setText("Référence");

        txtRef.setText("ref");

        jLabel3.setText("Prix");

        txtPrix.setText("0");
        txtPrix.setToolTipText("");

        btnAjout.setText("Ajouter");
        btnAjout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAjoutMouseClicked(evt);
            }
        });

        jLabel4.setText("quantité");

        txtQuantite.setText("1");

        txtLargeur.setText("0");

        jLabel6.setText("Largeur");

        txtHauteur.setText("0");

        jLabel7.setText("Hauteur");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtLargeur, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                        .addComponent(txtRef)
                        .addComponent(txtQuantite)
                        .addComponent(txtHauteur, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtPrix, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAjout))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtHauteur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLargeur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(15, 15, 15)
                .addComponent(btnAjout))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAjoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAjoutMouseClicked
        // TODO add your handling code here:
        unAutre = new Article_fabrication();
        unAutre.setNom(txtNom.getText());
        unAutre.setRef_article(txtRef.getText());
        unAutre.setPrix(Integer.parseInt(txtPrix.getText()));
        unAutre.setQuantite(Integer.parseInt(txtQuantite.getText()));
        unAutre.setHauteur(Double.parseDouble(txtHauteur.getText()));
        unAutre.setLargeur(Double.parseDouble(txtLargeur.getText()));
        unAutre.setType_article(1);
        unAutre.setPuissance_moteur(0);
        unAutre.setCouleur_coffre(1);
        unAutre.setCouleur_coulisse(1);
        unAutre.setCote_manoeuvre("0");
        unAutre.setType_coulisse(1);
        unAutre.setType_manoeuvre(1);
        unAutre.setCouleur_tablier(1);
        unAutre.setType_lame(1);
        unAutre.setTelecommande(1);
        unAutre.setHors_cote(0);
        unAutre.setType_pose(1);
        unAutre.setType_moteur("0");
        dispose();
    }//GEN-LAST:event_btnAjoutMouseClicked
    public static Article_fabrication openForm(Component cpt) {
        unAutre = null;
        JDialogAutres diagAutre = new JDialogAutres(null, true);
        diagAutre.setLocationRelativeTo(cpt);
        diagAutre.setVisible(true);
        return unAutre;
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
            java.util.logging.Logger.getLogger(JDialogAutres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogAutres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogAutres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogAutres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogAutres dialog = new JDialogAutres(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtHauteur;
    private javax.swing.JTextField txtLargeur;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtPrix;
    private javax.swing.JTextField txtQuantite;
    private javax.swing.JTextField txtRef;
    // End of variables declaration//GEN-END:variables
}
