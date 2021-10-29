package edu.newton.ldp.u6.io.chars;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ex2PesquisaArqTexto {

	// Problema (grep):
	// Entrada: nome de um arquivo texto e uma palavra lidos do usuário
		// JOptionPane ou Scanner(System.in)
	// Saída: informar se a palavra existe no arquivo ou não
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do arquivo: ");
		var arq = sc.nextLine();
		System.out.println("Digite a palavra: ");
		var palavra = sc.next();
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(arq));
			
			String linha = null;
			while ((linha = br.readLine()) != null) {
				if (linha.contains(palavra)) {
					System.out.println("INFO: palavra encontrada no arquivo!");
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} finally {
			if (br != null) {
				br.close();
			}
		}
		sc.close();
	}
}
