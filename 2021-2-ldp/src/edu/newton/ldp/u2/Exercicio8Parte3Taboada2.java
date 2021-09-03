package edu.newton.ldp.u2;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * Problema:
 * 
 * Entrada: um número inteiro N digitado pelo usuário
 * Saída: exibir a Taboada de N
 * 
 * @author wrpires
 *
 */
public class Exercicio8Parte3Taboada2 {
	
	public static void main(String[] args) { // função principal
		// declaração de variáveis
		
		// entrada
		var n = Integer.parseInt(
					JOptionPane.showInputDialog("Digite um número inteiro: ")
				);
		
		var msg = "\nTaboada de " + n;
		msg += "\n======================";
		
		// processamento e saída
		for (var i = 0; i <= 10; i++) {
			var r = n * i;
			
			msg += "\n" + n + " * " + i + " = " + r;
		}

		JOptionPane.showMessageDialog(null, msg);

	}

}
