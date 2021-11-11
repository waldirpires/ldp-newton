package edu.newton.ldp.u7.exercicios;

public class MainSomatorio {

	// Problema:
	// entrada: número inteiro positivo N
	// saída: informar o somatório de N
	// ex: R = N + (N-1) + (N-2) + (N-3) . . . + 1
	//
	// implementar utilizando recursão E iteração
	
	static int somatorioIterativo(int n) { // iteração, laço
		var s = 0;
		
		for (int i = n; i >=0; i--) {
			System.out.println(String.format("%d: \t s = %d + %d", i, s, i));
			s = s + i;
		}
		
		return s;
	}
	
	static int somatorio(int n) { // recursao
		// caso base
		if (n == 1) {
			return n;
		}
		
		// passo recursivo
		return n + somatorio(n-1);
	}
	
	public static void main(String[] args) {
		int n = 6;
		System.out.println("Somatório de "+ n + " (recursivo): " + somatorio(n));
		System.out.println("Somatório de "+ n + " (iterativo): " + somatorioIterativo(n));
	}
}
