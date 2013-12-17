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
public class Type_pose {
    private int id_type_pose;
    private String nom_type_pose;
    private String enroulement;
    private int rabat;

    public Type_pose() {
    }

    public Type_pose(int id_type_pose, String nom_type_pose, String enroulement, int rabat) {
        this.id_type_pose = id_type_pose;
        this.nom_type_pose = nom_type_pose;
        this.enroulement = enroulement;
        this.rabat = rabat;
    }

    /**
     * @return the id_type_pose
     */
    public int getId_type_pose() {
        return id_type_pose;
    }

    /**
     * @param id_type_pose the id_type_pose to set
     */
    public void setId_type_pose(int id_type_pose) {
        this.id_type_pose = id_type_pose;
    }

    /**
     * @return the nom_type_pose
     */
    public String getNom_type_pose() {
        return nom_type_pose;
    }

    /**
     * @param nom_type_pose the nom_type_pose to set
     */
    public void setNom_type_pose(String nom_type_pose) {
        this.nom_type_pose = nom_type_pose;
    }

    /**
     * @return the enroulement
     */
    public String getEnroulement() {
        return enroulement;
    }

    /**
     * @param enroulement the enroulement to set
     */
    public void setEnroulement(String enroulement) {
        this.enroulement = enroulement;
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
