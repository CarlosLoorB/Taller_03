/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller02;

/**
 *
 * @author CAELOS JR 2018
 */
public class Humanos_LSP implements Bipedos_LSP{
    public piernas piernas;
    public brazos brazos;
    public personalidad personalidad;

    public Humanos_LSP(piernas piernas, brazos brazos, personalidad personalidad) {
        this.piernas = piernas;
        this.brazos = brazos;
        this.personalidad = personalidad;
    }

    public void caminar(){
        // se camina
    }
    
    public void correr(){
        // se corre 
    }
    
    public void saludar(){
        //saluda
    }
}
