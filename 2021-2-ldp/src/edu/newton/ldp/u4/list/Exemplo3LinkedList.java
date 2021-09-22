package edu.newton.ldp.u4.list;

import java.util.LinkedList;

public class Exemplo3LinkedList {

	public static void main(String[] args) {
		var lista = new LinkedList<Integer>();
		
		lista.add(4); // 4, 16, 23, 55
		lista.add(16);
		lista.add(23);
		lista.add(55);
		lista.add(63);
		lista.add(81);
		
		System.out.println("Tamanho: " + lista.size());
		for (var item: lista) {
			System.out.println(item);
		}
		
		// 1a posicao
		System.out.println(lista.getFirst());
		// ultima posicao
		System.out.println(lista.getLast());
		
		// remover quem tá na frente - 1a posicao
		System.out.println("Removido 1o: " + lista.removeFirst());
		System.out.println(lista);
		
		// remover o ultimo elemento da lista
		System.out.println("Removido último: " + lista.removeLast());
		System.out.println(lista);		
	}
}
