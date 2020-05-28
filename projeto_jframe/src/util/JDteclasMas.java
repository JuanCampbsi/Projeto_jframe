
package util;


import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class JDteclasMas extends PlainDocument {
    
    @Override
    public void insertString(int offs, String str, javax.swing.text.AttributeSet attr){
           try {
            super.insertString(offs, str.toUpperCase().replaceAll("[^a-z|^A-Z|^ ]",""), attr);
        } catch (BadLocationException e) {
        }  
    }
    
     
    public void replace(int offs, String str, javax.swing.text.AttributeSet attr) {
           try {
            super.insertString(offs, str.toUpperCase().replaceAll("[^a-z|^A-Z|^ ]",""), attr);
        } catch (BadLocationException e) {
        }  
    }

}