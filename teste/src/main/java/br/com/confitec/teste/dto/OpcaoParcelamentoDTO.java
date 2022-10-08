package br.com.confitec.teste.dto;

public class OpcaoParcelamentoDTO {

	private Integer quantidadeMinimaParcelas;
	private Integer quantidadeMaximaParcelas;
	private Double juros;
	
	public OpcaoParcelamentoDTO(Integer quantidadeMinimaParcelas, Integer quantidadeMaximaParcelas, Double juros) {
		this.quantidadeMinimaParcelas = quantidadeMinimaParcelas;
		this.quantidadeMaximaParcelas = quantidadeMaximaParcelas;
		this.juros = juros;
	}

	public Integer getQuantidadeMinimaParcelas() {
		return quantidadeMinimaParcelas;
	}

	public void setQuantidadeMinimaParcelas(Integer quantidadeMinimaParcelas) {
		this.quantidadeMinimaParcelas = quantidadeMinimaParcelas;
	}

	public Integer getQuantidadeMaximaParcelas() {
		return quantidadeMaximaParcelas;
	}

	public void setQuantidadeMaximaParcelas(Integer quantidadeMaximaParcelas) {
		this.quantidadeMaximaParcelas = quantidadeMaximaParcelas;
	}

	public Double getJuros() {
		return juros;
	}

	public void setJuros(Double juros) {
		this.juros = juros;
	}

}
