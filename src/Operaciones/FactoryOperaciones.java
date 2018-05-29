/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import AbstracFactory.AbstractFactory;
 

/**
 *
 * @author Jorge
 */
public class FactoryOperaciones implements AbstractFactory{
     
   

    @Override
    public float getOperacion(Operaciones op, float a, float b) {
        switch(op){
            case SUMAR:
                return Operacion.sumar(a, b);
            case RESTAR:
                return Operacion.restar(a, b);
            case MULTIPLICAR:
                return Operacion.multiplicar(a, b);
            case DIVIDIR:
                return Operacion.dividir(a, b);
            default:
                return 0;
        }
    }

    @Override
    public String getConversion(int a) {
        return null;
    }
}
