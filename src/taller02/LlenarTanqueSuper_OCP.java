/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller02;

/**
 *
 * @author CAELOS JR 2018
 */
public class LlenarTanqueSuper_OCP implements LlenarTanque_OCP {
    private Carro_SRP carro;

    public LlenarTanqueSuper_OCP(Carro_SRP carro) {
        this.carro = carro;
    }
    
    public int precioTanqueLLeno(Carro_SRP carro){
        //se calcula el precio del tanque lleno con super 
    }
    
}
