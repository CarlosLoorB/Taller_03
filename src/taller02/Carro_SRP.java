package taller02;

//toda la clase tiene una sola responsabilidad manejar el carro en general 
public class Carro_SRP {
    private motor motor;
    private modelo modelo;
    private anio anio;
    private pasajeros pasajeros;
    private precio precio;
    private litraje litraje;

    public Carro_SRP(motor motor, modelo modelo, anio anio, pasajeros pasajeros, precio precio) {
        this.motor = motor;
        this.modelo = modelo;
        this.anio = anio;
        this.pasajeros = pasajeros;
        this.precio = precio;
    }
    
    public void conducirCarro(){
        // conduccion del carro 
    }
    
    public void parquearCarro(){
        // se parquea el carro 
    }
}
