/**
 * 
 */
package br.com.seuaquario.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import br.com.seuaquario.entity.Aquario;
import br.com.seuaquario.entity.Dimensoes;
import br.com.seuaquario.entity.Substrato;

/**
 * @author Camila Nachbar 13 de jun de 2019
 */
@Service
public class CalcularService {

	private static final Logger log = LoggerFactory.getLogger(CalcularService.class);

	public Aquario aquarioDimensoes(Dimensoes dimensoes) {
		try {
			Aquario aquario = new Aquario();
			Substrato substrato = new Substrato();

			Long litragem = (dimensoes.getComprimento() * dimensoes.getLargura() * dimensoes.getAltura()) / 1000;
			substrato.setQuantidade((litragem * 15) / 100);
			aquario.setLitragem(litragem);
			aquario.setDimensoes(dimensoes);
			aquario.setSubstrato(substrato);

			return aquario;
		} catch (Exception e) {
			log.error("Error" + e.getMessage());
			return null;
		}
	}

}
