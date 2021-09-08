package edu.newton.ldp.u2.poo.ex1;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		var pf = new PessoaFisica();
		
		pf.nomeCompleto = "José Pereira da Costa";
		pf.cpf = "123.456.789-01";
		pf.email = "jose.pereira@gmail.com";
		pf.celular = "+55.31.991234567";
		pf.dataDeNascimento = LocalDate.of(2001, 6, 12);
		pf.genero = Genero.MASCULINO;
		
		System.out.println("Idade: "+ pf.getIdade());
		
		System.out.println("Sobrenome: " + pf.getSobrenome());
	}
}
