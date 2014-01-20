/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loiseau.metier;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Vector;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.Number;
import jxl.write.WritableImage;
import loiseau.stockage.Article_fabrication;
import loiseau.stockage.Client;
import loiseau.stockage.Commande;
import loiseau.stockage.Couleur;
import loiseau.stockage.Type_manoeuvre;
import loiseau.stockage.Type_pose;
import loiseau.stockage.telecommande;

/**
 *
 * @author guillaume
 */
public class ExportExcel {

    private static Number number;
    private static Label label;
    private static Param mesParam=new Param();
/**
 * Methode pour exporter la facture d'une commande
 * @param unClient
 * @param uneCommade
 * @param desArticle
 * @param desArticleLoiseau
 * @throws Exception 
 */
    public static void exportFacture(Client unClient, Commande uneCommade,
            Vector<Article_fabrication> desArticle,
            Vector<Article_fabrication> desArticleLoiseau) throws Exception {
        Locale locale = Locale.getDefault();
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT, locale);
        Date aujourdhui = new Date();
        int compteur = 22;
        InputStream xlsRefStream = new FileInputStream(mesParam.getParam("factureModel")+"/Facture.xls");
        Workbook refWorkbook = Workbook.getWorkbook(xlsRefStream);
        File outFile = new File(mesParam.getParam("folderCommandePath")+uneCommade.getRef_dossier() +"/Facture.xls");
        WritableWorkbook outWorkbook = Workbook.createWorkbook(outFile, refWorkbook);
        WritableSheet out = outWorkbook.getSheet(0);

        label = new Label(1, 5, dateFormat.format(aujourdhui));
        label.setCellFormat(out.getCell(1, 5).getCellFormat());
        out.addCell(label);
        label = new Label(1, 7, uneCommade.getRef_dossier());
        label.setCellFormat(out.getCell(1, 7).getCellFormat());
        out.addCell(label);
        label = new Label(4, 3, unClient.getNom().concat(" " + unClient.getPrenom()));
        label.setCellFormat(out.getCell(4, 3).getCellFormat());
        out.addCell(label);
        label = new Label(4, 4, unClient.getRue());
        label.setCellFormat(out.getCell(4, 4).getCellFormat());
        out.addCell(label);
        label = new Label(4, 5, unClient.getCode_postal().concat(" " + unClient.getVille()));
        label.setCellFormat(out.getCell(4, 5).getCellFormat());
        out.addCell(label);
        if (unClient.getType().compareTo("Revendeur") == 0) {
            number = new Number(5, 49, uneCommade.getTaux_tva());
            number.setCellFormat(out.getCell(5, 49).getCellFormat());
            out.addCell(number);
            number = new Number(5, 48, uneCommade.getTaux_ht());
            number.setCellFormat(out.getCell(5, 48).getCellFormat());
            out.addCell(number);
        }
        label = new Label(7, 52, uneCommade.getAcompte());
        label.setCellFormat(out.getCell(7, 52).getCellFormat());
        out.addCell(label);
        number = new Number(7, 51, uneCommade.getPrix_ttc());
        number.setCellFormat(out.getCell(7, 51).getCellFormat());
        out.addCell(number);
        for (Article_fabrication a : desArticleLoiseau) {
            label = new Label(0, compteur, a.getNom());
            label.setCellFormat(out.getCell(0, compteur).getCellFormat());
            out.addCell(label);
            number = new Number(4, compteur, a.getLargeur());
            number.setCellFormat(out.getCell(4, compteur).getCellFormat());
            out.addCell(number);
            number = new Number(5, compteur, a.getHauteur());
            number.setCellFormat(out.getCell(5, compteur).getCellFormat());
            out.addCell(number);
            number = new Number(6, compteur, a.getQuantite());
            number.setCellFormat(out.getCell(6, compteur).getCellFormat());
            out.addCell(number);
            number = new Number(7, compteur, a.getQuantite() * a.getPrix());
            number.setCellFormat(out.getCell(7, compteur).getCellFormat());
            out.addCell(number);
            compteur++;
        }
        for (Article_fabrication a : desArticle) {
            label = new Label(0, compteur, a.getNom());
            label.setCellFormat(out.getCell(0, compteur).getCellFormat());
            out.addCell(label);
            number = new Number(4, compteur, a.getLargeur());
            number.setCellFormat(out.getCell(4, compteur).getCellFormat());
            out.addCell(number);
            number = new Number(5, compteur, a.getHauteur());
            number.setCellFormat(out.getCell(5, compteur).getCellFormat());
            out.addCell(number);
            number = new Number(6, compteur, a.getQuantite());
            number.setCellFormat(out.getCell(6, compteur).getCellFormat());
            out.addCell(number);
            number = new Number(7, compteur, a.getQuantite() * a.getPrix());
            number.setCellFormat(out.getCell(7, compteur).getCellFormat());
            out.addCell(number);
            compteur++;
        }
        outWorkbook.write();
        outWorkbook.close();
    }
