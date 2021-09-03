package edu.newton.ldp.u1;

import javax.swing.JOptionPane;

import edu.newton.ldp.util.LeituraDeDados;

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

	private static boolean ehPar(int n) {
		var r = n % 2; // modulo: calcula o resto da divisão 
		
		return r == 0; // se o resto for igual a zero, retornar true, false o contrário
	}
	
	public static void main(String[] args) {
		
		// declaração de variáveis
		int n, r;
		boolean ehPar = false; // assumindo que o numero é impar
		
		// entrada
//		String valor = JOptionPane.showInputDialog("Digite um número inteiro:");
//		// transformar de String para inteiro 
//		n = Integer.parseInt(valor);

		n = LeituraDeDados.lerNumeroInteiro();
		
//		// processamento
//		r = n % 2; // modulo: calcula o resto da divisão 
//		
//		if (r == 0) { // se o resto for igual a zero
//			ehPar = true;
//		}
		ehPar = ehPar(n);
		
		// saída		
		JOptionPane.showMessageDialog(null, "O número é " + (ehPar?"PAR":"IMPAR"));		
	}
}
