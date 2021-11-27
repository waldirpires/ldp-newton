package edu.newton.ldp.u8.lab8;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtils {

	public static Connection obterConexao(String driver, String url, String user, String pw) throws Exception {
		Connection con = null;
		// testar a carga do driver
		Class.forName(driver);

		// obter uma coneção através do driver e o driver manager
		// conexão
		con = DriverManager.getConnection(url, user, pw);
		System.out.println("INFO: conexão iniciada com sucesso.");

		return con;		
	}
}
