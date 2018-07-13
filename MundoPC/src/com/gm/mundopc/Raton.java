package com.gm.mundopc;

/**
 *
 * @author Shell
 */
public class Raton extends DispositivoEntrada {
    
    private static int contadorRatones;
    
    private int idRaton;

    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        idRaton = ++contadorRatones;
    }

    @Override
    public String toString() {
        return "Raton: {"
                + "idRaton: " + idRaton
                + ", " + super.toString()
                + "}";
    }
}
