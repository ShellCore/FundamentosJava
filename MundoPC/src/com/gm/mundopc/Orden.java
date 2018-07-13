package com.gm.mundopc;

/**
 *
 * @author Shell
 */
public class Orden {
    
    private static final int MAX_COMPUTADORAS = 10;
    
    private static int contadorOrdenes;
    
    private int idOrden;
    private Computadora[] computadoras;
    private int contadorComputadoras;

    public Orden() {
        idOrden = ++contadorOrdenes;
        computadoras = new Computadora[MAX_COMPUTADORAS];
    }
    
    public void agregarComputadora(Computadora computadora) {
        if (contadorComputadoras < MAX_COMPUTADORAS) {
            computadoras[contadorComputadoras++] = computadora;
        } else {
            System.out.println("Se a sobrepasado el máximo de computadoras en la orden (" + MAX_COMPUTADORAS + ")");
        }
    }
    
    public void mostrarOrden() {
        System.out.println("Orden #" + idOrden + ":");
        for (int i = 0; i < contadorComputadoras; i++) {
            System.out.println(computadoras[i]);
        }
    }
}
