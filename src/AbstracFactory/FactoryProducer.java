/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstracFactory;

import Conversiones.FactoryConversiones;
import Operaciones.FactoryOperaciones;

/**
 *
 * @author Jorge
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(Type tipo){
        switch (tipo){
            case ARITMETICO:
                return new FactoryOperaciones();
            case BINARIO:
                return new FactoryConversiones();
            default:return null;
        
        }
    }
}
