/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.Decorator;

import patrones.Builder.VehiculoBase;
import patrones.Vehiculo;

/**
 *
 * @author eli
 */
public class VehiculoDecorator implements Vehiculo{
    
    protected Vehiculo vehiculo;
    
    VehiculoDecorator(Vehiculo vehiculo){
        this.vehiculo=vehiculo;
    }
    @Override
    public void ensamblar() {
        this.vehiculo.ensamblar();
    }

    

}
