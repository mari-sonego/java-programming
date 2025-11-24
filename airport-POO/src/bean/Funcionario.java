package bean;

public class Funcionario {
	
	protected String cpf;
	protected String nome;
	protected double salario;
	protected String cma;
	protected int cod_agencia;
	
	public Funcionario(String cpf, String nome, double salario, String cma, int cod_agencia) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.salario = salario;
		this.cma = cma;
		this.cod_agencia = cod_agencia;
	}

	public Funcionario() {
		super();
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCma() {
		return cma;
	}

	public void setCma(String cma) {
		this.cma = cma;
	}

	public int getCod_agencia() {
		return cod_agencia;
	}

	public void setCod_agencia(int cod_agencia) {
		this.cod_agencia = cod_agencia;
	}

	@Override
	public String toString() {
		return "Funcionario [cpf=" + cpf + ", nome=" + nome + ", salario=" + salario + ", cma=" + cma + ", cod_agencia="
				+ cod_agencia + "]";
	}
	
	
	
}
