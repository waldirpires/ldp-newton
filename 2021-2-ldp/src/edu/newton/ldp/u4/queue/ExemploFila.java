package edu.newton.ldp.u4.queue;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploFila {

	public static void main(String[] args) {
		// criando a fila vazia
		Queue<String> fila = new LinkedList<>();
		
		// adicionando utilizando a estratégia FIFO
		fila.offer("João");
		fila.offer("Maria");
		fila.offer("Manuel");
		fila.offer("Judite");
		fila.offer("Ricardo");
		
		// imprimir a fila completa
		System.out.println("FILA: tamanho " + fila.size());
		System.out.println("FRENTE: " + fila.peek() + "\n");
		System.out.print("FRENTE: ");
		for (var item: fila) {
			System.out.print(item + " ");
		}
		System.out.println("TRAS\n");
		
		// retirada quem está na frente
		System.out.println("Saiu: " + fila.poll());

		// imprimir a fila depois da saida
		System.out.println("FILA: tamanho " + fila.size());
		System.out.println("FRENTE: " + fila.peek() + "\n");
		System.out.print("FRENTE: ");
		for (var item: fila) {
			System.out.print(item + " ");
		}
		System.out.println("TRAS\n");
		
	}
}
