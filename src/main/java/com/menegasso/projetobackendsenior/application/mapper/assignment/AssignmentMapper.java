package com.menegasso.projetobackendsenior.application.mapper.assignment;

import com.menegasso.projetobackendsenior.application.dto.assignment.AssignmentDTO;
import com.menegasso.projetobackendsenior.application.mapper.person.PersonMapper;
import com.menegasso.projetobackendsenior.application.mapper.unit.UnitMapper;
import com.menegasso.projetobackendsenior.domain.model.assignment.Assignment;
import org.mapstruct.Mapper;

/**
 * Mapper interface for Assignment.
 * Defines the contract for converting between Assignment domain objects and AssignmentDTO,
 * remaining free of any framework-specific details (Clean Architecture).
 */
@Mapper(componentModel = "spring", uses = {PersonMapper.class, UnitMapper.class})
public interface AssignmentMapper {
    AssignmentDTO toDTO(Assignment assignment);

    Assignment toDomain(AssignmentDTO assignmentDTO);
}
