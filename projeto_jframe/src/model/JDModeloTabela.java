
package model;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;


public class JDModeloTabela extends AbstractTableModel{
     //Collection de diversos tipos de objetos
     private ArrayList linhas = null;
     private String[] colunas = null;
     

     public JDModeloTabela(ArrayList lin, String[] col){
       setLinhas(lin);
       setColunas(col);
        
     }

   
    public ArrayList getLinhas() {
        return linhas;
    }

    
    public void setLinhas(ArrayList linhas) {
        this.linhas = linhas;
    }

    public String[] getColunas() {
        return colunas;
    }

   
    public void setColunas(String[] colunas) {
        this.colunas = colunas;
    }
    
    //contagem das colunas
    public int getColumnCount(){
      return colunas.length;
    }
    //contagem das linhas
   public int getRowCount(){
     return linhas.size();
   }
   //nome para as colunas
   public String getColumnName (int numCol){
      return colunas[numCol];
   }
   //Objeto recebe o valor, verificando se chegou na ultima linha e coluna
   public Object getValueAt(int numLin, int numCol){
     Object[] linha = (Object[])getLinhas().get(numLin);
     return linha[numCol];
   
   
   }

}    


