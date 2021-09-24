package edu.newton.ldp.u4.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ExercicioFila3 {

	/**
	 * Problema:
	 * Entrada: fila (A) previamente criada de nomes (String)
	 * Saída: gerar uma nova fila (B) invertida de (A)
	 * 
	 * ex: FRENTE: João Maria Manuel Judite Ricardo TRAS
	 *     FRENTE: Ricardo Judite Manuel Maria João TRAS
	 * @param args
	 */
	public static void main(String[] args) {
		// entrada
		
		// criando a fila vazia - FIFO
		Queue<String> fila = new LinkedList<>();
		
		// adicionando utilizando a estratégia FIFO
		fila.offer("João");
		fila.offer("Maria");
		fila.offer("Manuel");
		fila.offer("Judite");
		fila.offer("Ricardo");

		System.out.println("Original: " + fila);
		
		// processamento
		// pilha intermediária - LIFO
		var pilha = new Stack<String>();
		
		while (!fila.isEmpty()) {
			// tirando da fila, colocando na pilha
			pilha.push(fila.poll());
		}
		
		Queue<String> fila2 = new LinkedList<>();
		while (!pilha.isEmpty()) {
			fila2.offer(pilha.pop());
		}
		
		// saída
		System.out.println("Invertida: " + fila2);
	}
}
