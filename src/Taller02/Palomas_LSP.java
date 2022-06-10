package Taller02;

public class Palomas_LSP {
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
