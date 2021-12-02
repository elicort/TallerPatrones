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
public class CámaraRetro extends VehiculoDecorator{
    String marca;
    
    public CámaraRetro(String marca){
        this.marca=marca;
    }

    @Override
    public void ensamblar() {
        super.ensamblar(); 
    }
}
    
