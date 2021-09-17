package edu.newton.ldp.u4.list;

import java.util.ArrayList;

public class Exemplo2ArrayList {
	
	public static void main(String[] args) {
		
		var estados = new ArrayList<String>();
		
		System.out.println("lista: " + estados);
		
		estados.add("Minas Gerais");
		System.out.println("lista: " + estados);
		
		estados.add("São Paulo");
		System.out.println("lista: " + estados);
		
		estados.add("Santa Catarina");
		System.out.println("lista: " + estados);
		
		estados.remove("São Paulo");
		System.out.println("lista: " + estados);
		
		// for-each avançado
		for (var estado: estados) {
			System.out.println("Estado: " + estado);
		}
		
		// for-each classico
		for (int i = 0; i < estados.size(); i++) {
			var estado = estados.get(i);
			System.out.println("Estado: " + estado);
		}
		
		System.out.println("Minas Gerais: " + estados.indexOf("Minas Gerais"));
		
		
		estados.clear();
		for (var estado: estados) {
			System.out.println("Estado: " + estado);
		}
		
	}

}
