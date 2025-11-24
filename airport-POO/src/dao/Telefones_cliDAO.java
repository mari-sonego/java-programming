package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.Agencia;
import bean.Cliente;
import bean.Telefones_cli;

public class Telefones_cliDAO {
private Connection connection;
	
	public Telefones_cliDAO() {
		connection = new FabricaConexoes().getConnection();
	}


	public int insert(Telefones_cli t) {
		int inseriu = 0;
		String sql = "INSERT INTO Telefones(cpf_cli,telefone)VALUES(?,?);";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			//stmt.setInt(1, a.getCod());
			stmt.setString(1,t.getCpf_cliente());
			stmt.setString(2, t.getTelefone());
			inseriu = stmt.executeUpdate();
			stmt.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return inseriu;
	}
	
	
	public int existe_cpf(String cpf, String tel)  {
		int count = 0;
		String sql = "SELECT COUNT(*) as rowcount FROM telefones where cpf_cli =? and telefone =?";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setString(1, cpf);
			stmt.setString(2, tel);
			ResultSet rs = stmt.executeQuery();
			rs.next();
			count = rs.getInt("rowcount");
			rs.close();
			stmt.close();
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return count;
	}
	
	public ArrayList<Telefones_cli> getLista(){
		String sql = "SELECT * FROM telefones;";
		PreparedStatement stmt;
		Telefones_cli t;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			ArrayList <Telefones_cli> telefones= new ArrayList<>();
			while(rs.next()) {
				t = new Telefones_cli();
				t.setCpf_cliente(rs.getString("cpf_cli"));
				t.setTelefone(rs.getString("telefone"));
				telefones.add(t);
			}
			
			rs.close();
			stmt.close();
			return telefones;
			}catch(SQLException e) {
				e.printStackTrace();
			}
		return null;
	}
	
	
	public int excluir(String cpf,String telefone) {
		int inseriu = 0;
		String sql = "delete from telefones where cpf_cli= ? and telefone =? ;";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setString(1, cpf);
			stmt.setString(2, telefone);
			inseriu = stmt.executeUpdate();
			stmt.close();
			inseriu = 1;
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return inseriu;
	}
	
	public int existe(String cpf,String telefone) {
		int count = 0;
		String sql = "SELECT COUNT(*) as rowcount FROM telefones where cpf_cli =? and telefone =?";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setString(1, cpf);
			stmt.setString(2, telefone);
			ResultSet rs = stmt.executeQuery();
			rs.next();
			count = rs.getInt("rowcount");
			rs.close();
			stmt.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return count;
	}
}

