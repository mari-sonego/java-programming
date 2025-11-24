package bean;

public class Passagem {
	private int cod;
	private String num;
	private float valor;
	private int cod_agen;
	private String cpf_cli;
	private int id_pilota;
	
	public Passagem(String num, float valor, int cod_agen, String cpf_cli, int id_pilota) {
		super();
		this.num = num;
		this.valor = valor;
		this.cod_agen = cod_agen;
		this.cpf_cli = cpf_cli;
		this.id_pilota = id_pilota;
	}
	
	

	public Passagem() {
		super();
	}



	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getCod_agen() {
		return cod_agen;
	}

	public void setCod_agen(int cod_agen) {
		this.cod_agen = cod_agen;
	}

	public String getCpf_cli() {
		return cpf_cli;
	}

	public void setCpf_cli(String cpf_cli) {
		this.cpf_cli = cpf_cli;
	}

	public int getId_pilota() {
		return id_pilota;
	}

	public void setId_pilota(int id_pilota) {
		this.id_pilota = id_pilota;
	}



	@Override
	public String toString() {
		return "Passagem [cod=" + cod + ", num=" + num + ", valor=" + valor + ", cod_agen=" + cod_agen + ", cpf_cli="
				+ cpf_cli + ", id_pilota=" + id_pilota + "]";
	}
	
	
	
	
}
