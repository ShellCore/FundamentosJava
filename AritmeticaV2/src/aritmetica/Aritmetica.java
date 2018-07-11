package aritmetica;

public class Aritmetica {
    
    // Argumentos de la clase
    int a;
    int b;
    
    // Cosntructor vacío
    public Aritmetica() {}
    
    // Constructor con 2 argumentos
    public Aritmetica(int arg1, int arg2) {
        a = arg1;
        b = arg2;
    }
    
    // Éste método realiza la suma de los argumentos
    int sumar(int x, int y) {
        return x + y;
    }
    
    // Éste método toma los atributos de la clase
    int sumar() {
        return a + b;
    }
}
