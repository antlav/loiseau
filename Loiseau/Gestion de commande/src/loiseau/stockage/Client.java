/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loiseau.stockage;

/**
 *
 * @author guillaume
 */
public class Client {
    private int id_client;
    private String titre;
    private String nom;
    private String prenom;
    private String type;
    private String tel_port;
    private String tel_fix;
    private String fax;
    private String email;
    private String vendeur;
    private String site_web;
    private String remise;
    private int num_siret;
    private String divers;
    private String rue;
    private int code_postal;
    private String ville;
    private int nb_commande;

    public Client() {
    }

    public Client(int id_client, String titre, String nom, String prenom, String type, String tel_port, String tel_fix, String fax, String email, String vendeur, String site_web, String remise, int num_siret, String divers, String rue, int code_postal, String ville, int nb_commande) {
        this.id_client = id_client;
        this.titre = titre;
        this.nom = nom;
        this.prenom = prenom;
        this.type = type;
        this.tel_port = tel_port;
        this.tel_fix = tel_fix;
        this.fax = fax;
        this.email = email;
        this.vendeur = vendeur;
        this.site_web = site_web;
        this.remise = remise;
        this.num_siret = num_siret;
        this.divers = divers;
        this.rue = rue;
        this.code_postal = code_postal;
        this.ville = ville;
        this.nb_commande = nb_commande;
    }

  

    /**
     * @return the titre
     */
    public String getTitre() {
        return titre;
    }

    /**
     * @param titre the titre to set
     */
    public void setTitre(String titre) {
        this.titre = titre;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the tel_port
     */
    public String getTel_port() {
        return tel_port;
    }

    /**
     * @param tel_port the tel_port to set
     */
    public void setTel_port(String tel_port) {
        this.tel_port = tel_port;
    }

    /**
     * @return the tel_fix
     */
    public String getTel_fix() {
        return tel_fix;
    }

    /**
     * @param tel_fix the tel_fix to set
     */
    public void setTel_fix(String tel_fix) {
        this.tel_fix = tel_fix;
    }

    /**
     * @return the fax
     */
    public String getFax() {
        return fax;
    }

    /**
     * @param fax the fax to set
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the vendeur
     */
    public String getVendeur() {
        return vendeur;
    }

    /**
     * @param vendeur the vendeur to set
     */
    public void setVendeur(String vendeur) {
        this.vendeur = vendeur;
    }

    /**
     * @return the site_web
     */
    public String getSite_web() {
        return site_web;
    }

    /**
     * @param site_web the site_web to set
     */
    public void setSite_web(String site_web) {
        this.site_web = site_web;
    }

    /**
     * @return the remise
     */
    public String getRemise() {
        return remise;
    }

    /**
     * @param remise the remise to set
     */
    public void setRemise(String remise) {
        this.remise = remise;
    }

    /**
     * @return the num_siret
     */
    public int getNum_siret() {
        return num_siret;
    }

    /**
     * @param num_siret the num_siret to set
     */
    public void setNum_siret(int num_siret) {
        this.num_siret = num_siret;
    }

    /**
     * @return the divers
     */
    public String getDivers() {
        return divers;
    }

    /**
     * @param divers the divers to set
     */
    public void setDivers(String divers) {
        this.divers = divers;
    }

    /**
     * @return the rue
     */
    public String getRue() {
        return rue;
    }

    /**
     * @param rue the rue to set
     */
    public void setRue(String rue) {
        this.rue = rue;
    }

    /**
     * @return the code_postal
     */
    public int getCode_postal() {
        return code_postal;
    }

    /**
     * @param code_postal the code_postal to set
     */
    public void setCode_postal(int code_postal) {
        this.code_postal = code_postal;
    }

    /**
     * @return the ville
     */
    public String getVille() {
        return ville;
    }

    /**
     * @param ville the ville to set
     */
    public void setVille(String ville) {
        this.ville = ville;
    }

    /**
     * @return the nb_commande
     */
    public int getNb_commande() {
        return nb_commande;
    }

    /**
     * @param nb_commande the nb_commande to set
     */
    public void setNb_commande(int nb_commande) {
        this.nb_commande = nb_commande;
    }

    /**
     * @return the id_client
     */
    public int getId_client() {
        return id_client;
    }

    /**
     * @param id_client the id_client to set
     */
    public void setId_client(int id_client) {
        this.id_client = id_client;
    }
}
