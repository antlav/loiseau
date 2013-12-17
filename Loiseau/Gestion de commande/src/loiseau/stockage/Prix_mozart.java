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
public class Prix_mozart {
    private int id_prix_mozart;
    private float largeur;
    private float hauteur;
    private float prix;
    private int puissance_moteur;
    private String caisson;

    public Prix_mozart() {
    }

    public Prix_mozart(int id_prix_mozart, float largeur, float hauteur, float prix, int puissance_moteur, String caisson) {
        this.id_prix_mozart = id_prix_mozart;
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.prix = prix;
        this.puissance_moteur = puissance_moteur;
        this.caisson = caisson;
    }

    /**
     * @return the id_prix_mozart
     */
    public int getId_prix_mozart() {
        return id_prix_mozart;
    }

    /**
     * @param id_prix_mozart the id_prix_mozart to set
     */
    public void setId_prix_mozart(int id_prix_mozart) {
        this.id_prix_mozart = id_prix_mozart;
    }

    /**
     * @return the largeur
     */
    public float getLargeur() {
        return largeur;
    }

    /**
     * @param largeur the largeur to set
     */
    public void setLargeur(float largeur) {
        this.largeur = largeur;
    }

    /**
     * @return the hauteur
     */
    public float getHauteur() {
        return hauteur;
    }

    /**
     * @param hauteur the hauteur to set
     */
    public void setHauteur(float hauteur) {
        this.hauteur = hauteur;
    }

    /**
     * @return the prix
     */
    public float getPrix() {
        return prix;
    }

    /**
     * @param prix the prix to set
     */
    public void setPrix(float prix) {
        this.prix = prix;
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
     * @return the caisson
     */
    public String getCaisson() {
        return caisson;
    }

    /**
     * @param caisson the caisson to set
     */
    public void setCaisson(String caisson) {
        this.caisson = caisson;
    }
}
