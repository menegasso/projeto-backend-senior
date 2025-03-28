package com.menegasso.projetobackendsenior.application.usecase.unit;

import com.menegasso.projetobackendsenior.application.dto.unit.UnitDTO;
import com.menegasso.projetobackendsenior.application.mapper.unit.UnitMapper;
import com.menegasso.projetobackendsenior.domain.model.unit.Unit;
import com.menegasso.projetobackendsenior.domain.repository.unit.UnitRepository;

/**
 * Use case for creating a Unit.
 * Defines the business operation for persisting a new Unit,
 * converting between the domain model and UnitDTO,
 * remaining free of any framework-specific details (Clean Architecture).
 */
public class CreateUnitUseCase {

    private final UnitRepository unitRepository;
    private final UnitMapper unitMapper;

    public CreateUnitUseCase(UnitRepository unitRepository, UnitMapper unitMapper) {
        this.unitRepository = unitRepository;
        this.unitMapper = unitMapper;
    }

    public UnitDTO execute(UnitDTO unitDTO) {
        Unit unit = unitMapper.toDomain(unitDTO);
        Unit savedUnit = unitRepository.save(unit);
        return unitMapper.toDTO(savedUnit);
    }
}
