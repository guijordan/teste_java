package br.com.confitec.teste.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.confitec.teste.dto.CoberturaDTO;
import br.com.confitec.teste.dto.OpcaoParcelamentoDTO;
import br.com.confitec.teste.dto.ParcelamentoDTO;
import br.com.confitec.teste.dto.PlanoParcelamentoRequisicaoDTO;
import br.com.confitec.teste.dto.PlanoParcelamentoRespostaDTO;
import br.com.confitec.teste.service.ParcelamentoService;

@Service
public class ParcelamentoServiceImpl implements ParcelamentoService {

	@Override
	public PlanoParcelamentoRespostaDTO obterPlanosDeParcelamento(PlanoParcelamentoRequisicaoDTO requisicao) throws Exception {
		List<ParcelamentoDTO> listaParcelas = new ArrayList<>();
		for (OpcaoParcelamentoDTO op : requisicao.getListOpcaoParcelamento()) {
			listaParcelas.addAll(obterParcelamentos(requisicao.getListCobertura(), op));
		}
		return new PlanoParcelamentoRespostaDTO(listaParcelas);
	}

	private List<ParcelamentoDTO> obterParcelamentos(List<CoberturaDTO> coberturas, OpcaoParcelamentoDTO op) throws Exception {
		validarOpcaoParcelamento(op);
		List<ParcelamentoDTO> parcelamentos = new ArrayList<>();
		double valorTotal = 0.0;
		for (CoberturaDTO c : coberturas) {
			valorTotal += c.getValor();
		}

		for (int i = op.getQuantidadeMinimaParcelas(); i <= op.getQuantidadeMaximaParcelas(); i++) {
			double totalASerPago = valorTotal * Math.pow((1 + op.getJuros()), i);
			double valorDemaisParcelas = Math.floor((totalASerPago / i) * 100.0) / 100.0;
			double valorPrimeiraParcela = Math.round((totalASerPago - (valorDemaisParcelas * (i - 1))) * 100.0) / 100.0;

			ParcelamentoDTO p = new ParcelamentoDTO(i, valorPrimeiraParcela, valorDemaisParcelas, Math.round(totalASerPago * 100.0) / 100.0);
			if (i == 1) {
				p.setValorDemaisParcelas(null);
			}
			parcelamentos.add(p);
		}

		return parcelamentos;
	}

	private void validarOpcaoParcelamento(OpcaoParcelamentoDTO op) throws Exception {
		if (op.getQuantidadeMinimaParcelas() < 1) {
			throw new Exception("Quantidade mínima de parcelas não pode ser menor que 1.");
		}
		if (op.getQuantidadeMaximaParcelas() < 1) {
			throw new Exception("Quantidade máxima de parcelas não pode ser menor que 1.");
		}
		if (op.getQuantidadeMaximaParcelas() < op.getQuantidadeMinimaParcelas()) {
			throw new Exception("Quantidade máxima de parcelas deve ser maior do que a quantide mínima de parcelas.");
		}
		if (op.getJuros() < 0.0) {
			throw new Exception("Taxa de juros não pode ser menor que 0");
		}
	}
}
