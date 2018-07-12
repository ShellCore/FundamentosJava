package ejemplopalabrafinal;

public final class ClaseFinal {
    
    // Variables marcadas como finales
    public static final int varPrimitivo = 10;
    public static final Persona persona = new Persona();
    
    public final void metodoFinal() {    
    }
}

// Marca error: No se puede heredar de una clase final
// class ClaseHija extends ClaseFinal {}
