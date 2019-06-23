/**
 * 
 */
package br.com.seuaquario.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.seuaquario.entity.Aquario;
import br.com.seuaquario.entity.Dimensoes;

/**
 * @author Camila Nachbar 13 de jun de 2019
 */
@Service
public interface CalcularService {

	public Aquario aquarioDimensoes(Dimensoes dimensoes);

	public ResponseEntity<?> salvarAquario(List<Aquario> aquario);

}
