/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller02;

/**
 *
 * @author CAELOS JR 2018
 */
public class Palomas_LSP implements Bipedos_LSP {
    public piernas patas;
    public alas alas;
    public pico pico;

    public Palomas_LSP(piernas patas, alas alas, pico pico) {
        this.patas = patas;
        this.alas = alas;
        this.pico = pico;
    }

    @Override
    public void caminar() {
        //se camina 
    }

    @Override
    public void correr() {
        //se corre
    }
    
    public void volar(){
        // se vuela 
    }
    
}
