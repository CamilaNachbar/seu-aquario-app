/**
 * 
 */
package br.com.seuaquario.entity;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Camila Nachbar 17 de jun de 2019
 */
@Document
public class Cascalho {

	private String nome;
	private int numero;
	private String observacoes;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

}
