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
public class Coulisse {
    private int id_coulisse;
    private String nom_coulisse;
    private double profondeur;
    private int rabat;

    public Coulisse() {
    }

    public Coulisse(int id_coulisse, String nom_coulisse, double profondeur, int rabat) {
        this.id_coulisse = id_coulisse;
        this.nom_coulisse = nom_coulisse;
        this.profondeur = profondeur;
        this.rabat = rabat;
    }

    /**
     * @return the id_coulisse
     */
    public int getId_coulisse() {
        return id_coulisse;
    }

    /**
     * @param id_coulisse the id_coulisse to set
     */
    public void setId_coulisse(int id_coulisse) {
        this.id_coulisse = id_coulisse;
    }

    /**
     * @return the nom_coulisse
     */
    public String getNom_coulisse() {
        return nom_coulisse;
    }

    /**
     * @param nom_coulisse the nom_coulisse to set
     */
    public void setNom_coulisse(String nom_coulisse) {
        this.nom_coulisse = nom_coulisse;
    }

    /**
     * @return the profondeur
     */
    public double getProfondeur() {
        return profondeur;
    }

    /**
     * @param profondeur the profondeur to set
     */
    public void setProfondeur(double profondeur) {
        this.profondeur = profondeur;
    }

    /**
     * @return the rabat
     */
    public int getRabat() {
        return rabat;
    }

    /**
     * @param rabat the rabat to set
     */
    public void setRabat(int rabat) {
        this.rabat = rabat;
    }   
}
