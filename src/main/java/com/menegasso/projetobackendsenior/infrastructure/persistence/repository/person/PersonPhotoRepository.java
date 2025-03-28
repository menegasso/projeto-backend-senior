package com.menegasso.projetobackendsenior.infrastructure.persistence.repository.person;

import java.util.List;
import java.util.Optional;

/**
 * Repository interface for PersonPhoto.
 * Defines the contract for persistence operations on PersonPhoto entities,
 * remaining free of any framework-specific details.
 */
public interface PersonPhotoRepository {
    PersonPhoto save(PersonPhoto personPhoto);
    Optional<PersonPhoto> findById(Long id);
    List<PersonPhoto> findAll();
    void deleteById(Long id);
}
