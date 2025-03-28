package com.menegasso.projetobackendsenior.application.usecase.person;

import com.menegasso.projetobackendsenior.application.dto.person.PersonDTO;
import com.menegasso.projetobackendsenior.application.mapper.person.PersonMapper;
import com.menegasso.projetobackendsenior.domain.model.person.Person;
import com.menegasso.projetobackendsenior.domain.repository.person.PersonRepository;

/**
 * Use case for creating a Person.
 * Defines the business operation for persisting a new Person,
 * converting between the domain model and PersonDTO,
 * and remains free of any framework-specific details (Clean Architecture).
 */
public class CreatePersonUseCase {

    private final PersonRepository personRepository;
    private final PersonMapper personMapper;

    public CreatePersonUseCase(PersonRepository personRepository, PersonMapper personMapper) {
        this.personRepository = personRepository;
        this.personMapper = personMapper;
    }

    public PersonDTO execute(PersonDTO personDTO) {
        Person person = personMapper.toDomain(personDTO);
        Person savedPerson = personRepository.save(person);
        return personMapper.toDTO(savedPerson);
    }
}
