package listaencadeada;

import java.util.LinkedList;

public class Ex4 {

	public static void main(String[] args) {

		Integer maiorValor = new Integer(0);
		LinkedList<Integer> lista = new LinkedList<Integer>();
		
		lista.add(1);
		lista.add(45);
		lista.add(19);
		lista.add(88);
		lista.add(32);
		
		for(int i : lista) {  
		      if(i > maiorValor) {
		            maiorValor = i;
		      }
		}

		System.out.println(maiorValor);
	}

}
