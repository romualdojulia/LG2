package listaencadeada;

import java.util.LinkedList;

public class Ex1 {
	public static void main(String[] args) {
		
		Integer soma = 0;
		LinkedList<Integer> lista = new LinkedList<Integer>();
	
		lista.add(10);
		lista.add(8);
		lista.add(45);
		lista.add(17);
		lista.add(9);
		lista.add(11);
		
		for(int i=0;i<lista.size(); i++) {
			soma+=lista.get(i);
		}
	
		System.out.println(soma);
	}	
}
