package edu.newton.ldp.u7.lab7;

import java.security.SecureRandom;
import java.util.Arrays;

public class Problema2PesqBin {

    static int bolinha(int arr[], int x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
  
            if (arr[m] == x)
                return m;
  
            if (arr[m] < x)
                l = m + 1;
  
            else
                r = m - 1;
        }
  
        return -1;
    }
    
    public static void main(String[] args) {
		int tam = 2000000;
		var arr = new int[tam];
		
		SecureRandom sr = new SecureRandom();
		
		for (int i = 0; i < tam; i++) {
			arr[i] = sr.nextInt() % 1000000;
		}
		
		// ordenar
		Arrays.sort(arr);
		
		int r = bolinha(arr, 900);
		System.out.println(r);
		
		String a = "abacate";
		System.out.println(a.charAt(0) + " + " + a.substring(1));
	}
}
