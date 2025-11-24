package bean;

import java.util.ArrayList;

public class Cliente {
	private String cpf;
	private String nome;
	private String email;
	private String passaporte;
	private int idade;
	private String inf;
	
	public Cliente(String cpf,String nome, String email, String passaporte, int idade, String inf) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.passaporte = passaporte;
		this.idade = idade;
		this.inf = inf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cliente() {
		super();
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassaporte() {
		return passaporte;
	}

	public void setPassaporte(String passaporte) {
		this.passaporte = passaporte;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getInf() {
		return inf;
	}

	public void setInf(String inf) {
		this.inf = inf;
	}
	


	@Override
	public String toString() {
		return "Cliente [cpf=" + cpf + ",nome="+ nome +", email=" + email + ", passaporte=" + passaporte + ", idade=" + idade + ", inf="
				+ inf + "]";
	}
	
	
	
	
}
