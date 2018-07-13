package ventas;

import com.gm.ventas.Orden;
import com.gm.ventas.Producto;

public class Ventas {

    public static void main(String[] args) {

        Producto p1 = new Producto("Camisa", 50);
        Producto p2 = new Producto("Pantalón", 100);
        Producto p3 = new Producto("Corbata", 30);
        
        Orden o1 = new Orden();
        
        o1.agregarProducto(p1);
        o1.agregarProducto(p2);
        o1.agregarProducto(p3);
        
        o1.mostrarOrden();
        
        Producto p4 = new Producto("Zapatos", 200);
        Producto p5 = new Producto("Blusa", 90);
        
        Orden o2 = new Orden();
        
        o2.agregarProducto(p1);
        o2.agregarProducto(p4);
        o2.agregarProducto(p5);
        o2.agregarProducto(p3);
        
        System.out.println("");
        o2.mostrarOrden();
    }
    
}
