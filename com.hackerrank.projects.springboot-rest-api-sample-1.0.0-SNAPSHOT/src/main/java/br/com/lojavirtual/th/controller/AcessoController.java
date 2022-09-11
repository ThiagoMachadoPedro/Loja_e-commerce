package br.com.lojavirtual.th.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	@DeleteMapping(value = "**/deletaAcesso")
	@ResponseBody
	public ResponseEntity<?> deletarAcesso(@RequestBody Acesso acesso) {

		acessoRepository.deleteById(acesso.getId());

		return new ResponseEntity("Acesso Removido", HttpStatus.OK);
	}

	@DeleteMapping(value = "**/deletaAcessoPorId/{id}")
	@ResponseBody
	public ResponseEntity<?> deletaAcessoPorId(@PathVariable("id")Long id) {

		acessoRepository.deleteById(id);

		return new ResponseEntity("Acesso Removido", HttpStatus.OK);
	}

	@GetMapping(value = "**/obterAcesso/{id}")
	@ResponseBody
	public ResponseEntity<Acesso> obterAcesso(@PathVariable("id")Long id) {

	Acesso acesso =	acessoRepository.findById(id).get() ;

		return new ResponseEntity<Acesso>(acesso, HttpStatus.OK);
	}
	
	@GetMapping(value = "**/buscarPorDesc/{desc}")
	@ResponseBody
	public ResponseEntity<List<Acesso>> buscarPorDesc(@PathVariable("id")String desc) {

	List<Acesso> acessos = acessoRepository.buscarAcessoDesc(desc);

		return new ResponseEntity<List<Acesso>>(acessos, HttpStatus.OK);
	}
	
	
	
	
	
	
	
}
