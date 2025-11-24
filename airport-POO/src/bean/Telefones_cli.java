package bean;

public class Telefones_cli {
	private String cpf_cliente;
	private String telefone;
	public Telefones_cli(String cpf_cliente, String telefone) {
		super();
		this.cpf_cliente = cpf_cliente;
		this.telefone = telefone;
	}
	public Telefones_cli() {
		super();
	}
	public String getCpf_cliente() {
		return cpf_cliente;
	}
	public void setCpf_cliente(String cpf_cliente) {
		this.cpf_cliente = cpf_cliente;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	@Override
	public String toString() {
		return "Telefones_cli [cpf_cliente=" + cpf_cliente + ", telefone=" + telefone + "]";
	}
	
	
}
