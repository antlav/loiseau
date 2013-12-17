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
public class Option {
    private int id_option;
    private String nom_option;
    private float prix_option;

    public Option() {
    }

    public Option(int id_option, String nom_option, float prix_option) {
        this.id_option = id_option;
        this.nom_option = nom_option;
        this.prix_option = prix_option;
    }

    /**
     * @return the id_option
     */
    public int getId_option() {
        return id_option;
    }

    /**
     * @param id_option the id_option to set
     */
    public void setId_option(int id_option) {
        this.id_option = id_option;
    }

    /**
     * @return the nom_option
     */
    public String getNom_option() {
        return nom_option;
    }

    /**
     * @param nom_option the nom_option to set
     */
    public void setNom_option(String nom_option) {
        this.nom_option = nom_option;
    }

    /**
     * @return the prix_option
     */
    public float getPrix_option() {
        return prix_option;
    }

    /**
     * @param prix_option the prix_option to set
     */
    public void setPrix_option(float prix_option) {
        this.prix_option = prix_option;
    }
}
