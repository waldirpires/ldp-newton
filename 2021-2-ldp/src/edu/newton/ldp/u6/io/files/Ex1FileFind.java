package edu.newton.ldp.u6.io.files;

import java.io.File;
import java.util.Scanner;

public class Ex1FileFind {

	// Problema
	// Entrada: um caminho de diretório (path) e um nome de arquivo informados pelo usuário
	// Saída: informar se o arquivo informado existe ou não dentro do diretório.
	
	// Notas:
	// - se o diretório não existir, informar para o usuário que ele não existe
	// - se o caminho informado for um arquivo, informar que não é possível pesquisar.
	
	public static void main(String[] args) {
		// entrada
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o caminho para o diretório:");
		var caminho = sc.nextLine();
		
		System.out.println("Digite o nome do arquivo para pesquisa:");
		var nome = sc.nextLine();
		
		sc.close();
		
		// processamento
		var diretorio = new File(caminho);
		
		if (!diretorio.exists()) {
			System.out.println("O caminho informado não existe: " + caminho);
			System.exit(0);
		}
		
		if (!diretorio.isDirectory()) {
			System.out.println("O caminho informado não é um diretório: "+ caminho);
			System.exit(0);
		}
		
		var arquivos = diretorio.list();
//		for (int i = 0; i < arquivos.length; i++) {
//			var item = arquivos[i];
//		}
		
		boolean achou = false;
		for (var item: arquivos) { // for-each avançado
			if (item.equals(nome)) {
				achou = true;
			}
		}
		
		// saída
		if (achou) {
			System.out.println("Arquivo " + nome + " existe no diretório " + caminho);
			var arquivo = new File(caminho + '/' + nome);
			System.out.println("Caminho absoluto:" + arquivo.getAbsolutePath());
			System.out.println("Tamanho: " + arquivo.length() + " bytes");
		} else {
			System.out.println("Arquivo " + nome + " NÃO existe no diretório " + caminho);
		}
	}
}
