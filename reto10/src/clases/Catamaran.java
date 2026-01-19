package clases;

public class Catamaran extends Barco {
protected Motor motorSecundario;

public Catamaran(String nombre, Motor motor, double capacidadCombustible, Motor motorSecundario) {
	super(nombre, motor, capacidadCombustible);
	this.motorSecundario = motorSecundario;
}

public Motor getMotorSecundario() {
	return motorSecundario;
}

public void setMotorSecundario(Motor motorSecundario) {
	this.motorSecundario = motorSecundario;
}

@Override
public String toString() {
	return "Catamaran [motorSecundario=" + motorSecundario + ", toString()=" + super.toString() + "]";
}

@Override
public double calcularAutonomia() {
	// TODO Auto-generated method stub
	return (super.calcularAutonomia()+(super.capacidadCombustible+motorSecundario.consumo))/2;
}

}
