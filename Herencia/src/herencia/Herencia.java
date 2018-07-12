package herencia;

import java.util.Date;

public class Herencia {

    public static void main(String[] args) {
        
        Empleado e1 = new Empleado("Juan", 25000);
        System.out.println("\nImprimimos el objeto Empleado1");
        System.out.println(e1);
        
        Empleado e2 = new Empleado("Pedro", 15000);
        e2.setEdad(28);
        e2.setGenero('M');
        e2.setDireccion("Bogotá, Colombia");
        System.out.println("\nImprimimos el objeto Empleado2");
        System.out.println(e2);
        
        Cliente c1 = new Cliente(new Date(), false);
        System.out.println("\nImprimimos el objeto Cliente1");
        System.out.println(c1);
        c1.setNombre("Karla");
        c1.setEdad(22);
        c1.setGenero('F');
        c1.setDireccion("México, D.F.");
        System.out.println("\nVolvemos a imprimir el objeto Cliente1 actualizado");
        System.out.println(c1);
    }
    
}
