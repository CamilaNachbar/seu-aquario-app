
package br.com.seuaquario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.seuaquario.entity.Aquario;
import br.com.seuaquario.entity.Dimensoes;
import br.com.seuaquario.service.CalcularService;

/**
 * @author Camila Nachbar - cshebling@stefanini.com - 62106 13 de jun de 2019
 */
@CrossOrigin
@RestController
public class CalcularController {

	@Autowired
	public CalcularService calcular;

	@PostMapping(value = "/calcular/litragem")
	public Aquario calcularDimensoesESubstrato(@RequestBody Dimensoes dimensoes) {
		return calcular.aquarioDimensoes(dimensoes);

	}

	

}
