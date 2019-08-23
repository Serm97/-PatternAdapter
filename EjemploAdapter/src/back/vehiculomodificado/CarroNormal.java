/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package back.vehiculomodificado;

import back.Carro;

/**
 *
 * @author Dairo
 */
public class CarroNormal extends Carro {

    @Override
    public void frenar() {
        System.out.println("El carro freno");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando");
    }
    
}
