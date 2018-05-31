/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import javax.swing.JTextField;
/**
 *
 * @author Jorge
 */
class Exeption {
    public boolean Validacion(String cad){
         int num;
         try{
             num = Integer.parseInt(cad);
             return true;
         }
         catch(Exception e){
             return false;
         }
         
     
   }
}
