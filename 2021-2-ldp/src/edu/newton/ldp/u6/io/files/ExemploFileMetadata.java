package edu.newton.ldp.u6.io.files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Date;

public class ExemploFileMetadata {
	
	public static void main(String[] args) throws IOException {
		var arquivo = new File("./teste.txt");
		
		System.out.println("Existe: " + arquivo.exists());
		System.out.println("Tamanho (Bytes): " + arquivo.length());
		System.out.println("Última modificação: " + 
				new Date(arquivo.lastModified()) + "\t" + arquivo.lastModified());
		System.out.println("Permissões:"); 
		System.out.println("read: " + arquivo.canRead());
		System.out.println("write: " + arquivo.canWrite());
		System.out.println("execute: " + arquivo.canExecute());
		
		Path file = Paths.get("./teste.txt");
		BasicFileAttributes attr = Files.readAttributes(file, BasicFileAttributes.class);

		System.out.println("criação: " + attr.creationTime());
		System.out.println("modificado: " + attr.lastModifiedTime());
	}

}
