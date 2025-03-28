package com.menegasso.projetobackendsenior.domain.service.assignment;

import com.menegasso.projetobackendsenior.domain.model.assignment.Assignment;
import java.util.List;
import java.util.Optional;

/**
 * Service interface for Assignment.
 * Defines business operations on Assignment entities,
 * remaining free of any framework-specific details.
 */
public interface AssignmentService {
    Assignment createAssignment(Assignment assignment);
    Optional<Assignment> getAssignmentById(Long id);
    List<Assignment> getAllAssignments();
    Assignment updateAssignment(Assignment assignment);
    void deleteAssignment(Long id);
}
