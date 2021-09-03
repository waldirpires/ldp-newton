package edu.newton.ldp.u2;

import java.util.Scanner;

/**
 * Problema:
 * 
 * Entrada: um número inteiro N digitado pelo usuário
 * Saída: exibir a Taboada de N
 * 
 * @author wrpires
 *
 */
public class Exercicio8Parte3Taboada {

	public static void main(String[] args) {
		// declaração de variáveis
		var scanner = new Scanner(System.in);
		
		// entrada
		System.out.println("Digite um número inteiro:");
		var n = scanner.nextInt();
		
		System.out.println("\nTaboada de " + n);
		System.out.println("======================");
		
		// processamento e saída
		for (var i = 0; i <= 10; i++) {
			var r = n * i;
			
			System.out.println(n + " * " + i + " = " + r);
		}
		
		// fechamento de recursos
		scanner.close();
	}

}
