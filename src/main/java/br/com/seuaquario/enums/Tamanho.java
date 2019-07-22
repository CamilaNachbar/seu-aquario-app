package br.com.seuaquario.enums;

public enum Tamanho {

	PEQUENO_ATE_5CM("PEQUENO_ATE_5CM"), PEQUENO_ATE_10CM("PEQUENO_ATE_10CM"),
	MEDIO_ATE_20CM("MEDIO_ATE_20CM"), GRANDE_25CM_ACIMA("GRANDE_25CM_ACIMA");

	public final String descricao;

	
	Tamanho(String desc){
		descricao = desc;
	}
	
	public String getDescricao() {
		return descricao;
		
	}

	
}
