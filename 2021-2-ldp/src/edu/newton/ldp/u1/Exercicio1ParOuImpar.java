package edu.newton.ldp.u1;

import javax.swing.JOptionPane;

/**
 * Problema
 * 
 * Entrada: um número inteiro digitado pelo usuário
 * Saída: informar se o número é par ou ímpar.l
 * 
 * @author wrpires
 *
 */
public class Exercicio1ParOuImpar {

	public static void main(String[] args) {
		
		// declaração de variáveis
		int n, r;
		boolean ehPar = false; // assumindo que o numero é impar
		
		// entrada
		String valor = JOptionPane.showInputDialog("Digite um número inteiro:");
		// transformar de String para inteiro 
		n = Integer.parseInt(valor);
		
		// processamento
		r = n % 2; // modulo: calcula o resto da divisão 
		
		if (r == 0) { // se o resto for igual a zero
			ehPar = true;
		}
		
		// saída		
		JOptionPane.showMessageDialog(null, "O número é " + (ehPar?"PAR":"IMPAR"));		
	}
}
