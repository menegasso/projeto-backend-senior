package com.menegasso.projetobackendsenior.infrastructure.persistence.entity.person;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Represents a PermanentEmployee entity mapped to the "permanent_employee" table.
 * Uses JPA and Lombok annotations.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "permanent_employee")
@PrimaryKeyJoinColumn(name = "person_id")
@EqualsAndHashCode(callSuper = true)
public class PermanentEmployeeEntity extends PersonEntity {

    @Column(name = "registration", nullable = false)
    private String registration;
}
