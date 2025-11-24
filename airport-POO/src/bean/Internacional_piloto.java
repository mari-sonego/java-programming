package bean;

public class Internacional_piloto extends Piloto {
	private String cpf_pi;
	private String moeda;
	private String pais;
	private String idioma;
	public Internacional_piloto(String cpf, String nome, double salario, String cma, int cod_agencia, String cpf_func,
			String breve, String moeda, String pais, String idioma) {
		super(cpf, nome, salario, cma, cod_agencia, cpf_func, breve);
		this.moeda = moeda;
		this.pais = pais;
		this.idioma = idioma;
	}
	
	public Internacional_piloto(String cpf, String nome, double salario, String cma, int cod_agencia, String cpf_func,
			String breve) {
		super(cpf, nome, salario, cma, cod_agencia, cpf_func, breve);
	}
	

	public Internacional_piloto(String cpf_pi,String moeda, String pais, String idioma) {
		super();
		this.cpf_pi = cpf_pi;
		this.moeda = moeda;
		this.pais = pais;
		this.idioma = idioma;
	}

	public Internacional_piloto() {
		// TODO Auto-generated constructor stub
	}
	
	

	public String getCpf_pi() {
		return cpf_pi;
	}

	public void setCpf_pi(String cpf_pi) {
		this.cpf_pi = cpf_pi;
	}

	public String getMoeda() {
		return moeda;
	}
	public void setMoeda(String moeda) {
		this.moeda = moeda;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	@Override
	public String toString() {
		return "Internacional_piloto [moeda=" + moeda + ", pais=" + pais + ", idioma=" + idioma + "]";
	}
	
	
}
