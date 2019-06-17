/**
 * 
 */
package br.com.seuaquario.serviceImpl;

import org.springframework.stereotype.Component;

import br.com.seuaquario.entity.Aquario;
import br.com.seuaquario.entity.Dimensoes;
import br.com.seuaquario.entity.Substrato;
import br.com.seuaquario.service.CalcularService;
import ch.qos.logback.core.pattern.parser.Parser;

/**
 * @author Camila Nachbar 13 de jun de 2019
 */
@Component
public class CalcularServiceImpl implements CalcularService {

	@Override
	public Aquario aquarioDimensoes(Dimensoes dimensoes) {
		Aquario aquario = new Aquario();
		Substrato substrato = new Substrato();
		
		Long litragem = (dimensoes.getComprimento() *  dimensoes.getLargura() * dimensoes.getAltura())/1000;
		substrato.setQuantidade((litragem * 15)/100);
		aquario.setLitragem(litragem);
		aquario.setDimensoes(dimensoes);
		aquario.setSubstrato(substrato);
		
		return aquario; 
	}

}
