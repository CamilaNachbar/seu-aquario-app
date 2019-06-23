package br.com.seuaquario.dto;

import java.util.List;

import javax.validation.constraints.NotNull;

import br.com.seuaquario.entity.Cascalho;
import br.com.seuaquario.entity.Dimensoes;
import br.com.seuaquario.entity.Peixes;
import br.com.seuaquario.entity.RangeDeQualidade;
import br.com.seuaquario.entity.Substrato;

public class AquarioDTO {
	
	private String id;
	@NotNull
	private String nomeDoAquario;
	@NotNull
	private Long litragem;
	private Dimensoes dimensoes;
	private Substrato substrato;
	private Cascalho cascalho;
	private List<Peixes> peixes;
	private RangeDeQualidade range;
	@NotNull
	private String imagem;

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

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

}
