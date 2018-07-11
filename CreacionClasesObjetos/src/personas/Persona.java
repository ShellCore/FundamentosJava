package personas;

public class Persona {
    
    // Atributos de la clase
    String nombre;
    String apellidoPaterno;
    String apellidoMaterno;
    
    public void desplegarNombre() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido paterno: " + apellidoPaterno);
        System.out.println("Apellido materno: " + apellidoMaterno);
    }
}
