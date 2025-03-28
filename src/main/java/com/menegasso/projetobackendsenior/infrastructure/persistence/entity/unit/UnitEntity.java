package com.menegasso.projetobackendsenior.infrastructure.persistence.entity.unit;

import com.menegasso.projetobackendsenior.infrastructure.persistence.entity.address.AddressEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

/**
 * Represents a Unit entity mapped to the "unit" table.
 * Uses JPA and Lombok annotations.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "unit")
public class UnitEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "unit_id")
    private Long id;

    @Column(name = "unit_name", nullable = false)
    private String name;

    @Column(name = "unit_abbreviation")
    private String abbreviation;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "unit_address",
            joinColumns = @JoinColumn(name = "unit_id"),
            inverseJoinColumns = @JoinColumn(name = "address_id"))
    private List<AddressEntity> addresses;
}
