/**
 * 
 */
package br.com.seuaquario.entity;

import java.util.List;

import lombok.Data;

/**
 * @author Camila Nachbar- 13 de jun de 2019
 */
@Data
public class Aquario {

	private String id;
	private String nomeDoAquario;
	private Long litragem;
	private Dimensoes dimensoes;
	private Substrato substrato;
	private List<Peixes> peixes;
	private RangeDeQualidade range;
}
