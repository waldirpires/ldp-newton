package edu.newton.ldp.u8.lab8;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class DaoLivros {

	public static final String DRIVER = "org.h2.Driver";

	public static final String URL = "jdbc:h2:file:/home/wrpires/tools/h2/data/livros";
	public static final String USER = "root";
	public static final String PW = "";

	private Connection con;
	
	public DaoLivros() throws Exception {
		con = DbUtils.obterConexao(DRIVER, URL, USER, PW);		
	}
	
	public Livro cadastrar(Livro livro) {
		return null;
	}
	
	public List<Livro> listar() throws Exception {
		System.out.println("Listando livros . . .");
		
		var statement = con.createStatement();
		
		var sql = "select * from livros";
		var resultado = statement.executeQuery(sql);
		
		// processar o resultado do sql		
		var lista = new ArrayList<Livro>();
		while (resultado.next()) { // iterador
			
			// populando objetos a partir da resposta no banco
			var livro = new Livro();
			
			livro.setId(resultado.getInt("id"));
			livro.setTitulo(resultado.getString("titulo"));
			livro.setAutor(resultado.getString("autor"));
			livro.setAnoDePublicacao(resultado.getInt("ano_publicacao"));
			livro.setEditora(resultado.getString("editora"));
			
			livro.setCategorias(resultado.getString("categorias"));
			
			System.out.println(livro.getId() + ": " + livro);
			
			lista.add(livro);
		}
		
		resultado.close();
		statement.close();
		
		return lista;
	}
	
	public List<Livro> pesquisarPorTitulo(String titulo) {
		return null;
	}

	public List<Livro> pesquisarPorCategoria(String titulo) {
		return null;
	}
	
	public boolean excluir(int id) {
		return false;
	}
	
	@Override
	protected void finalize() throws Throwable {
		if (con != null && !con.isClosed()) {
			con.close();
		}
	}
}
