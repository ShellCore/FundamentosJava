package operadores;

public class ManejoOperadoresTest {
    
    public static void main(String[] args) {
        
        System.out.println("Operadores aritméticos:");
        int a = 1 + 2;
        int b = a * 4;
        int c = b / 2;
        int d = c - a;
        int e = -d;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        
        System.out.println("\nOperador módulo (residuo):");
        System.out.println("a mod 2 = " + (a % 2));
        
        System.out.println("\nOperador compuesto:");
        // a = a + 2;
        a += 2;
        b -= 4;
        c *= a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        
        System.out.println("\nOperador incremento:");
        // a = a + 1
        a++;
        System.out.println("a = " + a);
        // Preincremento (se incrementa antes de asignar el valor)
        c = ++a;
        // Postincremento (se incrementa después de asignar el valor)
        // La siguiente vez que se evalúa b, es cuando se incrementa
        d = b++;
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
        System.out.println("\nOperador relacional:");
        // a es menor que b
        boolean res = a < b;
        System.out.println("res = " + res);
        
        System.out.println("\nOperador ternario:");
        int min = (a < b) ? a : b;
        System.out.println("min = " + min);
        
        System.out.println("\nOperador de asignación:");
        int i, j, k;
        // Cadena de asignación
        i = j = k = 100; // valor de i, j, y k es igual a 100;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
    }
}
