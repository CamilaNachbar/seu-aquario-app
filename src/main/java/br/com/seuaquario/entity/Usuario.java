/**
 * 
 */
package br.com.seuaquario.entity;

import java.util.Date;
import java.util.List;

/**
 * @author Camila Nachbar - cshebling@stefanini.com - 62106 17 de jun de 2019
 */
public class Usuario {

	private String nome;
	private String sobrenome;
	private Date dataNascimento;
	private String documento;
	private String cidade;
	private String estado;
	private List<Aquario> aquarios;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public List<Aquario> getAquarios() {
		return aquarios;
	}

	public void setAquarios(List<Aquario> aquarios) {
		this.aquarios = aquarios;
	}
}
