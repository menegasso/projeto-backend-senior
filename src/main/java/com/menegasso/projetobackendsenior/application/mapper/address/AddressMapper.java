package com.menegasso.projetobackendsenior.application.mapper.address;

import com.menegasso.projetobackendsenior.application.dto.address.AddressDTO;
import com.menegasso.projetobackendsenior.domain.model.address.Address;
import org.mapstruct.Mapper;

/**
 * Mapper interface for Address.
 * Defines the contract for converting between Address domain objects and AddressDTO,
 * remaining free of any framework-specific details (Clean Architecture).
 */
@Mapper(componentModel = "spring", uses = { CityMapper.class })
public interface AddressMapper {
    AddressDTO toDTO(Address address);
    Address toDomain(AddressDTO addressDTO);
}
