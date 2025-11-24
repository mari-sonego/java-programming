package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.Cliente;
import bean.Passagem;

public class PassagemDAO {
private Connection connection;
	
	public PassagemDAO() {
		connection = new FabricaConexoes().getConnection();
	}
	public int insert(Passagem p) {
		int inseriu = 0;
		String sql = "INSERT INTO Passagem(cod,n_assento,valor,cod_agen,cpf_cli,id_pilota) VALUES(?,?,?,?,?,?);";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setInt(1,p.getCod() );
			stmt.setString(2,p.getNum());
			stmt.setFloat(3, p.getValor());
			stmt.setInt(4,p.getCod_agen() );
			stmt.setString(5,p.getCpf_cli());
			stmt.setInt(6,p.getId_pilota());
			inseriu = stmt.executeUpdate();
			stmt.close();
			inseriu = 1;
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return inseriu;
	}
	
	public ArrayList<Passagem> getLista(){
		String sql = "SELECT * FROM Passagem;";
		PreparedStatement stmt;
		Passagem p;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			ArrayList <Passagem> passagens = new ArrayList<>();
			while(rs.next()) {
				p = new Passagem();
				p.setCod(rs.getInt("cod"));
				p.setNum(rs.getString("n_assento"));
				p.setValor(rs.getFloat("valor"));
				p.setCod_agen(rs.getInt("cod_agen"));
				p.setCpf_cli(rs.getString("cpf_cli"));
				p.setId_pilota(rs.getInt("id_pilota"));
				passagens.add(p);
			}
			
			rs.close();
			stmt.close();
			return passagens;
			}catch(SQLException e) {
				e.printStackTrace();
			}
		return null;
	}
	
	public int update(int cod, String num, float valor, int cod_a, String cpf, int id_p) {
		int inseriu = 0;
		String sql = "Update Passagem set n_assento=?, valor=?,cod_agen=?,cpf_cli=?,id_pilota=? where cod = ? ;";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setInt(6,cod );
			stmt.setString(1,num);
			stmt.setFloat(2,valor);
			stmt.setInt(3,cod_a);
			stmt.setString(4,cpf);
			stmt.setInt(5,id_p);
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
		String sql = "delete from passagem where cod = ? ;";
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
	
	public int existe(int cod) {
		int count = 0;
		String sql = "SELECT COUNT(*) as rowcount FROM Passagem where cod =?";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setInt(1, cod);
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
	
	public ArrayList<Passagem> esp(int cod){
		String sql = "SELECT * FROM Passagem where cod = ?;";
		PreparedStatement stmt;
		Passagem p;
		try {
			
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setInt(1, cod);
			ResultSet rs = stmt.executeQuery();
			ArrayList <Passagem> ps = new ArrayList<>();
			while(rs.next()) {
				p = new Passagem();
				p.setCod(rs.getInt("cod"));
				p.setNum(rs.getString("n_assento"));
				p.setValor(rs.getFloat("valor"));
				p.setCod_agen(rs.getInt("cod_agen"));
				p.setCpf_cli(rs.getString("cpf_cli"));
				p.setId_pilota(rs.getInt("id_pilota"));
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
	
	
}
