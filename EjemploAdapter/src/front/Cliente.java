/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package front;

import back.*;
import back.vehiculomodificado.*;

import java.util.Scanner;

/**
 *
 * @author Dairo
 */

//Client
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Carro carro;
        Scanner sc = new Scanner(System.in);
        
        for(;;){
            System.out.println("*****************************************");
            System.out.println("*****************************************");
            
            System.out.println("Seleccione el carro que desea conducir");
            System.out.println("1. Carro Normal");
            System.out.println("2. Carro de Batman");
            System.out.println("3. TroncoMovíl");
            System.out.println("4. Carroza");
            System.out.println("5. Triciclo");
            System.out.println("0. Salir");
            
            int opcion = sc.nextInt();
            System.out.println("*****************************************");
            System.out.println("*****************************************");

            carro = new CarroNormal();
            switch (opcion) {
                case 1:
                    break;
                case 2:
                    carro = new BatiMovilAdaptado();
                    break;
                case 3:
                    carro = new TroncoMovilAdaptado();
                    break;
                case 4:
                    carro = new CarrozaModificada();
                    break;
                case 5:
                    carro = new TricicloModificado();
                    break;
                case 0:
                    System.exit(0);

                default:
                    System.out.println("La seleccionada no existe");
                    break;
            }

            probarCarro(carro);
        }
    }

    public static void probarCarro(Carro carro){
        if(carro == null ){}
        else{
           carro.acelerar();
           carro.frenar();
        }
        
    }
    
}
