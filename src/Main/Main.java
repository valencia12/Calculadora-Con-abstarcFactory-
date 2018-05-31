/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import GUI.Ventana;
import javax.swing.JFrame;

/**
 *
 * @author Jorge
 */
public class Main {
     public static void main(String[] args){
    //
    JFrame ventana = new JFrame("Ventana");
    ventana.setContentPane(new Ventana());
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.pack();
    ventana.setVisible(true);
    Ventana v = new Ventana();
    
    }
     
     
}

