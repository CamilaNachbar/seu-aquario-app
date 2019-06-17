/**
 * 
 */
package br.com.seuaquario.entity;

import br.com.seuaquario.enums.Comportamento;

/**
 * @author Camila Nachbar - cshebling@stefanini.com - 62106 13 de jun de 2019
 */
public class Peixes {

	public String codigoPeixe;
	public String nomePopular;
	public String nomeCientifico;
	public String observacoes;
	public Comportamento comportamento;
	public Long phMinimo;
	public Long phMaximo;
	public Double litragem;
	public Double litragemAdicionalPorPeixe;
	public int dificuldade; //5 o maximo de dificuldade
	public boolean peixeUnico; // false para aquario comunitario
	

}
