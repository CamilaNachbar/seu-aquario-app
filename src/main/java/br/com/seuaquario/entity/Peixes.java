/**
 * 
 */
package br.com.seuaquario.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import br.com.seuaquario.enums.Comportamento;

/**
 * @author Camila Nachbar - 13 de jun de 2019
 */
@Document
public class Peixes {

	private String codigoPeixe;
	private String nomePopular;
	private String nomeCientifico;
	private String observacoes;
	private String temperaturaMinima;
	private String temperaturaMaxima;
	private Comportamento comportamento;
	private Long phMinimo;
	private Long phMaximo;
	private String alimentação;
	private String tamanho;
	private Double litragem;
	private Double litragemAdicionalPorPeixe;
	private int dificuldade; // 5 o maximo de dificuldade
	private boolean peixeUnico; // false para aquario comunitario

	public String getCodigoPeixe() {
		return codigoPeixe;
	}

	public void setCodigoPeixe(String codigoPeixe) {
		this.codigoPeixe = codigoPeixe;
	}

	public String getNomePopular() {
		return nomePopular;
	}

	public void setNomePopular(String nomePopular) {
		this.nomePopular = nomePopular;
	}

	public String getNomeCientifico() {
		return nomeCientifico;
	}

	public void setNomeCientifico(String nomeCientifico) {
		this.nomeCientifico = nomeCientifico;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public String getTemperaturaMinima() {
		return temperaturaMinima;
	}

	public void setTemperaturaMinima(String temperaturaMinima) {
		this.temperaturaMinima = temperaturaMinima;
	}

	public String getTemperaturaMaxima() {
		return temperaturaMaxima;
	}

	public void setTemperaturaMaxima(String temperaturaMaxima) {
		this.temperaturaMaxima = temperaturaMaxima;
	}

	public Comportamento getComportamento() {
		return comportamento;
	}

	public void setComportamento(Comportamento comportamento) {
		this.comportamento = comportamento;
	}

	public Long getPhMinimo() {
		return phMinimo;
	}

	public void setPhMinimo(Long phMinimo) {
		this.phMinimo = phMinimo;
	}

	public Long getPhMaximo() {
		return phMaximo;
	}

	public void setPhMaximo(Long phMaximo) {
		this.phMaximo = phMaximo;
	}

	public String getAlimentação() {
		return alimentação;
	}

	public void setAlimentação(String alimentação) {
		this.alimentação = alimentação;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public Double getLitragem() {
		return litragem;
	}

	public void setLitragem(Double litragem) {
		this.litragem = litragem;
	}

	public Double getLitragemAdicionalPorPeixe() {
		return litragemAdicionalPorPeixe;
	}

	public void setLitragemAdicionalPorPeixe(Double litragemAdicionalPorPeixe) {
		this.litragemAdicionalPorPeixe = litragemAdicionalPorPeixe;
	}

	public int getDificuldade() {
		return dificuldade;
	}

	public void setDificuldade(int dificuldade) {
		this.dificuldade = dificuldade;
	}

	public boolean isPeixeUnico() {
		return peixeUnico;
	}

	public void setPeixeUnico(boolean peixeUnico) {
		this.peixeUnico = peixeUnico;
	}

}
