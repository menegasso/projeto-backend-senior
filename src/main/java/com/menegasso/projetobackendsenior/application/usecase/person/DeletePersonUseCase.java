package com.menegasso.projetobackendsenior.application.usecase.person;

import com.menegasso.projetobackendsenior.domain.repository.person.PersonRepository;

/**
 * Use case for deleting a Person.
 * Defines the business operation for removing a Person by ID,
 * remaining free of any framework-specific details (Clean Architecture).
 */
public class DeletePersonUseCase {

    private final PersonRepository personRepository;

    public DeletePersonUseCase(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public void execute(Long id) {
        personRepository.deleteById(id);
    }
}
