package edu.newton.ldp.u5.conta;

public class ValorInvalidoException extends Exception{

	public ValorInvalidoException(float valor) {
		super("Valor inválido para saque: " + valor);
	}
}
