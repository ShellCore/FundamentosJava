package personas;

public class PersonaTest {
    
    public static void main(String[] args) {
        // Creación de un objeto
        Persona p = new Persona();
        
        // Llamando a un método del objeto creado
        System.out.println("Valores por defecto del objeto Persona");
        p.desplegarNombre();
        
        // Modificar valores
        p.nombre = "Juan";
        p.apellidoPaterno = "Esparza";
        p.apellidoMaterno = "Lara";
        
        // Volvemos a llamar al método
        System.out.println("\nNuevos valores del objeto Persona");
        p.desplegarNombre();
    }
}
