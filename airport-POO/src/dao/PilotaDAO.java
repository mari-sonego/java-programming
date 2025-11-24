package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;

import bean.Agencia;
import bean.Pilota;

public class PilotaDAO {
private Connection connection;
	
	public PilotaDAO() {
		connection = new FabricaConexoes().getConnection();
	}
	public int insert(Pilota p) {
		int inseriu = 0;
		String sql = "INSERT INTO Pilota(local_de_partida,local_de_destino,data_de_partida,"
				+ "data_de_chegada,hora_de_partida,hora_de_chegada,cod_avioes,cpf_piloto1,cpf_piloto2)VALUES(?,?,?,?,?,?,?,?,?);";
		PreparedStatement stmt;
		
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setString(1,p.getPartida());
			stmt.setString(2, p.getChegada());
			stmt.setDate(3,p.getData_p() );
			stmt.setDate(4, p.getData_c());
			stmt.setTime(5, p.getHora_p());
			stmt.setTime(6,p.getHora_c());
			stmt.setInt(7, p.getCod_a());
			stmt.setString(8, p.getCpf_p1());
			stmt.setString(9, p.getCpf_p2());
			inseriu = stmt.executeUpdate();
			stmt.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return inseriu;
	}
	
	public ArrayList<Pilota> getLista(){
		String sql = "SELECT * FROM Pilota;";
		PreparedStatement stmt;
		Pilota p;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			ArrayList <Pilota> pilotas = new ArrayList<>();
			while(rs.next()) {
				p = new Pilota();
				p.setId(rs.getInt("id"));
				p.setPartida(rs.getString("local_de_partida"));
				p.setChegada(rs.getString("local_de_destino"));
				p.setData_p(rs.getDate("data_de_partida"));
				p.setData_c(rs.getDate("data_de_chegada"));
				p.setHora_p(rs.getTime("hora_de_partida"));
				p.setHora_c(rs.getTime("hora_de_chegada"));
				p.setCod_a(rs.getInt("cod_avioes"));
				p.setCpf_p1(rs.getString("cpf_piloto1"));
				p.setCpf_p2(rs.getString("cpf_piloto2"));
				
				pilotas.add(p);
			}
			
			rs.close();
			stmt.close();
			return pilotas;
			}catch(SQLException e) {
				e.printStackTrace();
			}
		return null;
	}
	
	public int update(int id, String pa, String ch, Date dp, Date dc, Time hp, Time hc, int cod, String p1, String p2) {
		int inseriu = 0;
		String sql = "Update Pilota set local_de_partida =?,local_de_destino =?,data_de_partida =?, "
						+ "data_de_chegada =?,hora_de_partida =?,hora_de_chegada =?,cod_avioes =?,cpf_piloto1 =?,cpf_piloto2 =? where id=?;";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setInt(10, id);
			stmt.setString(1, pa);
			stmt.setString(2, ch);
			stmt.setDate(3, dp);
			stmt.setDate(4, dc);
			stmt.setTime(5, hp);
			stmt.setTime(6, hc);
			stmt.setInt(7, cod);
			stmt.setString(8,p1);
			stmt.setString(9, p2);
			inseriu = stmt.executeUpdate();
			stmt.close();
			inseriu = 1;
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return inseriu;
	}
	
	public int excluir(int id) {
		int inseriu = 0;
		String sql = "delete from pilota where id = ? ;";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setInt(1, id);
			inseriu = stmt.executeUpdate();
			stmt.close();
			inseriu = 1;
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return inseriu;
	}
	
	public int existe(int id) {
		int count = 0;
		String sql = "SELECT COUNT(*) as rowcount FROM Pilota where id =?";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setInt(1, id);
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
	
	public ArrayList<Pilota> esp(int id){
		String sql = "SELECT * FROM Pilota where id = ?;";
		PreparedStatement stmt;
		Pilota p;
		try {
			
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			ArrayList <Pilota> ps = new ArrayList<>();
			while(rs.next()) {
				p = new Pilota();
				p.setId(rs.getInt("id"));
				p.setPartida(rs.getString("local_de_partida"));
				p.setChegada(rs.getString("local_de_destino"));
				p.setData_p(rs.getDate("data_de_partida"));
				p.setData_c(rs.getDate("data_de_chegada"));
				p.setHora_p(rs.getTime("hora_de_partida"));
				p.setHora_c(rs.getTime("hora_de_chegada"));
				p.setCod_a(rs.getInt("cod_avioes"));
				p.setCpf_p1(rs.getString("cpf_piloto1"));
				p.setCpf_p2(rs.getString("cpf_piloto2"));
				
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
