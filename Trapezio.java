package eng2020_1_a01;

public class Trapezio extends Poligono implements DoisD {

	private double basemaior;
	
	public Trapezio(double basemaior, double base, double altura) {
		super(base, altura);
		this.basemaior = basemaior;
		// TODO Auto-generated constructor stub
	}

	public double getBasemaior() {
		return basemaior;
	}

	public void setBasemaior(double basemaior) {
		this.basemaior = basemaior;
	}

	@Override
	public double area() {
		return ((getBasemaior()+getBase())*getAltura())/2;
	}

	@Override
	public double perimetro() {
		return 0;
	}

	@Override
	public String toString() {
		return "Trapezio [Base maior=" + basemaior + ", getBase()=" + getBase() + ", getAltura()=" + getAltura() + "]";
	}

}
