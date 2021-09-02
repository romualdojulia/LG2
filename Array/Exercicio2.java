package array;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Integer[] array = new Integer[10];
		
		for(int i=9; i>0; i--) {
			array[i] = i;
			System.out.println(array[i]);
		}
	}
}
