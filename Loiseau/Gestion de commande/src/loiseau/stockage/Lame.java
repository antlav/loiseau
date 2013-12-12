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
public class Lame {
    private int id_lame;
    private String nom_lame;
    private double prix;
    private String pas;

    public Lame() {
    }

    public Lame(int id_lame, String nom_lame, double prix, String pas) {
        this.id_lame = id_lame;
        this.nom_lame = nom_lame;
        this.prix = prix;
        this.pas = pas;
    }

    /**
     * @return the id_lame
     */
    public int getId_lame() {
        return id_lame;
    }

    /**
     * @param id_lame the id_lame to set
     */
    public void setId_lame(int id_lame) {
        this.id_lame = id_lame;
    }

    /**
     * @return the nom_lame
     */
    public String getNom_lame() {
        return nom_lame;
    }

    /**
     * @param nom_lame the nom_lame to set
     */
    public void setNom_lame(String nom_lame) {
        this.nom_lame = nom_lame;
    }

    /**
     * @return the prix
     */
    public double getPrix() {
        return prix;
    }

    /**
     * @param prix the prix to set
     */
    public void setPrix(double prix) {
        this.prix = prix;
    }

    /**
     * @return the pas
     */
    public String getPas() {
        return pas;
    }

    /**
     * @param pas the pas to set
     */
    public void setPas(String pas) {
        this.pas = pas;
    } 
}
