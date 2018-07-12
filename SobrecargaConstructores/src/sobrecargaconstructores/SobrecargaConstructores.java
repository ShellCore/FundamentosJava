package sobrecargaconstructores;

public class SobrecargaConstructores {

    public static void main(String[] args) {
        Persona p1 = new Persona("Lilia", 22);
        System.out.println("\nImprimir el objeto p1");
        System.out.println(p1);
        
        Persona p2 = new Persona("Juan", 33);
        System.out.println("\nImprimir el objeto p2");
        System.out.println(p2);
        
        Empleado e1 = new Empleado("Pedro", 29, 18000);
        System.out.println("\nImprimir el objeto e1");
        System.out.println(e1);
    }
    
}
