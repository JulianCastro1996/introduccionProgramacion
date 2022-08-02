package ejercicioTema9;

public class Trabajador extends Persona{
    private int salario;
    public Trabajador(int edad, String nombre, int telefono,int salario) {
        super(edad, nombre, telefono);
        this.salario=salario;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
