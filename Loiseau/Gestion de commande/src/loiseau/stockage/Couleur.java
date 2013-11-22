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
public class Couleur {
    private int id_couleur;
    private String nom_couleur;

    public Couleur() {
    }

    public Couleur(int id_couleur, String nom_couleur) {
        this.id_couleur = id_couleur;
        this.nom_couleur = nom_couleur;
    }

    /**
     * @return the id_couleur
     */
    public int getId_couleur() {
        return id_couleur;
    }

    /**
     * @param id_couleur the id_couleur to set
     */
    public void setId_couleur(int id_couleur) {
        this.id_couleur = id_couleur;
    }

    /**
     * @return the nom_couleur
     */
    public String getNom_couleur() {
        return nom_couleur;
    }

    /**
     * @param nom_couleur the nom_couleur to set
     */
    public void setNom_couleur(String nom_couleur) {
        this.nom_couleur = nom_couleur;
    }
}
