package eng2020_1_a01;

public class Cilindro extends Redondo implements TresD {

	private double altura;
	
	public Cilindro(double raio, double altura) {
		super(raio);
		this.altura = altura;
	}
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double volume() {
		return Math.PI*Math.pow(getRaio(), 3)*getAltura();
	}

	@Override
	public String toString() {
		return "Cilindro [getAltura()=" + getAltura() + ", getRaio()=" + getRaio() + "]";
	}



}
