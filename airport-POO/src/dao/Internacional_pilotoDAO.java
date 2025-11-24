package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;

import bean.Agencia;
import bean.Internacional_piloto;
import bean.Piloto;

public class Internacional_pilotoDAO {
private Connection connection;
	
	public Internacional_pilotoDAO() {
		connection = new FabricaConexoes().getConnection();
	}
	public int insert(Internacional_piloto p) {
		int inseriu = 0;
		String sql = "INSERT INTO internacionais(cpf_pi,pais_de_origem,idiomas,moeda)VALUES(?,?,?,?);";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setString(1,p.getCpf_pi());
			stmt.setString(2, p.getPais());
			stmt.setString(3, p.getIdioma());
			stmt.setString(4,p.getMoeda());
			inseriu = stmt.executeUpdate();
			stmt.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return inseriu;
	}
	
	public ArrayList<Internacional_piloto> getLista(){
		String sql = "SELECT * FROM Internacionais;";
		PreparedStatement stmt;
		Internacional_piloto p;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			ArrayList <Internacional_piloto> internacionais = new ArrayList<>();
			while(rs.next()) {
				p = new Internacional_piloto();
				p.setCpf_pi(rs.getString("cpf_pi"));
				p.setIdioma(rs.getString("idiomas"));
				p.setPais(rs.getString("pais_de_origem"));
				p.setMoeda(rs.getString("moeda"));
				internacionais.add(p);
			}
			
			rs.close();
			stmt.close();
			return internacionais;
			}catch(SQLException e) {
				e.printStackTrace();
			}
		return null;
	}
	
	public int update(String pais_de_origem,String idiomas,String moeda, String cpf) {
		int inseriu = 0;
		String sql = "Update Internacionais set pais_de_origem =?,idiomas=?,moeda=? where cpf_pi = ? ;";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setString(1, pais_de_origem);
			stmt.setString(2, idiomas);
			stmt.setString(3, moeda);
			stmt.setString(4, cpf);
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
		String sql = "delete from internacionais where cpf_pi = ? ;";
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
		String sql = "SELECT COUNT(*) as rowcount FROM internacionais where cpf_pi =?";
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
	
	public ArrayList<Internacional_piloto> esp(String cpf){
		String sql = "SELECT * FROM Internacionais where cpf_pi = ?;";
		PreparedStatement stmt;
		Internacional_piloto p;
		try {
			
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setString(1, cpf);
			ResultSet rs = stmt.executeQuery();
			ArrayList <Internacional_piloto> inters = new ArrayList<>();
			while(rs.next()) {
				p = new Internacional_piloto();
				p.setCpf_pi(rs.getString("cpf_pi"));
				p.setIdioma(rs.getString("idiomas"));
				p.setPais(rs.getString("pais_de_origem"));
				p.setMoeda(rs.getString("moeda"));
				inters.add(p);
				
			}
			
			rs.close();
			stmt.close();
			return inters;
			}catch(SQLException e) {
				e.printStackTrace();
			}
		return null;

		
	}

}
