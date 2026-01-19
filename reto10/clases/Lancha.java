package clases;

public class Lancha extends Barco {
	protected boolean cubierta;

	public Lancha(String nombre, Motor motor, double capacidadCombustible, boolean cubierta) {
		super(nombre, motor, capacidadCombustible);
		this.cubierta = cubierta;
	}

	public boolean isCubierta() {
		return cubierta;
	}

	public void setCubierta(boolean cubierta) {
		this.cubierta = cubierta;
	}

	@Override
	public String toString() {
		return "Lancha [cubierta=" + cubierta + ", toString()=" + super.toString() + "]";
	}

	@Override
	public double calcularAutonomia() {
		// TODO Auto-generated method stub
		return super.calcularAutonomia();
	}

}
