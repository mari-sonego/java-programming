package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.Agencia;
import bean.Funcionario;
import bean.Internacional_piloto;

public class FuncionarioDAO {
private Connection connection;
	
	public FuncionarioDAO() {
		connection = new FabricaConexoes().getConnection();
	}
	
	public int insert(Funcionario f) {
		int inseriu = 0;
		String sql = "INSERT INTO Funcionarios(cpf,nome,salario,cma,cod_agen)VALUES(?,?,?,?,?);";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setString(1, f.getCpf());
			stmt.setString(2,f.getNome());
			stmt.setDouble(3, f.getSalario());
			stmt.setString(4, f.getCma());
			stmt.setInt(5,f.getCod_agencia());
			inseriu = stmt.executeUpdate();
			stmt.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return inseriu;
	}
	public ArrayList<Funcionario> getLista(){
		String sql = "SELECT * FROM Funcionarios;";
		PreparedStatement stmt;
		Funcionario f;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			ArrayList <Funcionario> funcionarios = new ArrayList<>();
			while(rs.next()) {
				f = new Funcionario();
				f.setCpf(rs.getString("cpf"));
				f.setNome(rs.getString("nome"));
				f.setSalario(rs.getDouble("salario"));
				f.setCma(rs.getString("cma"));
				f.setCod_agencia(rs.getInt("cod_agen"));
				funcionarios.add(f);
			}
			
			rs.close();
			stmt.close();
			return funcionarios;
			}catch(SQLException e) {
				e.printStackTrace();
			}
		return null;
	}
	
	public int update(String cpf,String nome,double salario, String cma, int cod) {
		int inseriu = 0;
		String sql = "Update Funcionarios set nome=?,salario=?,cma=?,cod_agen =? where cpf=? ;";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setString(5,cpf);
			stmt.setString(1,nome);
			stmt.setDouble(2,salario);
			stmt.setString(3,cma);
			stmt.setInt(4,cod);
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
		String sql = "Delete from Funcionarios where cpf = ? ;";
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
	
	public int existe(String cpf)  {
		int count = 0;
		String sql = "SELECT COUNT(*) as rowcount FROM funcionarios where cpf =?";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setString(1,cpf);
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
	
	public ArrayList<Funcionario> esp(String cpf){
		String sql = "SELECT * FROM Funcionarios where cpf = ?;";
		PreparedStatement stmt;
		Funcionario f;
		try {
			
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setString(1, cpf);
			ResultSet rs = stmt.executeQuery();
			ArrayList <Funcionario> funcs = new ArrayList<>();
			while(rs.next()) {
				f = new Funcionario();
				f.setCpf(rs.getString("cpf"));
				f.setNome(rs.getString("nome"));
				f.setSalario(rs.getDouble("salario"));
				f.setCma(rs.getString("cma"));
				f.setCod_agencia(rs.getInt("cod_agen"));
				funcs.add(f);
				
			}
			
			rs.close();
			stmt.close();
			return funcs;
			}catch(SQLException e) {
				e.printStackTrace();
			}
		return null;

		
	}
	
	public ArrayList<Funcionario> ret2(){
		String sql = "SELECT * from funcionarios where nome like 'a%';" ;
		PreparedStatement stmt;
		Funcionario f;
		try {
			
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			//stmt.setString(1, let);
			ResultSet rs = stmt.executeQuery();
			ArrayList <Funcionario> funcs = new ArrayList<>();
			while(rs.next()) {
				f = new Funcionario();
				f.setCpf(rs.getString("cpf"));
				f.setNome(rs.getString("nome"));
				f.setSalario(rs.getDouble("salario"));
				f.setCma(rs.getString("cma"));
				f.setCod_agencia(rs.getInt("cod_agen"));
				funcs.add(f);
				
			}
			
			rs.close();
			stmt.close();
			return funcs;
			}catch(SQLException e) {
				e.printStackTrace();
			}
		return null;
		
	}
	
	
}
