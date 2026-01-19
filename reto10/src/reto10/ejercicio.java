package reto10;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.random.RandomGenerator;

import clases.Barco;
import clases.Catamaran;
import clases.Lancha;
import clases.Motor;
import clases.Puerto;
import clases.Yate;

public class ejercicio {

	public static void main(String[] args) {
		Puerto puerto=new Puerto();
		RandomGenerator rg=RandomGenerator.getDefault();
		ArrayList<Motor> listaMotor=new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			Motor m=new Motor("motor"+i, rg.nextInt(1,100), rg.nextInt(10,20));
			listaMotor.add(m);

		}
		Lancha l1=new Lancha("L1", listaMotor.get(0), rg.nextInt(5,15), false);
		Lancha l2=new Lancha("L2", listaMotor.get(1), rg.nextInt(5,15), false);
		Yate y1=new Yate("Y1", listaMotor.get(2), rg.nextInt(5,15), rg.nextInt(1,5));
		Yate y2=new Yate("Y2", listaMotor.get(3), rg.nextInt(5,15), rg.nextInt(1,5));
		Catamaran C1=new Catamaran("C1", listaMotor.get(4), rg.nextInt(5,15), listaMotor.get(1));
		Catamaran C2=new Catamaran("C2", listaMotor.get(4), rg.nextInt(5,15), listaMotor.get(2));
		
		
		puerto.entrarBarco(l1);
		puerto.entrarBarco(l2);
		puerto.entrarBarco(y1);
		puerto.entrarBarco(y2);
		puerto.entrarBarco(C1);
		puerto.entrarBarco(C2);
		System.out.println("qweqweqweqweeqwe");
		
		double mayorAut=0;
		int indMayorAuto=-1;
		int indice=0;
		for (Barco b : puerto.getLista()) {
			System.out.print(b);
			if (b instanceof Catamaran) {
				Catamaran C=(Catamaran) b;
				System.out.println(C.calcularAutonomia()+"Autonomia");
				if (C.calcularAutonomia()>mayorAut) {
					mayorAut=C.calcularAutonomia();
					indMayorAuto=indice;
				}
			}
			
			System.out.println(b.calcularAutonomia()+"Automia");
			mayorAut=b.calcularAutonomia();
			indMayorAuto=indice;
			indice+=1;
		}
		System.out.println("Barco con mayor autonomia ");
		
	}

}
