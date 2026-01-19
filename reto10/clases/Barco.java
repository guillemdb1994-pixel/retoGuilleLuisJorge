package clases;

public class Barco {
	protected String nombre;
	protected Motor motor;
	protected double capacidadCombustible;

	public Barco(String nombre, Motor motor, double capacidadCombustible) {
		super();
		this.nombre = nombre;
		this.motor = motor;
		this.capacidadCombustible = capacidadCombustible;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public double getCapacidadCombustible() {
		return capacidadCombustible;
	}

	public void setCapacidadCombustible(double capacidadCombustible) {
		this.capacidadCombustible = capacidadCombustible;
	}

	@Override
	public String toString() {
		return "Barco [nombre=" + nombre + ", motor=" + motor + ", capacidadCombustible=" + capacidadCombustible + "]";
	}

	public double calcularAutonomia() {
		return capacidadCombustible / motor.consumo;
	}
}
