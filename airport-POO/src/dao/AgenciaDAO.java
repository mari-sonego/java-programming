package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.Agencia;
import bean.Cliente;

public class AgenciaDAO {
private Connection connection;
	
	public AgenciaDAO() {
		connection = new FabricaConexoes().getConnection();
	}
	
	public int insert(Agencia a) {
		int inseriu = 0;
		String sql = "INSERT INTO Agencia(cep,rua,estado,pais,num)VALUES(?,?,?,?,?);";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			//stmt.setInt(1, a.getCod());
			stmt.setString(1,a.getCep());
			stmt.setString(2, a.getEstado());
			stmt.setString(3, a.getPais());
			stmt.setString(4, a.getRua());
			stmt.setString(5,a.getNum());
			inseriu = stmt.executeUpdate();
			stmt.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return inseriu;
	}
	public ArrayList<Agencia> getLista(){
		String sql = "SELECT * FROM Agencia;";
		PreparedStatement stmt;
		Agencia a;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			ArrayList <Agencia> agencias = new ArrayList<>();
			while(rs.next()) {
				a = new Agencia();
				a.setCod(rs.getInt("cod"));
				a.setCep(rs.getString("cep"));
				a.setEstado(rs.getString("estado"));
				a.setPais(rs.getString("pais"));
				a.setRua(rs.getString("rua"));
				a.setNum(rs.getString("num"));
				agencias.add(a);
				
				
			}
			
			rs.close();
			stmt.close();
			return agencias;
			}catch(SQLException e) {
				e.printStackTrace();
			}
		return null;
	}
	
	public int update(int cod,String cep, String rua, String estado, String pais, String num ) {
		int inseriu = 0;
		String sql = "Update Agencia set cep =?,rua=?,estado=?,pais=?,num=? where cod=? ;";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setString(1,cep);
			stmt.setString(3,estado);
			stmt.setString(4, pais);
			stmt.setString(2, rua);
			stmt.setString(5,num);
			stmt.setInt(6,cod);
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
		String sql = "Delete from Agencia where cod = ? ;";
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
		String sql = "SELECT COUNT(*) as rowcount FROM agencia where cod =?";
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
	
	public ArrayList<Agencia> esp(int cod){
		String sql = "SELECT * FROM Agencia where cod = ?;";
		PreparedStatement stmt;
		Agencia a;
		try {
			
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setInt(1, cod);
			ResultSet rs = stmt.executeQuery();
			ArrayList <Agencia> agencias = new ArrayList<>();
			while(rs.next()) {
				a = new Agencia();
				a.setCod(rs.getInt("cod"));
				a.setCep(rs.getString("cep"));
				a.setEstado(rs.getString("estado"));
				a.setPais(rs.getString("pais"));
				a.setRua(rs.getString("rua"));
				a.setNum(rs.getString("num"));
				agencias.add(a);
				
				
			}
			
			rs.close();
			stmt.close();
			return agencias;
			}catch(SQLException e) {
				e.printStackTrace();
			}
		return null;

		
	}
}
