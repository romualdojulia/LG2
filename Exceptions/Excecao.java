package exeptions;

public class Excecao {

	public static void main(String[] args) {

		try {
			int[] vetor = new int [4];

			System.out.println("Antes exception");

			vetor[4] = 1;
		}

		catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("Exece��o ao acessar aum �ndice do vetor que n�o existe");
		}

		System.out.println("Esse texto ser� impresso ap�s a exception");
	}

}
