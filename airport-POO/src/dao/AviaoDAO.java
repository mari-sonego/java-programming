package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.Agencia;
import bean.Aviao;

public class AviaoDAO {
private Connection connection;
	
	public AviaoDAO() {
		connection = new FabricaConexoes().getConnection();
	}
	
	public int insert(Aviao a) {
		int inseriu = 0;
		String sql = "INSERT INTO Avioes(cod,n_de_assentos,capacidade_de_bagagens,fabricante,modelo,ano,companhia,agencia_fk)VALUES(?,?,?,?,?,?,?,?);";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setInt(1, a.getCod());
			stmt.setInt(2,a.getNum_a());
			stmt.setInt(3, a.getCapacidade());
			stmt.setString(4, a.getFabricante());
			stmt.setString(5, a.getModelo());
			stmt.setInt(6,a.getAno());
			stmt.setString(7, a.getCompanhia());
			stmt.setInt(8,a.getAgencia_fk());
			inseriu = stmt.executeUpdate();
			stmt.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return inseriu;
	}
	
	public ArrayList<Aviao> getLista(){
		String sql = "SELECT * FROM Avioes;";
		PreparedStatement stmt;
		Aviao a;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			ArrayList <Aviao> avioes = new ArrayList<>();
			while(rs.next()) {
				a = new Aviao();
				a.setCod(rs.getInt("cod"));
				a.setNum_a(rs.getInt("n_de_assentos"));
				a.setCapacidade(rs.getInt("capacidade_de_bagagens"));
				a.setFabricante(rs.getString("fabricante"));
				a.setModelo(rs.getString("modelo"));
				a.setAno(rs.getInt("ano"));
				a.setCompanhia(rs.getString("companhia"));
				a.setAgencia_fk(rs.getInt("agencia_fk"));
				avioes.add(a);
				
				
			}
			
			rs.close();
			stmt.close();
			return avioes;
			}catch(SQLException e) {
				e.printStackTrace();
			}
		return null;
	}
	
	public int update(int num, int capa, String fa, String mo, int ano, String com, int agencia_fk, int cod) {
		int inseriu = 0;
		String sql = "Update Avioes set n_de_assentos = ?,capacidade_de_bagagens = ?,fabricante = ?,modelo = ?,ano = ?,companhia = ?,agencia_fk = ? where cod = ?;";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setInt(8, cod);
			stmt.setInt(1,num);
			stmt.setInt(2, capa);
			stmt.setString(3, fa);
			stmt.setString(4, mo);
			stmt.setInt(5,ano);
			stmt.setString(6, com);
			stmt.setInt(7,agencia_fk);
			inseriu = stmt.executeUpdate();
			stmt.close();
			inseriu = 1;
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return inseriu;
	}
	
	public int excluir(int cod) {
		int inseriu = 0;
		String sql = "Delete from Avioes where cod = ? ;";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setInt(1, cod);
			inseriu = stmt.executeUpdate();
			stmt.close();
			inseriu = 1;
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return inseriu;
	}
	
	public int existe(int cod)  {
		int count = 0;
		String sql = "SELECT COUNT(*) as rowcount FROM avioes where cod =?";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setInt(1,cod);
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
	
	public ArrayList<Aviao> esp(int cod){
		String sql = "SELECT * FROM Avioes where cod = ?;";
		PreparedStatement stmt;
		Aviao a;
		try {
			
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setInt(1, cod);
			ResultSet rs = stmt.executeQuery();
			ArrayList <Aviao> avioes = new ArrayList<>();
			while(rs.next()) {
				a = new Aviao();
				a.setCod(rs.getInt("cod"));
				a.setNum_a(rs.getInt("n_de_assentos"));
				a.setCapacidade(rs.getInt("capacidade_de_bagagens"));
				a.setFabricante(rs.getString("fabricante"));
				a.setModelo(rs.getString("modelo"));
				a.setAno(rs.getInt("ano"));
				a.setCompanhia(rs.getString("companhia"));
				a.setAgencia_fk(rs.getInt("agencia_fk"));
				avioes.add(a);
			}
			
			rs.close();
			stmt.close();
			return avioes;
			}catch(SQLException e) {
				e.printStackTrace();
			}
		return null;

		
	}
	
	public ArrayList<Aviao> rl1(String estado){
		String sql = "SELECT * from avioes where agencia_fk in (select cod from agencia where estado = ?);";
		PreparedStatement stmt;
		Aviao a;
		try {
			
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setString(1, estado);
			ResultSet rs = stmt.executeQuery();
			ArrayList <Aviao> avioes = new ArrayList<>();
			while(rs.next()) {
				a = new Aviao();
				a.setCod(rs.getInt("cod"));
				a.setNum_a(rs.getInt("n_de_assentos"));
				a.setCapacidade(rs.getInt("capacidade_de_bagagens"));
				a.setFabricante(rs.getString("fabricante"));
				a.setModelo(rs.getString("modelo"));
				a.setAno(rs.getInt("ano"));
				a.setCompanhia(rs.getString("companhia"));
				a.setAgencia_fk(rs.getInt("agencia_fk"));
				avioes.add(a);
			}
			
			rs.close();
			stmt.close();
			return avioes;
			}catch(SQLException e) {
				e.printStackTrace();
			}
		return null;
	}
}
