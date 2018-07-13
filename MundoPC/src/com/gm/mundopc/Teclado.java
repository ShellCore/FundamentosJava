package com.gm.mundopc;

/**
 *
 * @author Shell
 */
public class Teclado extends DispositivoEntrada {
    
    private static int contadorTeclados;
    
    private int idTeclado;

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        idTeclado = ++contadorTeclados;
    }
    
    @Override
    public String toString() {
        return "Teclado: {"
                + "idTeclado: " + idTeclado
                + ", " + super.toString()
                + "}";
    }
}
