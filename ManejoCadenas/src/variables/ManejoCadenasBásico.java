package variables;

public class ManejoCadenasBásico {
    
    public static void main(String[] args) {
        String nombre = "María";
        String apellido = "Esparza";
        
        System.out.println("Concatenación: " + nombre + apellido);
        System.out.println("Nueva línea: \n" + nombre + " " + apellido);
        System.out.println("Tabulador: \t" + nombre + " " + apellido);
        System.out.println("Retroceso: \b" + nombre + " " + apellido);
        System.out.println("Retorno de carro: \r" + nombre + " " + apellido);
        System.out.println("Comilla simple: \'" + nombre + " " + apellido + "\'");
        System.out.println("Comilla doble: \"" + nombre + " " + apellido + "\"");
    }
}
