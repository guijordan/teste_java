package br.com.confitec.teste.dto;

import java.util.List;

public class PlanoParcelamentoRespostaDTO {

	private List<ParcelamentoDTO> dados;

	public PlanoParcelamentoRespostaDTO(List<ParcelamentoDTO> dados) {
		this.dados = dados;
	}

	public List<ParcelamentoDTO> getDados() {
		return dados;
	}

	public void setDados(List<ParcelamentoDTO> dados) {
		this.dados = dados;
	}

}
