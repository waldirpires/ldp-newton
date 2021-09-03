package edu.newton.ldp.util;

import javax.swing.JOptionPane;

public class JanelaDeDialogo {
	
	public static String exibirJanelaDeEntrada(String mensagem) {
		return JOptionPane.showInputDialog(mensagem);
	}
	
	public static void exibirJanelaDeSaida(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}
	
	public static void main(String[] args) {
		var mensagem = JanelaDeDialogo.exibirJanelaDeEntrada("Digite o seu nome:");
		
		JanelaDeDialogo.exibirJanelaDeSaida(mensagem);
	}

}
