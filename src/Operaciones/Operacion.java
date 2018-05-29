/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

/**
 *
 * @author Jorge 
 */
public interface Operacion {
    
    static float sumar (float a, float b){
        return a + b;
    }
    static float restar(float a, float b){
        return a - b;
    }
    static float multiplicar(float a, float b){
        return a * b;
    }
    static float dividir(float a, float b){
        return a / b;
    }
    
}
