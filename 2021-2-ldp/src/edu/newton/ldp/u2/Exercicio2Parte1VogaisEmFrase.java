package edu.newton.ldp.u2;

import java.util.Scanner;

import edu.newton.ldp.util.LeituraDeDados;

/**
 * Problema:
 * 
 * Entrada: uma frase digitada pelo usuário
 * Saída: informar a quantidade de vogais na frase. 
 *
 * @author wrpires
 * Data: 26/8/2021
 *
 */
public class Exercicio2Parte1VogaisEmFrase {

	private static final String VOGAIS = "aeiouy"; // constante

	/**
	 * Método que verifica se um caractere é vogal ou não.
	 * 
	 * @param c o caractere a ser testado
	 * @return true se for vogal, false o contrário
	 */
	private static boolean caractereEhVogal(char c) {
		return VOGAIS.contains(""+c);		
	}
	
	public static void main(String[] args) {
		// declaração de variáveis
		var contVogais = 0;
		
		// entrada
		var frase = LeituraDeDados.lerFraseDaTela();
		var frase2 = LeituraDeDados.lerFraseDaTela();
		var frase3 = LeituraDeDados.lerFraseDaTela();
		var frase4 = LeituraDeDados.lerFraseDaTela();
		var frase5 = LeituraDeDados.lerFraseDaTela();
		
		// processamento
		for(var i = 0; i < frase.length(); i++) {
			var caractere = frase.charAt(i);
			
			if (caractereEhVogal(caractere)) {
				contVogais++;
			}
			
//			if (caractere == 'a' || caractere == 'e' || caractere == 'i' 
//					|| caractere == 'o' || caractere == 'u') {
//				contVogais++;
//			}
		}
		
		// saída
		System.out.println("A frase possui " + contVogais + " vogais.");
	}

}
