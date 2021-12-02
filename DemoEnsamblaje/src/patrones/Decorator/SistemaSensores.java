/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.Decorator;

/**
 *
 * @author eli
 */
public class SistemaSensores extends VehiculoDecorator{

    String nombre;
    
    public SistemaSensores(String nombre){
        this.nombre = nombre;
    }
    
}
