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
public class Caisson {
    private int id_caisson;
    private String type_volet;
    private float hauteur;
    private int caisson;
    private String lame;

    public Caisson() {
    }

    public Caisson(int id_caisson, String type_volet, float hauteur, int caisson, String lame) {
        this.id_caisson = id_caisson;
        this.type_volet = type_volet;
        this.hauteur = hauteur;
        this.caisson = caisson;
        this.lame = lame;
    }

    /**
     * @return the id_caisson
     */
    public int getId_caisson() {
        return id_caisson;
    }

    /**
     * @param id_caisson the id_caisson to set
     */
    public void setId_caisson(int id_caisson) {
        this.id_caisson = id_caisson;
    }

    /**
     * @return the type_volet
     */
    public String getType_volet() {
        return type_volet;
    }

    /**
     * @param type_volet the type_volet to set
     */
    public void setType_volet(String type_volet) {
        this.type_volet = type_volet;
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
     * @return the caisson
     */
    public int getCaisson() {
        return caisson;
    }

    /**
     * @param caisson the caisson to set
     */
    public void setCaisson(int caisson) {
        this.caisson = caisson;
    }

    /**
     * @return the lame
     */
    public String getLame() {
        return lame;
    }

    /**
     * @param lame the lame to set
     */
    public void setLame(String lame) {
        this.lame = lame;
    }
}
