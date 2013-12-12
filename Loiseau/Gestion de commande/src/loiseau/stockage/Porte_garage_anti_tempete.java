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
public class Porte_garage_anti_tempete {
    private int id_potre_garage_anti_tempete;
    private float hauteur;
    private float largeur;
    private float prix;

    public Porte_garage_anti_tempete() {
    }

    public Porte_garage_anti_tempete(int id_potre_garage_anti_tempete, float hauteur, float largeur, float prix) {
        this.id_potre_garage_anti_tempete = id_potre_garage_anti_tempete;
        this.hauteur = hauteur;
        this.largeur = largeur;
        this.prix = prix;
    }

    /**
     * @return the id_potre_garage_anti_tempete
     */
    public int getId_potre_garage_anti_tempete() {
        return id_potre_garage_anti_tempete;
    }

    /**
     * @param id_potre_garage_anti_tempete the id_potre_garage_anti_tempete to set
     */
    public void setId_potre_garage_anti_tempete(int id_potre_garage_anti_tempete) {
        this.id_potre_garage_anti_tempete = id_potre_garage_anti_tempete;
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
