package com.menegasso.projetobackendsenior.application.usecase.person;

import com.menegasso.projetobackendsenior.application.dto.person.PersonDTO;
import com.menegasso.projetobackendsenior.application.mapper.person.PersonMapper;
import com.menegasso.projetobackendsenior.domain.repository.person.PersonRepository;
import java.util.Optional;

/**
 * Use case for retrieving a Person by ID.
 * Defines the business operation for fetching a Person,
 * converting between the domain model and PersonDTO,
 * remaining free of any framework-specific details (Clean Architecture).
 */
public class GetPersonByIdUseCase {

    private final PersonRepository personRepository;
    private final PersonMapper personMapper;

    public GetPersonByIdUseCase(PersonRepository personRepository, PersonMapper personMapper) {
        this.personRepository = personRepository;
        this.personMapper = personMapper;
    }

    public Optional<PersonDTO> execute(Long id) {
        return personRepository.findById(id)
                .map(personMapper::toDTO);
    }
}
