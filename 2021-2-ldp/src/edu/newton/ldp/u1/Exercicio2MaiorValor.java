package edu.newton.ldp.u1;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * Problema
 * 
 * Entrada: três números inteiros digitados pelo usuário (x, y, e z)
 * Saída: informar qual é o maior valor dos números digitados
 * 
 * @author wrpires
 *
 */
public class Exercicio2MaiorValor {

	public static void main(String[] args) {
		// declaração de variáveis
		int maior = 0;
		
		// entrada
		int x = lerNumeroInteiro();
		int y = lerNumeroInteiro();
		int z = lerNumeroInteiro();
		
		JOptionPane.showMessageDialog(null, "Você digitou: " + x + ", " + y + ", " + z);

		// processamento
		maior = x; // assumindo que X é o maior
		
		if (y > maior) {
			maior = y;
		} 
		
		if (z > maior) {
			maior = z;
		}
		
		// tabela
		// x	y	z	maior
		// 10	6	4	10
		// 6	10	4	10
		// 6	8	10	10
		
		
		// saída
		JOptionPane.showMessageDialog(null, "O maior número é: " + maior);
	}
	
	static int lerNumeroInteiro() {
		return Integer.parseInt(
				JOptionPane.showInputDialog("Digite um número inteiro:")
		);
	}

}
