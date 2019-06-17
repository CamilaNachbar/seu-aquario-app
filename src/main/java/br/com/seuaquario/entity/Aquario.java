/**
 * 
 */
package br.com.seuaquario.entity;

import lombok.Data;

/**
 * @author Camila Nachbar - cshebling@stefanini.com - 62106
 * 13 de jun de 2019
 */
@Data
public class Aquario {

	private Long litragem;
	private Dimensoes dimensoes;
	private Substrato substrato;
}
