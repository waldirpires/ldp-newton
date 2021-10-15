package edu.newton.ldp.av1.revisao;

import java.util.ArrayList;

/**
 * 
Problema 1:
Entrada: Uma sequência de números pares de 0 a 100
Saída: Armazenar estes números numa lista dinâmica (ArrayList), calcular e exibir a soma destes números 
       (somátório de todos os pares)       
      
 * @author wrpires
 *
 */
public class Exercicio1 {

	public static void main(String[] args) {

		var lista = new ArrayList<Integer>();
		//var vetor = new int[20]; // lista estática (tamanho)
		var soma = 0;
		
		/**
		 *1. Uma sequência de números pares de 0 a 100
		 *2. Armazenar estes números numa lista dinâmica (ArrayList)
		 *3. calcular a soma destes números       (somátório de todos os pares)
		 *4. exibir esta soma
		 */
		
		// 1
		for (int i = 0; i <=100; i = i + 2) {
			lista.add(i); // 2
			soma = soma + i;
		}
		
		System.out.println("Lista: " + lista);
		System.out.println("Soma: " + soma);
	}
}
