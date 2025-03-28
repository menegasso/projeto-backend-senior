package com.menegasso.projetobackendsenior.application.usecase.assignment;

import com.menegasso.projetobackendsenior.application.dto.assignment.AssignmentDTO;
import com.menegasso.projetobackendsenior.application.mapper.assignment.AssignmentMapper;
import com.menegasso.projetobackendsenior.domain.repository.assignment.AssignmentRepository;
import java.util.Optional;

/**
 * Use case for retrieving an Assignment by ID.
 * Defines the business operation for fetching an Assignment,
 * converting between the domain model and AssignmentDTO,
 * remaining free of any framework-specific details (Clean Architecture).
 */
public class GetAssignmentByIdUseCase {

    private final AssignmentRepository assignmentRepository;
    private final AssignmentMapper assignmentMapper;

    public GetAssignmentByIdUseCase(AssignmentRepository assignmentRepository, AssignmentMapper assignmentMapper) {
        this.assignmentRepository = assignmentRepository;
        this.assignmentMapper = assignmentMapper;
    }

    public Optional<AssignmentDTO> execute(Long id) {
        return assignmentRepository.findById(id)
                .map(assignmentMapper::toDTO);
    }
}
