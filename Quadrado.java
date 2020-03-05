package eng2020_1_a01;

public class Quadrado extends Poligono implements Diagonal {

	public Quadrado(double lado) {
		super(lado, lado);
	}

	@Override
	public double diagonal() {
		return getAltura()*Math.sqrt(2);
	}

	@Override
	public double area() {
		return getAltura()*getBase();
	}

	@Override
	public String toString() {
		return "Quadrado [getBase()=" + getBase() + ", getAltura()=" + getAltura() + "]";
	}

	@Override
	public double perimetro() {
		return 4*getAltura();
	}

}
