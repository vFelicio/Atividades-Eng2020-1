package eng2020_1_a01;

public class Losango extends Poligono {

	public Losango(double base, double altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		return getBase()*getAltura();
	}
	
	@Override
	public String toString() {
		return "Losango [getBase()=" + getBase() + ", getAltura()=" + getAltura() + "]";
	}

	@Override
	public double perimetro() {
		return 4*getBase();
	}
}