/**
 * Methode pour exporter la prise de mesure d'une commande
 * @param unClient
 * @param uneCommade
 * @param lesArticles
 * @throws Exception 
 */
    public static void exportPriseMesure(Client unClient, Commande uneCommade,
            Vector<Article_fabrication> lesArticles) throws Exception {
        String adresse;
        String reference = uneCommade.getRef_dossier();
        String article = "";
        int cpt = 24;
        Locale locale = Locale.getDefault();
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT, locale);
        Date aujourdhui = new Date();

        InputStream xlsRefStream = new FileInputStream("FileModel\\Prestation prise de mesure.xls");
        Workbook refWorkbook = Workbook.getWorkbook(xlsRefStream);
        File outFile = new File("Export\\Prise Mesure " + reference + ".xls");
        WritableWorkbook outWorkbook = Workbook.createWorkbook(outFile, refWorkbook);
        WritableSheet out = outWorkbook.getSheet(0);
        label = new Label(1, 15, dateFormat.format(aujourdhui));
        out.addCell(label);
        label = new Label(2, 17, unClient.getNom());
        out.addCell(label);
        adresse = unClient.getRue();
        adresse = adresse.concat(unClient.getCode_postal());
        adresse = adresse.concat(unClient.getVille());
        label = new Label(1, 19, adresse);
        out.addCell(label);
        label = new Label(1, 21, unClient.getTel_fix());
        out.addCell(label);

        for (Article_fabrication a : lesArticles) {
            article = a.getNom();
            article = article.concat(" " + String.valueOf(a.getLargeur()) + "X"
                    + String.valueOf(a.getHauteur()));
            label = new Label(1, cpt, article);
            out.addCell(label);
            cpt++;
        }
        outWorkbook.write();
        outWorkbook.close();
    }
