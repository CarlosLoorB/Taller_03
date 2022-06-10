package SRP;

import java.util.ArrayList;

public class Carro {
	private Motor motor;
    private String modelo;
    private int anio;
    private ArrayList<Pasajero> pasajeros;
    private double precio;
    private double litraje;
    
    public Carro(String modelo, int anio, double precio) {
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
        this.pasajeros = new ArrayList<Pasajero>();
        this.litraje = 0;
    }
}
