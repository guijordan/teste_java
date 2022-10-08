package br.com.confitec.teste.service;

import br.com.confitec.teste.dto.PlanoParcelamentoRequisicaoDTO;
import br.com.confitec.teste.dto.PlanoParcelamentoRespostaDTO;

public interface ParcelamentoService {

	PlanoParcelamentoRespostaDTO obterPlanosDeParcelamento(PlanoParcelamentoRequisicaoDTO requisicao) throws Exception;

}