/**
 * Methode pour exporter les prix d'une commande
 * @param unClient
 * @param uneCommade
 * @param desArticle
 * @param desArticleLoiseau
 * @param desTele
 * @param lesCouleurs
 * @param lesposes
 * @param lesManoeuvres
 * @throws Exception 
 */
    public static void exportPrix(Client unClient, Commande uneCommade,
            Vector<Article_fabrication> desArticle, Vector<Article_fabrication> desArticleLoiseau,
            Vector<telecommande> desTele, Vector<Couleur> lesCouleurs, Vector<Type_pose> lesposes,
            Vector<Type_manoeuvre> lesManoeuvres) throws Exception {
        int compteur = 13;
        double prix = 0;
        Locale locale = Locale.getDefault();
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT, locale);
        Date aujourdhui = new Date();
        WritableImage image = new WritableImage(0, 3, 6, 6, new File("FileModel\\logoRDP.png"));
        InputStream xlsRefStream = new FileInputStream("FileModel\\Remise de prix.xls");
        Workbook refWorkbook = Workbook.getWorkbook(xlsRefStream);
        File outFile = new File("Export\\Remise de prix  " + uneCommade.getRef_dossier() + ".xls");
        WritableWorkbook outWorkbook = Workbook.createWorkbook(outFile, refWorkbook);
        WritableSheet out = outWorkbook.getSheet(0);
        out.addImage(image);
        label = new Label(14, 5, unClient.getNom().concat(" " + unClient.getPrenom()));
        label.setCellFormat(out.getCell(14, 5).getCellFormat());
        out.addCell(label);
        label = new Label(14, 4, dateFormat.format(aujourdhui));
        label.setCellFormat(out.getCell(14, 4).getCellFormat());
        out.addCell(label);

        label = new Label(14, 6, uneCommade.getRef_dossier());
        label.setCellFormat(out.getCell(14, 6).getCellFormat());
        out.addCell(label);
        label = new Label(14, 7, unClient.getFax());
        label.setCellFormat(out.getCell(14, 7).getCellFormat());
        out.addCell(label);
        label = new Label(14, 8, unClient.getEmail());
        label.setCellFormat(out.getCell(14, 8).getCellFormat());
        out.addCell(label);
        if (unClient.getType().compareTo("Revendeur") == 0) {
            number = new Number(25, 31, uneCommade.getTaux_tva());
            number.setCellFormat(out.getCell(25, 31).getCellFormat());
            out.addCell(number);
            number = new Number(25, 29, uneCommade.getTaux_ht());
            number.setCellFormat(out.getCell(25, 29).getCellFormat());
            out.addCell(number);
        }
        number = new Number(25, 33, uneCommade.getPrix_ttc());
        number.setCellFormat(out.getCell(25, 33).getCellFormat());
        out.addCell(number);
        for (Article_fabrication a : desArticleLoiseau) {
            label = new Label(0, compteur, a.getNom());
            label.setCellFormat(out.getCell(0, compteur).getCellFormat());
            out.addCell(label);
            number = new Number(6, compteur, a.getLargeur());
            number.setCellFormat(out.getCell(6, compteur).getCellFormat());
            out.addCell(number);
            number = new Number(7, compteur, a.getHauteur());
            number.setCellFormat(out.getCell(7, compteur).getCellFormat());
            out.addCell(number);
            for (Couleur c : lesCouleurs) {
                if (a.getCouleur_coffre() == c.getId_couleur()) {
                    label = new Label(8, compteur, c.getNom_couleur());
                    label.setCellFormat(out.getCell(8, compteur).getCellFormat());
                    out.addCell(label);
                }
                if (a.getCouleur_tablier() == c.getId_couleur()) {
                    label = new Label(10, compteur, c.getNom_couleur());
                    label.setCellFormat(out.getCell(10, compteur).getCellFormat());
                    out.addCell(label);
                }
                if (a.getCouleur_coulisse() == c.getId_couleur()) {
                    label = new Label(12, compteur, c.getNom_couleur());
                    label.setCellFormat(out.getCell(12, compteur).getCellFormat());
                    out.addCell(label);
                }
            }
            for (Type_manoeuvre m : lesManoeuvres) {
                if (m.getId_type_manoeuvre() == a.getType_manoeuvre()) {
                    label = new Label(13, compteur, m.getNom_type_manoeuvre());
                    label.setCellFormat(out.getCell(13, compteur).getCellFormat());
                    out.addCell(label);

                }
            }
            if (a.getCote_manoeuvre().compareTo("Droite") == 0) {
                label = new Label(15, compteur, "D");
                label.setCellFormat(out.getCell(15, compteur).getCellFormat());
                out.addCell(label);
            }
            if (a.getCote_manoeuvre().compareTo("Gauche") == 0) {
                label = new Label(15, compteur, "G");
                label.setCellFormat(out.getCell(15, compteur).getCellFormat());
                out.addCell(label);
            }
            for (Type_pose p : lesposes) {
                if (p.getId_type_pose() == a.getType_pose()) {
                    label = new Label(16, compteur, p.getNom_type_pose());
                    label.setCellFormat(out.getCell(16, compteur).getCellFormat());
                    out.addCell(label);
                }
            }
            for (telecommande t : desTele) {
                if (t.getId_telecommande() == a.getId_article_fabrication()) {
                    label = new Label(18, compteur, t.getNom_telecommande());
                    label.setCellFormat(out.getCell(18, compteur).getCellFormat());
                    out.addCell(label);
                }
            }
            number = new Number(24, compteur, a.getQuantite());
            number.setCellFormat(out.getCell(24, compteur).getCellFormat());
            out.addCell(number);
            prix = a.getPrix() * a.getQuantite();
            prix -= prix * Double.parseDouble(unClient.getRemise()) / 100;
            number = new Number(25, compteur, prix);
            number.setCellFormat(out.getCell(25, compteur).getCellFormat());
            out.addCell(number);
            compteur++;

        }
        for (Article_fabrication a : desArticle) {
            label = new Label(0, compteur, a.getNom());
            label.setCellFormat(out.getCell(0, compteur).getCellFormat());
            out.addCell(label);
            number = new Number(24, compteur, a.getQuantite());
            number.setCellFormat(out.getCell(24, compteur).getCellFormat());
            out.addCell(number);
            prix = a.getPrix() * a.getQuantite();
            prix -= prix * Double.parseDouble(unClient.getRemise()) / 100;
            number = new Number(25, compteur, prix);
            number.setCellFormat(out.getCell(25, compteur).getCellFormat());
            out.addCell(number);

            number = new Number(6, compteur, a.getLargeur());
            number.setCellFormat(out.getCell(6, compteur).getCellFormat());
            out.addCell(number);
            number = new Number(7, compteur, a.getHauteur());
            number.setCellFormat(out.getCell(7, compteur).getCellFormat());
            out.addCell(number);

            compteur++;
        }
        outWorkbook.write();
        outWorkbook.close();
    }
