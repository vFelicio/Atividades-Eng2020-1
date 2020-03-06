package eng2020_1_a01;

public class Piramide extends Poliedro implements TresD {

	public Piramide(double largura, double comprimento, double altura) {
		super(largura, comprimento, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double volume() {
		return (getLargura()*getComprimento()*getAltura())/3;
	}

	@Override
	public String toString() {
		return "Piramide [getLargura()=" + getLargura() + ", getComprimento()=" + getComprimento() + ", getAltura()="
				+ getAltura() + "]";
	}

}
