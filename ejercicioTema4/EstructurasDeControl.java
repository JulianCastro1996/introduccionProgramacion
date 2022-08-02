package ejercicioTema4;

public class EstructurasDeControl {
    private static int numeroIf;
    private static int estacion;
    public static void main(String args[]){
        numeroIf=-10;
        posOneg();
        doWhile();
        forNumber();
        estacion=2;
        estaciones();
    }

    //Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
    //Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
    public static void posOneg(){
        if(numeroIf< 0) {
            System.out.println("soy negativo");
        }else if(numeroIf>0){
            System.out.println("soy positivo");
        }else{
            System.out.println("soy un cero");
        }
    }
    //Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el
    // bloque de código que tendrá el bucle deberá:
    //
    //Incrementar el valor de la variable en uno cada vez que se ejecute.
    //
    //Mostrarlo por pantalla cada vez que se ejecute.
    public static void bucle(){
        while (numeroIf<3){
            System.out.println("Entro al while, el valor de numeroIf es: " + numeroIf);
            numeroIf++;
        }
    }
    //Para el bucle Do While, deberás crear la misma estructura que en el While, pero
    // solo se debe ejecutar una vez.
    public static void doWhile(){
        do{
            numeroIf=10;
            System.out.println("Entro al do, el valor de numeroIf es: " + numeroIf);
        }while (numeroIf<10);
    }
    //Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será
    // que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá
    // mostrarse por pantalla.

    public static void forNumber(){
        for(int numeroFor=0;numeroFor<=3;numeroFor++){
            System.out.println("Entro al FOR, el valor de numeroFor es: " + numeroFor);
        }
    }

    //Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año.
    // Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la
    // estación en la que está. También habrá
    // que poner un default para cuando el valor de la variable no sea una estación.

    public static void estaciones(){
        switch (estacion){
            case 1:
                System.out.println("estamos en invierno");
                break;
            case 2:
                System.out.println("estamos en primavera");
                break;
            case 3:
                System.out.println("estamos en verano");
                break;
            case 4:
                System.out.println("estamos en otoño");
                break;
            default:
                System.out.println("no corresponde a una estacion");
                break;
        }
    }
}
