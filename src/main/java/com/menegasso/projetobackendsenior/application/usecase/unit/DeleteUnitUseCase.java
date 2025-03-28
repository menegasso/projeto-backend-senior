package com.menegasso.projetobackendsenior.application.usecase.unit;

import com.menegasso.projetobackendsenior.domain.repository.unit.UnitRepository;

/**
 * Use case for deleting a Unit.
 * Defines the business operation for removing a Unit by ID,
 * remaining free of any framework-specific details (Clean Architecture).
 */
public class DeleteUnitUseCase {

    private final UnitRepository unitRepository;

    public DeleteUnitUseCase(UnitRepository unitRepository) {
        this.unitRepository = unitRepository;
    }

    public void execute(Long id) {
        unitRepository.deleteById(id);
    }
}

