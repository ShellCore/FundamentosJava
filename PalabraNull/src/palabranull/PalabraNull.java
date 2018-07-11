package palabranull;

public class PalabraNull {

    public static void main(String[] args) {
        Persona p1 = new Persona("Juan");
        System.out.println("Persona p1: " + p1.obtenerNombre());
        
        Persona p2 = p1;
        System.out.println("Persona p2: " + p2.obtenerNombre());
        
        // Hacemos que la variable p1 ya no apunte al objeto p1
        p1 = null;
        
        // Comprobamos que p2 sigue accediendo al objeto
        System.out.println("Persona p2: " + p2.obtenerNombre());
        
        /**
         * La siguiente línea marca error de tipo NullPointerException
         * System.out.println("Persona p1: " + p1.obtenerNombre());
         * Solo en caso de que no sea nulo podemos utilizar este método
         * en esta variable
         */
        if (p1 != null) {
            System.out.println("Persona p1: " + p1.obtenerNombre());
        }
    }
    
}

class Persona {
    
    String nombre; // Valor por defecto es null
    
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    public String obtenerNombre() {
        return this.nombre;
    }
}
