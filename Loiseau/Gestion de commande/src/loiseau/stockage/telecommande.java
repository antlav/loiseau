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
public class telecommande {
    private int id_telecommande;
    private String nom_telecommande;
    private double prix_telecommande;
    private String ref_telecommande;

    public telecommande() {
    }

    public telecommande(int id_telecommande, String nom_telecommande, double prix_telecommande, String ref_telecommande) {
        this.id_telecommande = id_telecommande;
        this.nom_telecommande = nom_telecommande;
        this.prix_telecommande = prix_telecommande;
        this.ref_telecommande = ref_telecommande;
    }

    /**
     * @return the id_telecommande
     */
    public int getId_telecommande() {
        return id_telecommande;
    }

    /**
     * @param id_telecommande the id_telecommande to set
     */
    public void setId_telecommande(int id_telecommande) {
        this.id_telecommande = id_telecommande;
    }

    /**
     * @return the nom_telecommande
     */
    public String getNom_telecommande() {
        return nom_telecommande;
    }

    /**
     * @param nom_telecommande the nom_telecommande to set
     */
    public void setNom_telecommande(String nom_telecommande) {
        this.nom_telecommande = nom_telecommande;
    }

    /**
     * @return the prix_telecommande
     */
    public double getPrix_telecommande() {
        return prix_telecommande;
    }

    /**
     * @param prix_telecommande the prix_telecommande to set
     */
    public void setPrix_telecommande(double prix_telecommande) {
        this.prix_telecommande = prix_telecommande;
    }

    /**
     * @return the ref_telecommande
     */
    public String getRef_telecommande() {
        return ref_telecommande;
    }

    /**
     * @param ref_telecommande the ref_telecommande to set
     */
    public void setRef_telecommande(String ref_telecommande) {
        this.ref_telecommande = ref_telecommande;
    }   
}
