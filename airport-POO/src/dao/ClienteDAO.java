package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.Cliente;
import bean.Funcionario;

public class ClienteDAO {
private Connection connection;
	
	public ClienteDAO() {
		connection = new FabricaConexoes().getConnection();
	}
	public int insert(Cliente c) {
		int inseriu = 0;
		String sql = "INSERT INTO Cliente(cpf,nome,email,passaporte,idade,informacoes_bancarias)VALUES(?,?,?,?,?,?);";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setString(1, c.getCpf());
			stmt.setString(2,c.getNome());
			stmt.setString(3, c.getEmail());
			stmt.setString(4, c.getPassaporte());
			stmt.setInt(5, c.getIdade());
			stmt.setString(6,c.getInf());
			inseriu = stmt.executeUpdate();
			stmt.close();
			inseriu = 1;
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return inseriu;
	}
	
	public ArrayList<Cliente> getLista(){
		String sql = "SELECT * FROM Cliente;";
		PreparedStatement stmt;
		Cliente c;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			ArrayList <Cliente> clientes = new ArrayList<>();
			while(rs.next()) {
				c = new Cliente();
				c.setCpf(rs.getString("cpf"));
				c.setNome(rs.getString("nome"));
				c.setEmail(rs.getString("email"));
				c.setPassaporte(rs.getString("passaporte"));
				c.setIdade(rs.getInt("idade"));
				c.setInf(rs.getString("informacoes_bancarias"));
				clientes.add(c);
			}
			
			rs.close();
			stmt.close();
			return clientes;
			}catch(SQLException e) {
				e.printStackTrace();
			}
		return null;
	}
	
	public int update(String nome,String email,String passaporte, int idade, String inf, String cpf) {
		int inseriu = 0;
		String sql = "Update Cliente set nome =?,email =?,passaporte =?,idade =?,informacoes_bancarias=? where cpf = ? ;";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setString(6, cpf);
			stmt.setString(1,nome);
			stmt.setString(2, email);
			stmt.setString(3, passaporte);
			stmt.setInt(4, idade);
			stmt.setString(5,inf);
			inseriu = stmt.executeUpdate();
			stmt.close();
			inseriu = 1;
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return inseriu;
	}
	
	public int excluir(String cpf) {
		int inseriu = 0;
		String sql = "delete from cliente where cpf = ? ;";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setString(1, cpf);
			inseriu = stmt.executeUpdate();
			stmt.close();
			inseriu = 1;
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return inseriu;
	}
	
	public int existe(String cpf) {
		int count = 0;
		String sql = "SELECT COUNT(*) as rowcount FROM Cliente where cpf =?";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setString(1, cpf);
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
	
	public ArrayList<Cliente> esp(String cpf){
		String sql = "SELECT * FROM Cliente where cpf = ?;";
		PreparedStatement stmt;
		Cliente c;
		try {
			
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setString(1, cpf);
			ResultSet rs = stmt.executeQuery();
			ArrayList <Cliente> cs = new ArrayList<>();
			while(rs.next()) {
				c = new Cliente();
				c.setCpf(rs.getString("cpf"));
				c.setNome(rs.getString("nome"));
				c.setEmail(rs.getString("email"));
				c.setPassaporte(rs.getString("passaporte"));
				c.setIdade(rs.getInt("idade"));
				c.setInf(rs.getString("informacoes_bancarias"));
				cs.add(c);
				
			}
			
			rs.close();
			stmt.close();
			return cs;
			}catch(SQLException e) {
				e.printStackTrace();
			}
		return null;

		
	}
	
	public ArrayList<Cliente> rl3(int qnt){
		String sql = "SELECT * from cliente where length(nome) > ?;";
		PreparedStatement stmt;
		Cliente c;
		try {
			
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setInt(1, qnt);
			ResultSet rs = stmt.executeQuery();
			ArrayList <Cliente> cs = new ArrayList<>();
			while(rs.next()) {
				c = new Cliente();
				c.setCpf(rs.getString("cpf"));
				c.setNome(rs.getString("nome"));
				c.setEmail(rs.getString("email"));
				c.setPassaporte(rs.getString("passaporte"));
				c.setIdade(rs.getInt("idade"));
				c.setInf(rs.getString("informacoes_bancarias"));
				cs.add(c);
				
			}
			
			rs.close();
			stmt.close();
			return cs;
			}catch(SQLException e) {
				e.printStackTrace();
			}
		return null;

		
	}
	
}
