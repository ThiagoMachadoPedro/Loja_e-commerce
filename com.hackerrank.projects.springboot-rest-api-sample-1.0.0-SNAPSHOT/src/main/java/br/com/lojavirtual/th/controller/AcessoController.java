package br.com.lojavirtual.th.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.lojavirtual.th.model.Acesso;
import br.com.lojavirtual.th.repository.AcessoRepository;
import br.com.lojavirtual.th.services.AcessoServices;

@Controller
@RestController
public class AcessoController {

	@Autowired
	private AcessoServices acessoServices;

	@Autowired
	private AcessoRepository acessoRepository;

	@PostMapping(value = "**/salvarAcesso")
	@ResponseBody
	public ResponseEntity<Acesso> salvaAcesso(@RequestBody Acesso acesso) {

		Acesso acessoSalvo = acessoServices.save(acesso);

		return new ResponseEntity<Acesso>(acessoSalvo, HttpStatus.OK);
	}

	@PostMapping(value = "**/deletaAcesso")
	@ResponseBody
	public ResponseEntity<?> deletarAcesso(@RequestBody Acesso acesso) {

		acessoRepository.deleteById(acesso.getId());

		return new ResponseEntity("Acesso Removido", HttpStatus.OK);
	}

}
