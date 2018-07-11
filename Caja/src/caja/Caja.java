package caja;

public class Caja {

    int ancho;
    int alto;
    int profundo;

    Caja() {
    }

    public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    int calcularVolumen() {
        return ancho * alto * profundo;
    }
}