/**
 * Methode pour exporter la prestation de psoe d'une commande
 * @param unClient
 * @param uneCommade
 * @param lesArticles
 * @throws Exception 
 */
    public static void exportPrestationPose(Client unClient, Commande uneCommade,
            Vector<Article_fabrication> lesArticles) throws Exception {
        String reference = uneCommade.getRef_dossier();
        String article = "";
        String adresse;
        int cpt = 23;

        Locale locale = Locale.getDefault();
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT, locale);
        Date aujourdhui = new Date();
        InputStream xlsRefStream = new FileInputStream("FileModel\\Prestation pose.xls");
        Workbook refWorkbook = Workbook.getWorkbook(xlsRefStream);
        File outFile = new File("Export\\prestation de pose  " + reference + ".xls");
        WritableWorkbook outWorkbook = Workbook.createWorkbook(outFile, refWorkbook);
        WritableSheet out = outWorkbook.getSheet(0);

        label = new Label(1, 14, dateFormat.format(aujourdhui));
        out.addCell(label);
        label = new Label(2, 16, unClient.getNom());
        out.addCell(label);
        adresse = unClient.getRue();
        adresse = adresse.concat(unClient.getCode_postal());
        adresse = adresse.concat(unClient.getVille());
        label = new Label(1, 18, adresse);
        out.addCell(label);
        label = new Label(1, 20, unClient.getTel_fix());
        out.addCell(label);
        label = new Label(4, 34, uneCommade.getDate_pose());
        out.addCell(label);
        label = new Label(5, 36, uneCommade.getTemps_pose_commercial());
        out.addCell(label);
        label = new Label(5, 38, uneCommade.getTemps_pose_moeteur());
        out.addCell(label);
        for (Article_fabrication a : lesArticles) {
            article = a.getNom();
            article = article.concat(" " + String.valueOf(a.getLargeur()) + "X"
                    + String.valueOf(a.getHauteur()));
            label = new Label(1, cpt, article);
            out.addCell(label);
            cpt++;
        }
        outWorkbook.write();
        outWorkbook.close();

    }
