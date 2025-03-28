package com.menegasso.projetobackendsenior.application.mapper.unit;

import com.menegasso.projetobackendsenior.application.dto.unit.UnitDTO;
import com.menegasso.projetobackendsenior.application.mapper.address.AddressMapper;
import com.menegasso.projetobackendsenior.domain.model.unit.Unit;
import org.mapstruct.Mapper;

/**
 * Mapper interface for Unit.
 * Defines the contract for converting between Unit domain objects and UnitDTO,
 * remaining free of any framework-specific details (Clean Architecture).
 */
@Mapper(componentModel = "spring", uses = {AddressMapper.class})
public interface UnitMapper {
    UnitDTO toDTO(Unit unit);

    Unit toDomain(UnitDTO unitDTO);
}
