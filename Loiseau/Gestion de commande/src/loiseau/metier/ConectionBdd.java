/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loiseau.metier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import loiseau.metier.Param;

/**
 * Classe de gestion de la connection a la base de données
 *
 * @author guillaume Pacquet
 */
public class ConectionBdd {

    private static Param mesParam;
    private static String url;
    private static String user;
    private static String passwd;
    private static Connection connect;

    /**
     * methode pour se connecter a la BDD.
     *
     * @return la connection a la base de données
     * @throws Exception
     */
    public static Connection getInstance() throws Exception {
        if (connect == null) {
            try {
                url = mesParam.getParam("bddPath");
                user = mesParam.getParam("bddUser");
                passwd = mesParam.getParam("bddPass");
                connect = DriverManager.getConnection(url, user, passwd);
            } catch (SQLException e) {
                throw new Exception("impossible de se connceter à la base de données");
            }
        }
        return connect;
    }
}
