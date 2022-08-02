package ejercicioTema9;

public class Cliente extends Persona{
    private boolean credito;
    public Cliente(int edad, String nombre, int telefono,boolean credito) {
        super(edad, nombre, telefono);
        this.credito=credito;
    }

    public boolean isCredito() {
        return credito;
    }

    public void setCredito(boolean credito) {
        this.credito = credito;
    }
}
