package edu.newton.ldp.u8.ex;

import java.util.ArrayList;

public class TesteSelect {

	public static void main(String[] args) throws Exception {
		// obter conecao
		var con = TesteConexao.obterConecao();
		
		// executar um sql
		var statement = con.createStatement();
		
		var sql = "select * from users";
		var resultado = statement.executeQuery(sql);
		
		// processar o resultado do sql		
		var lista = new ArrayList<String>();
		while (resultado.next()) { // iterador
			var id = resultado.getInt("id");
			var userName = resultado.getString("name");
			var pw = resultado.getString("password");
			
			var user = id + " - " + userName + " - " + pw;
			
			//System.out.println(user);
			
			lista.add(user);
		}
		
		resultado.close();
		statement.close();
		
		System.out.println("\nExibindo lista:");
		
		//lista.stream().forEach(item -> System.out.println(item));
		
		for (var item: lista) {
			System.out.println(item);
			System.out.println("teste");
		}
		
		// encerrar a conecao
//		if (con != null && !con.isClosed()) {
//			con.close();
//		}
		
		TesteConexao.fechar(con);
		TesteConexao.fechar(con);
	}
}
