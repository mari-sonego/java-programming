package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.Cliente;
import bean.Funcionario;
import bean.Pilota;
import bean.Piloto;

public class PilotoDAO {
private Connection connection;
	
	public PilotoDAO() {
		connection = new FabricaConexoes().getConnection();
	}
	
	public int insert(Piloto p) {
		int inseriu = 0;
		String sql = "INSERT INTO Pilotos(cpf_fun,breve)VALUES(?,?);";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setString(1, p.getCpf_func());
			stmt.setString(2,p.getBreve());
			inseriu = stmt.executeUpdate();
			stmt.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return inseriu;
	}
	
	public ArrayList<Piloto> getLista(){
		String sql = "SELECT * FROM Pilotos;";
		PreparedStatement stmt;
		Piloto p;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			ArrayList <Piloto> pilotos = new ArrayList<>();
			while(rs.next()) {
				p = new Piloto();
				p.setCpf_func(rs.getString("cpf_fun"));
				p.setBreve(rs.getString("breve"));
				pilotos.add(p);
			}
			
			rs.close();
			stmt.close();
			return pilotos;
			}catch(SQLException e) {
				e.printStackTrace();
			}
		return null;
	}
	

	public ArrayList<Piloto> esp(String cpf){
		String sql = "SELECT * FROM Pilotos where cpf_fun = ?;";
		PreparedStatement stmt;
		Piloto p;
		try {
			
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setString(1, cpf);
			ResultSet rs = stmt.executeQuery();
			ArrayList <Piloto> ps = new ArrayList<>();
			while(rs.next()) {
				p = new Piloto();
				p.setCpf_func(rs.getString("cpf_fun"));
				p.setBreve(rs.getString("breve"));
				ps.add(p);
				
			}
			
			rs.close();
			stmt.close();
			return ps;
			}catch(SQLException e) {
				e.printStackTrace();
			}
		return null;

		
	}
	
	public int update(String cpf ,String breve) {
		int inseriu = 0;
		String sql = "Update Pilotos set breve =? where cpf_fun = ? ;";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setString(1, breve);
			stmt.setString(2,cpf);
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
		String sql = "delete from pilotos where cpf_fun = ? ;";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setString(1, cpf);
			inseriu = stmt.executeUpdate();
			stmt.close();
			inseriu =1;
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return inseriu;
	}
	
	public int existe(String cpf) {
		int count = 0;
		String sql = "SELECT COUNT(*) as rowcount FROM Pilotos where cpf_fun =?";
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
	
}
