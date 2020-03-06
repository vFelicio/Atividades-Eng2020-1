package eng2020_1_a01;

public class Circulo extends Redondo implements DoisD {
	
	public Circulo(double raio) {
		super(raio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(getRaio(), 2);
	}

	@Override
	public String toString() {
		return "Circulo [raio=" + getRaio() + "]";
	}

	@Override
	public double perimetro() {
		return 2* Math.PI * getRaio();	
	}

}
