package com.menegasso.projetobackendsenior.application.usecase.person;

import com.menegasso.projetobackendsenior.application.dto.person.PersonDTO;
import com.menegasso.projetobackendsenior.application.mapper.person.PersonMapper;
import com.menegasso.projetobackendsenior.domain.model.person.Person;
import com.menegasso.projetobackendsenior.domain.repository.person.PersonRepository;

/**
 * Use case for updating a Person.
 * Defines the business operation for updating an existing Person,
 * converting between the domain model and PersonDTO,
 * remaining free of any framework-specific details (Clean Architecture).
 */
public class UpdatePersonUseCase {

    private final PersonRepository personRepository;
    private final PersonMapper personMapper;

    public UpdatePersonUseCase(PersonRepository personRepository, PersonMapper personMapper) {
        this.personRepository = personRepository;
        this.personMapper = personMapper;
    }

    public PersonDTO execute(PersonDTO personDTO) {
        Person person = personMapper.toDomain(personDTO);
        Person updatedPerson = personRepository.save(person);
        return personMapper.toDTO(updatedPerson);
    }
}
