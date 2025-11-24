package bean;

public class Agencia {
	private int cod;
	private String cep;
	private String rua;
	private String estado;
	private String pais;
	private String num;

	public Agencia(String cep, String rua, String estado, String pais, String num) {
		super();
		this.cep = cep;
		this.rua = rua;
		this.estado = estado;
		this.pais = pais;
		this.num = num;
	}

	public Agencia() {
		super();
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Agencia [cod=" + cod + ", cep=" + cep + ", rua=" + rua + ", estado=" + estado + ", pais=" + pais
				+ ", num=" + num + "]";
	}

}
