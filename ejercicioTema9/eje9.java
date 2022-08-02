package ejercicioTema9;

public class eje9 {
    public static void main (String args[]){
        Cliente cliente1=new Cliente(19,"marcelo",201917, true);

        System.out.println(cliente1.getNombre()+" "+cliente1.getEdad()+" "+cliente1.getTelefono()+" "+cliente1.isCredito());

        Trabajador trabajador1=new Trabajador(19,"marcelo",222874, 1200);

        System.out.println(trabajador1.getNombre()+" "+trabajador1.getEdad()+" "+trabajador1.getTelefono()+" "+trabajador1.getSalario());
    }



}
