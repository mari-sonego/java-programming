package bean;

public class Aviao {
	private int cod;
	private int num_a;
	private int capacidade;
	private String fabricante;
	private String modelo;
	private int ano;
	private String companhia;
	private int agencia_fk;
	public Aviao(int num_a, int capacidade, String fabricante, String modelo, int ano, String companhia,int agencia_fk) {
		super();
		this.num_a = num_a;
		this.capacidade = capacidade;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.ano = ano;
		this.companhia = companhia;
		this.agencia_fk = agencia_fk;
	}
	public Aviao() {
		super();
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public int getNum_a() {
		return num_a;
	}
	public void setNum_a(int num_a) {
		this.num_a = num_a;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCompanhia() {
		return companhia;
	}
	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}
	
	public int getAgencia_fk() {
		return agencia_fk;
	}
	public void setAgencia_fk(int agencia_fk) {
		this.agencia_fk = agencia_fk;
	}
	@Override
	public String toString() {
		return "Aviao [cod=" + cod + ", num_a=" + num_a + ", capacidade=" + capacidade + ", fabricante=" + fabricante
				+ ", modelo=" + modelo + ", ano=" + ano + ", companhia=" + companhia +  ", agencia_fk=" + agencia_fk +  "]";
	}
	
	
}
