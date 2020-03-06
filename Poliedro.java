package eng2020_1_a01;

public abstract class Poliedro extends Figura {
	
	private double largura,comprimento,altura;

	public Poliedro(double largura, double comprimento, double altura) {
		this.largura = largura;
		this.comprimento = comprimento;
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Poliedro [largura=" + largura + ", comprimento=" + comprimento + ", altura=" + altura + "]";
	}





}
