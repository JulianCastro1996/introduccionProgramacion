package primeraParte;

import segundaParte.Coche;

public class main {

    public static void main(String args[]) {
        System.out.println("1 PARTE");
        int a = 10;
        int b = 13;
        int c = 15;
        System.out.println("suma 1: " + suma(b, a, c));
        System.out.println("suma 2: " + suma(a, b, c));
        System.out.println("suma 3: " + suma(c, a, b));

        System.out.println("2 PARTE");
        Coche coche = new Coche();
        System.out.println("puertas iniciales: " + coche.getPuertas());
        coche.sumarPuerta(1);
        System.out.println("puertas finales: " + coche.getPuertas());
    }


    public static int suma(int a, int b, int c) {
        return (a + b + c);
    }
}