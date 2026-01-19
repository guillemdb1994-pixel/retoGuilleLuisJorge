package clases;

import java.util.ArrayList;

public class Puerto {
	protected ArrayList<Barco> lista;

	public Puerto(ArrayList<Barco> lista) {
		super();
		this.lista = new ArrayList<>() ;
	}

	public ArrayList<Barco> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Barco> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Puerto [lista=" + lista + "]";
	}
	
	// ENTRA BARCO
	public void entrarBarco(Barco barco) {
		if (lista.size()>=6) {
			System.out.println("Puerto lleno");
		} else {
			lista.add(barco);
		}
	}
	
	// SALIR BARCO
	
	public boolean salirBarco(String nombre) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNombre().equalsIgnoreCase(nombre)) {
                lista.remove(i);
                System.out.println("Barco " + nombre + " ha salido del puerto.");
                return true;
            }
        }
        System.out.println("El barco no está en el puerto.");
        return false;
    }
	
	// CALCULAR PRECIO VIAJE
	
	
    public double calcularPrecioViaje(Barco b, int horas, double precioCombustible) {
    	
        if (b.calcularAutonomia() < horas) {
            return -1;
        }
        
        return horas * b.getMotor().getConsumo() * precioCombustible;
    }
    
    
    
    
    
	

}
























