package cl.infoclub.fsj.desafio15;

public class Calculadora {
	public float suma(float n1,float n2) {
		return n1+n2;
	}
	
	public float restar(float n1,float n2) {
		return n1-n2;
	}
	
	public float multiplicar(float n1,float n2) {
		return n1*n2;
	}
	
	public float dividir(float n1,float n2) {
		if (n2!=0.0f) {
			return n1/n2;
		}else {
			System.out.println("No se puede dividir por cero.");
			return 0.0f;
		}
	}

	public Calculadora() {
		super();
	}
	
	
}
