package edu.newton.ldp.u6.io.files;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class ExemploFilesListRoots {

	public static void main(String[] args) {
		var raizes = File.listRoots();

		System.out.println("Raizes do sistema de arquivos: ");
		for (var raiz : raizes) {
			System.out.println(" - " + raiz.getAbsolutePath());
		}

		System.out.println("\n\n");
		Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();
		for (Path name : dirs) {
			System.err.println(name);
		}
	}
}
