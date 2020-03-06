package eng2020_1_a01;

public class Esfera extends Redondo implements TresD {

	public Esfera(double raio) {
		super(raio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double volume() {
		return (4*Math.PI*Math.pow(getRaio(), 3))/3;
	}

	@Override
	public String toString() {
		return "Esfera [getRaio()=" + getRaio() + "]";
	}

}
