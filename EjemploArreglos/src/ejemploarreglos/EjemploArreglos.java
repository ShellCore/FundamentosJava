package ejemploarreglos;

import com.gm.dominio.arreglos.Persona;

public class EjemploArreglos {

    public static void main(String[] args) {
        
        int[] edades;
        edades = new int[3];
        
        edades[0] = 10;
        edades[1] = 15;
        edades[2] = 20;
        
        System.out.println("Arreglo entero índice 0: " + edades[0]);
        System.out.println("Arreglo entero índice 1: " + edades[1]);
        System.out.println("Arreglo entero índice 2: " + edades[2]);
        
        Persona[] personas;
        personas = new Persona[4];
        
        personas[0] = new Persona("Juan");
        personas[1] = new Persona("Karla");
        personas[2] = new Persona("Pedro");
        
        System.out.println("");
        System.out.println("Arreglo personas índice 0: " + personas[0]);
        System.out.println("Arreglo personas índice 1: " + personas[1]);
        System.out.println("Arreglo personas índice 2: " + personas[2]);
        
        String[] nombres = {
            "Sara",
            "Laura",
            "Carlos",
            "Carmen"
        };
        
        System.out.println("");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Arreglo nombres índice " + i + ": " + nombres[i]);
        }
    }
    
}
