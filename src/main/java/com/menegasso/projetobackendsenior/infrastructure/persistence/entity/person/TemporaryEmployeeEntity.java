package com.menegasso.projetobackendsenior.infrastructure.persistence.entity.person;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

/**
 * Represents a TemporaryEmployee entity mapped to the "temporary_employee" table.
 * Uses JPA and Lombok annotations.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "temporary_employee")
@PrimaryKeyJoinColumn(name = "person_id")
@EqualsAndHashCode(callSuper = true)
public class TemporaryEmployeeEntity extends PersonEntity {

    @Column(name = "hire_date")
    private LocalDate hireDate;

    @Column(name = "termination_date")
    private LocalDate terminationDate;
}
