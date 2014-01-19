/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loiseau.ihm;

import java.io.File;
import java.sql.ResultSet;
import java.util.Collections;
import loiseau.metier.ClientOperation;
import java.util.HashMap;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.table.DefaultTableModel;
import loiseau.metier.DialogueBdd;
import loiseau.metier.ExportExcel;
import loiseau.metier.Param;
import loiseau.stockage.Article_fabrication;
import loiseau.stockage.Client;
import loiseau.stockage.Commande;
import loiseau.stockage.Couleur;
import loiseau.stockage.Coulisse;
import loiseau.stockage.Lame;
import loiseau.stockage.Moteur;
import loiseau.stockage.Option;
import loiseau.stockage.Piece;
import loiseau.stockage.Type_article;
import loiseau.stockage.Type_manoeuvre;
import loiseau.stockage.Type_pose;
import loiseau.stockage.telecommande;

/**
 *
 * @author guillaume
 */
public class SuivieCommande extends javax.swing.JFrame {

    /**
     * Creates new form SuivieCommande
     */
    public SuivieCommande() {
        initComponents();
    }
    Param mesParam=new Param();
    Acceuil laForm;
    DefaultListModel lst;
    DefaultTableModel dtm;
    ClientOperation tri = new ClientOperation();
    ResultSet rs;
    Client unClient;
    telecommande uneTelecomande;
    Type_article unTypeArticle;
    Option uneOption;
    Piece unePiece;
    Couleur uneCouleur;
    Coulisse uneCoulisse;
    Lame uneLame;
    Type_pose unePose;
    Type_manoeuvre uneManoeuvre;
    Moteur unMoteur;
    Article_fabrication unArticleCommande;
    Article_fabrication unArticle;
    HashMap<Double, HashMap<Double, Vector<String>>> lesPrixCalypso = new HashMap<>();
    HashMap<Double, HashMap<Double, Vector<String>>> lesPrixMozart = new HashMap<>();
    HashMap<Double, HashMap<Double, Vector<String>>> lesPrixTradi = new HashMap<>();
    HashMap<Double, HashMap<Double, Vector<String>>> lesPrixAntitempete = new HashMap<>();
    HashMap<Double, HashMap<Double, Vector<String>>> lesPrixGarageReno = new HashMap<>();
    HashMap<Double, Vector<String>> lesLargeur = new HashMap<>();
    Commande uneCommande;
    String GETCLIENT = "SELECT * FROM client";
    String GETCOMMANDE = "SELECT * FROM commande";
    String GETARTICLEFABRICATION = "SELECT * FROM article_fabrication";
    String GETCAISSONS = "SELECT * FROM caisson";
    String GETCOULEUR = "SELECT * FROM couleur";
    String GETCOULISSE = "SELECT * FROM coulisse";
    String GETETATCOMMANDE = "SELECT * FROM etat_commande";
    String GETLAME = "SELECT * FROM lame";
    String GETMOTEUR = "SELECT * FROM moteur";
    String GETOPTION = "SELECT * FROM option";
    String GETPRIXCALYPSO = "SELECT * FROM prix_calypso";
    String GETPRIXMOZART = "SELECT * FROM prix_mozart";
    String GETGARAGEANTITEMPETE = "SELECT * FROM porte_garage_anti_tempete";
    String GETPRIXTRADITONNEL = "SELECT * FROM traditionnel";
    String GETGARAGERENOVATION = "SELECT * FROM prote_garage_reno";
    String GETTELECOMANDE = "SELECT * FROM telecommande";
    String GETTYPEARTICLE = "SELECT * FROM type_article";
    String GETTYPEMANOEUVRE = "SELECT * FROM type_manoeuvre";
    String GETTYPEPOSE = "SELECT * FROM type_pose";
    String GETPIECE = "SELECT * FROM piece";
    
    String ADDARTICLE = "INSERT INTO `loiseaudb`.`article_fabrication` (`largeur`, `hauteur`, `ref_article`, `quantite`, `prix`, `cote_manoeuvre`, `type_moteur`, `puissance_moteur`, `hors_cote`, `commande`, `id_couleur_coffre`, `id_couleur_coulisse`, `id_couleur_tablier`, `type_coulisse`, `type_lame`, `type_article`, `type_manoeuvre`, `type_pose`, `telecommande`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    String ADDCOMMAND;
    String UPDATEARTICLE = "UPDATE `loiseaudb`.`article_fabrication` SET `largeur`=?, `hauteur`=?, `ref_article`=?, `quantite`=?, `prix`=?, `cote_manoeuvre`=?, `type_moteur`=?, `puissance_moteur`=?, `hors_cote`=?, `commande`=?, `id_couleur_coffre`=?, `id_couleur_coulisse`=?, `id_couleur_tablier`=?, `type_coulisse`=?, `type_lame`=?, `type_article`=?, `type_manoeuvre`=?, `type_pose`=?, `telecommande`=? WHERE `id_article_fabrication`=?";
    String UPDATECOMMAND;
    String DELETEARTICLE = "DELETE FROM `loiseaudb`.`article_fabrication` WHERE `id_article_fabrication`=?";

