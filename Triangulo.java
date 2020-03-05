package eng2020_1_a01;

public class Triangulo extends Poligono {

	@Override
	public double area() {
		return getBase()*getAltura()/2;
	}

	public Triangulo(double base, double altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Triangulo [getBase()=" + getBase() + ", getAltura()=" + getAltura() + "]";
	}

	@Override
	public double perimetro() {
		return 0;
	}



}
