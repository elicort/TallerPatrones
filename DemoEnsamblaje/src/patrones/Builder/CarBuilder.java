/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.Builder;

/**
 *
 * @author eli
 */
public abstract class CarBuilder {
    
    protected VehiculoBase vehiculo;
    
    
    abstract void armarCarroceria(String color);
    abstract void montarMotor();
    abstract void definirVehiculo();
    abstract void construirExtras(boolean booleano);

}
