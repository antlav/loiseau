/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loiseau.metier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *Classe de gestion de la connection a la base de données
 * @author guillaume Pacquet
 */
public class ConectionBdd {

    private static String url = "jdbc:mysql://localhost/paka";
    private static String user = "root";
    private static String passwd = "password";
    private static Connection connect;
/**
 * methode pour se connecter a la Base de données.
 * @return la connection a la base de données
 * @throws Exception 
 */
    public static Connection getInstance() throws Exception {
        if (connect == null) {
            try {
                connect = DriverManager.getConnection(url, user, passwd);
            } catch (SQLException e) {
                throw new Exception("impossible de se connceter à la base de données");
            }
        }
        return connect;
    }
}
