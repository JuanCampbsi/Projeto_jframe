
package util;

import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;


public class JDteclasMin  extends PlainDocument{
    
    @Override
    public void insertString(int offset, String str, javax.swing.text.AttributeSet attr){
           try {
            super.insertString(offset, str.toUpperCase().replaceAll("[^A-Z|^a-z]",""), attr);
        } catch (BadLocationException e) {
        }  
    }
   
      public void replace(int offset, String str, javax.swing.text.AttributeSet attr) {
           try {
            super.insertString(offset, str.toUpperCase().replaceAll("[^A-Z|^a-z]",""), attr);
        } catch (BadLocationException e) {
        }  
    }
    
}
