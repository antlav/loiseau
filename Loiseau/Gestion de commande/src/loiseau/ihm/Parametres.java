/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loiseau.ihm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;
import loiseau.metier.Param;

/**
 *
 * @author laveauantoine
 */
public class Parametres extends javax.swing.JFrame {

    /**
     * Creates new form Parametres
     */
    public Parametres() {
        initComponents();
        
        
        // on creer le noeud racine
        Element racine = null;
        //un objec jdom document
        Document document = null;
        // on creer une instance de saxbuilder
        SAXBuilder sxb = new SAXBuilder();

        //Recupération des valeurs de parametre et modification de celle-ci
        try {
            String path = System.getProperty("user.dir" );
            document = sxb.build(new File(path + "/src/files/param.xml"));
            racine = document.getRootElement();
            List lstParam = racine.getChildren("param");

            //Iterator pour parcourir la list
            Iterator ite = lstParam.iterator();

            String paramName;
            String paramPath;

            while(ite.hasNext()){
                Element curent = (Element) ite.next();
                //recupere values
                paramName = curent.getAttributeValue("name").toString();
                paramPath = curent.getAttributeValue("pathName").toString();
                //modifier values
                if(paramName.contains("bddPath"))
                    txtBddPath.setText(paramPath);
                if(paramName.contains("bddUser"))
                    txtIdBdd.setText(paramPath);
                if(paramName.contains("bddPass"))
                    txtMdpBdd.setText(paramPath);
                if(paramName.contains("factureModel"))
                    txtFacturePath.setText(paramPath);
                if(paramName.contains("devisModel"))
                    txtDevisPath.setText(paramPath);
                if(paramName.contains("mesureModel"))
                    txtMesurePath.setText(paramPath);
                if(paramName.contains("decoteModel"))
                    txtDecotePath.setText(paramPath);
                if(paramName.contains("folderCommandePath"))
                    txtFolderPath.setText(paramPath);

            }

        } catch (JDOMException ex) {
            Logger.getLogger(Parametres.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Parametres.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Bouton Parcourir facture
        jButtonParcourFolder4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                JFileChooser chooser = new JFileChooser();
                chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                int returnVal = chooser.showOpenDialog(null);
                if (returnVal == JFileChooser.APPROVE_OPTION){
                    System.out.println("Chemin choisi : " + chooser.getSelectedFile().getAbsolutePath());
                    txtFacturePath.setText(chooser.getSelectedFile().getAbsolutePath());
                }
            }
        });
        
        //Bouton Parcourir devis
        jButtonParcourFolder3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                JFileChooser chooser = new JFileChooser();
                chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                int returnVal = chooser.showOpenDialog(null);
                if (returnVal == JFileChooser.APPROVE_OPTION){
                    System.out.println("Chemin choisi : " + chooser.getSelectedFile().getAbsolutePath());
                    txtDevisPath.setText(chooser.getSelectedFile().getAbsolutePath());
                }
            }
        });
        
        //Bouton Parcourir mesure
        jButtonParcourFolder2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                JFileChooser chooser = new JFileChooser();
                chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                int returnVal = chooser.showOpenDialog(null);
                if (returnVal == JFileChooser.APPROVE_OPTION){
                    System.out.println("Chemin choisi : " + chooser.getSelectedFile().getAbsolutePath());
                    txtMesurePath.setText(chooser.getSelectedFile().getAbsolutePath());
                }
            }
        });
        
        //Bouton Parcourir decote
        jButtonParcourFolder1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                JFileChooser chooser = new JFileChooser();
                chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                int returnVal = chooser.showOpenDialog(null);
                if (returnVal == JFileChooser.APPROVE_OPTION){
                    System.out.println("Chemin choisi : " + chooser.getSelectedFile().getAbsolutePath());
                    txtDecotePath.setText(chooser.getSelectedFile().getAbsolutePath());
                }
            }
        });
        
        //Bouton Parcourir chemin dossier de commandes
        jButtonParcourFolder.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                JFileChooser chooser = new JFileChooser();
                chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                int returnVal = chooser.showOpenDialog(null);
                if (returnVal == JFileChooser.APPROVE_OPTION){
                    System.out.println("Chemin choisi : " + chooser.getSelectedFile().getAbsolutePath());
                    txtFolderPath.setText(chooser.getSelectedFile().getAbsolutePath());
                }
            }
        });
        
        
