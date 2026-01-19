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
	
	public void entrarBarco(Barco barco) {
		if (lista.size()>=6) {
			System.out.println("Puerto lleno");
		} else {
			lista.add(barco);
		}
	}
	
	

}
