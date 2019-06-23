package br.com.seuaquario.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.seuaquario.entity.Aquario;

@Repository
public interface AquarioRepository extends MongoRepository<Aquario, String> {

}
