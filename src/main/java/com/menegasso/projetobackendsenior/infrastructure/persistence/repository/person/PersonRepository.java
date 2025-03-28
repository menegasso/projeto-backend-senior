package com.menegasso.projetobackendsenior.infrastructure.persistence.repository.person;

import java.util.List;
import java.util.Optional;

/**
 * Repository interface for Person.
 * Defines the contract for persistence operations on Person entities,
 * remaining free of any framework-specific details.
 */
public interface PersonRepository {
    PersonEntity save(PersonEntity person);
    Optional<PersonEntity> findById(Long id);
    List<PersonEntity> findAll();
    void deleteById(Long id);
}
