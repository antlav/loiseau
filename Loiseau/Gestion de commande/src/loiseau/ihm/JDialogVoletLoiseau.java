/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loiseau.ihm;

import java.awt.Component;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import loiseau.metier.ArticleLoiseau;
import loiseau.stockage.Article_fabrication;
import loiseau.stockage.Couleur;
import loiseau.stockage.Coulisse;
import loiseau.stockage.Lame;
import loiseau.stockage.Type_article;
import loiseau.stockage.Type_manoeuvre;
import loiseau.stockage.Type_pose;

/**
 *
 * @author guillaume
 */
public class JDialogVoletLoiseau extends javax.swing.JDialog {

    /**
     * Creates new form JDialogVoletLoiseau
     */
    public JDialogVoletLoiseau(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public JDialogVoletLoiseau(java.awt.Frame parent, boolean modal, Vector<Type_article> v, Vector<Coulisse> c, Vector<Lame> l, Vector<Type_pose> p, Vector<Type_manoeuvre> m, Vector<Couleur> couleur) {
        super(parent, modal);
        initComponents();
        lesTypeVolet = v;
        lesLames = l;
        lesCoulisses = c;
        lesPose = p;
        lesManoeuvres = m;
        lesCouleur = couleur;
    }
    Vector<Type_manoeuvre> lesManoeuvres;
    Vector<Coulisse> lesCoulisses;
    Vector<Lame> lesLames;
    Vector<Type_article> lesTypeVolet;
    Vector<Type_pose> lesPose;
    Vector<Couleur> lesCouleur;
    static Article_fabrication art;
    DefaultComboBoxModel<Object> cbb;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdbGrp = new javax.swing.ButtonGroup();
        cbbTypeVolet = new javax.swing.JComboBox();
        cbbLame = new javax.swing.JComboBox();
        cbbTypePose = new javax.swing.JComboBox();
        txtHauteur = new javax.swing.JTextField();
        txtLargeur = new javax.swing.JTextField();
        txtQt = new javax.swing.JTextField();
        btnAjout = new javax.swing.JButton();
        rdbDroite = new javax.swing.JRadioButton();
        rdbGauche = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        cbbCouleurCoffre = new javax.swing.JComboBox();
        cbbManoeuvre = new javax.swing.JComboBox();
        cbbCouleurTablier = new javax.swing.JComboBox();
        cbbCouleurCoulisse = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        cbbTypeVolet.setEditor(null);
        cbbTypeVolet.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbTypeVoletItemStateChanged(evt);
            }
        });

        cbbLame.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbLameItemStateChanged(evt);
            }
        });

        txtHauteur.setText("1000");

        txtLargeur.setText("1000");

        txtQt.setText("1");

        btnAjout.setText("Ajouter");
        btnAjout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAjoutMouseClicked(evt);
            }
        });

        rdbDroite.setText("Droite");

        rdbGauche.setText("Gauche");

        jLabel1.setText("Côté de manoeuvre");

        jLabel2.setText("Type");

        jLabel3.setText("Lame");

        jLabel4.setText("Type de pose");

        jLabel5.setText("Largeur en mm");

        jLabel6.setText("Hauteur en mm");

        jLabel7.setText("Quantité");

        jLabel8.setText("Couleur caisson");

        jLabel9.setText("Couleur tablier");

        jLabel10.setText("Couleur coulisses");

        jLabel11.setText("Type de manoeuvre");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLargeur, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbbTypeVolet, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbbLame, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbbTypePose, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtHauteur)
                            .addComponent(txtQt)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdbDroite, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdbGauche, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbbCouleurCoulisse, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbbCouleurTablier, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbbCouleurCoffre, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbbManoeuvre, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(52, 52, 52)
                .addComponent(btnAjout, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbbTypeVolet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbbLame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbbTypePose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLargeur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHauteur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbDroite)
                    .addComponent(rdbGauche))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbCouleurCoffre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbCouleurTablier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbCouleurCoulisse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbManoeuvre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(0, 75, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAjout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        rdbGrp.add(rdbDroite);
        rdbGrp.add(rdbGauche);
        rdbDroite.setSelected(true);

        for (Type_article t : lesTypeVolet) {
            cbbTypeVolet.addItem(t.getNom_type());
        }
        for (Type_pose t : lesPose) {
            cbbTypePose.addItem(t.getNom_type_pose());
        }
        for (Lame l : lesLames) {
            cbbLame.addItem(l.getNom_lame());
        }
        for (Type_manoeuvre m : lesManoeuvres) {
            cbbManoeuvre.addItem(m.getNom_type_manoeuvre());
        }
        for (Couleur c : lesCouleur) {
            cbbCouleurCoffre.addItem(c.getNom_couleur());
            cbbCouleurTablier.addItem(c.getNom_couleur());
            cbbCouleurCoulisse.addItem(c.getNom_couleur());
        }

    }//GEN-LAST:event_formWindowOpened

    private void cbbTypeVoletItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbTypeVoletItemStateChanged
    }//GEN-LAST:event_cbbTypeVoletItemStateChanged

    private void cbbLameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbLameItemStateChanged
    }//GEN-LAST:event_cbbLameItemStateChanged

    private void btnAjoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAjoutMouseClicked
        // TODO add your handling code here:
        art = new Article_fabrication();
        art.setNom(cbbTypeVolet.getSelectedItem().toString());
        for (Lame l : lesLames) {
            if (l.getNom_lame().compareTo(cbbLame.getSelectedItem().toString()) == 0) {
                art.setType_lame(l.getId_lame());
            }
        }
        art.setLargeur(Double.parseDouble(txtLargeur.getText()));
        art.setHauteur(Double.parseDouble(txtHauteur.getText()));
        art.setQuantite(Integer.parseInt(txtQt.getText()));
        for (Type_pose p : lesPose) {
            if (p.getNom_type_pose().compareTo(cbbTypePose.getSelectedItem().toString()) == 0) {
                art.setType_pose(p.getId_type_pose());
            }
        }
        for (Couleur c : lesCouleur) {
            if (c.getNom_couleur().compareTo(cbbCouleurCoffre.getSelectedItem().toString()) == 0) {
                art.setCouleur_coffre(c.getId_couleur());
            }
            if (c.getNom_couleur().compareTo(cbbCouleurTablier.getSelectedItem().toString()) == 0) {
                art.setCouleur_tablier(c.getId_couleur());
            }
            if (c.getNom_couleur().compareTo(cbbCouleurCoulisse.getSelectedItem().toString()) == 0) {
                art.setCouleur_coulisse(c.getId_couleur());
            }
        }
        for (Type_manoeuvre m : lesManoeuvres) {
            if(m.getNom_type_manoeuvre().compareTo(cbbManoeuvre.getSelectedItem().toString())==0){
                art.setType_manoeuvre(m.getId_type_manoeuvre());
            }
        }
        art.setType_article(0);
        if (rdbDroite.isSelected()) {
            art.setCote_manoeuvre("Droite");
        } else {
            art.setCote_manoeuvre("Gauche");
        }
        art=ArticleLoiseau.choixCoulisse(art, lesCoulisses, lesPose);
        dispose();
    }//GEN-LAST:event_btnAjoutMouseClicked
    public static Article_fabrication openForm(Component cpt, Vector<Type_article> v, Vector<Coulisse> c, Vector<Lame> l, Vector<Type_pose> p, Vector<Type_manoeuvre> m, Vector<Couleur> couleur) {
        art = null;
        JDialogVoletLoiseau volet = new JDialogVoletLoiseau(null, true, v, c, l, p, m, couleur);
        volet.setLocationRelativeTo(cpt);
        volet.setVisible(true);
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
            java.util.logging.Logger.getLogger(JDialogVoletLoiseau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogVoletLoiseau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogVoletLoiseau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogVoletLoiseau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogVoletLoiseau dialog = new JDialogVoletLoiseau(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox cbbCouleurCoffre;
    private javax.swing.JComboBox cbbCouleurCoulisse;
    private javax.swing.JComboBox cbbCouleurTablier;
    private javax.swing.JComboBox cbbLame;
    private javax.swing.JComboBox cbbManoeuvre;
    private javax.swing.JComboBox cbbTypePose;
    private javax.swing.JComboBox cbbTypeVolet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rdbDroite;
    private javax.swing.JRadioButton rdbGauche;
    private javax.swing.ButtonGroup rdbGrp;
    private javax.swing.JTextField txtHauteur;
    private javax.swing.JTextField txtLargeur;
    private javax.swing.JTextField txtQt;
    // End of variables declaration//GEN-END:variables
}