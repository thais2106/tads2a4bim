package br.univel.cadastro.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ClienteDAOH2Impl implements ClienteDAO{
	
	private static Connection con;
	
	private Connection getConnection(){
		synchronized (con){
			if (con == null){
				//Todo
			}
			
			return con;
		}
	}
	

	@Override
	public void inserir(Cliente c) {
		String sql = "INSERT INTO CLIENTE(ID, NOME, ENDERECO, TELEFONE, CIDADE, UF)"
				+ "VALUES(?, ?, ?, ?, ?, ?)";
		
		try (PreparedStatement ps = getConnection().prepareStatement(sql)){
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void atualizar(Cliente c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Cliente c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cliente buscar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente buscarPorExemplo(Cliente c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cliente> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
