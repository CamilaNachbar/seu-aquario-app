package br.com.seuaquario.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.seuaquario.entity.Peixes;

@Repository
public interface PeixeRepository extends MongoRepository<Peixes, String> {
	public List<Peixes> findByNomePopular(String nome);
	public List<Peixes> findByLitragem(Long litragem);
	public List<Peixes> findByLitragemLessThan(long litragem);

}
