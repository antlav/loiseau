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
public class Moteur {
    private int id_moteur;
    private String nom_moteur;
    private String ref_moteur;
    private String prix_moteur;
    private String quantite_moteur;

    public Moteur() {
    }

    public Moteur(int id_moteur, String nom_moteur, String ref_moteur, String prix_moteur, String quantite_moteur) {
        this.id_moteur = id_moteur;
        this.nom_moteur = nom_moteur;
        this.ref_moteur = ref_moteur;
        this.prix_moteur = prix_moteur;
        this.quantite_moteur = quantite_moteur;
    }

    /**
     * @return the id_moteur
     */
    public int getId_moteur() {
        return id_moteur;
    }

    /**
     * @param id_moteur the id_moteur to set
     */
    public void setId_moteur(int id_moteur) {
        this.id_moteur = id_moteur;
    }

    /**
     * @return the nom_moteur
     */
    public String getNom_moteur() {
        return nom_moteur;
    }

    /**
     * @param nom_moteur the nom_moteur to set
     */
    public void setNom_moteur(String nom_moteur) {
        this.nom_moteur = nom_moteur;
    }

    /**
     * @return the ref_moteur
     */
    public String getRef_moteur() {
        return ref_moteur;
    }

    /**
     * @param ref_moteur the ref_moteur to set
     */
    public void setRef_moteur(String ref_moteur) {
        this.ref_moteur = ref_moteur;
    }

    /**
     * @return the prix_moteur
     */
    public String getPrix_moteur() {
        return prix_moteur;
    }

    /**
     * @param prix_moteur the prix_moteur to set
     */
    public void setPrix_moteur(String prix_moteur) {
        this.prix_moteur = prix_moteur;
    }

    /**
     * @return the quantite_moteur
     */
    public String getQuantite_moteur() {
        return quantite_moteur;
    }

    /**
     * @param quantite_moteur the quantite_moteur to set
     */
    public void setQuantite_moteur(String quantite_moteur) {
        this.quantite_moteur = quantite_moteur;
    }
}
