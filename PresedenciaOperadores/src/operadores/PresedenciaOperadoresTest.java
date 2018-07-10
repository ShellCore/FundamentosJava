package operadores;

public class PresedenciaOperadoresTest {

    public static void main(String[] args) {
        System.out.println("Primer ejemplo Precedencia Operadores");
        int x = 5;
        int y = 10;
        int z = ++x * y--;
        
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        System.out.println("\nEjemplo Evaluación");
        System.out.println(4 + 5 * 6 / 3);
        System.out.println((4 + 5) * (6 / 3));
        
        System.out.println("\nOtro ejemplo Evaluación");
        System.out.println(1 + 2 - 3 * 4 / 5);
        System.out.println(1 + 2 - (3 * (4 / 5)));
        
        System.out.println("\nOtro ejemplo");
        // Si detecta una cadena, lo demás lo convierte a cadena
        System.out.println("1 + 2 = " + 1 + 2);
        // Los paréntesis rompen ésta regla, ya que tiene mayor prioridad
        System.out.println("(1 + 2) = " + (1 + 2));
        
        System.out.println("\nOtro ejemplo");
        // El operador + es asociativo a la izquierda
        System.out.println(1 + 2 + "abc"); // Detecta la operación primero
        System.out.println("abc" + 1 + 2); // Detecta una cadena primero
    }
}
