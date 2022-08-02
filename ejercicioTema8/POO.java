package ejercicioTema8;

public class POO {
    public static void main(String arg[]){
        Persona persona1=new Persona();
        //seteo edad
        persona1.setEdad(15);
        //seteo nombre
        persona1.setNombre("damian");
        //seteo telefono
        persona1.setTelefono(28976353);
        System.out.println("-PERSONA1");
        System.out.println("-Nombre: "+ persona1.getNombre());
        System.out.println("-Edad: "+ persona1.getEdad());
        System.out.println("-Telefono"+ persona1.getTelefono());

    }
}

