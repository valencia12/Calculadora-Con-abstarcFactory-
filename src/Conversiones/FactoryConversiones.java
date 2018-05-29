/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversiones;

import AbstracFactory.AbstractFactory;
import Operaciones.Operaciones;

/**
 *
 * @author Jorge
 */
public class FactoryConversiones implements AbstractFactory{

    @Override
    public float getOperacion(Operaciones op, float a, float b) {
        return 0;
    }
    

    @Override
    public String getConversion(int a) {
       return Integer.toBinaryString(a);
    }

    
    

    

  
}