    Vector<Client> lesClient = new Vector<>();
    Vector<Commande> lesCommandes = new Vector<>();
    Vector<Article_fabrication> article = new Vector<>();
    Vector<Article_fabrication> articleLoiseau = new Vector<>();
    Vector<Article_fabrication> lesArticle = new Vector<>();
    Vector<Article_fabrication> lesArticleLoiseau = new Vector<>();
    Vector<Couleur> lesCouleurs = new Vector<>();
    Vector<String> prixEtMoteur;
    Vector<Object> lesInfos;
    Vector<Option> lesOption = new Vector<>();
    Vector<Type_manoeuvre> lesManoeuvres = new Vector<>();
    Vector<telecommande> lesTele = new Vector<>();
    Vector<Moteur> lesMoteur = new Vector();
    Vector<Coulisse> lesCoulisses = new Vector<>();
    Vector<Lame> lesLames = new Vector<>();
    Vector<Type_pose> lesPoses = new Vector<>();
    Vector<Type_article> lesTypeArticle = new Vector<>();
    Vector<Piece> lesPieces = new Vector<>();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtAcompte2 = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstClient = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstCommande = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtNom = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtType = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtTTC = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtHT = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtRef = new javax.swing.JTextField();
        Reference = new javax.swing.JLabel();
        cbbTva = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblArticle = new javax.swing.JTable();
        txtCommercial = new javax.swing.JTabbedPane();
        txtTmpCommercial = new javax.swing.JTextField();
        txtMetreur = new javax.swing.JTextField();
        txtVendu = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        txtAcompte = new javax.swing.JTextField();
        txtReglement = new javax.swing.JTextField();
        txtDatePose = new javax.swing.JTextField();
        txtDelai = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemNewCommande = new javax.swing.JMenuItem();
        ItemSuprCommande = new javax.swing.JMenuItem();
        ItemEtatSuivant = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenu3 = new javax.swing.JMenu();
        itemPriseMesur = new javax.swing.JMenuItem();
        ItemDevis = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        ItemDecote = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        ItemPrestaPose = new javax.swing.JMenuItem();
        ItemFacture = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenu4 = new javax.swing.JMenu();
        itemAjoutVolet = new javax.swing.JMenuItem();
        itemAjoutTelecomande = new javax.swing.JMenuItem();
        itemAjoutAxe = new javax.swing.JMenuItem();
        itemAjoutGarage = new javax.swing.JMenuItem();
        itemMoteur = new javax.swing.JMenuItem();
        itemAjoutTablier = new javax.swing.JMenuItem();
        itemAjoutPiece = new javax.swing.JMenuItem();
        itemAjoutOption = new javax.swing.JMenuItem();
        itemAjoutAutre = new javax.swing.JMenuItem();
        itemReset = new javax.swing.JMenuItem();
        itemRetour = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem10 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Suivie des commandes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        lstClient.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Collette", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lstClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstClientMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(lstClient);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Commandes");

        lstCommande.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lstCommande.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstCommandeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstCommande);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Client");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        txtNom.setEditable(false);

        jLabel6.setText("Téléphone");

        txtType.setEditable(false);

        jLabel5.setText("Nom");

        jLabel8.setText("Type");

        jLabel7.setText("Email");

        txtTel.setEditable(false);

        txtMail.setEditable(false);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Informations client");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel12.setText("Total HT");

        jLabel13.setText("Total TTC");

        txtHT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHTActionPerformed(evt);
            }
        });

        jLabel11.setText("Taux TVA");

        Reference.setText("Reference");

        cbbTva.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "19.6" }));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Information commande");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Reference))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtHT, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                .addComponent(txtTTC, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                .addComponent(cbbTva, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtRef, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reference))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cbbTva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtHT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(txtTTC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        tblArticle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nom", "Largeur", "Hauteur", "QT", "Prix"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblArticle);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtTmpCommercial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTmpCommercialActionPerformed(evt);
            }
        });
        txtCommercial.addTab("Commercial", txtTmpCommercial);
        txtCommercial.addTab("Metreur", txtMetreur);
        txtCommercial.addTab("Vendu", txtVendu);

        jLabel9.setText("Temps de pose ");

        jTabbedPane2.addTab("Acompte", txtAcompte);
        jTabbedPane2.addTab("Reglement", txtReglement);
        jTabbedPane2.addTab("Date de pose", txtDatePose);
        jTabbedPane2.addTab("Delai max", txtDelai);

        jMenu1.setText("Fichier");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        itemNewCommande.setText("Sauvegarder commande");
        itemNewCommande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNewCommandeActionPerformed(evt);
            }
        });
        jMenu1.add(itemNewCommande);

        ItemSuprCommande.setText("Suprimer article");
        jMenu1.add(ItemSuprCommande);

        ItemEtatSuivant.setText("Etat suivant");
        jMenu1.add(ItemEtatSuivant);
        jMenu1.add(jSeparator3);

        jMenu3.setText("Export");

        itemPriseMesur.setText("Préstation de pris de mesures");
        itemPriseMesur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPriseMesurActionPerformed(evt);
            }
        });
        jMenu3.add(itemPriseMesur);

        ItemDevis.setText("Devis");
        ItemDevis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemDevisActionPerformed(evt);
            }
        });
        jMenu3.add(ItemDevis);
        jMenu3.add(jSeparator1);

        ItemDecote.setText("Décote");
        jMenu3.add(ItemDecote);
        jMenu3.add(jSeparator2);

        ItemPrestaPose.setText("Préstation de pose");
        ItemPrestaPose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemPrestaPoseActionPerformed(evt);
            }
        });
        jMenu3.add(ItemPrestaPose);

        ItemFacture.setText("Facture");
        ItemFacture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemFactureActionPerformed(evt);
            }
        });
        jMenu3.add(ItemFacture);

        jMenu1.add(jMenu3);
        jMenu1.add(jSeparator4);

        jMenu4.setText("Ajouter");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        itemAjoutVolet.setText("Volet Loiseau");
        itemAjoutVolet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemAjoutVoletMouseClicked(evt);
            }
        });
        itemAjoutVolet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAjoutVoletActionPerformed(evt);
            }
        });
        jMenu4.add(itemAjoutVolet);

        itemAjoutTelecomande.setText("Télécommande");
        itemAjoutTelecomande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAjoutTelecomandeActionPerformed(evt);
            }
        });
        jMenu4.add(itemAjoutTelecomande);

        itemAjoutAxe.setText("Axe motorisé");
        itemAjoutAxe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAjoutAxeActionPerformed(evt);
            }
        });
        jMenu4.add(itemAjoutAxe);

        itemAjoutGarage.setText("Porte de garage");
        itemAjoutGarage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAjoutGarageActionPerformed(evt);
            }
        });
        jMenu4.add(itemAjoutGarage);

        itemMoteur.setText("Moteur");
        itemMoteur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMoteurActionPerformed(evt);
            }
        });
        jMenu4.add(itemMoteur);

        itemAjoutTablier.setText("Tablier");
        itemAjoutTablier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAjoutTablierActionPerformed(evt);
            }
        });
        jMenu4.add(itemAjoutTablier);

        itemAjoutPiece.setText("Piéces");
        itemAjoutPiece.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAjoutPieceActionPerformed(evt);
            }
        });
        jMenu4.add(itemAjoutPiece);

        itemAjoutOption.setText("Options");
        itemAjoutOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAjoutOptionActionPerformed(evt);
            }
        });
        jMenu4.add(itemAjoutOption);

        itemAjoutAutre.setText("Autres");
        itemAjoutAutre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAjoutAutreActionPerformed(evt);
            }
        });
        jMenu4.add(itemAjoutAutre);

        jMenu1.add(jMenu4);

        itemReset.setText("Reset");
        itemReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemResetActionPerformed(evt);
            }
        });
        jMenu1.add(itemReset);

        itemRetour.setText("Retour");
        itemRetour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRetourActionPerformed(evt);
            }
        });
        jMenu1.add(itemRetour);
        jMenu1.add(jSeparator5);

        jMenuItem10.setText("Paramètres");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem10);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addComponent(jLabel9)
                                        .addGap(54, 54, 54))
                                    .addComponent(txtCommercial)
                                    .addComponent(jTabbedPane2))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCommercial, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        txtCommercial.getAccessibleContext().setAccessibleName("Commercial");

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void ItemFactureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemFactureActionPerformed
        // TODO add your handling code here:  
        for (Commande c : lesCommandes) {
            if (lstCommande.getSelectedValue().toString().compareTo(c.getRef_dossier()) == 0) {
                uneCommande = c;
            }
        }
        for (Client cl : lesClient) {
            if (cl.getId_client() == uneCommande.getId_client()) {
                unClient = cl;
            }
        }
        try {
            ExportExcel.exportFacture(unClient, uneCommande, article, articleLoiseau);
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_ItemFactureActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        try {
            rs = DialogueBdd.select(GETCLIENT);
            while (rs.next()) {
                unClient = new Client();
                unClient.setPrenom(rs.getString("prenom"));
                unClient.setNom(rs.getString("nom"));
                unClient.setEmail(rs.getString("email"));
                unClient.setTitre(rs.getString("titre"));
                unClient.setVille(rs.getString("ville"));
                unClient.setCode_postal(rs.getString("code_postal"));
                unClient.setDivers(rs.getString("divers"));
                unClient.setSite_web(rs.getString("site_web"));
                unClient.setTel_fix(rs.getString("tel_fix"));
                unClient.setFax(rs.getString("fax"));
                unClient.setType(rs.getString("type"));
                unClient.setNum_siret(rs.getString("num_siret"));
                unClient.setRemise(rs.getString("remise"));
                unClient.setVendeur(rs.getString("vendeur"));
                unClient.setTel_port(rs.getString("tel_port"));
                unClient.setRue(rs.getString("rue"));
                unClient.setNb_commande(rs.getString("nb_commande"));
                unClient.setId_client(Integer.parseInt(rs.getString("id_client")));
                lesClient.add(unClient);
            }
            rs = DialogueBdd.select(GETCOMMANDE);
            while (rs.next()) {
                uneCommande = new Commande(Integer.parseInt(rs.getString("id_client")), Integer.parseInt(rs.getString("id_commande")), rs.getString("ref_dossier"),
                        rs.getString("acompte"), Double.parseDouble(rs.getString("taux_tva")), Double.parseDouble(rs.getString("prix_ht")), Double.parseDouble(rs.getString("prix_ttc")),
                        rs.getString("type_reglement"), Integer.parseInt(rs.getString("etat_commande")), rs.getString("temps_pose_metreur"), rs.getString("temps_pose_commercial"),
                        rs.getString("temps_pose_vendu"), rs.getString("delais_prevu"), rs.getString("date_pose"));
                lesCommandes.add(uneCommande);
            }
            rs = DialogueBdd.select(GETOPTION);
            while (rs.next()) {
                uneOption = new Option(rs.getInt("id_option"), rs.getString("nom_option"), Double.parseDouble(rs.getString("prix")));
                lesOption.add(uneOption);
            }
            rs = DialogueBdd.select(GETTELECOMANDE);
            while (rs.next()) {
                uneTelecomande = new telecommande(rs.getInt("id_telecomande"), rs.getString("nom"), Double.parseDouble(rs.getString("prix_telecommande")), rs.getString("reference"));
                lesTele.add(uneTelecomande);
            }
            rs = DialogueBdd.select(GETMOTEUR);
            while (rs.next()) {
                unMoteur = new Moteur(rs.getInt("id_moteur"), rs.getString("nom_moteur"), rs.getString("ref_moteur"), Double.parseDouble(rs.getString("prix_moteur")),
                        rs.getString("quantite_moteur"));
                lesMoteur.add(unMoteur);
            }
            rs = DialogueBdd.select(GETPIECE);
            while (rs.next()) {
                unePiece = new Piece(rs.getInt("id_piece"), rs.getString("nom_piece"), rs.getString("ref_piece"), Double.parseDouble(rs.getString("prix_piece")), rs.getString("valeur_quantite_piece"));
                lesPieces.add(unePiece);
            }
            rs = DialogueBdd.select(GETLAME);
            while (rs.next()) {
                uneLame = new Lame(rs.getInt("id_lame"), rs.getString("nom_lame"), Double.parseDouble(rs.getString("prix")), rs.getString("pas"));
                lesLames.add(uneLame);
            }
            rs = DialogueBdd.select(GETCOULISSE);
            while (rs.next()) {
                uneCoulisse = new Coulisse(rs.getInt("id_coulisse"), rs.getString("nom"), Double.parseDouble(rs.getString("profondeur")), rs.getInt("rabat"));
                lesCoulisses.add(uneCoulisse);
            }
            rs = DialogueBdd.select(GETTYPEARTICLE);
            while (rs.next()) {
                unTypeArticle = new Type_article(rs.getInt("id_type_article"), rs.getString("nom"));
                lesTypeArticle.add(unTypeArticle);
            }
            rs = DialogueBdd.select(GETTYPEPOSE);
            while (rs.next()) {
                unePose = new Type_pose(rs.getInt("id_type_pose"), rs.getString("nom"), rs.getString("enroulement"), rs.getInt("rabat"));
                lesPoses.add(unePose);
            }
            rs = DialogueBdd.select(GETPRIXCALYPSO);
            prixEtMoteur = new Vector<>();
            while (rs.next()) {
                lesLargeur = new HashMap<>();
                if (lesPrixCalypso.containsKey(Double.parseDouble(rs.getString("hauteur")))) {
                    prixEtMoteur = new Vector<>();
                    prixEtMoteur.add(rs.getString("prix"));
                    prixEtMoteur.add(rs.getString("puissanceMoteur"));
                    prixEtMoteur.add(rs.getString("caisson"));
                    lesPrixCalypso.get(Double.parseDouble(rs.getString("hauteur"))).put(Double.parseDouble(rs.getString("largeur")), prixEtMoteur);
                } else {
                    prixEtMoteur = new Vector<>();
                    prixEtMoteur.add(rs.getString("prix"));
                    prixEtMoteur.add(rs.getString("puissanceMoteur"));
                    prixEtMoteur.add(rs.getString("caisson"));
                    lesLargeur = new HashMap<>();
                    lesLargeur.put(Double.parseDouble(rs.getString("largeur")), prixEtMoteur);
                    lesPrixCalypso.put(Double.parseDouble(rs.getString("hauteur")), lesLargeur);
                }
            }
            rs = DialogueBdd.select(GETPRIXMOZART);
            prixEtMoteur = new Vector<>();
            while (rs.next()) {
                lesLargeur = new HashMap<>();
                if (lesPrixMozart.containsKey(Double.parseDouble(rs.getString("hauteur")))) {
                    prixEtMoteur = new Vector<>();
                    prixEtMoteur.add(rs.getString("prix"));
                    prixEtMoteur.add(rs.getString("puissanceMoteur"));
                    prixEtMoteur.add(rs.getString("caisson"));
                    lesPrixMozart.get(Double.parseDouble(rs.getString("hauteur"))).put(Double.parseDouble(rs.getString("largeur")), prixEtMoteur);
                } else {
                    prixEtMoteur = new Vector<>();
                    prixEtMoteur.add(rs.getString("prix"));
                    prixEtMoteur.add(rs.getString("puissanceMoteur"));
                    prixEtMoteur.add(rs.getString("caisson"));
                    lesLargeur = new HashMap<>();
                    lesLargeur.put(Double.parseDouble(rs.getString("largeur")), prixEtMoteur);
                    lesPrixMozart.put(Double.parseDouble(rs.getString("hauteur")), lesLargeur);
                }
            }
            rs = DialogueBdd.select(GETPRIXTRADITONNEL);
            prixEtMoteur = new Vector<>();
            while (rs.next()) {
                lesLargeur = new HashMap<>();
                if (lesPrixTradi.containsKey(Double.parseDouble(rs.getString("hauteur")))) {
                    prixEtMoteur = new Vector<>();
                    prixEtMoteur.add(rs.getString("prix"));
                    prixEtMoteur.add(rs.getString("puissanceMoteur"));
                    prixEtMoteur.add(rs.getString("caisson"));
                    lesPrixTradi.get(Double.parseDouble(rs.getString("hauteur"))).put(Double.parseDouble(rs.getString("largeur")), prixEtMoteur);
                } else {
                    prixEtMoteur = new Vector<>();
                    prixEtMoteur.add(rs.getString("prix"));
                    prixEtMoteur.add(rs.getString("puissanceMoteur"));
                    prixEtMoteur.add(rs.getString("caisson"));
                    lesLargeur = new HashMap<>();
                    lesLargeur.put(Double.parseDouble(rs.getString("largeur")), prixEtMoteur);
                    lesPrixTradi.put(Double.parseDouble(rs.getString("hauteur")), lesLargeur);
                }
            }
            rs = DialogueBdd.select(GETGARAGEANTITEMPETE);
            prixEtMoteur = new Vector<>();
            while (rs.next()) {
                lesLargeur = new HashMap<>();
                if (lesPrixAntitempete.containsKey(Double.parseDouble(rs.getString("hauteur")))) {
                    prixEtMoteur = new Vector<>();
                    prixEtMoteur.add(rs.getString("prix"));
                    lesPrixAntitempete.get(Double.parseDouble(rs.getString("hauteur"))).put(Double.parseDouble(rs.getString("largeur")), prixEtMoteur);
                } else {
                    prixEtMoteur = new Vector<>();
                    prixEtMoteur.add(rs.getString("prix"));
                    lesLargeur = new HashMap<>();
                    lesLargeur.put(Double.parseDouble(rs.getString("largeur")), prixEtMoteur);
                    lesPrixAntitempete.put(Double.parseDouble(rs.getString("hauteur")), lesLargeur);
                }
            }
            rs = DialogueBdd.select(GETGARAGERENOVATION);
            prixEtMoteur = new Vector<>();
            while (rs.next()) {
                lesLargeur = new HashMap<>();
                if (lesPrixGarageReno.containsKey(Double.parseDouble(rs.getString("hauteur")))) {
                    prixEtMoteur = new Vector<>();
                    prixEtMoteur.add(rs.getString("prix"));
                    lesPrixGarageReno.get(Double.parseDouble(rs.getString("hauteur"))).put(Double.parseDouble(rs.getString("largeur")), prixEtMoteur);
                } else {
                    prixEtMoteur = new Vector<>();
                    prixEtMoteur.add(rs.getString("prix"));
                    lesLargeur = new HashMap<>();
                    lesLargeur.put(Double.parseDouble(rs.getString("largeur")), prixEtMoteur);
                    lesPrixGarageReno.put(Double.parseDouble(rs.getString("hauteur")), lesLargeur);
                }
            }
            rs = DialogueBdd.select(GETCOULEUR);
            while (rs.next()) {
                uneCouleur = new Couleur(rs.getInt("id_couleur"), rs.getString("nom_couleur"));
                lesCouleurs.add(uneCouleur);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
        lst = new DefaultListModel();
        lstClient.setModel(lst);
        Collections.sort(lesClient, tri);
        for (Client c : lesClient) {
            lst.addElement(c.getNom());
        }
        lst = new DefaultListModel();
        lstCommande.setModel(lst);
        for (Commande c : lesCommandes) {
            lst.addElement(c.getRef_dossier());
        }
    }//GEN-LAST:event_formWindowOpened

    private void lstClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstClientMouseClicked
        // TODO add your handling code here:
        completerClient(lstClient.getSelectedIndex());
        lst = new DefaultListModel();
        lstCommande.setModel(lst);
        for (Commande c : lesCommandes) {
            if (lesClient.get(lstClient.getSelectedIndex()).getId_client() == c.getId_client()) {
                lst.addElement(c.getRef_dossier());
            }
        }
    }//GEN-LAST:event_lstClientMouseClicked

    private void lstCommandeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstCommandeMouseClicked
        // TODO add your handling code here:
        article.removeAllElements();
        articleLoiseau.removeAllElements();
        int indice = 0;
        for (Commande c : lesCommandes) {
            if (lstCommande.getSelectedValue().toString().compareTo(c.getRef_dossier()) == 0) {
                indice = lesCommandes.indexOf(c);
            }
        }
        for (Client c : lesClient) {
            if (c.getId_client() == lesCommandes.get(indice).getId_client()) {
                lstClient.setSelectedIndex(lesClient.indexOf(c));
            }
        }
        completerClient(lstClient.getSelectedIndex());
        for (Article_fabrication a : lesArticle) {
            if (a.getCommande() == lesCommandes.get(indice).getId_commande()) {
                article.add(a);
            }
        }
        for (Article_fabrication a : lesArticleLoiseau) {
            if (a.getCommande() == lesCommandes.get(indice).getId_commande()) {
                articleLoiseau.add(a);
            }
        }
        completerCommande(indice);
        afficherArticle();
        calculTva();
    }//GEN-LAST:event_lstCommandeMouseClicked

    private void itemAjoutTablierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAjoutTablierActionPerformed
        // TODO add your handling code here:
        unArticleCommande = JDialogTablier.openForm(this, lesLames, lesCouleurs);
        if (unArticleCommande != null) {
            try {
                unArticleCommande = CalculPrixLoiseau(unArticleCommande);
            } catch (Exception ex) {
                Logger.getLogger(SuivieCommande.class.getName()).log(Level.SEVERE, null, ex);
            }
            articleLoiseau.add(unArticleCommande);
            afficherArticle();
            calculTva();
        }
    }//GEN-LAST:event_itemAjoutTablierActionPerformed

    private void itemAjoutVoletMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemAjoutVoletMouseClicked
        // TODO add your handling code here:
        unArticleCommande = JDialogVoletLoiseau.openForm(this, lesTypeArticle, lesCoulisses, lesLames, lesPoses, lesManoeuvres, lesCouleurs);
        if (unArticleCommande != null) {
            try {
                unArticleCommande = CalculPrixLoiseau(unArticleCommande);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Attention le volet est hors cote");
                unArticleCommande.setHors_cote(1);
                unArticleCommande.setPrix(JDialogPrix.openForm(this));
            }
            unArticle = JDialogueTelecomande.openForm(this, lesTele);
            if (unArticle != null) {
                unArticleCommande.setTelecommande(unArticle.getId_article_fabrication());
                articleLoiseau.add(unArticleCommande);
                if (unArticle.getNom().compareTo("Pas de télécomande") == 0) {
                } else {
                    article.add(unArticle);
                }
                afficherArticle();
                calculTva();
            } else {
                JOptionPane.showMessageDialog(this, "volet non enregistrer, choisissez une télécomande");
            }
        }
    }//GEN-LAST:event_itemAjoutVoletMouseClicked

    private void itemAjoutVoletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAjoutVoletActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemAjoutVoletActionPerformed

    private void itemAjoutTelecomandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAjoutTelecomandeActionPerformed
        // TODO add your handling code here:
        unArticle = JDialogueTelecomande.openForm(this, lesTele);
        if (unArticle != null) {
            article.add(unArticle);
            afficherArticle();
            calculTva();
        }
    }//GEN-LAST:event_itemAjoutTelecomandeActionPerformed

    private void itemAjoutAxeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAjoutAxeActionPerformed
        // TODO add your handling code here:
        unArticleCommande = JDialogAxe.openForm(this, lesPieces);
        if (unArticleCommande != null) {
            articleLoiseau.add(unArticleCommande);
            afficherArticle();
            calculTva();
        }
    }//GEN-LAST:event_itemAjoutAxeActionPerformed

    private void itemAjoutGarageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAjoutGarageActionPerformed
        // TODO add your handling code here:
        unArticleCommande = JDialogGarage.openForm(this);
        if (unArticleCommande != null) {
            if (unArticleCommande.getNom().regionMatches(true, 0, "porte", 0, 4)) {
                try {
                    unArticleCommande = calculPrixGarageAntiTempete(unArticleCommande);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Attention la porte de garage est hors cote");
                    unArticleCommande.setHors_cote(1);
                    unArticleCommande.setPrix(JDialogPrix.openForm(this));
                }
            } else {
                try {
                    unArticleCommande = calculPrixGarageReno(unArticleCommande);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Attention la porte de garage est hors cote");
                    unArticleCommande.setHors_cote(1);
                    unArticleCommande.setPrix(JDialogPrix.openForm(this));
                }
            }
            unArticle = JDialogueTelecomande.openForm(this, lesTele);
            if (unArticle != null) {
                unArticleCommande.setId_article_fabrication(unArticle.getId_article_fabrication());
                articleLoiseau.add(unArticleCommande);
                article.add(unArticle);
                afficherArticle();
                calculTva();
            } else {
                JOptionPane.showMessageDialog(this, "Porte de garage non enregistrer, choisissez une télécomande");
            }
        }
    }//GEN-LAST:event_itemAjoutGarageActionPerformed

    private void itemMoteurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMoteurActionPerformed
        // TODO add your handling code here:
        unArticle = JDialogMoteur.openForm(this, lesMoteur);
        if (unArticle != null) {
            article.add(unArticle);
            afficherArticle();
            calculTva();
        }
    }//GEN-LAST:event_itemMoteurActionPerformed

    private void itemAjoutPieceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAjoutPieceActionPerformed
        // TODO add your handling code here:
        unArticle = JDialogPieces.openForm(this, lesPieces);
        if (unArticle != null) {
            article.add(unArticle);
            afficherArticle();
            calculTva();
        }
    }//GEN-LAST:event_itemAjoutPieceActionPerformed

    private void itemAjoutOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAjoutOptionActionPerformed
        // TODO add your handling code here:
        if (tblArticle.getSelectedRow() != -1) {
            unArticle = JDialogOptions.openForm(this, tblArticle.getValueAt(tblArticle.getSelectedRow(), 1).toString(),
                    tblArticle.getValueAt(tblArticle.getSelectedRow(), 3).toString(), tblArticle.getValueAt(tblArticle.getSelectedRow(), 2).toString(), lesOption);
            if (unArticle != null) {
                article.add(unArticle);
                afficherArticle();
                calculTva();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Choisissez un article");
        }
    }//GEN-LAST:event_itemAjoutOptionActionPerformed

    private void itemAjoutAutreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAjoutAutreActionPerformed
        // TODO add your handling code here:
        unArticleCommande = JDialogAutres.openForm(this);
        if (unArticleCommande != null) {
            articleLoiseau.add(unArticleCommande);
            afficherArticle();
            calculTva();
        }
    }//GEN-LAST:event_itemAjoutAutreActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void itemNewCommandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNewCommandeActionPerformed
        // TODO add your handling code here:
        String path;
        int idClient = 0;
        int idCommande = 0;
        int indice = 0;
        boolean refUtiliser = false;
        for (Commande c : lesCommandes) {
            if (c.getRef_dossier().compareToIgnoreCase(txtRef.getText()) == 0) {
                refUtiliser = true;
                indice = lesCommandes.indexOf(c);
            }
        }
        if (lstCommande.isSelectionEmpty() && refUtiliser == false) {
            if (refUtiliser) {
                JOptionPane.showMessageDialog(this, "cette réference est deja utiliser desolé");
            } else {
                if (lstClient.isSelectionEmpty()) {
                    JOptionPane.showMessageDialog(this, "selectionnez un client");
                } else {
                    if (dtm.getRowCount() < 1) {
                        JOptionPane.showMessageDialog(this, "ajouter des articles svp");
                    } else {
                        if (txtRef.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(this, "entrez une réference svp");
                        } else {
                            for (Client c : lesClient) {
                                if (c.getNom().compareTo(lstClient.getSelectedValue().toString()) == 0) {
                                    idClient = c.getId_client();
                                }
                            }
                            uneCommande = new Commande();
                            remplirCommande();
                            uneCommande.setRef_dossier(txtRef.getText());
                            uneCommande.setId_client(idClient);
                            lesInfos = new Vector<>();
                            lesInfos.add(uneCommande.getRef_dossier());
                            lesInfos.add(uneCommande.getAcompte());
                            lesInfos.add(String.valueOf(uneCommande.getTaux_tva()));
                            lesInfos.add(String.valueOf(uneCommande.getTaux_ht()));
                            lesInfos.add(String.valueOf(uneCommande.getPrix_ttc()));
                            lesInfos.add(uneCommande.getType_reglement());
                            lesInfos.add(String.valueOf(uneCommande.getId_client()));
                            lesInfos.add(0);
                            lesInfos.add(uneCommande.getTemps_pose_commercial());
                            lesInfos.add(uneCommande.getTemps_pose_moeteur());
                            lesInfos.add(uneCommande.getTemps_pose_vendu());
                            lesInfos.add(uneCommande.getDelais_prevu());
                            lesInfos.add(uneCommande.getDate_pose());
                            try {
                                rs = DialogueBdd.insert(ADDCOMMAND, lesInfos);
                                while (rs.next()) {
                                    uneCommande.setId_commande(rs.getInt(1));
                                    idCommande = rs.getInt(1);
                                }
                                path=mesParam.getParam("folderCommandePath");                                
                                path=path.concat(uneCommande.getRef_dossier());
                                new File(path).mkdir(); 
                                for (Article_fabrication a : article) {
                                    a.setCommande(idCommande);
                                    lesInfos = new Vector<>();
                                    lesInfos.add(String.valueOf(a.getLargeur()));
                                    lesInfos.add(String.valueOf(a.getHauteur()));
                                    lesInfos.add(a.getRef_article());
                                    lesInfos.add(String.valueOf(a.getQuantite()));
                                    lesInfos.add(String.valueOf(a.getPrix()));
                                    lesInfos.add(a.getCote_manoeuvre());
                                    lesInfos.add(a.getType_moteur());
                                    lesInfos.add(a.getPuissance_moteur());
                                    lesInfos.add(a.getHors_cote());
                                    lesInfos.add(a.getCommande());
                                    lesInfos.add(a.getCouleur_coffre());
                                    lesInfos.add(a.getCouleur_coulisse());
                                    lesInfos.add(a.getCouleur_tablier());
                                    lesInfos.add(a.getType_coulisse());
                                    lesInfos.add(a.getType_lame());
                                    lesInfos.add(a.getType_article());
                                    lesInfos.add(a.getType_manoeuvre());
                                    lesInfos.add(a.getType_pose());
                                    lesInfos.add(a.getTelecommande());
                                    rs = DialogueBdd.insert(ADDARTICLE, lesInfos);
                                    while (rs.next()) {
                                        a.setId_article_fabrication(rs.getInt(1));
                                    }
                                    lesArticle.add(a);
                                }
                                for (Article_fabrication a : articleLoiseau) {
                                    a.setCommande(idCommande);
                                    lesInfos = new Vector<>();
                                    lesInfos.add(String.valueOf(a.getLargeur()));
                                    lesInfos.add(String.valueOf(a.getHauteur()));
                                    lesInfos.add(a.getRef_article());
                                    lesInfos.add(String.valueOf(a.getQuantite()));
                                    lesInfos.add(String.valueOf(a.getPrix()));
                                    lesInfos.add(a.getCote_manoeuvre());
                                    lesInfos.add(a.getType_moteur());
                                    lesInfos.add(a.getPuissance_moteur());
                                    lesInfos.add(a.getHors_cote());
                                    lesInfos.add(a.getCommande());
                                    lesInfos.add(a.getCouleur_coffre());
                                    lesInfos.add(a.getCouleur_coulisse());
                                    lesInfos.add(a.getCouleur_tablier());
                                    lesInfos.add(a.getType_coulisse());
                                    lesInfos.add(a.getType_lame());
                                    lesInfos.add(a.getType_article());
                                    lesInfos.add(a.getType_manoeuvre());
                                    lesInfos.add(a.getType_pose());
                                    lesInfos.add(a.getTelecommande());
                                    rs = DialogueBdd.insert(ADDARTICLE, lesInfos);
                                    while (rs.next()) {
                                        a.setId_article_fabrication(rs.getInt(1));
                                    }
                                    lesArticleLoiseau.add(a);
                                }
                                JOptionPane.showMessageDialog(this, "commande creer et sauvegarder");
                            } catch (Exception ex) {
                                Logger.getLogger(SuivieCommande.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            lesCommandes.add(uneCommande);
                        }
                    }
                }
            }
        } else {
            if (txtRef.getText().compareTo(lesCommandes.get(indice).getRef_dossier()) != 0) {
                JOptionPane.showMessageDialog(this, "Attention la reference afficher n'est pas la même que la reference selectioner"
                        + " si vous voulez entrer une nouvelle commande appuyez d'abort sur Reset");
            } else {
                uneCommande = new Commande();
                for (Commande c : lesCommandes) {
                    if (c.getRef_dossier().compareTo(lesCommandes.get(indice).getRef_dossier()) == 0) {
                        uneCommande = c;
                    }
                }
                remplirCommande();
                lesInfos = new Vector<>();
                lesInfos.add(uneCommande.getRef_dossier());
                lesInfos.add(uneCommande.getAcompte());
                lesInfos.add(String.valueOf(uneCommande.getTaux_tva()));
                lesInfos.add(String.valueOf(uneCommande.getTaux_ht()));
                lesInfos.add(String.valueOf(uneCommande.getPrix_ttc()));
                lesInfos.add(uneCommande.getType_reglement());
                lesInfos.add(String.valueOf(uneCommande.getId_client()));
                lesInfos.add(0);
                lesInfos.add(uneCommande.getTemps_pose_commercial());
                lesInfos.add(uneCommande.getTemps_pose_moeteur());
                lesInfos.add(uneCommande.getTemps_pose_vendu());
                lesInfos.add(uneCommande.getDelais_prevu());
                lesInfos.add(uneCommande.getDate_pose());
                lesInfos.add(uneCommande.getId_commande());
                try {
                    DialogueBdd.update(UPDATECOMMAND, lesInfos);
                    for (Article_fabrication a : article) {
                        lesInfos = new Vector<>();
                        lesInfos.add(String.valueOf(a.getLargeur()));
                        lesInfos.add(String.valueOf(a.getHauteur()));
                        lesInfos.add(a.getRef_article());
                        lesInfos.add(String.valueOf(a.getQuantite()));
                        lesInfos.add(String.valueOf(a.getPrix()));
                        lesInfos.add(a.getCote_manoeuvre());
                        lesInfos.add(a.getType_moteur());
                        lesInfos.add(a.getHors_cote());
                        lesInfos.add(a.getPuissance_moteur());
                        lesInfos.add(a.getCouleur_coffre());
                        lesInfos.add(a.getCouleur_coulisse());
                        lesInfos.add(a.getCouleur_tablier());
                        lesInfos.add(a.getType_coulisse());
                        lesInfos.add(a.getType_lame());
                        lesInfos.add(a.getType_article());
                        lesInfos.add(a.getType_manoeuvre());
                        lesInfos.add(a.getType_pose());
                        lesInfos.add(a.getTelecommande());
                        if (a.getCommande() < 1) {
                            a.setCommande(uneCommande.getId_commande());
                            lesInfos.insertElementAt(a.getCommande(), 9);
                            rs = DialogueBdd.insert(ADDARTICLE, lesInfos);
                            while (rs.next()) {
                                a.setId_article_fabrication(rs.getInt(1));
                            }
                            lesArticle.add(a);
                        } else {
                            lesInfos.insertElementAt(a.getCommande(), 9);
                            lesInfos.add(a.getId_article_fabrication());
                            DialogueBdd.update(UPDATEARTICLE, lesInfos);
                        }
                    }
                    for (Article_fabrication a : articleLoiseau) {
                        lesInfos = new Vector<>();
                        lesInfos.add(String.valueOf(a.getLargeur()));
                        lesInfos.add(String.valueOf(a.getHauteur()));
                        lesInfos.add(a.getRef_article());
                        lesInfos.add(String.valueOf(a.getQuantite()));
                        lesInfos.add(String.valueOf(a.getPrix()));
                        lesInfos.add(a.getCote_manoeuvre());
                        lesInfos.add(a.getType_moteur());
                        lesInfos.add(a.getHors_cote());
                        lesInfos.add(a.getPuissance_moteur());
                        lesInfos.add(a.getCouleur_coffre());
                        lesInfos.add(a.getCouleur_coulisse());
                        lesInfos.add(a.getCouleur_tablier());
                        lesInfos.add(a.getType_coulisse());
                        lesInfos.add(a.getType_lame());
                        lesInfos.add(a.getType_article());
                        lesInfos.add(a.getType_manoeuvre());
                        lesInfos.add(a.getType_pose());
                        lesInfos.add(a.getTelecommande());
                        if (a.getCommande() < 1) {
                            a.setCommande(uneCommande.getId_commande());
                            lesInfos.insertElementAt(a.getCommande(), 9);
                            rs = DialogueBdd.insert(ADDARTICLE, lesInfos);
                            while (rs.next()) {
                                a.setId_article_fabrication(rs.getInt(1));
                            }
                            lesArticleLoiseau.add(a);
                        } else {
                            lesInfos.insertElementAt(a.getCommande(), 9);
                            lesInfos.add(a.getId_article_fabrication());
                            DialogueBdd.update(UPDATEARTICLE, lesInfos);
                        }
                    }
                    JOptionPane.showMessageDialog(this, "commande modifier et sauvegarder");
                } catch (Exception ex) {
                    Logger.getLogger(SuivieCommande.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_itemNewCommandeActionPerformed

    private void txtTmpCommercialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTmpCommercialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTmpCommercialActionPerformed

    private void txtHTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHTActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
        int index = -1;
        if (tblArticle.getSelectedRow() != -1) {
            if (tblArticle.getSelectedRow() < article.size()) {
                try {
                    for (Article_fabrication a : lesArticle) {
                        if (a.getId_article_fabrication()== article.get(tblArticle.getSelectedRow()).getId_article_fabrication()) {
                            index = lesArticle.indexOf(a);
                        }
                    }
                    if (article.get(tblArticle.getSelectedRow()).getId_article_fabrication()> 0) {
                        DialogueBdd.delete(DELETEARTICLE, article.get(tblArticle.getSelectedRow()).getId_article_fabrication());
                        lesArticle.remove(index);
                    }
                    article.remove(tblArticle.getSelectedRow());
                } catch (Exception ex) {
                    Logger.getLogger(SuivieCommande.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                try {
                    for (Article_fabrication a : lesArticleLoiseau) {
                        if (a.getId_article_fabrication()== articleLoiseau.get(tblArticle.getSelectedRow() - article.size()).getId_article_fabrication()) {
                            index = lesArticleLoiseau.indexOf(a);
                        }
                    }
                    if (articleLoiseau.get(tblArticle.getSelectedRow() - article.size()).getId_article_fabrication()> 0) {
                        DialogueBdd.delete(DELETEARTICLE, articleLoiseau.get(tblArticle.getSelectedRow() - article.size()).getId_article_fabrication());
                        lesArticleLoiseau.remove(index);
                    }
                    articleLoiseau.remove(tblArticle.getSelectedRow() - article.size());
                } catch (Exception ex) {
                    Logger.getLogger(SuivieCommande.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            afficherArticle();
        } else {
            JOptionPane.showMessageDialog(this, "selectionner une ligne");
        }  
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void itemResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemResetActionPerformed
        // TODO add your handling code here:
         article.removeAllElements();
        articleLoiseau.removeAllElements();
        while (dtm.getRowCount() != 0) {
            dtm.removeRow(0);
        }
        txtReglement.setText("");
        txtHT.setText("");
        txtAcompte.setText("");
        txtTTC.setText("");
        txtNom.setText("");
        txtMail.setText("");
        txtTel.setText("");
        txtType.setText("");
        txtRef.setText("");
        txtTmpCommercial.setText("");
        txtMetreur.setText("");
        txtVendu.setText("");
        txtDelai.setText("");
        txtDatePose.setText("");
        lstCommande.clearSelection();
        lstClient.clearSelection();
        lst = new DefaultListModel();
        lstCommande.setModel(lst);
        for (Commande c : lesCommandes) {
            lst.addElement(c.getRef_dossier());
        }
        
    }//GEN-LAST:event_itemResetActionPerformed

    private void itemRetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRetourActionPerformed
        // TODO add your handling code here:
        laForm = new Acceuil();
        laForm.setVisible(true);
        dispose();
    }//GEN-LAST:event_itemRetourActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        Parametres formParam = new Parametres();
        formParam.setVisible(true);

    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void ItemDevisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemDevisActionPerformed
        // TODO add your handling code here:
        for (Commande c : lesCommandes) {
            if (lstCommande.getSelectedValue().toString().compareTo(c.getRef_dossier()) == 0) {
                uneCommande = c;
            }
        }
        for (Client cl : lesClient) {
            if (cl.getId_client() == uneCommande.getId_client()) {
                unClient = cl;
            }
        }
        try {
            ExportExcel.exportPrix(unClient, uneCommande, article, articleLoiseau, lesTele, lesCouleurs, lesPoses, lesManoeuvres);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_ItemDevisActionPerformed

    private void itemPriseMesurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPriseMesurActionPerformed
        // TODO add your handling code here:
        for (Commande c : lesCommandes) {
            if (lstCommande.getSelectedValue().toString().compareTo(c.getRef_dossier()) == 0) {
                uneCommande = c;
            }
        }
        for (Client cl : lesClient) {
            if (cl.getId_client() == uneCommande.getId_client()) {
                unClient = cl;
            }
        }
        try {
            ExportExcel.exportPrix(unClient, uneCommande, article, articleLoiseau, lesTele, lesCouleurs, lesPoses, lesManoeuvres);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_itemPriseMesurActionPerformed

    private void ItemPrestaPoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemPrestaPoseActionPerformed
        // TODO add your handling code here:
        for (Commande c : lesCommandes) {
            if (lstCommande.getSelectedValue().toString().compareTo(c.getRef_dossier()) == 0) {
                uneCommande = c;
            }
        }
        for (Client cl : lesClient) {
            if (cl.getId_client() == uneCommande.getId_client()) {
                unClient = cl;
            }
        }
        try {
            ExportExcel.exportPrestationPose(unClient, uneCommande, lesArticleLoiseau);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_ItemPrestaPoseActionPerformed

    public void completerClient(int index) {
        txtNom.setText(lesClient.get(index).getNom());
        txtTel.setText(lesClient.get(index).getTel_fix());
        txtType.setText(lesClient.get(index).getType());
        txtMail.setText(lesClient.get(index).getEmail());
    }

    public void completerCommande(int index) {

        txtAcompte.setText(String.valueOf(lesCommandes.get(index).getAcompte()));
        txtHT.setText(String.valueOf(lesCommandes.get(index).getTaux_ht()));
        txtTTC.setText(String.valueOf(lesCommandes.get(index).getPrix_ttc()));
        cbbTva.setSelectedItem(String.valueOf(lesCommandes.get(index).getTaux_tva()));

    }
    public void remplirCommande() {
        uneCommande.setAcompte(txtAcompte.getText());
        if (txtHT.getText().isEmpty()) {
            uneCommande.setTaux_ht(0);
        } else {
            uneCommande.setTaux_ht(Double.parseDouble(txtHT.getText()));
        }
        uneCommande.setType_reglement(txtReglement.getText());
        uneCommande.setPrix_ttc(Double.parseDouble(txtTTC.getText()));
        uneCommande.setTaux_tva(Double.parseDouble(cbbTva.getSelectedItem().toString()));
        uneCommande.setTemps_pose_commercial(txtTmpCommercial.getText());
        uneCommande.setTemps_pose_moeteur(txtMetreur.getText());
        uneCommande.setTemps_pose_vendu(txtVendu.getText());
        uneCommande.setDelais_prevu(txtDelai.getText());
        uneCommande.setDate_pose(txtDatePose.getText());
        
    }
    public void calculTva() {
        double resultat = 0.0;
        if (lesClient.get(lstClient.getSelectedIndex()).getType().compareTo("Revendeur") == 0) {
            for (Article_fabrication a : article) {
                resultat += a.getQuantite() * a.getPrix();
            }
            for (Article_fabrication a : articleLoiseau) {
                resultat += a.getQuantite() * a.getPrix();
            }
            resultat -= (resultat * Double.parseDouble(lesClient.get(lstClient.getSelectedIndex()).getRemise()) / 100);
            resultat = (double) (int) (resultat + 0.5);
            txtHT.setText(String.valueOf(resultat));
            resultat += (resultat * Double.parseDouble(cbbTva.getSelectedItem().toString()) / 100);
            resultat = (Math.floor(resultat * 100 + 0.5)) / 100;
            txtTTC.setText(String.valueOf(resultat));
        }
    }

    public void afficherArticle() {
        dtm = (DefaultTableModel) tblArticle.getModel();
        while (dtm.getRowCount() != 0) {
            dtm.removeRow(0);
        }
        for (Article_fabrication a : article) {
            Vector vect = new Vector();
            vect.add(a.getRef_article());
            vect.add("");
            vect.add("");
            vect.add(a.getQuantite());
            vect.add(a.getPrix());
            dtm.addRow(vect);
        }
        for (Article_fabrication a : articleLoiseau) {
            Vector vect = new Vector();
            vect.add(a.getRef_article());
            vect.add(a.getLargeur());
            vect.add(a.getHauteur());
            vect.add(a.getQuantite());
            vect.add(a.getPrix());
            dtm.addRow(vect);
        }
    }

    public Article_fabrication calculPrixGarageReno(Article_fabrication artLoiseauCmd) throws Exception {
        double prix = artLoiseauCmd.getPrix();
        prix += Double.parseDouble(lesPrixGarageReno.get(artLoiseauCmd.getHauteur()).get(artLoiseauCmd.getLargeur()).get(0));
        prix = prix * artLoiseauCmd.getQuantite();
        artLoiseauCmd.setPrix(prix);
        return artLoiseauCmd;
    }

    public Article_fabrication calculPrixGarageAntiTempete(Article_fabrication artLoiseauCmd) throws Exception {
        double prix = artLoiseauCmd.getPrix();
        prix += Double.parseDouble(lesPrixAntitempete.get(artLoiseauCmd.getHauteur()).get(artLoiseauCmd.getLargeur()).get(0));
        prix = prix * artLoiseauCmd.getQuantite();
        artLoiseauCmd.setPrix(prix);
        return artLoiseauCmd;
    }

    public Article_fabrication CalculPrixLoiseau(Article_fabrication artLoiseauCmd) throws Exception {
        double prix = 0;
        int hauteur = 0;
        int largeur = 0;
        hauteur = (int) ((artLoiseauCmd.getHauteur() / 100) + 0.5);
        hauteur = hauteur * 100;
        largeur = (int) ((artLoiseauCmd.getLargeur() / 100) + 0.5);
        largeur = largeur * 100;
        //prixEtMoteur = new Vector<>(); a verifier

        switch (artLoiseauCmd.getType_article()) {
            case 1:
                break;
            case 3:
                prix = Double.parseDouble(lesPrixCalypso.get((double) hauteur).get((double) largeur).get(0));
                prix = prix * artLoiseauCmd.getQuantite();
                for (Type_manoeuvre m : lesManoeuvres) {
                    if (m.getId_type_manoeuvre() == artLoiseauCmd.getType_manoeuvre()) {
                        prix -= m.getMoin_value() * artLoiseauCmd.getQuantite();
                    }
                }
                artLoiseauCmd.setPrix(prix);
                artLoiseauCmd.setPuissance_moteur(Integer.parseInt(lesPrixCalypso.get((double) hauteur).get((double) largeur).get(1)));
                break;
            case 2:
                prix = Double.parseDouble(lesPrixMozart.get((double) hauteur).get((double) largeur).get(0));
                prix = prix * artLoiseauCmd.getQuantite();
                for (Type_manoeuvre m : lesManoeuvres) {
                    if (m.getId_type_manoeuvre() == artLoiseauCmd.getType_manoeuvre()) {
                        prix -= m.getMoin_value() * artLoiseauCmd.getQuantite();
                    }
                }
                artLoiseauCmd.setPrix(prix);
                artLoiseauCmd.setPuissance_moteur(Integer.parseInt(lesPrixMozart.get((double) hauteur).get((double) largeur).get(1)));
                break;
            case 4:
                prix = Double.parseDouble(lesPrixTradi.get((double) hauteur).get((double) largeur).get(0));
                prix = prix * artLoiseauCmd.getQuantite();
                for (Type_manoeuvre m : lesManoeuvres) {
                    if (m.getId_type_manoeuvre() == artLoiseauCmd.getType_manoeuvre()) {
                        prix -= m.getMoin_value() * artLoiseauCmd.getQuantite();
                    }
                }
                artLoiseauCmd.setPrix(prix);
                artLoiseauCmd.setPuissance_moteur(Integer.parseInt(lesPrixTradi.get((double) hauteur).get((double) largeur).get(1)));
                break;
            case 6:
                prix = artLoiseauCmd.getHauteur() * artLoiseauCmd.getLargeur() / 1000000;

                if (prix < 1) {
                    for (Lame l : lesLames) {
                        if (l.getId_lame() == artLoiseauCmd.getType_lame()) {
                            prix = l.getPrix();
                            artLoiseauCmd.setPrix(prix);
                        }
                    }
                } else {
                    for (Lame l : lesLames) {
                        if (l.getId_lame() == artLoiseauCmd.getType_lame()) {
                            prix = l.getPrix() * prix;
                            prix = (double) (int) (prix + 0.5);
                            artLoiseauCmd.setPrix(prix);
                        }
                    }
                }
                break;
        }
        return artLoiseauCmd;
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
            java.util.logging.Logger.getLogger(SuivieCommande.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuivieCommande.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuivieCommande.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuivieCommande.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuivieCommande().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItemDecote;
    private javax.swing.JMenuItem ItemDevis;
    private javax.swing.JMenuItem ItemEtatSuivant;
    private javax.swing.JMenuItem ItemFacture;
    private javax.swing.JMenuItem ItemPrestaPose;
    private javax.swing.JMenuItem ItemSuprCommande;
    private javax.swing.JLabel Reference;
    private javax.swing.JComboBox cbbTva;
    private javax.swing.JMenuItem itemAjoutAutre;
    private javax.swing.JMenuItem itemAjoutAxe;
    private javax.swing.JMenuItem itemAjoutGarage;
    private javax.swing.JMenuItem itemAjoutOption;
    private javax.swing.JMenuItem itemAjoutPiece;
    private javax.swing.JMenuItem itemAjoutTablier;
    private javax.swing.JMenuItem itemAjoutTelecomande;
    private javax.swing.JMenuItem itemAjoutVolet;
    private javax.swing.JMenuItem itemMoteur;
    private javax.swing.JMenuItem itemNewCommande;
    private javax.swing.JMenuItem itemPriseMesur;
    private javax.swing.JMenuItem itemReset;
    private javax.swing.JMenuItem itemRetour;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JList lstClient;
    private javax.swing.JList lstCommande;
    private javax.swing.JTable tblArticle;
    private javax.swing.JTextField txtAcompte;
    private javax.swing.JTextField txtAcompte2;
    private javax.swing.JTabbedPane txtCommercial;
    private javax.swing.JTextField txtDatePose;
    private javax.swing.JTextField txtDelai;
    private javax.swing.JTextField txtHT;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtMetreur;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtRef;
    private javax.swing.JTextField txtReglement;
    private javax.swing.JTextField txtTTC;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField txtTmpCommercial;
    private javax.swing.JTextField txtType;
    private javax.swing.JTextField txtVendu;
    // End of variables declaration//GEN-END:variables
}
