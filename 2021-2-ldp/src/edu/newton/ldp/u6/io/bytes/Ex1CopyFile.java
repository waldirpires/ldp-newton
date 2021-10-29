package edu.newton.ldp.u6.io.bytes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex1CopyFile {

	// Problema
	// Entrada: um nome de arquivo de origem (A) e de destino (B)
	// Saída: copiar o conteúdo de A para B
	public static void main(String[] args) throws IOException {
		
		var src = "./teste.txt";
		var dest = "./teste2.txt";
		
		
		FileInputStream fis = null;
		FileOutputStream fos = null;		

		try {
			// 1. abrir um fluxo de entrada para o arquivo
			fis = new FileInputStream(src);

			// 1. abrir um fluxo de escrita de bytes
			fos = new FileOutputStream(dest);
			
			// 2. realizar a leitura dos bytes (um de cada vez)
			int c;
			// enquanto não for fim de arquivo . . .
			int numBytes = 0;
			while ((c = fis.read()) != -1) { // byte a byte
				// 3. exibir na saída padrão o byte lido
				fos.write(c);
				numBytes++;
			}
			
			fos.flush(); // comitar os dados escritos da memória para o disco

			System.out.println("Bytes lidos: " + numBytes);
		} catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		} finally {
			if (fis != null) {
				// 4. encerrar o fluxo
				fis.close();
			}
			// 3. encerrar o fluxo de escrita no arquivo.
			if (fos != null) {
				fos.close();
			}			
		}
		
	}
}
