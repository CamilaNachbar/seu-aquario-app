package br.com.seuaquario.entity;

import java.math.BigDecimal;

public class Preco {
	
	public BigDecimal preco;
	public String tamanho;
	public String regiao;

	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getRegiao() {
		return regiao;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

}
