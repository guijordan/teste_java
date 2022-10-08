package br.com.confitec.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.confitec.teste.dto.CoberturaDTO;
import br.com.confitec.teste.dto.OpcaoParcelamentoDTO;
import br.com.confitec.teste.dto.ParcelamentoDTO;
import br.com.confitec.teste.dto.PlanoParcelamentoRequisicaoDTO;
import br.com.confitec.teste.dto.PlanoParcelamentoRespostaDTO;
import br.com.confitec.teste.resource.ParcelamentoResource;
import br.com.confitec.teste.service.ParcelamentoService;

@SpringBootTest
class TesteApplicationTests {

	@Autowired
	private ParcelamentoService parcelamentoService;

	@Autowired
	private ParcelamentoResource parcelamentoResource;

	PlanoParcelamentoRequisicaoDTO requisicao;

	PlanoParcelamentoRespostaDTO resposta;

	@BeforeEach
	void montarMassaDeTeste() {

		requisicao = new PlanoParcelamentoRequisicaoDTO(
				Arrays.asList(new CoberturaDTO(1, 123.12), new CoberturaDTO(4, 345.45)),
				Arrays.asList(new OpcaoParcelamentoDTO(10, 12, 0.03)));

		resposta = new PlanoParcelamentoRespostaDTO(Arrays.asList(new ParcelamentoDTO(10, 62.99, 62.97, 629.72),
				new ParcelamentoDTO(11, 59.01, 58.96, 648.61), new ParcelamentoDTO(12, 55.70, 55.67, 668.07)));
	}

	@Test
	void validarPrimeiraParcela() throws Exception {

		assertEquals(resposta.getDados().get(0).getValorPrimeiraParcela(),
				parcelamentoService.obterPlanosDeParcelamento(requisicao).getDados().get(0).getValorPrimeiraParcela());

	}

	@Test
	void validarDemaisParcelas() throws Exception {

		assertEquals(resposta.getDados().get(1).getValorDemaisParcelas(),
				parcelamentoService.obterPlanosDeParcelamento(requisicao).getDados().get(1).getValorDemaisParcelas());

	}

	@Test
	void validarValorParcelamentoTotal() throws Exception {

		assertEquals(resposta.getDados().get(2).getValorParcelamentoTotal(), parcelamentoService
				.obterPlanosDeParcelamento(requisicao).getDados().get(2).getValorParcelamentoTotal());

	}

	@Test
	void validarEndpoint() throws Exception {

		assertEquals(resposta.getDados().get(2).getValorParcelamentoTotal(),
				parcelamentoResource.obterPlanosDeParcelamento(requisicao).getBody().getDados().get(2).getValorParcelamentoTotal());

	}

}
