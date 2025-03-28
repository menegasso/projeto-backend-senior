package com.menegasso.projetobackendsenior.infrastructure.persistence.entity.address;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents a City entity mapped to the "city" table.
 * Uses JPA and Lombok annotations.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "city")
public class CityEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "city_id")
    private Long id;

    @Column(name = "city_name", nullable = false)
    private String name;

    @Column(name = "state_code", nullable = false)
    private String stateCode;
}
