package br.com.confitec.teste.dto;

import java.util.List;

public class PlanoParcelamentoRequisicaoDTO {

	private List<CoberturaDTO> listCobertura;
	private List<OpcaoParcelamentoDTO> listOpcaoParcelamento;

	public PlanoParcelamentoRequisicaoDTO(List<CoberturaDTO> listCobertura,
			List<OpcaoParcelamentoDTO> listOpcaoParcelamento) {
		this.listCobertura = listCobertura;
		this.listOpcaoParcelamento = listOpcaoParcelamento;
	}

	public List<CoberturaDTO> getListCobertura() {
		return listCobertura;
	}

	public void setListCobertura(List<CoberturaDTO> listCobertura) {
		this.listCobertura = listCobertura;
	}

	public List<OpcaoParcelamentoDTO> getListOpcaoParcelamento() {
		return listOpcaoParcelamento;
	}

	public void setListOpcaoParcelamento(List<OpcaoParcelamentoDTO> listOpcaoParcelamento) {
		this.listOpcaoParcelamento = listOpcaoParcelamento;
	}

}
