package edu.newton.ldp.u6.io.chars;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class ExemploEscritaChar {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("./teste3.txt");
			
			var dateTime = LocalDateTime.now();
			System.out.println(dateTime);
			
			fw.write(dateTime.toString());
			
		} catch (Exception e) {
			
		} finally {
			if (fw != null) {
				fw.close();
			}
		}
	}
}
