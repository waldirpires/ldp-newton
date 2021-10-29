package edu.newton.ldp.u6.io.chars;

import java.io.FileReader;
import java.io.IOException;

public class ExemploLeituraChar {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = null;
		
		try {
			fr = new FileReader("./teste4.txt");
			
			int c;
			int numChars = 0;
			while ((c = fr.read()) != -1) {
				System.out.println(c + "= " + (char)c);
				numChars++;
			}
			
			System.out.println("Caracteres lidos: " + numChars);
			
		} catch (Exception e) {
			throw e;
		} finally {
			if (fr != null) {
				fr.close();
			}
		}
		
	}
}
