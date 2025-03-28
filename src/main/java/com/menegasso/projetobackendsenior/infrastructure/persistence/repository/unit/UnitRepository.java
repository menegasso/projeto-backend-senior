package com.menegasso.projetobackendsenior.infrastructure.persistence.repository.unit;

import java.util.List;
import java.util.Optional;

/**
 * Repository interface for Unit.
 * Defines the contract for persistence operations on Unit entities,
 * remaining free of any framework-specific details.
 */
public interface UnitRepository {
    Unit save(Unit unit);
    Optional<Unit> findById(Long id);
    List<Unit> findAll();
    void deleteById(Long id);
}
