package ciclos;

import java.util.Scanner;

public class CicloWhileV2 {
    
    public static void main(String[] args) {
        System.out.println("Ingrese el número de elementos a iterar:");
        
        int maxElementos;
        Scanner entradaScanner = new Scanner(System.in);
        maxElementos = entradaScanner.nextInt();
        int contador = 0;
        while (contador < maxElementos) {
            System.out.println("Contador: " + contador);
            contador++;
        }
    }
}
