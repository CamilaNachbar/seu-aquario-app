package br.com.seuaquario.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class AquarioController {

//	@Autowired
//	public AquarioService aquarioService;
//
//	@PostMapping(value = "/salvar/aquario")
//	public ResponseEntity<?> salvar(@RequestBody List<Aquario> aquarios) {
//		return new ResponseEntity<>(aquarioService.salvarAquario(aquarios), HttpStatus.CREATED);
//	}

//	@DeleteMapping(value = "/deletar/aquario")
//	public ResponseEntity<Object> deletar(Aquario aquario) {
//		aquarioService.deletarAquario(aquario);
//		return new ResponseEntity<>(HttpStatus.ACCEPTED);
//
//	}

//	@GetMapping(value = "/busca/aquario/litragem")
//	public ResponseEntity<?> listaAquarioLitragem(@RequestBody String litragem) {
//		return new ResponseEntity<>(aquarioService.listByLitragem(litragem), HttpStatus.CREATED);
//	}

//	@GetMapping(value = "/busca/aquario/peixes")
//	public ResponseEntity<?> listaAquarioPorPeixes(@RequestBody List<Peixes> peixes) {
//		return new ResponseEntity<>(aquarioService.listByPeixe(peixes), HttpStatus.CREATED);
//	}
}
