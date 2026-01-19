package reto10;
import clases.*;

public class ejercicio {
    public static void main(String[] args) {
        Puerto puerto = new Puerto();

        Motor m1 = new Motor("Yamaha 200", 200, 10.0);
        Motor m2 = new Motor("Honda 150", 150, 8.5);
        Motor m3 = new Motor("Suzuki 300", 300, 15.0);
        Motor m4 = new Motor("Mercury 100", 100, 5.0);
        Motor m5 = new Motor("Volvo 500", 500, 20.0);

        Lancha l1 = new Lancha("Lancha1", m1, 100, true);
        Lancha l2 = new Lancha("Lancha2", m2, 120, false);
        
        Yate y1 = new Yate("Yate1", m3, 500, 10);
        Yate y2 = new Yate("Yate2", m5, 600, 12);
        
        Catamaran c1 = new Catamaran("Catamaran1", m1, 300, m2);
        Catamaran c2 = new Catamaran("Catamaran2", m4, 250, m4);

        puerto.entraBarco(l1);
        puerto.entraBarco(l2);
        puerto.entraBarco(y1);
        puerto.entraBarco(y2);
        puerto.entraBarco(c1);
        puerto.entraBarco(c2);

        System.out.println("\n--- LISTADO DE BARCOS Y AUTONOMÍA ---");
        for (Barco b : puerto.getLista()) {
            System.out.println(b.toString());
            System.out.println(b.getNombre() + " puede realizar el viaje. Coste: " + b.calcularAutonomia()  + "€");
        }

       

        
        Barco mayorAutonomia = null;
        Barco menorAutonomia = null;
        double maxAut = -1;
        double minAut = Double.MAX_VALUE;

        for (Barco b : puerto.getLista()) {
            double aut = b.calcularAutonomia();
            if (aut > maxAut) {
                maxAut = aut;
                mayorAutonomia = b;
            }
            if (aut < minAut) {
                minAut = aut;
                menorAutonomia = b;
            }
        }
        
        System.out.println("\n--- ESTADÍSTICAS AUTONOMÍA ---");
        if (mayorAutonomia != null)
        	System.out.println("Mayor autonomía: " + mayorAutonomia.getNombre() + " (" + maxAut + " h)");
        if (menorAutonomia != null)
        	System.out.println("Menor autonomía: " + menorAutonomia.getNombre() + " (" + minAut + " h)"); 

        // 
        System.out.println("\n--- SIMULACIÓN VIAJE (5h, 1.50€) ---");
        double precioCombustible = 1.50;
        int horasViaje = 5;

        for (Barco b : puerto.getLista()) {
            double coste = puerto.calcularPrecioViaje(b, horasViaje, precioCombustible);
            if (coste != -1) {
            	System.out.println(b.getNombre() + " puede realizar el viaje. Coste: " + coste + "€");
            } 
            // Si devuelve -1 no se muestra, según instrucciones ("muestra solo los barcos que pueden realizarlo")
        }

  
        System.out.println("\n--- SALIDA DE BARCO ---");
        puerto.salirBarco("Lancha1");
    }
}
