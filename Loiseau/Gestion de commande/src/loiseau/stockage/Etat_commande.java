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
public class Etat_commande {
    private int id_etat_commande;
    private String nom_etet;

    public Etat_commande() {
    }

    public Etat_commande(int id_etat_commande, String nom_etet) {
        this.id_etat_commande = id_etat_commande;
        this.nom_etet = nom_etet;
    }

    /**
     * @return the id_etat_commande
     */
    public int getId_etat_commande() {
        return id_etat_commande;
    }

    /**
     * @param id_etat_commande the id_etat_commande to set
     */
    public void setId_etat_commande(int id_etat_commande) {
        this.id_etat_commande = id_etat_commande;
    }

    /**
     * @return the nom_etet
     */
    public String getNom_etet() {
        return nom_etet;
    }

    /**
     * @param nom_etet the nom_etet to set
     */
    public void setNom_etet(String nom_etet) {
        this.nom_etet = nom_etet;
    }
}
