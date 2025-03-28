package com.menegasso.projetobackendsenior.application.dto.assignment;

import com.menegasso.projetobackendsenior.application.dto.person.PersonDTO;
import com.menegasso.projetobackendsenior.application.dto.unit.UnitDTO;
import java.time.LocalDate;

/**
 * Represents an Assignment Data Transfer Object with basic attributes.
 * This class is part of the application layer and is used to transfer
 * Assignment data between the domain model and external layers,
 * remaining free of any framework-specific annotations (Clean Architecture).
 */
public class AssignmentDTO {
    private Long id;
    private PersonDTO person;
    private UnitDTO unit;
    private LocalDate assignmentDate;
    private LocalDate removalDate;
    private String officialAct;

    public AssignmentDTO() {
    }

    public AssignmentDTO(Long id, PersonDTO person, UnitDTO unit, LocalDate assignmentDate, LocalDate removalDate, String officialAct) {
        this.id = id;
        this.person = person;
        this.unit = unit;
        this.assignmentDate = assignmentDate;
        this.removalDate = removalDate;
        this.officialAct = officialAct;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PersonDTO getPerson() {
        return person;
    }

    public void setPerson(PersonDTO person) {
        this.person = person;
    }

    public UnitDTO getUnit() {
        return unit;
    }

    public void setUnit(UnitDTO unit) {
        this.unit = unit;
    }

    public LocalDate getAssignmentDate() {
        return assignmentDate;
    }

    public void setAssignmentDate(LocalDate assignmentDate) {
        this.assignmentDate = assignmentDate;
    }

    public LocalDate getRemovalDate() {
        return removalDate;
    }

    public void setRemovalDate(LocalDate removalDate) {
        this.removalDate = removalDate;
    }

    public String getOfficialAct() {
        return officialAct;
    }

    public void setOfficialAct(String officialAct) {
        this.officialAct = officialAct;
    }
}
