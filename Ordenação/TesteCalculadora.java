package algoritmosDeOrdenação;

public class TesteCalculadora {

	public static void main(String[] args) {
		
		int fatorialNR = Calculadora.fatorialNaoRecursivo(5);
		System.out.println(fatorialNR);
		
		int fatorialIR = Calculadora.fatorial(5);
		System.out.println(fatorialIR);
	}

}
