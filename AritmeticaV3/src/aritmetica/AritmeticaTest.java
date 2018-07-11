package aritmetica;

public class AritmeticaTest {
    
    public static void main(String[] args) {
        
        // Variables locales
        int operandoA = 6;
        int operandoB = 2;
        
        // Creamos un objeto de la clase Aritmetica enviado argumentos
        Aritmetica obj1 = new Aritmetica(operandoA, operandoB);
        
        // Imprimir operadores
        System.out.println("Operando A: " + operandoA);
        System.out.println("Operando B: " + operandoB);
        
        // Resultado de las operaciones
        System.out.println("\nResultado suma: " + obj1.sumar());
        System.out.println("\nResultado resta: " + obj1.restar());
        System.out.println("\nResultado multiplicación: " + obj1.multiplicar());
        System.out.println("\nResultado división: " + obj1.dividir());
        
    }
}
