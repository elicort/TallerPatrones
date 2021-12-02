/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.Decorator;

import patrones.Vehiculo;

/**
 *
 * @author eli
 */
public class SistemaSensores extends VehiculoDecorator{

    String nombre;
    
    public SistemaSensores(Vehiculo vehiculo){
        super(vehiculo);
    }
    
    @Override
    public void ensamblar() {
        this.vehiculo.ensamblar();
    }

}
