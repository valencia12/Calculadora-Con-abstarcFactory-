/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import AbstracFactory.AbstractFactory;
import AbstracFactory.FactoryProducer;
import AbstracFactory.Type;
import Operaciones.Operaciones;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Jorge
 */
public class Ventana extends JPanel{
   public int WIDTH = 700, widthTF = 120, widthB = 80;
   public int HEIGHT = 250, heightTF = 30, heightB = 30;
   public JTextField textF1, textF2, textF3, txtR, txtRC, txtCap;
   private JLabel titulo, resultado;
   public JButton ButtonOp, buttonS, buttonR, buttonM, buttonD, btnConver;
   public Ventana(){
    
    titulo = new JLabel("Calculadora", JLabel.CENTER);
    titulo.setSize(120,70);
    
    resultado = new JLabel("R. ");
    resultado.setSize(270,205);
    
    textF1 = new JTextField();
    textF1.setBounds(new Rectangle(100,10,widthTF,heightTF));
    
    textF2 = new JTextField();
    textF2.setBounds(new Rectangle(270,100,widthTF,heightTF));
    
    textF3 = new JTextField();
    textF3.setBounds(new Rectangle(270,150,widthTF,heightTF));
    
    txtR = new JTextField();
    txtR.setBounds(270,200,widthTF,heightTF);
    
    txtCap = new JTextField();
    txtCap.setBounds(550,100,widthTF,heightTF);
    
    txtRC = new JTextField();
    txtRC.setBounds(550,150,widthTF,heightTF);
    
    ButtonOp = new JButton("Operar");
    ButtonOp.setBounds(new Rectangle(40,205, 220, heightB));
    
    buttonS = new JButton("Sumar");
    buttonS.setBounds(new Rectangle(40, 150, 100, heightB));
    
    buttonR = new JButton("Restar");
    buttonR.setBounds(new Rectangle(40, 100, 100, heightB));
    
    buttonM = new JButton("Multiplicar");
    buttonM.setBounds(new Rectangle(150, 100, 100, heightB));
    
    buttonD = new JButton("Dividir");
    buttonD.setBounds(new Rectangle(150, 150, 100, heightB));
    
    btnConver = new JButton("Conversion");
    btnConver.setBounds(new Rectangle(430, 100, 100, heightB));
    
    textF1.setEditable(true);
    textF1.setEditable(false);
    txtRC.setEditable(false);
    txtR.setEditable(false);
     //Botones
    add(buttonS); add(buttonR); 
    add(buttonM); add(buttonD);
    add(btnConver); 
    //Textbox
    add(textF2); add(txtRC); add(txtCap);
    add(textF3); add(txtR);
    //Labels
    add(titulo); //add(resultado);
    setLayout(null);
    setPreferredSize(new Dimension(WIDTH, HEIGHT));
    
   ButtonOp.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent arg0){
        textF2.setText(textF1.getText());
        }
    });
   
   buttonS.addActionListener(new ActionListener(){
       @Override
       public void actionPerformed(ActionEvent e){
            AbstractFactory factory = FactoryProducer.getFactory(Type.ARITMETICO);
            txtR.setText(String.valueOf(factory.getOperacion(Operaciones.SUMAR,
                  Float.parseFloat(textF2.getText()),
                  Float.parseFloat(textF3.getText()))));
       }
   });
   
   buttonR.addActionListener(new ActionListener(){
       @Override
       
       public void actionPerformed(ActionEvent e){
           AbstractFactory factory = FactoryProducer.getFactory(Type.ARITMETICO);
           txtR.setText(String.valueOf(factory.getOperacion(Operaciones.RESTAR,
                  Float.parseFloat(textF2.getText()),
                  Float.parseFloat(textF3.getText()))));
   
    }
   });
   
   btnConver.addActionListener(new ActionListener(){
       @Override
       public void actionPerformed(ActionEvent e){
           int cap;
           
           AbstractFactory factory = FactoryProducer.getFactory(Type.BINARIO);
           txtRC.setText(factory.getConversion(Integer.parseInt(txtCap.getText())));
           
           
       }
   });
   
   buttonD.addActionListener(new ActionListener(){
       @Override
       public void actionPerformed(ActionEvent e){
           AbstractFactory factory = FactoryProducer.getFactory(Type.ARITMETICO);
           txtR.setText(String.valueOf(factory.getOperacion(Operaciones.DIVIDIR,
                  Float.parseFloat(textF2.getText()),
                  Float.parseFloat(textF3.getText()))));
       }
   });
   
   buttonM.addActionListener(new ActionListener(){
       @Override
       public void actionPerformed(ActionEvent e){
           AbstractFactory factory = FactoryProducer.getFactory(Type.ARITMETICO);
           txtR.setText(String.valueOf(factory.getOperacion(Operaciones.MULTIPLICAR,
                  Float.parseFloat(textF2.getText()),
                  Float.parseFloat(textF3.getText()))));
       }
   });
   
   }
   
}

