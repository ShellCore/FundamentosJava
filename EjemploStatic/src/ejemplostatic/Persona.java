package ejemplostatic;

public class Persona {
    
    private String nombre;
    private int idPersona;
    private static int contadorPersonas;

    public Persona(String nombre) {
        contadorPersonas++;
        this.nombre = nombre;
        idPersona = contadorPersonas;
    }

    @Override
    public String toString() {
        return "Persona{"
                + "Id Persona: " + idPersona
                + ", Nombre: " + nombre 
                + "}";
    }
    
    public static int getContadorPersonas() {
        return contadorPersonas;
    }
}
