package edu.newton.ldp.u4.list;

import java.util.ArrayList;

public class Exemplo2ArrayList {
	
	/**
	 * Problema:
	 * implementar um método que permite buscar por um determinado
	 * estado dentro da lista de estados.
	 * Se o estado for encontrado, retornar o índice onde ele foi
	 * encontrado no vetor
	 * Caso contrário, retornar -1 (não encontrado)
	 * 
	 * @param args
	 */
	
	private static int buscaSequencial(ArrayList<String> estados, String estado) {
		
		for (int i = 0; i < estados.size(); i++) {
			var item = estados.get(i);
			
			if (item.equals(estado)) { // achei
				return i;
			}
		}
		
		return -1; // não achou
	}
	
	public static void main(String[] args) {
		var estados = new ArrayList<String>();
		
		estados.add("Minas Gerais");
		estados.add("Goias");
		estados.add("Tocantins");
		estados.add("Alagoas");
		
		System.out.println(estados);
		
		System.out.println(
				buscaSequencial(estados, "Tocantins")
				);
	}
	
	
	public static void main2(String[] args) {
		
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
