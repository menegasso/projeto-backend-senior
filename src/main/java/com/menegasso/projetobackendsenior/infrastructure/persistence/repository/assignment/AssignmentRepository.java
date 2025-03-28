package com.menegasso.projetobackendsenior.infrastructure.persistence.repository.assignment;

import java.util.List;
import java.util.Optional;

/**
 * Repository interface for Assignment.
 * Defines the contract for persistence operations on Assignment entities,
 * remaining free of any framework-specific details.
 */
public interface AssignmentRepository {
    Assignment save(Assignment assignment);
    Optional<Assignment> findById(Long id);
    List<Assignment> findAll();
    void deleteById(Long id);
}
