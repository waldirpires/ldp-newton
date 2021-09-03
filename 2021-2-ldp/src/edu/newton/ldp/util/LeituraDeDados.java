package edu.newton.ldp.util;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class LeituraDeDados {

	public static String lerFraseDaTela() {
		System.out.println("Digite uma frase:");

		var scanner = new Scanner(System.in);
		var frase = scanner.nextLine();
		
		scanner.close();

		System.out.println("\nVocê digitou a frase: " + frase + "\n\n");
		
		frase = frase.toLowerCase();

		return frase;
	}	
	
	public static int lerNumeroInteiro() {
		// entrada
		String valor = JOptionPane.showInputDialog("Digite um número inteiro:");
		// transformar de String para inteiro 
		return Integer.parseInt(valor);		
	}
	
}
