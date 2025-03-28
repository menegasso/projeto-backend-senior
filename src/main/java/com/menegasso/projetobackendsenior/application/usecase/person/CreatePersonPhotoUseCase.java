package com.menegasso.projetobackendsenior.application.usecase.person;

import com.menegasso.projetobackendsenior.application.dto.person.PersonPhotoDTO;
import com.menegasso.projetobackendsenior.application.mapper.person.PersonPhotoMapper;
import com.menegasso.projetobackendsenior.domain.model.person.PersonPhoto;
import com.menegasso.projetobackendsenior.domain.repository.person.PersonPhotoRepository;

/**
 * Use case for creating a PersonPhoto.
 * Defines the business operation for persisting a new PersonPhoto,
 * converting between the domain model and PersonPhotoDTO,
 * remaining free of any framework-specific details (Clean Architecture).
 */
public class CreatePersonPhotoUseCase {

    private final PersonPhotoRepository personPhotoRepository;
    private final PersonPhotoMapper personPhotoMapper;

    public CreatePersonPhotoUseCase(PersonPhotoRepository personPhotoRepository, PersonPhotoMapper personPhotoMapper) {
        this.personPhotoRepository = personPhotoRepository;
        this.personPhotoMapper = personPhotoMapper;
    }

    public PersonPhotoDTO execute(PersonPhotoDTO personPhotoDTO) {
        PersonPhoto personPhoto = personPhotoMapper.toDomain(personPhotoDTO);
        PersonPhoto savedPhoto = personPhotoRepository.save(personPhoto);
        return personPhotoMapper.toDTO(savedPhoto);
    }
}