package br.com.seuaquario.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import br.com.seuaquario.dto.AquarioDTO;
import br.com.seuaquario.entity.Aquario;

@Mapper
public interface AquarioMapper {

	AquarioMapper INSTANCE = Mappers.getMapper(AquarioMapper.class);

	@Mapping(source = "nomeDoAquario", target = "nomeDoAquario")
	Aquario AquarioDTOtoAquario(AquarioDTO aquario);

}
