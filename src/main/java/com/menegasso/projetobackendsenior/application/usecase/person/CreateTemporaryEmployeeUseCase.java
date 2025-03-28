package com.menegasso.projetobackendsenior.application.usecase.person;

import com.menegasso.projetobackendsenior.application.dto.person.TemporaryEmployeeDTO;
import com.menegasso.projetobackendsenior.application.mapper.person.TemporaryEmployeeMapper;
import com.menegasso.projetobackendsenior.domain.model.person.TemporaryEmployee;
import com.menegasso.projetobackendsenior.domain.repository.person.TemporaryEmployeeRepository;

/**
 * Use case for creating a TemporaryEmployee.
 * Defines the business operation for persisting a new TemporaryEmployee,
 * converting between the domain model and TemporaryEmployeeDTO,
 * remaining free of any framework-specific details (Clean Architecture).
 */
public class CreateTemporaryEmployeeUseCase {

    private final TemporaryEmployeeRepository temporaryEmployeeRepository;
    private final TemporaryEmployeeMapper temporaryEmployeeMapper;

    public CreateTemporaryEmployeeUseCase(TemporaryEmployeeRepository temporaryEmployeeRepository, TemporaryEmployeeMapper temporaryEmployeeMapper) {
        this.temporaryEmployeeRepository = temporaryEmployeeRepository;
        this.temporaryEmployeeMapper = temporaryEmployeeMapper;
    }

    public TemporaryEmployeeDTO execute(TemporaryEmployeeDTO temporaryEmployeeDTO) {
        TemporaryEmployee temporaryEmployee = temporaryEmployeeMapper.toDomain(temporaryEmployeeDTO);
        TemporaryEmployee savedEmployee = temporaryEmployeeRepository.save(temporaryEmployee);
        return temporaryEmployeeMapper.toDTO(savedEmployee);
    }
}
