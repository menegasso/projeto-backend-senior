package com.menegasso.projetobackendsenior.application.usecase.person;

import com.menegasso.projetobackendsenior.application.dto.person.PermanentEmployeeDTO;
import com.menegasso.projetobackendsenior.application.mapper.person.PermanentEmployeeMapper;
import com.menegasso.projetobackendsenior.domain.model.person.PermanentEmployee;
import com.menegasso.projetobackendsenior.domain.repository.person.PermanentEmployeeRepository;

/**
 * Use case for creating a PermanentEmployee.
 * Defines the business operation for persisting a new PermanentEmployee,
 * converting between the domain model and PermanentEmployeeDTO,
 * remaining free of any framework-specific details (Clean Architecture).
 */
public class CreatePermanentEmployeeUseCase {

    private final PermanentEmployeeRepository permanentEmployeeRepository;
    private final PermanentEmployeeMapper permanentEmployeeMapper;

    public CreatePermanentEmployeeUseCase(PermanentEmployeeRepository permanentEmployeeRepository, PermanentEmployeeMapper permanentEmployeeMapper) {
        this.permanentEmployeeRepository = permanentEmployeeRepository;
        this.permanentEmployeeMapper = permanentEmployeeMapper;
    }

    public PermanentEmployeeDTO execute(PermanentEmployeeDTO permanentEmployeeDTO) {
        PermanentEmployee permanentEmployee = permanentEmployeeMapper.toDomain(permanentEmployeeDTO);
        PermanentEmployee savedEmployee = permanentEmployeeRepository.save(permanentEmployee);
        return permanentEmployeeMapper.toDTO(savedEmployee);
    }
}
