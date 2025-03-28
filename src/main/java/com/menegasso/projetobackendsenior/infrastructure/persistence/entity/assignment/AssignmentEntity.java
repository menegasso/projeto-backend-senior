package com.menegasso.projetobackendsenior.infrastructure.persistence.entity.assignment;

import com.menegasso.projetobackendsenior.infrastructure.persistence.entity.person.PersonEntity;
import com.menegasso.projetobackendsenior.infrastructure.persistence.entity.unit.UnitEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

/**
 * Represents an Assignment entity mapped to the "assignment" table.
 * Uses JPA and Lombok annotations.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "assignment")
public class AssignmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "assignment_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_id", nullable = false)
    private PersonEntity person;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "unit_id", nullable = false)
    private UnitEntity unit;

    @Column(name = "assignment_date")
    private LocalDate assignmentDate;

    @Column(name = "removal_date")
    private LocalDate removalDate;

    @Column(name = "official_act")
    private String officialAct;
}
