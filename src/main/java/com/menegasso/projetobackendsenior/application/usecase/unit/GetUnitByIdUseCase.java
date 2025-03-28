package com.menegasso.projetobackendsenior.application.usecase.unit;

import com.menegasso.projetobackendsenior.application.dto.unit.UnitDTO;
import com.menegasso.projetobackendsenior.application.mapper.unit.UnitMapper;
import com.menegasso.projetobackendsenior.domain.repository.unit.UnitRepository;
import java.util.Optional;

/**
 * Use case for retrieving a Unit by ID.
 * Defines the business operation for fetching a Unit,
 * converting between the domain model and UnitDTO,
 * remaining free of any framework-specific details (Clean Architecture).
 */
public class GetUnitByIdUseCase {

    private final UnitRepository unitRepository;
    private final UnitMapper unitMapper;

    public GetUnitByIdUseCase(UnitRepository unitRepository, UnitMapper unitMapper) {
        this.unitRepository = unitRepository;
        this.unitMapper = unitMapper;
    }

    public Optional<UnitDTO> execute(Long id) {
        return unitRepository.findById(id)
                .map(unitMapper::toDTO);
    }
}

