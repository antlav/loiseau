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
public class Prix_calypso {
    private int id_prix_calypso;
    private float largeur;
    private float hauteur;
    private float prix;
    private int puissance_moteur;
    private String caisson;

    public Prix_calypso() {
    }

    public Prix_calypso(int id_prix_calypso, float largeur, float hauteur, float prix, int puissance_moteur, String caisson) {
        this.id_prix_calypso = id_prix_calypso;
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.prix = prix;
        this.puissance_moteur = puissance_moteur;
        this.caisson = caisson;
    }

    /**
     * @return the id_prix_calypso
     */
    public int getId_prix_calypso() {
        return id_prix_calypso;
    }

    /**
     * @param id_prix_calypso the id_prix_calypso to set
     */
    public void setId_prix_calypso(int id_prix_calypso) {
        this.id_prix_calypso = id_prix_calypso;
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
