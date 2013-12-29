/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loiseau.metier;

import java.awt.Toolkit;
import javax.swing.text.*;

/**
 *  Classe pour limiter le nombre de caractére par champ de text
 * @author guillaume
 */
public class LimiteCaract extends PlainDocument {

    private static final long serialVersionUID = 6016644222758009922L;
    private int max;

    public LimiteCaract(int max) {
        super();

        this.max = max;
    }
/**
 * 
 * @param offset
 * @param str
 * @param attrs
 * @throws BadLocationException 
 */
    public void insertString(int offset, String str, AttributeSet attrs) throws BadLocationException {
        if (str != null && getLength() + str.length() > max) {
            Toolkit.getDefaultToolkit().beep();
        } else {
            super.insertString(offset, str, attrs);
        }
    }
/**
 * 
 * @param offset
 * @param length
 * @param str
 * @param attrs
 * @throws BadLocationException 
 */
    public void replace(int offset, int length, String str, AttributeSet attrs) throws BadLocationException {
        if (str != null && getLength() + str.length() - length > max) {
            Toolkit.getDefaultToolkit().beep();
        } else {
            super.replace(offset, length, str, attrs);
        }
    }
}
