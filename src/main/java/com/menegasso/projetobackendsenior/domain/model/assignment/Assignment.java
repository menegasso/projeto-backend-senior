package com.menegasso.projetobackendsenior.domain.model.assignment;

import com.menegasso.projetobackendsenior.domain.model.person.Person;
import com.menegasso.projetobackendsenior.domain.model.unit.Unit;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Represents an assignment linking a person to a unit,
 * remaining free of any framework-specific annotations. (Clean Architecture).
 */
public class Assignment {

    private Long id;
    private Person person;
    private Unit unit;
    private LocalDate assignmentDate;
    private LocalDate removalDate;
    private String officialAct;

    public Assignment() {
    }

    public Assignment(Long id, Person person, Unit unit, LocalDate assignmentDate, LocalDate removalDate, String officialAct) {
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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Assignment that = (Assignment) o;
        return Objects.equals(id, that.id) && Objects.equals(person, that.person) && Objects.equals(unit, that.unit) && Objects.equals(assignmentDate, that.assignmentDate) && Objects.equals(removalDate, that.removalDate) && Objects.equals(officialAct, that.officialAct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, person, unit, assignmentDate, removalDate, officialAct);
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "id=" + id +
                ", person=" + person +
                ", unit=" + unit +
                ", assignmentDate=" + assignmentDate +
                ", removalDate=" + removalDate +
                ", officialAct='" + officialAct + '\'' +
                '}';
    }
}
