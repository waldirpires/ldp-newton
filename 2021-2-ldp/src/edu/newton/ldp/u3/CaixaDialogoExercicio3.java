package edu.newton.ldp.u3;

import javax.swing.JOptionPane;

/**
 * Problema Entrada: Ler do usuário um número inteiro positivo N Saída: exibir
 * todos os múltiplos de N de 1 a 100
 * 
 * Obs: implementar com tratamento de erro de entrada
 * 
 * @author wrpires
 *
 */
public class CaixaDialogoExercicio3 {

	public static void main(String[] args) {
		// declaracao de variaveis
		int n = 0;
		boolean success = false;
		// entrada

		while (!success) {

			String s = JOptionPane.showInputDialog("Digite um número inteiro positivo:");

			if (s == null || s.trim().length() == 0) {
				JOptionPane.showMessageDialog(null, "Para executar, é necessário digitar um valor.");
				System.exit(0);
			}
			
			// nao for numero
			try {
				n = Integer.parseInt(s);
				
				if (n < 0) { // problema
					throw new RuntimeException("Valor negativo: " + n);
				}
				
				success = true;
			} catch (NumberFormatException ex) {
				// valor não é numero
				JOptionPane.showMessageDialog(null, "Valor inválido: " + s, "ERRO", JOptionPane.ERROR_MESSAGE);
			} catch (RuntimeException ex) {
				// valor é negativo
				JOptionPane.showMessageDialog(null, ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
			}
		}

		// processamento
		String saida = "";
		for (int i = 0; i <= 100; i = i + n) {
			saida = saida + i + "\n";
		}

		// saída
		JOptionPane.showMessageDialog(null, saida);
		System.out.println(saida);
	}
}
