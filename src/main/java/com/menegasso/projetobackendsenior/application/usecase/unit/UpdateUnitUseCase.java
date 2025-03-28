package com.menegasso.projetobackendsenior.application.usecase.unit;

import com.menegasso.projetobackendsenior.application.dto.unit.UnitDTO;
import com.menegasso.projetobackendsenior.application.mapper.unit.UnitMapper;
import com.menegasso.projetobackendsenior.domain.model.unit.Unit;
import com.menegasso.projetobackendsenior.domain.repository.unit.UnitRepository;

/**
 * Use case for updating a Unit.
 * Defines the business operation for updating an existing Unit,
 * converting between the domain model and UnitDTO,
 * remaining free of any framework-specific details (Clean Architecture).
 */
public class UpdateUnitUseCase {

    private final UnitRepository unitRepository;
    private final UnitMapper unitMapper;

    public UpdateUnitUseCase(UnitRepository unitRepository, UnitMapper unitMapper) {
        this.unitRepository = unitRepository;
        this.unitMapper = unitMapper;
    }

    public UnitDTO execute(UnitDTO unitDTO) {
        Unit unit = unitMapper.toDomain(unitDTO);
        Unit updatedUnit = unitRepository.save(unit);
        return unitMapper.toDTO(updatedUnit);
    }
}
