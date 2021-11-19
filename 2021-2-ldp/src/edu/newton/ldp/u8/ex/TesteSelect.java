package edu.newton.ldp.u8.ex;

public class TesteSelect {

	public static void main(String[] args) throws Exception {
		// obter conecao
		var con = TesteConexao.obterConecao();
		
		// executar um sql
		var statement = con.createStatement();
		
		var sql = "select * from users";
		var resultado = statement.executeQuery(sql);
		
		// processar o resultado do sql		
		while (resultado.next()) { // iterador
			var id = resultado.getInt("id");
			var userName = resultado.getString("name");
			var pw = resultado.getString("password");
			
			System.out.println(id + " - " + userName + " - " + pw);
		}
		
		resultado.close();
		statement.close();
		
		// encerrar a conecao
		if (con != null && !con.isClosed()) {
			con.close();
		}
	}
}
