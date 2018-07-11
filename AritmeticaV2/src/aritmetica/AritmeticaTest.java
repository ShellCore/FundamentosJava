package aritmetica;

public class AritmeticaTest {
    
    public static void main(String[] args) {
        
        // Creamos un objeto de la clase Aritmetia con el constructor vacío
        Aritmetica obj1 = new Aritmetica();
        
        // Llamamos al método suma y recibimos el valor devuelto
        int resultado = obj1.sumar(5, 3);
        
        System.out.println("\nResultado de la suma directa obj1: " + resultado);
        
        /**
         * Si llamamos directamente al método sumar sin argumentos el valor es 
         * cero, ya que los atributos del objeto nunca se inicializaron ya que
         * no se usó el constructor con argumentos, sino el constructor vacío.
         */
        System.out.println("\nResultado suma atributos obj1: " + obj1.sumar());
        
        // Ahora creamos un objeto con el constructor con 2 argumentos
        Aritmetica obj2 = new Aritmetica(2, 1);
        
        /**
         * Mostramos directamente el resultado. Al llamar directamente al método
         * suma, nos regresa el valor de la suma.
         */
        System.out.println("\nResultado suma atributos obj2: " + obj2.sumar());
    }
}
