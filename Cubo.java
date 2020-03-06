package eng2020_1_a01;

public class Cubo extends Poliedro implements TresD {

	public Cubo(double largura, double comprimento, double altura) {
		super(largura, comprimento, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double volume() {
		return getLargura()*getComprimento()*getAltura();
	}

	@Override
	public String toString() {
		return "Cubo [getLargura()=" + getLargura() + ", getComprimento()=" + getComprimento() + ", getAltura()="
				+ getAltura() + "]";
	}

}
