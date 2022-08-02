package ejercicioTema8;

public class Persona {
    //Crear clase Persona.
    //
    //Crear variables las privadas edad, nombre y telefono de la clase Persona.
    private int edad;
    private String nombre;
    private int telefono;

    public Persona(int edad, String nombre, int telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }
    public Persona() {

    }
    //Crear gets y sets de cada propiedad.
    //

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}