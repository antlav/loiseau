/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loiseau.stockage;

/**
 *
 * @author
 * Florian
 */
public class Article_fabrication {
    private int id_article_fabrication;
    private int type_article;
    private double largeur;
    private double hauteur;
    private String ref_article;
    private int quantite;
    private double prix;
    private int type_pose;
    private int couleur_tablier;
    private int couleur_coffre;
    private int couleur_coulisse;
    private int type_manoeuvre;
    private String cote_manoeuvre;
    private String type_moteur;
    private int puissance_moteur;
    private int hors_cote;
    private int type_coulisse;
    private int type_lame;
    private int telecommande;
    private int commande;
    private int client;

    public Article_fabrication() {
    }

    public Article_fabrication(int id_article_fabrication, int type_article, double largeur, double hauteur, String ref_article, int quantite, double prix, int type_pose, int couleur_tablier, int couleur_coffre, int couleur_coulisse, int type_manoeuvre, String cote_manoeuvre, String type_moteur, int puissance_moteur, int hors_cote, int type_coulisse, int type_lame, int telecommande, int commande, int client) {
        this.id_article_fabrication = id_article_fabrication;
        this.type_article = type_article;
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.ref_article = ref_article;
        this.quantite = quantite;
        this.prix = prix;
        this.type_pose = type_pose;
        this.couleur_tablier = couleur_tablier;
        this.couleur_coffre = couleur_coffre;
        this.couleur_coulisse = couleur_coulisse;
        this.type_manoeuvre = type_manoeuvre;
        this.cote_manoeuvre = cote_manoeuvre;
        this.type_moteur = type_moteur;
        this.puissance_moteur = puissance_moteur;
        this.hors_cote = hors_cote;
        this.type_coulisse = type_coulisse;
        this.type_lame = type_lame;
        this.telecommande = telecommande;
        this.commande = commande;
        this.client = client;
    }

    /**
     * @return the id_article_fabrication
     */
    public int getId_article_fabrication() {
        return id_article_fabrication;
    }

    /**
     * @param id_article_fabrication the id_article_fabrication to set
     */
    public void setId_article_fabrication(int id_article_fabrication) {
        this.id_article_fabrication = id_article_fabrication;
    }

    /**
     * @return the type_article
     */
    public int getType_article() {
        return type_article;
    }

    /**
     * @param type_article the type_article to set
     */
    public void setType_article(int type_article) {
        this.type_article = type_article;
    }

    /**
     * @return the largeur
     */
    public double getLargeur() {
        return largeur;
    }

    /**
     * @param largeur the largeur to set
     */
    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    /**
     * @return the hauteur
     */
    public double getHauteur() {
        return hauteur;
    }

    /**
     * @param hauteur the hauteur to set
     */
    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    /**
     * @return the ref_article
     */
    public String getRef_article() {
        return ref_article;
    }

    /**
     * @param ref_article the ref_article to set
     */
    public void setRef_article(String ref_article) {
        this.ref_article = ref_article;
    }

    /**
     * @return the quantite
     */
    public int getQuantite() {
        return quantite;
    }

    /**
     * @param quantite the quantite to set
     */
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    /**
     * @return the prix
     */
    public double getPrix() {
        return prix;
    }

    /**
     * @param prix the prix to set
     */
    public void setPrix(double prix) {
        this.prix = prix;
    }

    /**
     * @return the type_pose
     */
    public int getType_pose() {
        return type_pose;
    }

    /**
     * @param type_pose the type_pose to set
     */
    public void setType_pose(int type_pose) {
        this.type_pose = type_pose;
    }

    /**
     * @return the couleur_tablier
     */
    public int getCouleur_tablier() {
        return couleur_tablier;
    }

    /**
     * @param couleur_tablier the couleur_tablier to set
     */
    public void setCouleur_tablier(int couleur_tablier) {
        this.couleur_tablier = couleur_tablier;
    }

    /**
     * @return the couleur_coffre
     */
    public int getCouleur_coffre() {
        return couleur_coffre;
    }

    /**
     * @param couleur_coffre the couleur_coffre to set
     */
    public void setCouleur_coffre(int couleur_coffre) {
        this.couleur_coffre = couleur_coffre;
    }

    /**
     * @return the couleur_coulisse
     */
    public int getCouleur_coulisse() {
        return couleur_coulisse;
    }

    /**
     * @param couleur_coulisse the couleur_coulisse to set
     */
    public void setCouleur_coulisse(int couleur_coulisse) {
        this.couleur_coulisse = couleur_coulisse;
    }

    /**
     * @return the type_manoeuvre
     */
    public int getType_manoeuvre() {
        return type_manoeuvre;
    }

    /**
     * @param type_manoeuvre the type_manoeuvre to set
     */
    public void setType_manoeuvre(int type_manoeuvre) {
        this.type_manoeuvre = type_manoeuvre;
    }

    /**
     * @return the cote_manoeuvre
     */
    public String getCote_manoeuvre() {
        return cote_manoeuvre;
    }

    /**
     * @param cote_manoeuvre the cote_manoeuvre to set
     */
    public void setCote_manoeuvre(String cote_manoeuvre) {
        this.cote_manoeuvre = cote_manoeuvre;
    }

    /**
     * @return the type_moteur
     */
    public String getType_moteur() {
        return type_moteur;
    }

    /**
     * @param type_moteur the type_moteur to set
     */
    public void setType_moteur(String type_moteur) {
        this.type_moteur = type_moteur;
    }

    /**
     * @return the puissance_moteur
     */
    public int getPuissance_moteur() {
        return puissance_moteur;
    }

    /**
     * @param puissance_moteur the puissance_moteur to set
     */
    public void setPuissance_moteur(int puissance_moteur) {
        this.puissance_moteur = puissance_moteur;
    }

    /**
     * @return the hors_cote
     */
    public int getHors_cote() {
        return hors_cote;
    }

    /**
     * @param hors_cote the hors_cote to set
     */
    public void setHors_cote(int hors_cote) {
        this.hors_cote = hors_cote;
    }

    /**
     * @return the type_coulisse
     */
    public int getType_coulisse() {
        return type_coulisse;
    }

    /**
     * @param type_coulisse the type_coulisse to set
     */
    public void setType_coulisse(int type_coulisse) {
        this.type_coulisse = type_coulisse;
    }

    /**
     * @return the type_lame
     */
    public int getType_lame() {
        return type_lame;
    }

    /**
     * @param type_lame the type_lame to set
     */
    public void setType_lame(int type_lame) {
        this.type_lame = type_lame;
    }

    /**
     * @return the telecommande
     */
    public int getTelecommande() {
        return telecommande;
    }

    /**
     * @param telecommande the telecommande to set
     */
    public void setTelecommande(int telecommande) {
        this.telecommande = telecommande;
    }

    /**
     * @return the commande
     */
    public int getCommande() {
        return commande;
    }

    /**
     * @param commande the commande to set
     */
    public void setCommande(int commande) {
        this.commande = commande;
    }

    /**
     * @return the client
     */
    public int getClient() {
        return client;
    }

    /**
     * @param client the client to set
     */
    public void setClient(int client) {
        this.client = client;
    }
    
}
