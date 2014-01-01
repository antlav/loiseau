/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loiseau.metier;

import java.util.Comparator;
import loiseau.stockage.Client;

/**
 *
 * @author guillaume
 */
public class ClientOperation implements Comparator<Client> {

    public ClientOperation() {
    }

    public static void verificationNom(Client unClient) throws Exception {
        if (unClient.getNom().length() < 2) {
            throw new Exception("le nom doit contenir au moin 2 caractéres");
        }
    }

    @Override
    public int compare(Client o1, Client o2) {
        return o1.getNom().compareToIgnoreCase(o2.getNom());
    }
}
