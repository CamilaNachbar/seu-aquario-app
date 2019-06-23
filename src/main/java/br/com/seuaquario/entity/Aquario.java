/**
 * 
 */
package br.com.seuaquario.entity;

import java.util.List;

/**
 * @author Camila Nachbar- 13 de jun de 2019
 */

public class Aquario {

	private String id;
	private String nomeDoAquario;
	private Long litragem;
	private Dimensoes dimensoes;
	private Substrato substrato;
	private Cascalho cascalho;
	private List<Peixes> peixes;
	private RangeDeQualidade range;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNomeDoAquario() {
		return nomeDoAquario;
	}
	public void setNomeDoAquario(String nomeDoAquario) {
		this.nomeDoAquario = nomeDoAquario;
	}
	public Long getLitragem() {
		return litragem;
	}
	public void setLitragem(Long litragem) {
		this.litragem = litragem;
	}
	public Dimensoes getDimensoes() {
		return dimensoes;
	}
	public void setDimensoes(Dimensoes dimensoes) {
		this.dimensoes = dimensoes;
	}
	public Substrato getSubstrato() {
		return substrato;
	}
	public void setSubstrato(Substrato substrato) {
		this.substrato = substrato;
	}
	public Cascalho getCascalho() {
		return cascalho;
	}
	public void setCascalho(Cascalho cascalho) {
		this.cascalho = cascalho;
	}
	public List<Peixes> getPeixes() {
		return peixes;
	}
	public void setPeixes(List<Peixes> peixes) {
		this.peixes = peixes;
	}
	public RangeDeQualidade getRange() {
		return range;
	}
	public void setRange(RangeDeQualidade range) {
		this.range = range;
	}
}
