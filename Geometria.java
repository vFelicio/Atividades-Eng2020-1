package eng2020_1_a01;

import java.util.ArrayList;

public class Geometria {

	public Geometria() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		ArrayList<Figura> figuras = new ArrayList();
		figuras.add(new Circulo(1.0));
		figuras.add(new Circulo(10.0));
		figuras.add(new Retangulo(5, 10));
		figuras.add(new Quadrado(10));
		figuras.add(new Triangulo(5, 7));
		figuras.add(new Losango(8, 9));
		figuras.add(new Trapezio(10, 5, 8));
		figuras.add(new Cubo(3,3,3));
		figuras.add(new Piramide(4,4,6));
		figuras.add(new Esfera(2));
		figuras.add(new Cilindro(3,6));
		
		for(Figura figura: figuras) {
			System.out.println("**********************************************");
			System.out.println(figura);
			if (figura instanceof DoisD) {
				DoisD two = (DoisD)figura;
				System.out.println("Area = "+two.area());
				System.out.println("Perimetro = "+two.perimetro());
			}
			if (figura instanceof TresD) {
				TresD three = (TresD)figura;
				System.out.println("Volume = "+three.volume());
			}

			if (figura instanceof Diagonal) {
				Diagonal d = (Diagonal)figura;
				System.out.println("Diagonal = "+d.diagonal());
			}
		}
	}

}
