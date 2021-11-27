package edu.newton.ldp.u8.ex;

import javax.swing.JOptionPane;

import edu.newton.ldp.u8.lab8.DaoLivros;

public class Main {

	public static void main(String[] args) {
		
		try {
			var dao = new DaoLivros(); // objeto de acesso a dados
			
			var lista = dao.listar(); // execução da operação

			JOptionPane.showMessageDialog(null, lista);
			
		} catch (Exception ex){
			JOptionPane.showMessageDialog(null, "ERRO: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
		}
	}
}
