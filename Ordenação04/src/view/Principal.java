package view;

import controller.Ordena;

public class Principal {

	public static void main(String[] args) {
		Ordena ord = new Ordena();
		
		int[] vetor = {44, 43, 42, 41, 40, 39, 38};
		
		ord.ordenacao(vetor);

	}

}
