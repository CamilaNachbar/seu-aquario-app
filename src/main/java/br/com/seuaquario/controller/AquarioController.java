package br.com.seuaquario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.seuaquario.entity.Aquario;
import br.com.seuaquario.entity.Peixes;
import br.com.seuaquario.service.AquarioService;

@CrossOrigin
@RestController
public class AquarioController {

	@Autowired
	public AquarioService aquarioService;

	@PostMapping(value = "/salvar/aquario")
	public ResponseEntity<?> salvar(@RequestBody List<Aquario> aquarios) {
		return new ResponseEntity<>(aquarioService.salvarAquario(aquarios), HttpStatus.CREATED);
	}

	@DeleteMapping(value = "/deletar/aquario")
	public ResponseEntity<Object> deletar(Aquario aquario) {
		aquarioService.deletarAquario(aquario);
		return new ResponseEntity<>(HttpStatus.ACCEPTED);

	}

	@GetMapping(value = "/busca/aquario/litragem")
	public ResponseEntity<?> listaAquarioLitragem(@RequestBody String litragem) {
		return new ResponseEntity<>(aquarioService.listByLitragem(litragem), HttpStatus.CREATED);
	}

	@GetMapping(value = "/busca/aquario/peixes")
	public ResponseEntity<?> listaAquarioPorPeixes(@RequestBody List<Peixes> peixes) {
		return new ResponseEntity<>(aquarioService.listByPeixe(peixes), HttpStatus.CREATED);
	}
}
