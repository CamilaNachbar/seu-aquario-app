/**
 * 
 */
package br.com.seuaquario.entity;

import br.com.seuaquario.enums.Comportamento;
import lombok.Data;

/**
 * @author Camila Nachbar - cshebling@stefanini.com - 62106 13 de jun de 2019
 */

@Data
public class Peixes {

	private String codigoPeixe;
	private String nomePopular;
	private String nomeCientifico;
	private String observacoes;
	private Comportamento comportamento;
	private Long phMinimo;
	private Long phMaximo;
	private Double litragem;
	private Double litragemAdicionalPorPeixe;
	private int dificuldade; // 5 o maximo de dificuldade
	private boolean peixeUnico; // false para aquario comunitario

}
