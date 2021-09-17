package edu.newton.ldp.u4.vetores;

import java.util.Arrays;

import javax.swing.JOptionPane;

/*
 * Problema
 * Entrada: conjunto de palavras (nomes) a serem informados pelo usuário
 * Saída: exibir a lista dos nomes na tela
 */
public class Exemplo1Vetores {
	
	private static String[] dobrarCapacidade(String[] vetor) {
		// cria o vetor maior
		var vetorMaior = new String[vetor.length * 2];
		
		// transfere os dados do vetor menor para o maior
		for (int i = 0; i < vetor.length; i++) {
			vetorMaior[i] = vetor[i]; // copiando do menor para o maior
		}
		
		// retornar o vetor maior
		return vetorMaior;
	}
	
	
	public static void main(String[] args) {
		// declaração de variáveis
		
		// entrada
		int tamanho = Integer.parseInt(
				JOptionPane.showInputDialog("Digite a quantidade de nomes a ser informada:")
			);
		
		var nomes = new String[tamanho]; // alocando o vetor e memória
		
		for (int i = 0; i < tamanho; i++) {
			var nome = JOptionPane.showInputDialog("Digite um nome:");
			nomes[i] = nome;
			System.out.println(Arrays.toString(nomes));
		}
		
		// processamento
		
		// saída
		System.out.println("Endereço antes:" + nomes);
		JOptionPane.showMessageDialog(null, "Tamanho: " + nomes.length + "\n" + Arrays.toString(nomes));
		
		nomes = dobrarCapacidade(nomes);
		System.out.println("Endereço depois:" + nomes);
		JOptionPane.showMessageDialog(null, "Tamanho: " + nomes.length + "\n" + Arrays.toString(nomes));
	}

}
