package caja;

public class CajaTest {
    
    public static void main(String[] args) {
        
        int ancho = 3;
        int alto = 2;
        int profundo = 6;
        
        Caja obj1 = new Caja(ancho, alto, profundo);
        
        int volumen = obj1.calcularVolumen();
        
        System.out.println("Volumen: " + volumen);
    }
}
