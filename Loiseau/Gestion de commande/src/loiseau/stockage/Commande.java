/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loiseau.stockage;

import java.util.Date;

/**
 *
 * @author
 * Florian
 */
public class Commande {
    private int id_client;
    private int id_commande;
    private String ref_dossier;
    private String acompte;
    private double taux_tva;
    private double taux_ht;
    private double prix_ttc;
    private String type_reglement;
    private int etat_commande;
    private String temps_pose_moeteur;
    private String temps_pose_commercial;
    private String temps_pose_vendu;
    private String delais_prevu;
    private String date_pose;

    public Commande() {
    }

    public Commande(int id_client, int id_commande, String ref_dossier, String acompte, double taux_tva, double taux_ht, double prix_ttc, String type_reglement, int etat_commande, String temps_pose_moeteur, String temps_pose_commercial, String temps_pose_vendu, String delais_prevu, String date_pose) {
        this.id_client = id_client;
        this.id_commande = id_commande;
        this.ref_dossier = ref_dossier;
        this.acompte = acompte;
        this.taux_tva = taux_tva;
        this.taux_ht = taux_ht;
        this.prix_ttc = prix_ttc;
        this.type_reglement = type_reglement;
        this.etat_commande = etat_commande;
        this.temps_pose_moeteur = temps_pose_moeteur;
        this.temps_pose_commercial = temps_pose_commercial;
        this.temps_pose_vendu = temps_pose_vendu;
        this.delais_prevu = delais_prevu;
        this.date_pose = date_pose;
    }

    /**
     * @return the id_commande
     */
    public int getId_commande() {
        return id_commande;
    }

    /**
     * @param id_commande the id_commande to set
     */
    public void setId_commande(int id_commande) {
        this.id_commande = id_commande;
    }

    /**
     * @return the ref_dossier
     */
    public String getRef_dossier() {
        return ref_dossier;
    }

    /**
     * @param ref_dossier the ref_dossier to set
     */
    public void setRef_dossier(String ref_dossier) {
        this.ref_dossier = ref_dossier;
    }

    /**
     * @return the acompte
     */
    public String getAcompte() {
        return acompte;
    }

    /**
     * @param acompte the acompte to set
     */
    public void setAcompte(String acompte) {
        this.acompte = acompte;
    }

    /**
     * @return the taux_tva
     */
    public double getTaux_tva() {
        return taux_tva;
    }

    /**
     * @param taux_tva the taux_tva to set
     */
    public void setTaux_tva(double taux_tva) {
        this.taux_tva = taux_tva;
    }

    /**
     * @return the taux_ht
     */
    public double getTaux_ht() {
        return taux_ht;
    }

    /**
     * @param taux_ht the taux_ht to set
     */
    public void setTaux_ht(double taux_ht) {
        this.taux_ht = taux_ht;
    }

    /**
     * @return the prix_ttc
     */
    public double getPrix_ttc() {
        return prix_ttc;
    }

    /**
     * @param prix_ttc the prix_ttc to set
     */
    public void setPrix_ttc(double prix_ttc) {
        this.prix_ttc = prix_ttc;
    }

    /**
     * @return the type_reglement
     */
    public String getType_reglement() {
        return type_reglement;
    }

    /**
     * @param type_reglement the type_reglement to set
     */
    public void setType_reglement(String type_reglement) {
        this.type_reglement = type_reglement;
    }

    /**
     * @return the etat_commande
     */
    public int getEtat_commande() {
        return etat_commande;
    }

    /**
     * @param etat_commande the etat_commande to set
     */
    public void setEtat_commande(int etat_commande) {
        this.etat_commande = etat_commande;
    }

    /**
     * @return the temps_pose_moeteur
     */
    public String getTemps_pose_moeteur() {
        return temps_pose_moeteur;
    }

    /**
     * @param temps_pose_moeteur the temps_pose_moeteur to set
     */
    public void setTemps_pose_moeteur(String temps_pose_moeteur) {
        this.temps_pose_moeteur = temps_pose_moeteur;
    }

    /**
     * @return the temps_pose_commercial
     */
    public String getTemps_pose_commercial() {
        return temps_pose_commercial;
    }

    /**
     * @param temps_pose_commercial the temps_pose_commercial to set
     */
    public void setTemps_pose_commercial(String temps_pose_commercial) {
        this.temps_pose_commercial = temps_pose_commercial;
    }

    /**
     * @return the temps_pose_vendu
     */
    public String getTemps_pose_vendu() {
        return temps_pose_vendu;
    }

    /**
     * @param temps_pose_vendu the temps_pose_vendu to set
     */
    public void setTemps_pose_vendu(String temps_pose_vendu) {
        this.temps_pose_vendu = temps_pose_vendu;
    }

    /**
     * @return the delais_prevu
     */
    public String getDelais_prevu() {
        return delais_prevu;
    }

    /**
     * @param delais_prevu the delais_prevu to set
     */
    public void setDelais_prevu(String delais_prevu) {
        this.delais_prevu = delais_prevu;
    }

    /**
     * @return the date_pose
     */
    public String getDate_pose() {
        return date_pose;
    }

    /**
     * @param date_pose the date_pose to set
     */
    public void setDate_pose(String date_pose) {
        this.date_pose = date_pose;
    }

    /**
     * @return the id_client
     */
    public int getId_client() {
        return id_client;
    }

    /**
     * @param id_client the id_client to set
     */
    public void setId_client(int id_client) {
        this.id_client = id_client;
    }
}
