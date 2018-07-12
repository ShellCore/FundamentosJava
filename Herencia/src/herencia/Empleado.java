package herencia;

public class Empleado extends Persona {
    
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleados;

    public Empleado(String nombre, double sueldo) {
        super(nombre);
        this.sueldo = sueldo;
        this.idEmpleado = ++contadorEmpleados;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    @Override
    public String toString() {
        return super.toString()
                + ", Empleado{"
                + "Id Empleado: " + idEmpleado
                + ", Sueldo: " + sueldo
                + "}";
    }
}