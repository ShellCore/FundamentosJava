package encapsulamiento;

public class Encapsulamiento {

    public static void main(String[] args) {
        
        Persona p1 = new Persona("Juan", "Perez", false);
        System.out.println("Nombre de p1: " + p1.getNombre());
        
        Persona p2 = new Persona("Karla", "Gonzalez", false);
        System.out.println("Estado del objeto p2: " + p2);
        
        p2.setBorrado(true);
        System.out.println("Estado del objeto p2: " + p2);
        
        Persona p3 = new Persona();
        System.out.println("Estado del objeto p3: " + p3);
    }
}
