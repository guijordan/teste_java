package br.com.confitec.teste.dto;

public class ParcelamentoDTO {

	private Integer quantidadeParcelas;
	private Double valorPrimeiraParcela;
	private Double valorDemaisParcelas;
	private Double valorParcelamentoTotal;
	
	

	public ParcelamentoDTO(Integer quantidadeParcelas, Double valorPrimeiraParcela, Double valorDemaisParcelas, Double valorParcelamentoTotal) {
		this.quantidadeParcelas = quantidadeParcelas;
		this.valorPrimeiraParcela = valorPrimeiraParcela;
		this.valorDemaisParcelas = valorDemaisParcelas;
		this.valorParcelamentoTotal = valorParcelamentoTotal;
	}

	public Integer getQuantidadeParcelas() {
		return quantidadeParcelas;
	}

	public void setQuantidadeParcelas(Integer quantidadeParcelas) {
		this.quantidadeParcelas = quantidadeParcelas;
	}

	public Double getValorPrimeiraParcela() {
		return valorPrimeiraParcela;
	}

	public void setValorPrimeiraParcela(Double valorPrimeiraParcela) {
		this.valorPrimeiraParcela = valorPrimeiraParcela;
	}

	public Double getValorDemaisParcelas() {
		return valorDemaisParcelas;
	}

	public void setValorDemaisParcelas(Double valorDemaisParcelas) {
		this.valorDemaisParcelas = valorDemaisParcelas;
	}

	public Double getValorParcelamentoTotal() {
		return valorParcelamentoTotal;
	}

	public void setValorParcelamentoTotal(Double valorParcelamentoTotal) {
		this.valorParcelamentoTotal = valorParcelamentoTotal;
	}

}
