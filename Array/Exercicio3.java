package array;

public class Exercicio3 {

	public static void main(String[] args) {

		Integer[][] arraybid = new Integer[100][100];
		
		for(int i=0; i<100;i++) {
			for(int j=0;j<100;j++) {
				arraybid[i][j] = i-j;
				System.out.println(arraybid[i][j]);
			}
		}
		
		for(int i=0; i<100;i++) {
			for(int j=0;j<100;j++) {
				arraybid[i][j] *=7; 
				System.out.println(arraybid[i][j]);
			}
		}
	}
}
