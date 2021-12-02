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
public class Xsara extends CarBuilder{

    @Override
    void armarCarroceria(String color) {
        vehiculo.tipoCarroceria = new Carroceria();
        vehiculo.tipoCarroceria.habitaculoReforzado = false;
        vehiculo.tipoCarroceria.material = "acero";
        vehiculo.tipoCarroceria.tipoCarroceria = "monocolumen";
        vehiculo.color = color;
        
    }

    @Override
    void montarMotor() {
        vehiculo.motor = new MotorDiesel();
    }

    @Override
    void definirVehiculo() {
        vehiculo = new VehiculoBase();
        vehiculo.marca = "Citroen";
        vehiculo.modelo = "XsaraPicasso";
        
    }

    @Override
    void construirExtras(boolean booleano) {
        vehiculo.direccionAsistida = booleano;
    }

}
