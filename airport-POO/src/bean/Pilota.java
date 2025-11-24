package bean;

import java.sql.Date;
import java.sql.Time;

public class Pilota {
	private int id;
	private String partida;
	private String chegada;
	private Date data_p;
	private Date data_c;
	private Time hora_p;
	private Time hora_c;
	private int cod_a;
	private String cpf_p1;
	private String cpf_p2;
	public Pilota(String partida, String chegada, Date data_p, Date data_c, Time hora_p, Time hora_c, int cod_a,
			String cpf_p1, String cpf_p2) {
		super();
		
		this.partida = partida;
		this.chegada = chegada;
		this.data_p = data_p;
		this.data_c = data_c;
		this.hora_p = hora_p;
		this.hora_c = hora_c;
		this.cod_a = cod_a;
		this.cpf_p1 = cpf_p1;
		this.cpf_p2 = cpf_p2;
	}
	public Pilota() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPartida() {
		return partida;
	}
	public void setPartida(String partida) {
		this.partida = partida;
	}
	public String getChegada() {
		return chegada;
	}
	public void setChegada(String chegada) {
		this.chegada = chegada;
	}
	public Date getData_p() {
		return data_p;
	}
	public void setData_p(Date data_p) {
		this.data_p = data_p;
	}
	public Date getData_c() {
		return data_c;
	}
	public void setData_c(Date data_c) {
		this.data_c = data_c;
	}
	public Time getHora_p() {
		return hora_p;
	}
	public void setHora_p(Time hora_p) {
		this.hora_p = hora_p;
	}
	public Time getHora_c() {
		return hora_c;
	}
	public void setHora_c(Time hora_c) {
		this.hora_c = hora_c;
	}
	public int getCod_a() {
		return cod_a;
	}
	public void setCod_a(int cod_a) {
		this.cod_a = cod_a;
	}
	public String getCpf_p1() {
		return cpf_p1;
	}
	public void setCpf_p1(String cpf_p1) {
		this.cpf_p1 = cpf_p1;
	}
	public String getCpf_p2() {
		return cpf_p2;
	}
	public void setCpf_p2(String cpf_p2) {
		this.cpf_p2 = cpf_p2;
	}
	@Override
	public String toString() {
		return "Pilota [ partida=" + partida + ", chegada=" + chegada + ", data_p=" + data_p + ", data_c="
				+ data_c + ", hora_p=" + hora_p + ", hora_c=" + hora_c + ", cod_a=" + cod_a + ", cpf_p1=" + cpf_p1
				+ ", cpf_p2=" + cpf_p2 + "]";
	}
	
	
	
	
}
