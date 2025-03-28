package com.menegasso.projetobackendsenior.application.mapper.person;

import com.menegasso.projetobackendsenior.application.dto.person.TemporaryEmployeeDTO;
import com.menegasso.projetobackendsenior.domain.model.person.TemporaryEmployee;
import org.mapstruct.Mapper;

/**
 * Mapper interface for TemporaryEmployee.
 * Defines the contract for converting between TemporaryEmployee domain objects and TemporaryEmployeeDTO,
 * remaining free of any framework-specific details (Clean Architecture).
 */
@Mapper(componentModel = "spring", uses = { PersonMapper.class })
public interface TemporaryEmployeeMapper {
    TemporaryEmployeeDTO toDTO(TemporaryEmployee temporaryEmployee);
    TemporaryEmployee toDomain(TemporaryEmployeeDTO temporaryEmployeeDTO);
}
