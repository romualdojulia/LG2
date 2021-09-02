package array;

public class Exercicio4 {

	public static void main(String[] args) {

		Integer[][] a = new Integer[50][100];
		
		for(int i=49;i>0;i--) {
			for(int j=99; j>0;j--) {
				a[i][j] = i+j;
				System.out.println(a[i][j]);
			}
		}
	}
}
