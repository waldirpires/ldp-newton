package edu.newton.ldp.u4.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {

	public static void main(String[] args) {
		Set<String> nomes = new HashSet<String>();
		
		nomes.add("Maria");
		nomes.add("Mariá");
		nomes.add("João");
		System.out.println("Maria".hashCode());
		nomes.add("José");
		nomes.add("João");
		nomes.add("Alexandre");
		System.out.println("Mariá".hashCode());
		
		System.out.println("Conjunto:" + nomes);
	}
}
