package br.com.seuaquario.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.seuaquario.entity.Aquario;
import br.com.seuaquario.entity.Peixes;

@Repository
public interface AquarioRepository extends MongoRepository<Aquario, String> {

//	List<Aquario> findAquarioByPeixes(List<Peixes> peixes);

	List<Aquario> findByLitragem(String litragem);
}
