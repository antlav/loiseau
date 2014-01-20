/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loiseau.metier;


import java.util.HashMap;
import java.util.Vector;
import loiseau.stockage.Article_fabrication;
import loiseau.stockage.Caisson;
import loiseau.stockage.Lame;
import loiseau.stockage.Type_manoeuvre;
import loiseau.stockage.Type_pose;

/**
 *classe de gestion de la decote des article Loiseau
 * @author guillaume Pacquet
 */
public class CalculeCote {

    public CalculeCote() {
    }
/**
 * Methode pour calculer les cote Mozart
 * @param art le volet à decoter
 * @param caissons un vector de Caisson
 * @param lame un vector de Lame
 * @param pose un vector de TypePose
 * @param manoeuvre un vector deTypeManoeuvre
 * @return une hashmap avec les décote de l'article
 */
    public static HashMap<String, Double> calculeMozart(Article_fabrication art, Vector<Caisson> caissons, Vector<Lame> lame, Vector<Type_pose> pose,
            Vector<Type_manoeuvre> manoeuvre) {
        HashMap<String, Double> cote = new HashMap<>();
        int leCaisson = 205;
        int h = 0;
        double lameNonAjourer = 10;
        String nomLame = "";
        String unePose = "";
        String uneManoeuvre = "";
        cote.put("hauteur", art.getHauteur());
        cote.put("largeur", art.getLargeur());
        cote.put("quantite", (double) art.getQuantite());
        for (Lame l : lame) {
            if (l.getId_lame() == art.getType_lame()) {
                nomLame = l.getNom_lame();
            }
        }
        h = (int) ((art.getHauteur() / 100) + 0.5);
        h = h * 100;
        for (Caisson c : caissons) {
            if (c.getType_volet().compareTo("Mozart") == 0) {
                if (c.getLame().compareTo(nomLame) == 0) {
                    if (c.getHauteur() == h) {
                        leCaisson = c.getCaisson();
                    }
                }
            }
        }
        for (Type_pose p : pose) {
            if (p.getId_type_pose() == art.getType_pose()) {
                unePose = p.getNom_type_pose();
            }
        }
        for (Type_manoeuvre m : manoeuvre) {
            if (m.getId_type_manoeuvre() == art.getType_manoeuvre()) {
                uneManoeuvre = m.getNom_type_manoeuvre();
            }
        }
        if (unePose.compareTo("Pose N5") == 0) {
            art.setHauteur((art.getHauteur() + leCaisson));
            art.setLargeur(art.getLargeur());
            cote.put("largeurCaisson", (art.getLargeur() - 12));
            cote.put("hauteurCaisson", (double) leCaisson);
            cote.put("hauteurCoulisse", (art.getHauteur() - 3 - leCaisson));
            cote.put("largeurLame", (art.getLargeur() - 74));
            cote.put("lameNonAjourer", lameNonAjourer);
            if (uneManoeuvre.compareTo("sangle") == 0) {
                cote.put("axe", (art.getLargeur() - 100));
            }
            if (uneManoeuvre.compareTo("treuil") == 0) {
                cote.put("axe", (art.getLargeur() - 115));
            }
            if (uneManoeuvre.compareTo("tirage direct") == 0) {
                cote.put("axe", (art.getLargeur() - 120));
            }
            if (uneManoeuvre.regionMatches(0, "electrique", 0, 10)) {
                cote.put("axe", (art.getLargeur() - 90));
            }
            if (art.getHauteur() < 1200) {
                cote.put("nombreLame", (double) (int) ((art.getHauteur() - 185)
                        / 37 + 2));
            }
            if (art.getHauteur() >= 1200 && art.getHauteur() < 1600) {
                cote.put("nombreLame", (double) (int) ((art.getHauteur() - 197)
                        / 37 + 2));
            }
            if (art.getHauteur() >= 1600 && art.getHauteur() < 2400) {
                cote.put("nombreLame", (double) (int) ((art.getHauteur() - 225)
                        / 37 + 2));
            }
            if (art.getHauteur() >= 2400) {
                cote.put("nombreLame", (double) (int) ((art.getHauteur() - 240)
                        / 37 + 2));
            }
            cote.put("lameAjourer", (cote.get("nombreLame") - lameNonAjourer));
            return cote;
        } else {
            if (unePose.compareTo("Pose N3") == 0) {
                art.setHauteur((art.getHauteur() + leCaisson));
                cote.put("largeurCaisson", (art.getLargeur() - 12));
                cote.put("hauteurCaisson", (double) leCaisson);
                cote.put("hauteurCoulisse", (art.getHauteur() - 3 - leCaisson));
                cote.put("largeurLame", (art.getLargeur() - 74));
                cote.put("lameNonAjourer", lameNonAjourer);
                if (uneManoeuvre.compareTo("sangle") == 0) {
                    cote.put("axe", (art.getLargeur() - 100));
                }
                if (uneManoeuvre.compareTo("treuil") == 0) {
                    cote.put("axe", (art.getLargeur() - 115));
                }
                if (uneManoeuvre.compareTo("tirage direct") == 0) {
                    cote.put("axe", (art.getLargeur() - 120));
                }
                if (uneManoeuvre.regionMatches(0, "electrique", 0, 10)) {
                    cote.put("axe", (art.getLargeur() - 90));
                }
                if (art.getHauteur() < 1200) {
                    cote.put("nombreLame", (double) (int) ((art.getHauteur() - 185)
                            / 37 + 2));
                }
                if (art.getHauteur() >= 1200 && art.getHauteur() < 1600) {
                    cote.put("nombreLame", (double) (int) ((art.getHauteur() - 197)
                            / 37 + 2));
                }
                if (art.getHauteur() >= 1600 && art.getHauteur() < 2400) {
                    cote.put("nombreLame", (double) (int) ((art.getHauteur() - 225)
                            / 37 + 2));
                }
                if (art.getHauteur() >= 2400) {
                    cote.put("nombreLame", (double) (int) ((art.getHauteur() - 240)
                            / 37 + 2));
                }
                cote.put("lameAjourer", (cote.get("nombreLame") - lameNonAjourer));
                return cote;
            } else {
                cote.put("largeurCaisson", (art.getLargeur() - 12));
                cote.put("hauteurCaisson", (double) leCaisson);
                cote.put("hauteurCoulisse", (art.getHauteur() - 3 - leCaisson));
                cote.put("largeurLame", (art.getLargeur() - 74));
                cote.put("lameNonAjourer", lameNonAjourer);
                if (uneManoeuvre.compareTo("sangle") == 0) {
                    cote.put("axe", (art.getLargeur() - 100));
                }
                if (uneManoeuvre.compareTo("treuil") == 0) {
                    cote.put("axe", (art.getLargeur() - 115));
                }
                if (uneManoeuvre.compareTo("tirage direct") == 0) {
                    cote.put("axe", (art.getLargeur() - 120));
                }
                if (uneManoeuvre.regionMatches(0, "electrique", 0, 10)) {
                    cote.put("axe", (art.getLargeur() - 90));
                }
                if (art.getHauteur() < 1200) {
                    cote.put("nombreLame", (double) (int) ((art.getHauteur() - 185)
                            / 37 + 2));
                }
                if (art.getHauteur() >= 1200 && art.getHauteur() < 1600) {
                    cote.put("nombreLame", (double) (int) ((art.getHauteur() - 197)
                            / 37 + 2));
                }
                if (art.getHauteur() >= 1600 && art.getHauteur() < 2400) {
                    cote.put("nombreLame", (double) (int) ((art.getHauteur() - 225)
                            / 37 + 2));
                }
                if (art.getHauteur() >= 2400) {
                    cote.put("nombreLame", (double) (int) ((art.getHauteur() - 240)
                            / 37 + 2));
                }
                cote.put("lameAjourer", (cote.get("nombreLame") - lameNonAjourer));
                return cote;
            }
        }
    }
/**
 * Methode pour calculer les cotes Calypso
 * @param art le volet à decoter
 * @param caissons un vector de Caisson
 * @param lame un vector de Lame
 * @param pose un vector de TypePose
 * @param manoeuvre un vector deTypeManoeuvre
 * @return une hashmap avec les décote de l'article
 */
    public static HashMap<String, Double> calculeCalypso(Article_fabrication art,
            Vector<Caisson> caissons, Vector<Lame> lame, Vector<Type_pose> pose,
            Vector<Type_manoeuvre> manoeuvre) {
        HashMap<String, Double> cote = new HashMap<>();
        int leCaisson = 180;
        int lameAjourer = 10;
        int h = 0;
        String nomLame = "";
        String unePose = "";
        String uneManoeuvre = "";
        cote.put("hauteur", art.getHauteur());
        cote.put("largeur", art.getLargeur());
        cote.put("quantite", (double) art.getQuantite());
        for (Lame l : lame) {
            if (l.getId_lame() == art.getType_lame()) {
                nomLame = l.getNom_lame();
            }
        }
        h = (int) ((art.getHauteur() / 100) + 0.5);
        h = h * 100;
        for (Caisson c : caissons) {
            if (c.getType_volet().compareTo("Calypso") == 0) {
                if (c.getLame().compareTo(nomLame) == 0) {
                    if (c.getHauteur() == h) {
                        leCaisson = c.getCaisson();
                    }
                }
            }
        }
        for (Type_pose p : pose) {
            if (p.getId_type_pose() == art.getType_pose()) {
                unePose = p.getNom_type_pose();
            }
        }
        for (Type_manoeuvre m : manoeuvre) {
            if (m.getId_type_manoeuvre() == art.getType_manoeuvre()) {
                uneManoeuvre = m.getNom_type_manoeuvre();
            }
        }
        if (unePose.compareTo("Pose N5") == 0) {
            art.setHauteur((art.getHauteur() + leCaisson));
            art.setLargeur(art.getLargeur());
            cote.put("largeurCaisson", (art.getLargeur() - 7));
            cote.put("hauteurCaisson", (double) leCaisson);
            cote.put("hauteurCoulisse", (art.getHauteur() - 3 - leCaisson));
            cote.put("largeurLame", (art.getLargeur() - 74));
            cote.put("lameAjourer", (double) lameAjourer);
            if (uneManoeuvre.compareTo("sangle") == 0) {
                cote.put("axe", (art.getLargeur() - 143));
            }
            if (uneManoeuvre.compareTo("treuil") == 0) {
                cote.put("axe", (art.getLargeur() - 96));
            }
            if (uneManoeuvre.compareTo("tirage direct") == 0) {
                cote.put("axe", (art.getLargeur() - 120));
            }
            if (uneManoeuvre.regionMatches(0, "electrique", 0, 10)) {
                cote.put("axe", (art.getLargeur() - 96));
            }
            if (art.getHauteur() < 1700) {
                cote.put("nombreLame", (double) (int) ((art.getHauteur() - 210)
                        / 37 + 2));
            }
            if (art.getHauteur() >= 1700) {
                cote.put("nombreLame", (double) (int) ((art.getHauteur() - 240)
                        / 37 + 2));
            }
            return cote;
        } else {
            if (unePose.compareTo("Pose N3") == 0) {
                art.setHauteur((art.getHauteur() + leCaisson));
                cote.put("largeurCaisson", (art.getLargeur() - 7));
                cote.put("hauteurCaisson", (double) leCaisson);
                cote.put("hauteurCoulisse", (art.getHauteur() - 3 - leCaisson));
                cote.put("largeurLame", (art.getLargeur() - 74));
                cote.put("lameAjourer", (double) lameAjourer);
                if (uneManoeuvre.compareTo("sangle") == 0) {
                    cote.put("axe", (art.getLargeur() - 120));
                }
                if (uneManoeuvre.compareTo("treuil") == 0) {
                    cote.put("axe", (art.getLargeur() - 96));
                }
                if (uneManoeuvre.compareTo("tirage direct") == 0) {
                    cote.put("axe", (art.getLargeur() - 120));
                }
                if (uneManoeuvre.regionMatches(0, "electrique", 0, 10)) {
                    cote.put("axe", (art.getLargeur() - 96));
                }
                if (art.getHauteur() < 1700) {
                    cote.put("nombreLame", (double) (int) ((art.getHauteur() - 210)
                            / 37 + 2));
                }
                if (art.getHauteur() >= 1700) {
                    cote.put("nombreLame", (double) (int) ((art.getHauteur() - 240)
                            / 37 + 2));
                }
                return cote;
            } else {
                cote.put("largeurCaisson", (art.getLargeur() - 7));
                cote.put("hauteurCaisson", (double) leCaisson);
                cote.put("hauteurCoulisse", (art.getHauteur() - 3 - leCaisson));
                cote.put("largeurLame", (art.getLargeur() - 74));
                cote.put("lameAjourer", (double) lameAjourer);
                if (uneManoeuvre.compareTo("sangle") == 0) {
                    cote.put("axe", (art.getLargeur() - 120));
                }
                if (uneManoeuvre.compareTo("treuil") == 0) {
                    cote.put("axe", (art.getLargeur() - 96));
                }
                if (uneManoeuvre.compareTo("tirage direct") == 0) {
                    cote.put("axe", (art.getLargeur() - 120));
                }
                if (uneManoeuvre.regionMatches(0, "electrique", 0, 10)) {
                    cote.put("axe", (art.getLargeur() - 96));
                }
                if (art.getHauteur() < 1700) {
                    cote.put("nombreLame", (double) (int) ((art.getHauteur() - 210)
                            / 37 + 2));
                }
                if (art.getHauteur() >= 1700) {
                    cote.put("nombreLame", (double) (int) ((art.getHauteur() - 240)
                            / 37 + 2));
                }
                return cote;
            }
        }
    }
/**
 * Methode pour calculer les cotes Traditionnel
 * @param art le volet à decoter
 * @param lame un vector de Lame
 * @param manoeuvre un vector deTypeManoeuvre
 * @return une hashmap avec les décote de l'article
 */
    public static HashMap<String, Double> calculeTraditionnel(Article_fabrication art,
            Vector<Lame> lame, Vector<Type_manoeuvre> manoeuvre) {
        HashMap<String, Double> cote = new HashMap<>();
        double lameNonAjourer = 10;
        String nomLame = "";
        String uneManoeuvre = "";
        cote.put("hauteur", art.getHauteur());
        cote.put("largeur", art.getLargeur());
        cote.put("quantite", (double) art.getQuantite());
        for (Lame l : lame) {
            if (l.getId_lame() == art.getType_lame()) {
                nomLame = l.getNom_lame();
            }
        }
        for (Type_manoeuvre m : manoeuvre) {
            if (m.getId_type_manoeuvre() == art.getType_manoeuvre()) {
                uneManoeuvre = m.getNom_type_manoeuvre();
            }
        }
        if (nomLame.compareTo("AHS 56") == 0) {
            cote.put("hauteurCoulisse", (art.getHauteur() + 80));
            cote.put("largeurLame", (art.getLargeur() - 40));
            cote.put("lameNonAjourer", lameNonAjourer);
            cote.put("nombreLame", (double) (int) ((art.getHauteur() + 10) / 56 + 2));
            cote.put("lameAjourer", (cote.get("nombreLame") - lameNonAjourer));
            if (uneManoeuvre.compareTo("sangle") == 0) {
                cote.put("axe", (art.getLargeur() - 44));
            }
            if (uneManoeuvre.compareTo("treuil") == 0) {
                cote.put("axe", (art.getLargeur() - 35));
            }
            if (uneManoeuvre.compareTo("tirage direct") == 0) {
                cote.put("axe", (art.getLargeur() - 25));
            }
            if (uneManoeuvre.regionMatches(0, "electrique", 0, 10)) {
                cote.put("axe", (art.getLargeur() - 41));
            }
            return cote;
        }
        if (nomLame.compareTo("AHS 37") == 0) {
            cote.put("hauteurCoulisse", (art.getHauteur() + 80));
            cote.put("largeurLame", (art.getLargeur() - 40));
            cote.put("lameNonAjourer", lameNonAjourer);
            cote.put("nombreLame", (double) (int) ((art.getHauteur() + 10) / 37 + 2));
            cote.put("lameAjourer", (cote.get("nombreLame") - lameNonAjourer));
            if (uneManoeuvre.compareTo("sangle") == 0) {
                cote.put("axe", (art.getLargeur() - 44));
            }
            if (uneManoeuvre.compareTo("treuil") == 0) {
                cote.put("axe", (art.getLargeur() - 60));
            }
            if (uneManoeuvre.compareTo("tirage direct") == 0) {
                cote.put("axe", (art.getLargeur() - 25));
            }
            if (uneManoeuvre.regionMatches(0, "electrique", 0, 10)) {
                cote.put("axe", (art.getLargeur() - 41));
            }
            return cote;
        }
        return cote;
    }

