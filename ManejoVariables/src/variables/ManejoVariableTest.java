package variables;

public class ManejoVariableTest {
    
    public static void main(String[] args) {
        
        // Variables boolean, declaracion
        boolean bool1;
        // Inicialización
        bool1 = true;
        // Declaración e inicialización
        boolean bool2 = false;
        
        System.out.println("Valor bool1: " + bool1);
        System.out.println("Valor bool2: " + bool2);
        System.out.println("");
        
        // Variables byte
        byte b1 = 10;
        // Literal en exagesimal
        byte b2 = 0xa;
        System.out.println("Valor byte1: " + b1);
        System.out.println("Valor byte2: " + b2);
        System.out.println("");
        
        // Variable short
        short s1 = 2;
        System.out.println("Variable s1" + s1);
        
        // Variable char, declaración e inicialización en una sola linea
        // La primera declaración es UNICODE
        // http://www.icursos.net/referencias/TablaUnicode.html
        char ch1 = 65, ch2 = 'A';
        System.out.println("Valor ch1: " + ch1);
        System.out.println("Valor ch2: " + ch2);
        
        // Variables enteros
        int decimal = 100;
        int octal = 0144; // Valor octal inicia con 0
        int hexa = 0x64; // Valor hexagesimal inicia con 0x
        System.out.println("Valor int decimal: " + decimal);
        System.out.println("Valor int octal: " + octal);
        System.out.println("Valor int hexagesimal: " + hexa);
        System.out.println("");
        
        // Variables long
        long long1 = 10, long2 = 20L;
        System.out.println("Valor long1: " + long1);
        System.out.println("Valor long2: " + long2);
        System.out.println("");
        
        // Variables float
        float f1 = 15, f2 = 22.3F;
        System.out.println("Valor f1: " + f1);
        System.out.println("Valor f2: " + f2);
        System.out.println("");
        
        // Variables double
        double d1 = 11, d2 = 30.15D;
        System.out.println("Valor d1: " + d1);
        System.out.println("Valor d2: " + d2);
        System.out.println("");
    }
}
