/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstracFactory;

import Operaciones.Operaciones;

/**
 *
 * @author Jorge
 */
public interface AbstractFactory {
    float getOperacion(Operaciones op, float a, float b);
    String getConversion(int a);
}
