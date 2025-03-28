package com.menegasso.projetobackendsenior.application.dto.unit;

import com.menegasso.projetobackendsenior.application.dto.address.AddressDTO;
import java.util.List;

/**
 * Represents a Unit Data Transfer Object with basic attributes.
 * This class is part of the application layer and is used to transfer
 * Unit data between the domain model and external layers,
 * remaining free of any framework-specific annotations (Clean Architecture).
 */
public class UnitDTO {
    private Long id;
    private String name;
    private String abbreviation;
    private List<AddressDTO> addresses;

    public UnitDTO() {
    }

    public UnitDTO(Long id, String name, String abbreviation, List<AddressDTO> addresses) {
        this.id = id;
        this.name = name;
        this.abbreviation = abbreviation;
        this.addresses = addresses;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public List<AddressDTO> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<AddressDTO> addresses) {
        this.addresses = addresses;
    }
}
