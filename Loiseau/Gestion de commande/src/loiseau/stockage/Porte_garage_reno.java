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
public class Porte_garage_reno {
    private int id_porte_garage_reno;
    private float hauteur;
    private float largeur;
    private float prix;

    public Porte_garage_reno() {
    }

    public Porte_garage_reno(int id_porte_garage_reno, float hauteur, float largeur, float prix) {
        this.id_porte_garage_reno = id_porte_garage_reno;
        this.hauteur = hauteur;
        this.largeur = largeur;
        this.prix = prix;
    }

    /**
     * @return the id_porte_garage_reno
     */
    public int getId_porte_garage_reno() {
        return id_porte_garage_reno;
    }

    /**
     * @param id_porte_garage_reno the id_porte_garage_reno to set
     */
    public void setId_porte_garage_reno(int id_porte_garage_reno) {
        this.id_porte_garage_reno = id_porte_garage_reno;
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
}
