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
public class Piece {
    private int id_piece;
    private String nom_piece;
    private String ref_piece;
    private double prix_piece;
    private String valeur;
 

    public Piece() {
    }

    public Piece(int id_piece, String nom_piece, String ref_piece, double prix_piece,String valeur) {
        this.id_piece = id_piece;
        this.nom_piece = nom_piece;
        this.ref_piece = ref_piece;
        this.prix_piece = prix_piece;
        this.valeur=valeur;

    }

    /**
     * @return the id_piece
     */
    public int getId_piece() {
        return id_piece;
    }

    /**
     * @param id_piece the id_piece to set
     */
    public void setId_piece(int id_piece) {
        this.id_piece = id_piece;
    }

    /**
     * @return the nom_piece
     */
    public String getNom_piece() {
        return nom_piece;
    }

    /**
     * @param nom_piece the nom_piece to set
     */
    public void setNom_piece(String nom_piece) {
        this.nom_piece = nom_piece;
    }

    /**
     * @return the ref_piece
     */
    public String getRef_piece() {
        return ref_piece;
    }

    /**
     * @param ref_piece the ref_piece to set
     */
    public void setRef_piece(String ref_piece) {
        this.ref_piece = ref_piece;
    }

    /**
     * @return the prix_piece
     */
    public double getPrix_piece() {
        return prix_piece;
    }

    /**
     * @param prix_piece the prix_piece to set
     */
    public void setPrix_piece(double prix_piece) {
        this.prix_piece = prix_piece;
    }

    /**
     * @return the valeur
     */
    public String getValeur() {
        return valeur;
    }

    /**
     * @param valeur the valeur to set
     */
    public void setValeur(String valeur) {
        this.valeur = valeur;
    }

}
