package edu.newton.ldp.u6.io.bytes;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExemploEscritaBytesWithResources {

	public static void main(String[] args) throws IOException {
		var frase = "the book is on the table.";

		// usando recurso de E/S (I/O)
		try (FileOutputStream fos = new FileOutputStream("./teste2.txt")){
			// 1. abrir um fluxo de escrita de bytes

			int numBytes = 0;
			// 2. escrever byte a byte to arquivo
			for (char c : frase.toCharArray()) {
				fos.write(c);
				numBytes++;
			}
			
			fos.flush(); // comitar os dados escritos da memória para o disco
			
			System.out.println("Bytes escritos: " + numBytes);

		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
	
}
