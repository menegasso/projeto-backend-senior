package com.menegasso.projetobackendsenior.application.mapper.address;

import com.menegasso.projetobackendsenior.application.dto.address.CityDTO;
import com.menegasso.projetobackendsenior.domain.model.address.City;
import org.mapstruct.Mapper;

/**
 * Mapper interface for City.
 * Defines the contract for converting between City domain objects and CityDTO,
 * remaining free of any framework-specific details (Clean Architecture).
 */
@Mapper(componentModel = "spring")
public interface CityMapper {
    CityDTO toDTO(City city);

    City toDomain(CityDTO cityDTO);
}
