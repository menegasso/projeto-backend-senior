package com.menegasso.projetobackendsenior.domain.repository.person;

import com.menegasso.projetobackendsenior.domain.model.person.TemporaryEmployee;
import java.util.List;
import java.util.Optional;

/**
 * Repository interface for TemporaryEmployee.
 * Defines the contract for persistence operations on TemporaryEmployee entities,
 * remaining free of any framework-specific details.
 */
public interface TemporaryEmployeeRepository {
    TemporaryEmployee save(TemporaryEmployee temporaryEmployee);
    Optional<TemporaryEmployee> findById(Long id);
    List<TemporaryEmployee> findAll();
    void deleteById(Long id);
}
