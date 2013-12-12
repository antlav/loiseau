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
public class Type_manoeuvre {
    private int id_type_manoeuvre;
    private String nom_type_manoeuvre;
    private int moin_value;

    public Type_manoeuvre() {
    }

    public Type_manoeuvre(int id_type_manoeuvre, String nom_type_manoeuvre, int moin_value) {
        this.id_type_manoeuvre = id_type_manoeuvre;
        this.nom_type_manoeuvre = nom_type_manoeuvre;
        this.moin_value = moin_value;
    }

    /**
     * @return the id_type_manoeuvre
     */
    public int getId_type_manoeuvre() {
        return id_type_manoeuvre;
    }

    /**
     * @param id_type_manoeuvre the id_type_manoeuvre to set
     */
    public void setId_type_manoeuvre(int id_type_manoeuvre) {
        this.id_type_manoeuvre = id_type_manoeuvre;
    }

    /**
     * @return the nom_type_manoeuvre
     */
    public String getNom_type_manoeuvre() {
        return nom_type_manoeuvre;
    }

    /**
     * @param nom_type_manoeuvre the nom_type_manoeuvre to set
     */
    public void setNom_type_manoeuvre(String nom_type_manoeuvre) {
        this.nom_type_manoeuvre = nom_type_manoeuvre;
    }

    /**
     * @return the moin_value
     */
    public int getMoin_value() {
        return moin_value;
    }

    /**
     * @param moin_value the moin_value to set
     */
    public void setMoin_value(int moin_value) {
        this.moin_value = moin_value;
    } 
}
