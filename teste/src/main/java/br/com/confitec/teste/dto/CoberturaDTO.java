package br.com.confitec.teste.dto;

public class CoberturaDTO {

	private Integer cobertura;
	private Double valor;

	public CoberturaDTO(Integer cobertura, Double valor) {
		this.cobertura = cobertura;
		this.valor = valor;
	}

	public Integer getCobertura() {
		return cobertura;
	}

	public void setCobertura(Integer cobertura) {
		this.cobertura = cobertura;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

}
