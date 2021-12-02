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
public class CarDirector {

    private CarBuilder builder;
    
    public CarDirector(CarBuilder builder){
        this.builder=builder;
    }
    
    public void crearVehiculo(String color, boolean extra){
        builder.armarCarroceria(color);
        builder.montarMotor();
        builder.definirVehiculo();
        builder.construirExtras(extra);
    }
    
    
}
