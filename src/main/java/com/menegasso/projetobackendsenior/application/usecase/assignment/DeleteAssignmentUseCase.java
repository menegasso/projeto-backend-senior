package com.menegasso.projetobackendsenior.application.usecase.assignment;

import com.menegasso.projetobackendsenior.domain.repository.assignment.AssignmentRepository;

/**
 * Use case for deleting an Assignment.
 * Defines the business operation for removing an Assignment by ID,
 * remaining free of any framework-specific details (Clean Architecture).
 */
public class DeleteAssignmentUseCase {

    private final AssignmentRepository assignmentRepository;

    public DeleteAssignmentUseCase(AssignmentRepository assignmentRepository) {
        this.assignmentRepository = assignmentRepository;
    }

    public void execute(Long id) {
        assignmentRepository.deleteById(id);
    }
}
