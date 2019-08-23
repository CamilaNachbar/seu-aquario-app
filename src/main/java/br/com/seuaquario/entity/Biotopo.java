package br.com.seuaquario.entity;

import java.util.List;

public class Biotopo {

	private String nome;
	private String descrição;
	private String phMinimo;
	private String phMaximo;
	private List<Peixes> peixes;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrição() {
		return descrição;
	}

	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}

	public String getPhMinimo() {
		return phMinimo;
	}

	public void setPhMinimo(String phMinimo) {
		this.phMinimo = phMinimo;
	}

	public String getPhMaximo() {
		return phMaximo;
	}

	public void setPhMaximo(String phMaximo) {
		this.phMaximo = phMaximo;
	}

	public List<Peixes> getPeixes() {
		return peixes;
	}

	public void setPeixes(List<Peixes> peixes) {
		this.peixes = peixes;
	}

}
