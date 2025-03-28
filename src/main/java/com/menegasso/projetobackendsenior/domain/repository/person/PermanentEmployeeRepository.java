package com.menegasso.projetobackendsenior.domain.repository.person;

import com.menegasso.projetobackendsenior.domain.model.person.PermanentEmployee;
import java.util.List;
import java.util.Optional;

/**
 * Repository interface for PermanentEmployee.
 * Defines the contract for persistence operations on PermanentEmployee entities,
 * remaining free of any framework-specific details.
 */
public interface PermanentEmployeeRepository {
    PermanentEmployee save(PermanentEmployee permanentEmployee);
    Optional<PermanentEmployee> findById(Long id);
    List<PermanentEmployee> findAll();
    void deleteById(Long id);
}
