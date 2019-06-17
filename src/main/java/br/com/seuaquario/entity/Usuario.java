/**
 * 
 */
package br.com.seuaquario.entity;

import java.util.Date;
import java.util.List;

import lombok.Data;

/**
 * @author Camila Nachbar - cshebling@stefanini.com - 62106 17 de jun de 2019
 */
@Data
public class Usuario {

	private String nome;
	private String sobrenome;
	private Date dataNascimento;
	private String documento;
	private String cidade;
	private String estado;
	private List<Aquario> aquarios;
}