//      Param p = new Param();
//      String test = p.getParam("nameDuNoeudXML");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtBddPath = new javax.swing.JTextField();
        txtDecotePath = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonParcourFolder = new javax.swing.JButton();
        jButtonSaveParam = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtFolderPath = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtIdBdd = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMdpBdd = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButtonParcourFolder4 = new javax.swing.JButton();
        txtFacturePath = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButtonParcourFolder3 = new javax.swing.JButton();
        txtDevisPath = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButtonParcourFolder2 = new javax.swing.JButton();
        txtMesurePath = new javax.swing.JTextField();
        jButtonParcourFolder1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtDecotePath.setEnabled(false);

        jLabel1.setText("Chemin vers Base de données");

        jLabel2.setText("Chemin vers modèle décote");

        jButtonParcourFolder.setText("Parcourir");
        jButtonParcourFolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonParcourFolderActionPerformed(evt);
            }
        });

        jButtonSaveParam.setText("Enregister");
        jButtonSaveParam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveParamActionPerformed(evt);
            }
        });

        jLabel3.setText("Chemin vers les dossiers de commandes");

        txtFolderPath.setEnabled(false);

        jLabel4.setText("Identifiant Base de données");

        jLabel5.setText("Mot de passe base de données");

        jLabel6.setText("Chemin vers modèle facture");

        jButtonParcourFolder4.setText("Parcourir");
        jButtonParcourFolder4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonParcourFolder4ActionPerformed(evt);
            }
        });

        txtFacturePath.setEnabled(false);

        jLabel7.setText("Chemin vers modèle devis");

        jButtonParcourFolder3.setText("Parcourir");
        jButtonParcourFolder3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonParcourFolder3ActionPerformed(evt);
            }
        });

        txtDevisPath.setEnabled(false);

        jLabel8.setText("Chemin vers modèle fiche de mesure");

        jButtonParcourFolder2.setText("Parcourir");
        jButtonParcourFolder2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonParcourFolder2ActionPerformed(evt);
            }
        });

        txtMesurePath.setEnabled(false);

        jButtonParcourFolder1.setText("Parcourir");
        jButtonParcourFolder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonParcourFolder1ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                        .add(layout.createSequentialGroup()
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                .add(jLabel3)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, jLabel2))
                            .add(18, 18, 18)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(layout.createSequentialGroup()
                                    .add(txtDecotePath, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 230, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                    .add(jButtonParcourFolder1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 86, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(layout.createSequentialGroup()
                                    .add(txtFolderPath, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 230, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                    .add(jButtonParcourFolder, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 86, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                        .add(jButtonSaveParam))
                    .add(layout.createSequentialGroup()
                        .add(jLabel8)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(txtMesurePath, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 230, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jButtonParcourFolder2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 86, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(jLabel7)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(txtDevisPath, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 230, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jButtonParcourFolder3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 86, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(jLabel6)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(txtFacturePath, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 230, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jButtonParcourFolder4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 86, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(jLabel5)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(txtMdpBdd, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 230, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(98, 98, 98))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(layout.createSequentialGroup()
                                .add(jLabel1)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(txtBddPath, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 230, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(layout.createSequentialGroup()
                                .add(jLabel4)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(txtIdBdd, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 230, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(98, 98, 98)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(14, 14, 14)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtBddPath, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtIdBdd, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtMdpBdd, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtFacturePath, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButtonParcourFolder4))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtDevisPath, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButtonParcourFolder3))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtMesurePath, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButtonParcourFolder2))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtDecotePath, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButtonParcourFolder1))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtFolderPath, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jButtonParcourFolder))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 23, Short.MAX_VALUE)
                .add(jButtonSaveParam)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonParcourFolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonParcourFolderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonParcourFolderActionPerformed

    private void jButtonSaveParamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveParamActionPerformed
        // TODO add your handling code here:
        if(txtBddPath != null || txtDecotePath != null || txtDevisPath != null || txtFacturePath!= null || txtFolderPath != null || txtIdBdd != null || txtMdpBdd != null || txtMesurePath != null){
            // on creer le noeud racine
            Element racine = null;
            //un objec jdom document
            Document document = null;
            // on creer une instance de saxbuilder
            SAXBuilder sxb = new SAXBuilder();

            //Recupération des valeurs de parametre et modification de celle-ci
            try {
                String path = System.getProperty("user.dir" );
                document = sxb.build(new File(path + "/src/files/param.xml"));
                racine = document.getRootElement();
                List lstParam = racine.getChildren("param");

                //Iterator pour parcourir la list
                Iterator ite = lstParam.iterator();

                String paramName;
                String paramPath;

                while(ite.hasNext()){
                    Element curent = (Element) ite.next();
                    //recupere values
                    paramName = curent.getAttributeValue("name").toString();
                    paramPath = curent.getAttributeValue("pathName").toString();
                    
                    //modifier values
                    if(paramName.contains("bddPath"))
                        curent.setAttribute("pathName", txtBddPath.getText());
                    if(paramName.contains("bddUser"))
                        curent.setAttribute("pathName", txtIdBdd.getText());
                    if(paramName.contains("bddPass"))
                        curent.setAttribute("pathName", txtMdpBdd.getText());
                    if(paramName.contains("factureModel"))
                        curent.setAttribute("pathName", txtFacturePath.getText());
                    if(paramName.contains("devisModel"))
                        curent.setAttribute("pathName", txtDevisPath.getText());
                    if(paramName.contains("mesureModel"))
                        curent.setAttribute("pathName", txtMesurePath.getText());
                    if(paramName.contains("decoteModel"))
                        curent.setAttribute("pathName", txtDecotePath.getText());
                    if(paramName.contains("folderCommandePath"))
                        curent.setAttribute("pathName", txtFolderPath.getText());

                }
                // Enregistre les modifications
                XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
                sortie.output(document, new FileOutputStream(path + "/src/files/param.xml"));
                
                JOptionPane.showMessageDialog(this, "Nouveau paramètre pris en comptes");
                dispose();

            } catch (JDOMException ex) {
                Logger.getLogger(Parametres.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Parametres.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Tous les chemin doivent êtres renseignés");
        }
    }//GEN-LAST:event_jButtonSaveParamActionPerformed

    private void jButtonParcourFolder4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonParcourFolder4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonParcourFolder4ActionPerformed

    private void jButtonParcourFolder3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonParcourFolder3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonParcourFolder3ActionPerformed

    private void jButtonParcourFolder2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonParcourFolder2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonParcourFolder2ActionPerformed

    private void jButtonParcourFolder1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonParcourFolder1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonParcourFolder1ActionPerformed

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
            java.util.logging.Logger.getLogger(Parametres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Parametres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Parametres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Parametres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Parametres().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonParcourFolder;
    private javax.swing.JButton jButtonParcourFolder1;
    private javax.swing.JButton jButtonParcourFolder2;
    private javax.swing.JButton jButtonParcourFolder3;
    private javax.swing.JButton jButtonParcourFolder4;
    private javax.swing.JButton jButtonSaveParam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtBddPath;
    private javax.swing.JTextField txtDecotePath;
    private javax.swing.JTextField txtDevisPath;
    private javax.swing.JTextField txtFacturePath;
    private javax.swing.JTextField txtFolderPath;
    private javax.swing.JTextField txtIdBdd;
    private javax.swing.JTextField txtMdpBdd;
    private javax.swing.JTextField txtMesurePath;
    // End of variables declaration//GEN-END:variables
}
