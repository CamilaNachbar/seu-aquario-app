/**
 * 
 */
package br.com.seuaquario.entity;

import br.com.seuaquario.enums.Comportamento;

/**
 * @author Camila Nachbar - 13 de jun de 2019
 */
//@Document
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
	private String alimentacao;
	private Long tamanho;
	private Long litragem;
	private Long litragemAdicionalPorPeixe;
	private String biotopo;
	private int dificuldade; // 5 o maximo de dificuldade
	private boolean peixeUnico; // false para aquario comunitario
	private boolean cardume; //true torna necessario no minimo 5 individuos
	private Preco preco;

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

	public String getAlimentacao() {
		return alimentacao;
	}

	public void setAlimentacao(String alimentacao) {
		this.alimentacao = alimentacao;
	}

	public Long getTamanho() {
		return tamanho;
	}

	public void setTamanho(Long tamanho) {
		this.tamanho = tamanho;
	}

	public Long getLitragem() {
		return litragem;
	}

	public void setLitragem(Long litragem) {
		this.litragem = litragem;
	}

	public Long getLitragemAdicionalPorPeixe() {
		return litragemAdicionalPorPeixe;
	}

	public void setLitragemAdicionalPorPeixe(Long litragemAdicionalPorPeixe) {
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

	public Preco getPreco() {
		return preco;
	}

	public void setPreco(Preco preco) {
		this.preco = preco;
	}

	public String getBiotopo() {
		return biotopo;
	}

	public void setBiotopo(String biotopo) {
		this.biotopo = biotopo;
	}

	public boolean isCardume() {
		return cardume;
	}

	public void setCardume(boolean cardume) {
		this.cardume = cardume;
	}

}
