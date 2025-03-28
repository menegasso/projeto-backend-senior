package com.menegasso.projetobackendsenior.application.mapper.person;

import com.menegasso.projetobackendsenior.application.dto.person.PermanentEmployeeDTO;
import com.menegasso.projetobackendsenior.domain.model.person.PermanentEmployee;
import org.mapstruct.Mapper;

/**
 * Mapper interface for PermanentEmployee.
 * Defines the contract for converting between PermanentEmployee domain objects and PermanentEmployeeDTO,
 * remaining free of any framework-specific details (Clean Architecture).
 */
@Mapper(componentModel = "spring", uses = { PersonMapper.class })
public interface PermanentEmployeeMapper {
    PermanentEmployeeDTO toDTO(PermanentEmployee permanentEmployee);
    PermanentEmployee toDomain(PermanentEmployeeDTO permanentEmployeeDTO);
}
