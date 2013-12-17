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
public class Type_article {
    private int id_type_article;
    private String nom_type;

    public Type_article() {
    }

    public Type_article(int id_type_article, String nom_type) {
        this.id_type_article = id_type_article;
        this.nom_type = nom_type;
    }

    /**
     * @return the id_type_article
     */
    public int getId_type_article() {
        return id_type_article;
    }

    /**
     * @param id_type_article the id_type_article to set
     */
    public void setId_type_article(int id_type_article) {
        this.id_type_article = id_type_article;
    }

    /**
     * @return the nom_type
     */
    public String getNom_type() {
        return nom_type;
    }

    /**
     * @param nom_type the nom_type to set
     */
    public void setNom_type(String nom_type) {
        this.nom_type = nom_type;
    }
}
