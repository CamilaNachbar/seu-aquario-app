/**
 * 
 */
package br.com.seuaquario.entity;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Camila Nachbar - cshebling@stefanini.com - 62106 13 de jun de 2019
 */
@Document
public class Dimensoes {

	private Long largura;
	private Long altura;
	private Long comprimento;

	public Long getLargura() {
		return largura;
	}

	public void setLargura(Long largura) {
		this.largura = largura;
	}

	public Long getAltura() {
		return altura;
	}

	public void setAltura(Long altura) {
		this.altura = altura;
	}

	public Long getComprimento() {
		return comprimento;
	}

	public void setComprimento(Long comprimento) {
		this.comprimento = comprimento;
	}

}
