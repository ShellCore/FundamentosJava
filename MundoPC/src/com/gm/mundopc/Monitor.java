package com.gm.mundopc;

/**
 *
 * @author Shell
 */
public class Monitor {
    
    private static int contadorMonitores;
    
    private int idMonitor;
    private String marca;
    private double tamano;

    private Monitor() {
        idMonitor = ++contadorMonitores;
    }

    public Monitor(String marca, double tamano) {
        this();
        this.marca = marca;
        this.tamano = tamano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }
    
    @Override
    public String toString() {
        return "Monitor: {"
                + "idMonitor: " + idMonitor
                + ", Marca: " + marca
                + ", Tamaño: " + tamano
                + "}";
    }
}
