package com.menegasso.projetobackendsenior.domain.repository.person;

import com.menegasso.projetobackendsenior.domain.model.person.Person;
import java.util.List;
import java.util.Optional;

/**
 * Repository interface for Person.
 * Defines the contract for persistence operations on Person entities,
 * remaining free of any framework-specific details.
 */
public interface PersonRepository {
    Person save(Person person);
    Optional<Person> findById(Long id);
    List<Person> findAll();
    void deleteById(Long id);
}
