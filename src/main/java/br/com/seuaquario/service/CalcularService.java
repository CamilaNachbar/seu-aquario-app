/**
 * 
 */
package br.com.seuaquario.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import br.com.seuaquario.entity.Aquario;
import br.com.seuaquario.entity.Cascalho;
import br.com.seuaquario.entity.Dimensoes;
import br.com.seuaquario.entity.Peixes;
import br.com.seuaquario.entity.Substrato;
import br.com.seuaquario.enums.Tamanho;
import br.com.seuaquario.repository.PeixeRepository;

/**
 * @author Camila Nachbar 13 de jun de 2019
 */
@Service
public class CalcularService {

	public PeixeRepository peixesRepository;

	private static final Logger log = LoggerFactory.getLogger(CalcularService.class);

	public Aquario aquarioDimensoes(Dimensoes dimensoes) {
		try {
			Aquario aquario = new Aquario();
			Substrato substrato = new Substrato();
			Long litragem = calculoLitragem(dimensoes);
			Cascalho cascalho = new Cascalho();
			substrato.setQuantidade(dimensoes.getComprimento() * dimensoes.getLargura() * 5 / 1000);
			cascalho.setQuantidade(dimensoes.getComprimento() * dimensoes.getLargura() * 3 / 1000);
			aquario.setLitragem(litragem);
			aquario.setCascalho(cascalho);
			aquario.setDimensoes(dimensoes);
			aquario.setSubstrato(substrato);

			return aquario;
		} catch (Exception e) {
			log.error("Error" + e.getMessage());
			return null;
		}
	}

	/*
	 * - Peixes com altura maxima recomendada - peixes depende de uma litragem
	 * minina recomendada,e uma adicional para cada novo integrante
	 * 
	 * 
	 * função recomendar peixes
	 * 
	 * - Buscar pela litragem. - lista pelo biotopo escolhido - Quantidade de
	 * integrantes. - Calcular o substrato ( e o tipo de substrato). - Buscar por
	 * plantas recomendadas para aquele tipo de fauna ( se existente). - retornar
	 * lista de aquario possiveis para aquela determinada listragem.
	 * 
	 */

	public List<Aquario> aquarioComPeixesRelativosAoTamanhoEBiotopo(Dimensoes dimensoes, String biotopo) {
		Aquario aquario = new Aquario();
		List<Peixes> peixes = new ArrayList<>();
		peixes.addAll(peixesRepository.findByLitragemLessThan(calculoLitragem(dimensoes)));
		peixes.stream().filter(p -> p.getBiotopo().equals(biotopo)).collect(Collectors.toList());

		return null;

	}

	private Long calculoLitragem(Dimensoes dimensoes) {
		return (dimensoes.getComprimento() * dimensoes.getLargura() * dimensoes.getAltura()) / 1000;

	}

	private HashMap<String, Double> calculoQuantidadeDePeixesPorLitragem(Long litragem) {
		HashMap<String, Double> listaPeixes = new HashMap<String, Double>();
		double peixepequenos5cm = 0;
		double peixespequenos10cm = 0;
		double peixesmedios20cm = 0;
		double peixesgrande20cm = 0;

		peixepequenos5cm = litragem / 2.5;
		peixespequenos10cm = litragem / 10;
		peixesmedios20cm = litragem / 20;
		peixesgrande20cm = litragem / 50;
		listaPeixes.put(Tamanho.PEQUENO_ATE_5CM.getDescricao(), peixepequenos5cm);
		listaPeixes.put(Tamanho.PEQUENO_ATE_10CM.getDescricao(), peixespequenos10cm);
		listaPeixes.put(Tamanho.MEDIO_ATE_20CM.getDescricao(), peixesmedios20cm);
		listaPeixes.put(Tamanho.GRANDE_25CM_ACIMA.getDescricao(), peixesgrande20cm);

		return listaPeixes;

	}

	public List<Peixes> buscarPorFaixaDePh(List<Peixes> peixes, Long phMinimo, Long phMaximo) {
		return peixes.stream().filter(i -> i.getPhMinimo() >= phMinimo && i.getPhMaximo() <= phMaximo)
				.collect(Collectors.toList());
		
		
	}
}
