package exeptions;

public class Excecao {

	public static void main(String[] args) {

		try {
			int[] vetor = new int [4];

			System.out.println("Antes exception");

			vetor[4] = 1;
		}

		catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("Execeção ao acessar aum índice do vetor que não existe");
		}

		System.out.println("Esse texto será impresso após a exception");
	}

}
