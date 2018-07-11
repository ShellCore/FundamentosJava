package palabrareturnclases;

public class PalabraReturnClases {

    public static void main(String[] args) {
        Suma s = creaObjetoSuma();
        int resultado = s.a + s.b;
        System.out.println("Resultado: " + resultado);
    }
    
    public static Suma creaObjetoSuma() {
        Suma s = new Suma(3, 4);
        return s;
    }
    
}
