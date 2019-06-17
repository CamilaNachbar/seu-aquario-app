/**
 * 
 */
package br.com.seuaquario.entity;

import java.util.Date;

import lombok.Data;

/**
 * @author Camila Nachbar 17 de jun de 2019
 */

@Data
public class RangeDeQualidade {

	// calcula o range de qualidade do aquario
	// indica super lotação
	// indica faunas diferentes
	// peixes de comportamentos diferentes

	private String codigoRange;
	private int range; // 0 - sem fauna // 5 - aquario saudavel //10 - range em nivel perigoso
	private Date dataDoRange;

}
