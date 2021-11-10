package edu.newton.ldp.u7.fibonacci;

public class MainFibo {

	static int fiboInterativo(int n) {		
		// caso base
		var fn1 = 1;
		var fn0 = 0;
		var fn = 0;
		
		for (int i = 0; i <n-1; i++) {
			fn = fn1 + fn0; // Fn = Fn-1 + Fn-2
			System.out.println(String.format("%d \t %d = %d + %d", i, fn, fn1, fn0));
			fn0 = fn1; // 
			fn1 = fn;
		}
		
		return fn;				
	}
	
	/*
	 * passo recursivo: 
	 * 
	 * F(n) = F(n-1) + F(n-2) 
	 * 
	 * Caso base: 
	 * 
	 * F(0) = 0 
	 * 
	 * F(1) = 1
	 */
	static int fibo(int n) { // recursiva
		// caso base
		if (n <= 1) {
			return n;
		}
		
		// passo recursivo
		System.out.println(String.format("Fibo(%d) = Fibo(%d) + Fibo(%d)", n, n-1, n-2));
		return fibo(n-1) + fibo(n-2); // duas chamadas empilhadas
	}

	public static void main(String[] args) {
		int n = 12;
		System.out.println("Fibo(" + n + "): " + fiboInterativo(n));
	}
}
