package com.menegasso.projetobackendsenior.application.mapper.person;

import com.menegasso.projetobackendsenior.application.dto.person.PersonPhotoDTO;
import com.menegasso.projetobackendsenior.domain.model.person.PersonPhoto;
import org.mapstruct.Mapper;

/**
 * Mapper interface for PersonPhoto.
 * Defines the contract for converting between PersonPhoto domain objects and PersonPhotoDTO,
 * remaining free of any framework-specific details (Clean Architecture).
 */
@Mapper(componentModel = "spring")
public interface PersonPhotoMapper {
    PersonPhotoDTO toDTO(PersonPhoto personPhoto);

    PersonPhoto toDomain(PersonPhotoDTO personPhotoDTO);
}
