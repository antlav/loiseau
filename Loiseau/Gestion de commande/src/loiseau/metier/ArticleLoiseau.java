/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loiseau.metier;


import java.util.Vector;
import loiseau.stockage.Article_fabrication;
import loiseau.stockage.Coulisse;
import loiseau.stockage.Type_pose;

/**
 *
 * @author guillaume
 */
public class ArticleLoiseau {
    
    public static Article_fabrication choixCoulisse(Article_fabrication art
            ,Vector<Coulisse> coul,Vector<Type_pose> pose){
        int aile=0;
        for(Type_pose p:pose){
            if(p.getId_type_pose()==art.getType_pose()){
               aile=p.getRabat();
            }
        }
        for(Coulisse c:coul){
            if(aile==c.getRabat()&&art.getType_lame()==c.getId_coulisse()){
                art.setType_coulisse(c.getId_coulisse());
            }
        }
        
        return art;
    }
}
