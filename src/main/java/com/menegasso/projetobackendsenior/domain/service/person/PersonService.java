package com.menegasso.projetobackendsenior.domain.service.person;

import com.menegasso.projetobackendsenior.domain.model.person.Person;
import java.util.List;
import java.util.Optional;

/**
 * Service interface for Person.
 * Defines business operations on Person entities,
 * remaining free of any framework-specific details.
 */
public interface PersonService {
    Person createPerson(Person person);
    Optional<Person> getPersonById(Long id);
    List<Person> getAllPersons();
    Person updatePerson(Person person);
    void deletePerson(Long id);
}
