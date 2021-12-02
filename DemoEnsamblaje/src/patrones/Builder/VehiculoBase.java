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
public class VehiculoBase implements Vehiculo{
   public String color;
   public boolean direccionAsistida;
   public String marca;
   public String modelo;
   public IMotor motor;
   public Carroceria tipoCarroceria;
   
   public VehiculoBase(){
       
   }
   
   public String getPrestaciones(){
       String n1 = "Prestaciones:\n";
       n1 += "El presente vehículo es un " + marca + "\n";
       n1 += "Estilo " + tipoCarroceria.tipoCarroceria + "\n";
       n1 += "Color: " + color + "\n";
       n1 += (direccionAsistida ? "Con ":"Sin ") + "dirección asistida" + "\n";
       n1 += "Carrocería de " + tipoCarroceria.material + "\n";
       n1 += "Respuesta del motor: " + motor.InyectarCombustible(100) + "\n";
       n1 += ""
       return n1;
   }

    @Override
    public void ensamblar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

