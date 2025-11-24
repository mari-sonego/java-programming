package bean;

public class Piloto extends Funcionario {
	protected String cpf_func;
	protected String breve;
	public Piloto(String cpf, String nome, double salario, String cma, int cod_agencia, String cpf_func, String breve) {
		super(cpf, nome, salario, cma, cod_agencia);
		this.cpf_func = cpf_func;
		this.breve = breve;
	}
	
	public Piloto(String cpf, String nome, double salario, String cma, int cod_agencia) {
		super(cpf, nome, salario, cma, cod_agencia);
	}
	

	public Piloto(String cpf_func, String breve) {
		super();
		this.cpf_func = cpf_func;
		this.breve = breve;
	}

	public Piloto() {
		// TODO Auto-generated constructor stub
	}

	public String getCpf_func() {
		return cpf_func;
	}
	public void setCpf_func(String cpf_func) {
		this.cpf_func = cpf_func;
	}
	public String getBreve() {
		return breve;
	}
	public void setBreve(String breve) {
		this.breve = breve;
	}
	@Override
	public String toString() {
		return "Piloto [cpf_func=" + cpf_func + ", breve=" + breve + "]";
	}
	
	
}
