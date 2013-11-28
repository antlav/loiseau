/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loiseau.metier;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe de gestion de la comunication avec la base de données
 *
 * @author guillaume
 */
public class DialogueBdd {

    static private PreparedStatement stm;
    static private ResultSet rs;
/**
 * Methode pour utiliser SELECT en SQL
 * @param query le requéte SQL pour questioner la base de données 
 * @return la reponse de la base de données
 * @throws Exception 
 */
    public static ResultSet select(String query) throws Exception {
        try {
            stm = ConectionBdd.getInstance().prepareStatement(query);
            rs = stm.executeQuery();

        } catch (Exception e) {
            throw new Exception(e);
        }
        return rs;
    }
/**
 * Methode pour utiliser INSERT en SQL
 * @param query le requéte SQL pour questioner la base de données 
 * @param v le vector de champs de votre requéte
 * @return la reponse de la base de données
 * @throws Exception 
 */
    public static ResultSet insert(String query, Vector<Object> v) throws Exception {
        int cpt = 1;
        try {
            stm = ConectionBdd.getInstance().prepareStatement(query);
            for (Object o: v) {
                stm.setObject(cpt, o);
                cpt++;
            }
            stm.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DialogueBdd.class.getName()).log(Level.SEVERE, null, ex);

        }
        return stm.getGeneratedKeys();
    }
/**
 * Methode pour utiliser UPDATE en SQL
 * @param query le requéte SQL pour questioner la base de données
 * @param v le vector de champs de votre requéte
 * @throws Exception 
 */
    public static void update(String query, Vector<Object> v) throws Exception {
        int cpt = 1;
        try {
            stm = ConectionBdd.getInstance().prepareStatement(query);
            for (Object o : v) {
                stm.setObject(cpt, o);
                cpt++;
            }
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DialogueBdd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
 * Methode pour utiliser DELETE en SQL
 * @param query la requéte SQL pour questioner la base de données
 * @param id l'identifiant de la ligne a suprimer
 * @throws Exception 
 */
    public static void delete(String query,int id)throws Exception{
        stm= ConectionBdd.getInstance().prepareStatement(query);
        stm.setInt(1, id);
        stm.executeUpdate();
    }
}
