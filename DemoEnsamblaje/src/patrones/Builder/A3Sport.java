/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.Builder;

import patrones.Vehiculo;

/**
 *
 * @author eli
 */
public class A3Sport extends CarBuilder{

    @Override
    void armarCarroceria(String color) {
        vehiculo.tipoCarroceria = new Carroceria();
        vehiculo.tipoCarroceria.habitaculoReforzado = true;
        vehiculo.tipoCarroceria.material = "fibra de carbono";
        vehiculo.tipoCarroceria.tipoCarroceria = "deportivo";
        vehiculo.color = color;
        
    }

    @Override
    void montarMotor() {
        vehiculo.motor = new MotorDiesel();
    }

    @Override
    void definirVehiculo() {
        vehiculo = new VehiculoBase();
        vehiculo.marca = "Audi";
        vehiculo.modelo = "A3 Sportback";
        
    }

    @Override
    void construirExtras(boolean booleano) {
        vehiculo.direccionAsistida = booleano;
    }

}
