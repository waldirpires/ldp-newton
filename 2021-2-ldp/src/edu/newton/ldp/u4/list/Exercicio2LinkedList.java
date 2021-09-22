package edu.newton.ldp.u4.list;

import java.util.LinkedList;

public class Exercicio2LinkedList {

	/**
	 * Problema
	 * Entrada: um conjunto de chaves/valores dentro 
	 * de uma lista encadeada (LinkedList) predefinida
 	 * Saída: 
	 * Listagem das chaves;valores numa lista encadeada 
	 * em ordem invertida (final primeiro)

	 * @param args
	 */
	public static void main(String[] args) {
		var lista = new LinkedList<Integer>();
		
		lista.add(4); // 4, 16, 23, 55
		lista.add(16);
		lista.add(23);
		lista.add(55);
		lista.add(63);
		lista.add(81);
		
		while (!lista.isEmpty()) {
			System.out.println(
					lista.removeLast()
					);
		}

		
	}
}
