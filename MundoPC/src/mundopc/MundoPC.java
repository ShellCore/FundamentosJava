package mundopc;

import com.gm.mundopc.*;

/**
 *
 * @author Shell
 */
public class MundoPC {

    public static void main(String[] args) {
        
        // Monitores
        Monitor m1 = new Monitor("Sony", 14);
        Monitor m2 = new Monitor("Samsung", 21);
        Monitor m3 = new Monitor("Apple", 17);
        Monitor m4 = new Monitor("Dell", 15);
        
        // Teclados
        Teclado t1 = new Teclado("Español", "Logitech");
        Teclado t2 = new Teclado("Inglés", "Apple");
        Teclado t3 = new Teclado("Castellano", "Logitech");
        
        // Ratones
        Raton r1 = new Raton("USB", "Logitech");
        Raton r2 = new Raton("USB", "Microsoft");
        Raton r3 = new Raton("Wireless", "Apple");
        Raton r4 = new Raton("Wireless", "Logitech");
        Raton r5 = new Raton("Bluetooth", "Perfect Choice");
        Raton r6 = new Raton("Bluetooth", "Microsoft");
        
        // Computadoras
        Computadora p1 = new Computadora("Dell", m4, t1, r5);
        Computadora p2 = new Computadora("Dell", m3, t3, r6);
        Computadora p3 = new Computadora("Azus", m2, t3, r2);
        Computadora p4 = new Computadora("HP", m1, t2, r4);
        Computadora p5 = new Computadora("Azus", m2, t3, r5);
        Computadora p6 = new Computadora("Apple", m3, t1, r4);
        Computadora p7 = new Computadora("Dell", m3, t1, r4);
        Computadora p8 = new Computadora("HP", m4, t3, r4);
        Computadora p9 = new Computadora("HP", m1, t3, r4);
        Computadora p10 = new Computadora("Dell", m4, t3, r3);
        Computadora p11 = new Computadora("Azus", m3, t3, r1);
        Computadora p12 = new Computadora("HP", m2, t2, r4);
        Computadora p13 = new Computadora("Alienware", m3, t2, r2);
        Computadora p14 = new Computadora("Alienware", m3, t1, r2);
        Computadora p15 = new Computadora("Apple", m4, t1, r1);
        Computadora p16 = new Computadora("HP", m1, t1, r5);
        Computadora p17 = new Computadora("Apple", m2, t2, r6);
        Computadora p18 = new Computadora("HP", m3, t3, r6);
        Computadora p19 = new Computadora("Alienware", m4, t2, r6);
        Computadora p20 = new Computadora("Apple", m1, t2, r6);
        Computadora p21 = new Computadora("Alienware", m4, t2, r5);
        Computadora p22 = new Computadora("HP", m2, t2, r4);
        Computadora p23 = new Computadora("Apple", m4, t1, r3);
        Computadora p24 = new Computadora("Apple", m1, t3, r1);
        
        // Ordenes
        Orden o1 = new Orden();
        o1.agregarComputadora(p1);
        o1.agregarComputadora(p2);
        o1.agregarComputadora(p3);
        o1.agregarComputadora(p4);
        o1.agregarComputadora(p5);
        o1.agregarComputadora(p6);
        o1.agregarComputadora(p7);
        o1.agregarComputadora(p8);
        
        Orden o2 = new Orden();
        o2.agregarComputadora(p9);
        o2.agregarComputadora(p10);
        o2.agregarComputadora(p11);
        o2.agregarComputadora(p12);
        o2.agregarComputadora(p13);
        o2.agregarComputadora(p14);
        o2.agregarComputadora(p15);
        o2.agregarComputadora(p16);
        o2.agregarComputadora(p17);
        o2.agregarComputadora(p18);
        
        Orden o3 = new Orden();
        o3.agregarComputadora(p19);
        o3.agregarComputadora(p20);
        o3.agregarComputadora(p21);
        o3.agregarComputadora(p22);
        o3.agregarComputadora(p23);
        o3.agregarComputadora(p24);
        
        // Impresion de ordenes
        o1.mostrarOrden();
        System.out.println("");
        o2.mostrarOrden();
        System.out.println("");
        o3.mostrarOrden();
        
    }
    
}
