package edu.newton.ldp.u5.conta;

public class ValorInvalidoException extends Exception{

	public ValorInvalidoException(float valor, String operacao) {
		super("Valor inválido para "+operacao+": " + valor);
	}
}
