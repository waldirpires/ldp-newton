package edu.newton.ldp.u2.poo.ex1;

import java.time.LocalDate;

public class PessoaFisica {

	// atributos
	String nomeCompleto; // camelCase
	String cpf;
	String email;
	String celular;
	LocalDate dataDeNascimento;
	Genero genero;

	public int getIdade() {
		var now = LocalDate.now();
		
		// ex: 22/10/2000
		// now: 2/9/2021
		if (dataDeNascimento.getMonthValue() > now.getMonthValue()) {
			return now.getYear() - dataDeNascimento.getYear() - 1;
		}
		
		return now.getYear() - dataDeNascimento.getYear();
	}
	
	public String getSobrenome() {
		// Waldir Ribeiro
		//return nomeCompleto.substring(nomeCompleto.lastIndexOf(' '));
		
		//return nomeCompleto.substring(nomeCompleto.indexOf(" "));
		
		String sobrenome = "";
		boolean achou = false;
		for (int i = 0; i < nomeCompleto.length(); i++) {
			if (nomeCompleto.charAt(i) == ' ') {
				achou = true;
			}
			
			if (achou) {
				sobrenome += nomeCompleto.charAt(i);
			}
		}
		
		return sobrenome;		
	}
}