    public static HashMap<String, Double> calculeAutres(Article_fabrication art,
            Vector<Caisson> caissons) {
        HashMap<String, Double> cote = new HashMap<>();
        return cote;
    }

    public static HashMap<String, Double> calculeAxe(Article_fabrication art) {
        HashMap<String, Double> cote = new HashMap<>();
        return cote;
    }
/**
 * Methode pour calculer les cotes des tablier
 * @param art le tablier à decoter
 * @param lesLames un vector de Lame
 * @return  une hashmap des valeur décoté
 */
    public static HashMap<String, Double> calculeTablier(Article_fabrication art,
            Vector<Lame> lesLames) {
        HashMap<String, Double> cote = new HashMap<>();
        double lameNonAjourer = 10;
        cote.put("hauteur", art.getHauteur());
        cote.put("largeur", art.getLargeur());
        cote.put("quantite", (double) art.getQuantite());
        cote.put("largeurLame", (art.getLargeur() - 8));
        cote.put("lameNonAjourer", lameNonAjourer);
        for (Lame a : lesLames) {
            if (a.getId_lame() == art.getType_lame()) {
                cote.put("nombreLame", (double) (int) (art.getHauteur()
                        / Double.parseDouble(a.getPas()) + 2));
                cote.put("lameAjourer", (cote.get("nombreLame") - lameNonAjourer));
            }
        }
        return cote;
    }
}
