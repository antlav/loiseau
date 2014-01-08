/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loiseau.metier;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import loiseau.ihm.Parametres;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

/**
 *
 * @author laveauantoine
 */
public class Param {
    public String getParam(String name){ 
        String paramPath = "";
        // on creer le noeud racine
        Element racine = null;
        //un objec jdom document
        Document document = null;
        // on creer une instance de saxbuilder
        SAXBuilder sxb = new SAXBuilder();

        //Recupération des valeurs de parametre et modification de celle-ci
        try {
            String path = System.getProperty("user.dir" );
            document = sxb.build(new File(path + "/src/files/param.xml"));
            racine = document.getRootElement();
            List lstParam = racine.getChildren("param");

            //Iterator pour parcourir la list
            Iterator ite = lstParam.iterator();

            String paramName;
            

            while(ite.hasNext()){
                Element curent = (Element) ite.next();
                //recupere values
                paramName = curent.getAttributeValue("name").toString();
                
                if(paramName.contains(name)){
                    paramPath = curent.getAttributeValue("pathName").toString();
                }
            }

        } catch (JDOMException ex) {
            Logger.getLogger(Parametres.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Parametres.class.getName()).log(Level.SEVERE, null, ex);
        }
        return paramPath;
    }
    
}
