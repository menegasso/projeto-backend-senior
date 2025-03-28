package com.menegasso.projetobackendsenior.domain.service.unit;

import com.menegasso.projetobackendsenior.domain.model.unit.Unit;
import java.util.List;
import java.util.Optional;

/**
 * Service interface for Unit.
 * Defines business operations on Unit entities,
 * remaining free of any framework-specific details.
 */
public interface UnitService {
    Unit createUnit(Unit unit);
    Optional<Unit> getUnitById(Long id);
    List<Unit> getAllUnits();
    Unit updateUnit(Unit unit);
    void deleteUnit(Long id);
}
