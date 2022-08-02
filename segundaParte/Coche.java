package segundaParte;

public class Coche {
    private int puertas;
    //constructor
    public Coche(){
        puertas=0;
    }
    public int getPuertas(){
        return puertas;
    }


    public void sumarPuerta(int cant){
        puertas+=cant;
    }
}