/**
 * Methode pour exporter la décote d'une commande
 * @param deCote
 * @param art
 * @param infosArticle
 * @param ligne
 * @param option
 * @throws Exception 
 */
    public static void exportDecote(HashMap<String, Double> deCote, Article_fabrication art,
            HashMap<String, String> infosArticle, int ligne, Vector<String> option) throws Exception {
        Locale locale = Locale.getDefault();
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT, locale);
        Date aujourdhui = new Date();
        InputStream xlsRefStream;
        int cptOption = 0;
        if (ligne == 3) {
            xlsRefStream = new FileInputStream("FileModel\\NouvelleDecote.xls");
        } else {
            xlsRefStream = new FileInputStream("Export\\Decote " + infosArticle.get("reference") + ".xls");
        }
        Workbook refWorkbook = Workbook.getWorkbook(xlsRefStream);
        File outFile = new File("Export\\Decote " + infosArticle.get("reference") + ".xls");
        WritableWorkbook outWorkbook = Workbook.createWorkbook(outFile, refWorkbook);
        WritableSheet out = outWorkbook.getSheet(0);


        label = new Label(0, 0, "Decote de la commande " + infosArticle.get("reference"));
        label.setCellFormat(out.getCell(0, 0).getCellFormat());
        out.addCell(label);

        label = new Label(2, 14, infosArticle.get("reference"));
        label.setCellFormat(out.getCell(2, 14).getCellFormat());
        out.addCell(label);

        label = new Label(2, 15, dateFormat.format(aujourdhui));
        label.setCellFormat(out.getCell(2, 15).getCellFormat());
        out.addCell(label);

        label = new Label(2, 16, infosArticle.get("nbproduit"));
        label.setCellFormat(out.getCell(2, 16).getCellFormat());
        out.addCell(label);
        if (infosArticle.containsKey("nom")) {
            if (infosArticle.containsKey("prenom")) {
                label = new Label(12, 14, infosArticle.get("nom") + " " + infosArticle.get("prenom"));
                label.setCellFormat(out.getCell(12, 14).getCellFormat());
                out.addCell(label);
            } else {
                label = new Label(12, 14, infosArticle.get("nom"));
                label.setCellFormat(out.getCell(12, 14).getCellFormat());
                out.addCell(label);
            }
        }

        label = new Label(12, 15, infosArticle.get("telephone"));
        label.setCellFormat(out.getCell(12, 15).getCellFormat());
        out.addCell(label);
        label = new Label(12, 16, infosArticle.get("mail"));
        label.setCellFormat(out.getCell(12, 16).getCellFormat());
        out.addCell(label);

        label = new Label(0, ligne, art.getNom());
        label.setCellFormat(out.getCell(0, ligne).getCellFormat());
        out.addCell(label);
        if (deCote.containsKey("largeurCaisson")) {
            number = new Number(15, ligne, deCote.get("largeurCaisson"));
            number.setCellFormat(out.getCell(15, ligne).getCellFormat());
            out.addCell(number);
        }
        if (deCote.containsKey("hauteurCaisson")) {
            number = new Number(14, ligne, deCote.get("hauteurCaisson"));
            number.setCellFormat(out.getCell(14, ligne).getCellFormat());
            out.addCell(number);
        }
        if (deCote.containsKey("hauteurCoulisse")) {
            number = new Number(12, ligne, deCote.get("hauteurCoulisse"));
            number.setCellFormat(out.getCell(12, ligne).getCellFormat());
            out.addCell(number);
        }
        if (deCote.containsKey("largeurLame")) {
            number = new Number(8, ligne, deCote.get("largeurLame"));
            number.setCellFormat(out.getCell(8, ligne).getCellFormat());
            out.addCell(number);
        }
        if (deCote.containsKey("lameAjourer")) {
            number = new Number(6, ligne, deCote.get("lameAjourer"));
            number.setCellFormat(out.getCell(6, ligne).getCellFormat());
            out.addCell(number);
        }
        if (deCote.containsKey("axe")) {
            number = new Number(10, ligne, deCote.get("axe"));
            number.setCellFormat(out.getCell(10, ligne).getCellFormat());
            out.addCell(number);
        }
        if (deCote.containsKey("quantite")) {
            number = new Number(3, ligne, deCote.get("quantite"));
            number.setCellFormat(out.getCell(3, ligne).getCellFormat());
            out.addCell(number);
        }
        if (deCote.containsKey("hauteur")) {
            number = new Number(2, ligne, deCote.get("hauteur"));
            number.setCellFormat(out.getCell(2, ligne).getCellFormat());
            out.addCell(number);
        }
        if (deCote.containsKey("largeur")) {
            number = new Number(1, ligne, deCote.get("largeur"));
            number.setCellFormat(out.getCell(1, ligne).getCellFormat());
            out.addCell(number);
        }
        if (deCote.containsKey("nombreLame")) {
            number = new Number(7, ligne, deCote.get("nombreLame"));
            number.setCellFormat(out.getCell(7, ligne).getCellFormat());
            out.addCell(number);
        }
        if (deCote.containsKey("lameNonAjourer")) {
            number = new Number(5, ligne, deCote.get("lameNonAjourer"));
            number.setCellFormat(out.getCell(5, ligne).getCellFormat());
            out.addCell(number);
        }
        if (infosArticle.containsKey("couleurcoffre")) {
            label = new Label(16, ligne, infosArticle.get("couleurcoffre"));
            label.setCellFormat(out.getCell(16, ligne).getCellFormat());
            out.addCell(label);
        }
        if (infosArticle.containsKey("couleurtablier")) {
            label = new Label(9, ligne, infosArticle.get("couleurtablier"));
            label.setCellFormat(out.getCell(9, ligne).getCellFormat());
            out.addCell(label);
        }
        if (infosArticle.containsKey("couleurcoulisse")) {
            label = new Label(13, ligne, infosArticle.get("couleurcoulisse"));
            label.setCellFormat(out.getCell(13, ligne).getCellFormat());
            out.addCell(label);
        }
        if (infosArticle.containsKey("lame")) {
            label = new Label(4, ligne, infosArticle.get("lame"));
            label.setCellFormat(out.getCell(4, ligne).getCellFormat());
            out.addCell(label);
        }
        if (infosArticle.containsKey("coulisse")) {
            label = new Label(11, ligne, infosArticle.get("coulisse"));
            label.setCellFormat(out.getCell(11, ligne).getCellFormat());
            out.addCell(label);
        }
        if (infosArticle.containsKey("pose")) {
            label = new Label(17, ligne, infosArticle.get("pose"));
            label.setCellFormat(out.getCell(17, ligne).getCellFormat());
            out.addCell(label);
        }
        if (infosArticle.containsKey("typemanoeuvre")) {
            label = new Label(18, ligne, infosArticle.get("typemanoeuvre"));
            label.setCellFormat(out.getCell(18, ligne).getCellFormat());
            out.addCell(label);
        }
        if (infosArticle.containsKey("cotemanoeuvre")) {
            label = new Label(19, ligne, infosArticle.get("cotemanoeuvre"));
            label.setCellFormat(out.getCell(19, ligne).getCellFormat());
            out.addCell(label);
        }
        if (infosArticle.containsKey("telecomande")) {
            label = new Label(0, ligne + 17, infosArticle.get("telecomande"));
            label.setCellFormat(out.getCell(0, ligne + 17).getCellFormat());
            out.addCell(label);
        }
        cptOption = 20;
        for (String s : option) {
            label = new Label(12, cptOption, s);
            label.setCellFormat(out.getCell(12, cptOption).getCellFormat());
            out.addCell(label);
            cptOption++;
        }
        outWorkbook.write();
        outWorkbook.close();
    }
}
