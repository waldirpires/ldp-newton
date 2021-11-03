package edu.newton.ldp.u6.io.files;

import java.io.File;
import java.util.Scanner;

public class ExemploFileListFiles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite o caminho do diretório:");
		var caminho = sc.nextLine();
		
		var arquivo = new File(caminho);
		
		if (!arquivo.exists()) {
			System.out.println("O caminho não existe: " + caminho);
			
			System.exit(0);
		}
		
		// listar
		if (arquivo.isDirectory()) {
			System.out.println("listando conteúdo de "+ caminho + ": ");
			
			var arquivos = arquivo.list();
			for (var item: arquivos) {
				System.out.println(item);
			}
			
		} else {
			System.out.println("O caminho informado é um arquivo: " + caminho);
		}
		
		sc.close();
	}
}
