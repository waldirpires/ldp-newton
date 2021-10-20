package edu.newton.ldp.u5.conta;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args){
		var conta = new ContaBancaria();
		conta.saldo = 100.0f;
		conta.estado = 2; // inativa 
		
		try {
			conta.efetuarSaque(-10.01f);	
			
			System.out.println("Saque bem sucedido.");
		} catch (ValorInvalidoException ex) {			
			System.out.println(ex.getMessage());				
		} catch (ContaBloqueadaParaOperacoesException ex) {
			System.out.println(ex.getMessage());			
		} catch (SaldoInsuficienteException ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage());			
		} finally {
			System.out.println("Terminou.");
		}
	}
}
