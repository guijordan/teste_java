package br.com.confitec.teste.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.confitec.teste.dto.PlanoParcelamentoRequisicaoDTO;
import br.com.confitec.teste.dto.PlanoParcelamentoRespostaDTO;
import br.com.confitec.teste.service.ParcelamentoService;

@RestController
@RequestMapping(value = "/confitec/teste/parcelamento")
public class ParcelamentoResource {

	@Autowired
	private ParcelamentoService parcelamentoService;

	@PostMapping
	public ResponseEntity<PlanoParcelamentoRespostaDTO> obterPlanosDeParcelamento(
			@RequestBody PlanoParcelamentoRequisicaoDTO requisicao) {
		
		try {
			PlanoParcelamentoRespostaDTO resp = parcelamentoService.obterPlanosDeParcelamento(requisicao);
			return ResponseEntity.ok(resp);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
