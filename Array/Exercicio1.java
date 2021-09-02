package array;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Integer[] array = new Integer[9];
		
		for(int i=0; i<=8; i++) {
			array[i] = i;
			System.out.println(array[i]);
		}
		
		System.out.println("\nvalores multiplicados por 3\n");
		for(int i=0; i<=8; i++) {
			array[i] = i;
			System.out.println(array[i]*3);
		}
	}
}
