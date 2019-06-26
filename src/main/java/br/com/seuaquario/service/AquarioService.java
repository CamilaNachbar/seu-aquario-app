package br.com.seuaquario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import br.com.seuaquario.entity.Aquario;
import br.com.seuaquario.entity.Peixes;
import br.com.seuaquario.repository.AquarioRepository;

public class AquarioService {

	
	
	@Autowired
	public AquarioRepository aquarioRepository;

	public void salvarAquario(List<Aquario> aquarios) {
		try {
			aquarioRepository.saveAll(aquarios);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public ResponseEntity<?> deletarAquario(List<Aquario> aquario) {
		return null;
	}

	public List<Aquario> ListAquarios() {
		return null;
	}

	public ResponseEntity<?> updateAquario(Aquario aquario) {
		return null;
	}

	public List<Aquario> listByPeixe(List<Peixes> peixe) {
		return null;
	}

	public List<Aquario> listByLitragem(String litragem) {
		return null;
	}

}
