package com.menegasso.projetobackendsenior.application.usecase.assignment;

import com.menegasso.projetobackendsenior.application.dto.assignment.AssignmentDTO;
import com.menegasso.projetobackendsenior.application.mapper.assignment.AssignmentMapper;
import com.menegasso.projetobackendsenior.domain.model.assignment.Assignment;
import com.menegasso.projetobackendsenior.domain.repository.assignment.AssignmentRepository;

/**
 * Use case for updating an Assignment.
 * Defines the business operation for updating an existing Assignment,
 * converting between the domain model and AssignmentDTO,
 * remaining free of any framework-specific details (Clean Architecture).
 */
public class UpdateAssignmentUseCase {

    private final AssignmentRepository assignmentRepository;
    private final AssignmentMapper assignmentMapper;

    public UpdateAssignmentUseCase(AssignmentRepository assignmentRepository, AssignmentMapper assignmentMapper) {
        this.assignmentRepository = assignmentRepository;
        this.assignmentMapper = assignmentMapper;
    }

    public AssignmentDTO execute(AssignmentDTO assignmentDTO) {
        Assignment assignment = assignmentMapper.toDomain(assignmentDTO);
        Assignment updatedAssignment = assignmentRepository.save(assignment);
        return assignmentMapper.toDTO(updatedAssignment);
    }
}

