/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jarvis
 */
public class addons {
    
    public static void filltable(JTable tb, ResultSet rs,JTextField jt1,JTextField jt2,JTextField jt3){
       int count= Integer.parseInt(jt1.getText());
       int page_no=Integer.parseInt(jt2.getText());
       int total=0;
 
        try{
//            while(rs.next())
//            {total++;}
//            
//            rs.first();
//            rs.previous();
//            jt3.setText(String.valueOf(total));
            DefaultTableModel tm = (DefaultTableModel) tb.getModel();
             while(tm.getRowCount()>0)
            {
                tm.removeRow(0);
            }
            while(rs.next())
            {  total++;
                if(total>(page_no-1)*count&&total<=page_no*count){
                Object[] newRow = {rs.getString(1)};
                tm.addRow(newRow);
            } 
            }
            jt3.setText(String.valueOf(Math.ceil(total*1.0/count)).split(".0")[0].toString());
           
            
        }catch(SQLException e){e.printStackTrace();}
        
    }
    
}
