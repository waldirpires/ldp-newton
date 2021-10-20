package edu.newton.ldp.u5.conta;

public class ContaBancaria {
	
	float saldo;
	int estado; // 0 - inativo, 1 - bloqueado, 2 - ativo

	public void efetuarSaque(float valor) 
			throws ValorInvalidoException, 
			SaldoInsuficienteException, 
			ContaBloqueadaParaOperacoesException{

		// valor invalido (menor que zero)
		validarValorParaOperacao(valor, "saque");
		
		// saldo insuficiente
		if (saldo < valor) {
			throw new SaldoInsuficienteException(saldo, valor);
		}
		
		// estado inválido (inativa, bloqueada)
		validarEstadoConta();		
		
		// caso de sucesso
		saldo = saldo - valor;
		System.out.println("Saque de " + valor + " realizado com sucesso.");
		System.out.println("Saldo disponível: " + saldo);
	}

	public void efetuarDeposito(float valor) 
			throws ValorInvalidoException, ContaBloqueadaParaOperacoesException {
		
		validarValorParaOperacao(valor, "depósito");
		
		validarEstadoConta();
		
		saldo = saldo + valor;
		
		System.out.println("Depósito de " + valor + " realizado com sucesso.");
		System.out.println("Saldo disponível: " + saldo);
	}

	private void validarEstadoConta() throws ContaBloqueadaParaOperacoesException {
		if (estado != 2) {
			throw new ContaBloqueadaParaOperacoesException(estado);
		}
	}

	private void validarValorParaOperacao(float valor, String op) throws ValorInvalidoException {
		if (valor <= 0) {
			throw new ValorInvalidoException(valor, op);
		}
	}
}
