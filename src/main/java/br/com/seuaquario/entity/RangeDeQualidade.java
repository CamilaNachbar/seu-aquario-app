/**
 * 
 */
package br.com.seuaquario.entity;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Camila Nachbar 17 de jun de 2019
 */
@Document
public class RangeDeQualidade {

	// calcula o range de qualidade do aquario
	// indica super lotação
	// indica faunas diferentes
	// peixes de comportamentos diferentes

	private String codigoRange;
	private int range; // 0 - sem fauna // 5 - aquario saudavel //10 - range em nivel perigoso
	private Date dataDoRange;

	public String getCodigoRange() {
		return codigoRange;
	}

	public void setCodigoRange(String codigoRange) {
		this.codigoRange = codigoRange;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public Date getDataDoRange() {
		return dataDoRange;
	}

	public void setDataDoRange(Date dataDoRange) {
		this.dataDoRange = dataDoRange;
	}

}
