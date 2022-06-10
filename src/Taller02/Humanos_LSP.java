package Taller02;

public class Humanos_LSP {
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
