package com.menegasso.projetobackendsenior.application.usecase.assignment;

import com.menegasso.projetobackendsenior.application.dto.assignment.AssignmentDTO;
import com.menegasso.projetobackendsenior.application.mapper.assignment.AssignmentMapper;
import com.menegasso.projetobackendsenior.domain.model.assignment.Assignment;
import com.menegasso.projetobackendsenior.domain.repository.assignment.AssignmentRepository;

/**
 * Use case for creating an Assignment.
 * Defines the business operation for persisting a new Assignment,
 * converting between the domain model and AssignmentDTO,
 * remaining free of any framework-specific details (Clean Architecture).
 */
public class CreateAssignmentUseCase {

    private final AssignmentRepository assignmentRepository;
    private final AssignmentMapper assignmentMapper;

    public CreateAssignmentUseCase(AssignmentRepository assignmentRepository, AssignmentMapper assignmentMapper) {
        this.assignmentRepository = assignmentRepository;
        this.assignmentMapper = assignmentMapper;
    }

    public AssignmentDTO execute(AssignmentDTO assignmentDTO) {
        Assignment assignment = assignmentMapper.toDomain(assignmentDTO);
        Assignment savedAssignment = assignmentRepository.save(assignment);
        return assignmentMapper.toDTO(savedAssignment);
    }
}

